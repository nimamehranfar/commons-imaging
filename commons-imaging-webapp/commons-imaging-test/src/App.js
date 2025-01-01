import React, { useState } from "react";
import axios from "axios";
import "./App.css";

const API_URL = process.env.REACT_APP_API_URL || "http://localhost:8080";

const App = () => {
    const [image, setImage] = useState(null);
    const [imagePreview, setImagePreview] = useState(null);
    const [processedImage, setProcessedImage] = useState(null);
    const [processingOption, setProcessingOption] = useState("grayscale"); // Default to grayscale

    const handleFileChange = (e) => {
        const file = e.target.files[0];
        setImage(file);
        setProcessedImage(null);

        // Create a preview URL for the uploaded image
        const reader = new FileReader();
        reader.onload = () => {
            setImagePreview(reader.result);
        };
        reader.readAsDataURL(file);
    };

    const handleProcessingOptionChange = (e) => {
        setProcessingOption(e.target.value);
        setProcessedImage(null);
    };

    const handleUpload = async () => {
        if (!image) {
            alert("Please select an image first!");
            return;
        }

        const formData = new FormData();
        formData.append("file", image);

        let url = `${API_URL}/api/images/process/${processingOption}`;

        if (processingOption === "resize") {
            const width = prompt("Enter width:");
            const height = prompt("Enter height:");
            url = `${url}?width=${width}&height=${height}`;
        }

        try {
            const response = await axios.post(url, formData, {
                responseType: "arraybuffer",
            });

            // Convert binary data to Base64
            const base64Image = btoa(
                new Uint8Array(response.data).reduce(
                    (data, byte) => data + String.fromCharCode(byte),
                    ""
                )
            );

            setProcessedImage(`data:image/png;base64,${base64Image}`);
        } catch (error) {
            console.error("Error processing image", error);
        }
    };

    return (
        <div className="app">
            <h1 className="title">Image Processor</h1>
            <div className="upload-section">
                <input type="file" onChange={handleFileChange} />
                <select value={processingOption} onChange={handleProcessingOptionChange}>
                    <option value="grayscale">Grayscale</option>
                    <option value="invert">Invert</option>
                    <option value="resize">Resize</option>
                </select>
                <button onClick={handleUpload}>Upload and Process</button>
            </div>
            <div className="image-display">
                <div className="image-frame">
                    <h2>Uploaded Image</h2>
                    {imagePreview ? (
                        <img src={imagePreview} alt="Uploaded" />
                    ) : (
                        <p>No image selected</p>
                    )}
                </div>
                <div className="image-frame">
                    <h2>Processed Image</h2>
                    {processedImage ? (
                        <img src={processedImage} alt="Processed" />
                    ) : (
                        <p>No processed image yet</p>
                    )}
                </div>
            </div>
        </div>
    );
};

export default App;
