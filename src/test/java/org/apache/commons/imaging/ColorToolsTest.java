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
package org.apache.commons.imaging;

import org.junit.jupiter.api.Test;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.awt.color.ICC_Profile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ColorToolsTest {

    private final ColorTools colorTools = new ColorTools();

    @Test
    void testConvertBetweenColorSpaces() {
        BufferedImage inputImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorSpace from = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        ColorSpace to = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);

        BufferedImage outputImage = colorTools.convertBetweenColorSpaces(inputImage, from, to);

        assertNotNull(outputImage);
        assertEquals(to, outputImage.getColorModel().getColorSpace());
    }

    @Test
    void testConvertToColorSpace() {
        BufferedImage inputImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorSpace to = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);

        BufferedImage outputImage = colorTools.convertToColorSpace(inputImage, to);

        assertNotNull(outputImage);
        assertEquals(to, outputImage.getColorModel().getColorSpace());
    }

    @Test
    void testConvertToIccProfile() {
        BufferedImage inputImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ICC_Profile profile = ICC_Profile.getInstance(ColorSpace.CS_sRGB);

        BufferedImage outputImage = colorTools.convertToIccProfile(inputImage, profile);

        assertNotNull(outputImage);
        assertEquals(ColorSpace.TYPE_RGB, outputImage.getColorModel().getColorSpace().getType());
    }

    @Test
    void testRelabelColorSpace() throws IOException {
        BufferedImage inputImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);

        BufferedImage outputImage = colorTools.relabelColorSpace(inputImage, cs);

        assertNotNull(outputImage);
        assertEquals(cs, outputImage.getColorModel().getColorSpace());
    }

    @Test
    void testDeriveColorModel() throws IOException {
        BufferedImage inputImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);
        ColorModel colorModel = inputImage.getColorModel();

        ColorModel derivedModel = colorTools.deriveColorModel(colorModel, cs, false);

        assertNotNull(derivedModel);
        assertEquals(cs, derivedModel.getColorSpace());
    }

}
