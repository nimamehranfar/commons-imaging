/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.benchmark;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.openjdk.jmh.annotations.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
@Fork(1)
@Warmup(iterations = 1)
@Measurement(iterations = 1)
public class ImagingBenchmark {
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    private File jpegFile;
    private File bmpFile;
    private File pngFile;
    private File tiffFile;
    private BufferedImage bufferedImage;

    @Setup(Level.Iteration)
    public void setUp() {
        // Initialize sample image files for testing
        jpegFile = new File("sample_baseline.jpg");
        bmpFile = new File("sample.bmp");
        pngFile = new File("sample.png");
        tiffFile = new File("sample.tiff");
    }

    // Benchmark for decoding a JPEG image
    @Benchmark
    public void testJpegDecoding() throws Exception {
        BufferedImage image = Imaging.getBufferedImage(jpegFile);
    }

    // Benchmark for getting image metadata (ImageInfo)
    @Benchmark
    public void testImageInfoRetrieval() throws Exception {
        ImageInfo info = Imaging.getImageInfo(jpegFile);
    }

    // Benchmark for reading a TIFF image and extracting metadata
    @Benchmark
    public void testTiffMetadataExtraction() throws Exception {
        TiffImageParser parser = new TiffImageParser();
        parser.getMetadata(ByteSource.file(tiffFile));
    }

    // Benchmark for resizing an image (simulating a real-world transformation)
    @Benchmark
    public void testImageResizing() throws Exception {
        BufferedImage image = Imaging.getBufferedImage(pngFile);
        int width = image.getWidth() / 2;
        int height = image.getHeight() / 2;
        BufferedImage resizedImage = new BufferedImage(width, height, image.getType());
        resizedImage.getGraphics().drawImage(image, 0, 0, width, height, null);
    }

    // Benchmark for encoding a PNG image
    @Benchmark
    public void testPngEncoding() throws Exception {
        bufferedImage = Imaging.getBufferedImage(pngFile);
        Imaging.writeImage(bufferedImage, new File("sample_output.png"), ImageFormats.PNG);
    }

    // Benchmark for decoding a BMP image
    @Benchmark
    public void testBmpDecoding() throws Exception {
        BufferedImage image = Imaging.getBufferedImage(bmpFile);
    }

    // Benchmark for getting image metadata (ImageInfo) from BMP
    @Benchmark
    public void testBmpImageInfoRetrieval() throws Exception {
        ImageInfo info = Imaging.getImageInfo(bmpFile);
    }

    // Benchmark for writing a decoded BMP image back to a file
    @Benchmark
    public void testBmpImageWriting() throws Exception {
        bufferedImage = Imaging.getBufferedImage(bmpFile);
        Imaging.writeImage(bufferedImage, new File("sample_output.bmp"), ImageFormats.BMP);
    }
}
