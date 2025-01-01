package com.example.test;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImageFormats;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.color.ColorSpace;
import java.awt.image.ColorConvertOp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/api/images")
public class ImageController {

	// Function to process and convert image to grayscale
	@PostMapping("/process/grayscale")
	public ResponseEntity<byte[]> processGrayscale(@RequestParam("file") MultipartFile file) {
		try {
			BufferedImage image = Imaging.getBufferedImage(file.getInputStream());

			// Convert the image to grayscale using ColorConvertOp
			ColorConvertOp grayscaleOp = new ColorConvertOp(
					ColorSpace.getInstance(ColorSpace.CS_GRAY), null
			);
			BufferedImage grayImage = grayscaleOp.filter(image, null);

			// Convert BufferedImage to byte array
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			Imaging.writeImage(grayImage, outputStream, ImageFormats.PNG);

			return ResponseEntity.ok().body(outputStream.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// Function to invert the colors of the image
	@PostMapping("/process/invert")
	public ResponseEntity<byte[]> processInvert(@RequestParam("file") MultipartFile file) {
		try {
			BufferedImage image = Imaging.getBufferedImage(file.getInputStream());

			// Invert the image colors
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					int rgba = image.getRGB(x, y);
					Color color = new Color(rgba);
					Color invertedColor = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
					image.setRGB(x, y, invertedColor.getRGB());
				}
			}

			// Convert BufferedImage to byte array
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			Imaging.writeImage(image, outputStream, ImageFormats.PNG);

			return ResponseEntity.ok().body(outputStream.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// Function to resize the image
	@PostMapping("/process/resize")
	public ResponseEntity<byte[]> processResize(@RequestParam("file") MultipartFile file, @RequestParam("width") int width, @RequestParam("height") int height) {
		try {
			BufferedImage image = Imaging.getBufferedImage(file.getInputStream());

			// Resize the image
			Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			resizedImage.getGraphics().drawImage(scaledImage, 0, 0, null);

			// Convert BufferedImage to byte array
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			Imaging.writeImage(resizedImage, outputStream, ImageFormats.PNG);

			return ResponseEntity.ok().body(outputStream.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
