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

public class RandoopTest {

    public static boolean debug = false;

    @Test
    void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.LZW_COMPRESSION_BLOCK_SIZE_LARGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65536 + "'", int0 == 65536);
    }

    @Test
    void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_NIKON_NEF_COMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34713 + "'", int0 == 34713);
    }

    @Test
    void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.awt.Color color2 = null;
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange paletteEntryForRange4 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange((float) (short) -1, (float) (-1L), color2, color3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified values must be v0<v1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_SGILOG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34676 + "'", int0 == 34676);
    }

    @Test
    void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_COLOR_CHARACTERIZATION;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_DOWN_1_2_ROW_EVEN_COLUMNS_OFFSET_RIGHT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.EXIF_TAG_MD_FILE_TAG;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_UNIQUE_CAMERA_MODEL;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_DEFLATE_PKZIP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32946 + "'", int0 == 32946);
    }

    @Test
    void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_ALTITUDE_REF;
        org.junit.Assert.assertNotNull(tagInfoByte0);
    }

    @Test
    void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType4 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("hi!", (int) (short) 10, abstractFieldType2, (int) (short) 10, tiffDirectoryType4);
    }

    @Test
    void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_SOUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "S" + "'", str0, "S");
    }

    @Test
    void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ORIENTATION;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "V" + "'", str0, "V");
    }

    @Test
    void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.MAKER_NOTE_SAFETY_VALUE_UNSAFE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_SHADE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PROFILE_EMBED_POLICY_VALUE_ALLOW_COPYING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.INDEXED_VALUE_INDEXED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_CONTRAST_2;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LATITUDE;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_RIGHT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SHADOWS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SOFTWARE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_PROCESSING_METHOD;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType1 = null;
        java.nio.ByteOrder byteOrder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = tagInfoGpsText0.encodeValue(abstractFieldType1, (java.lang.Object) 1.0f, byteOrder3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: GPS text value not String: 1.0 (java.lang.Float)");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoGpsText0);
    }

    @Test
    void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_BGRA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_A;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.RESOLUTION_UNIT_VALUE_CM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_SHADE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PREVIEW_DATE_TIME;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_ROOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_FINE_WEATHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fieldTypeShort2.getValue(tiffField3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getByteArrayValue()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_ICCPROFILE;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_SUB2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_REFERENCE_BLACK_WHITE;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int3 = org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr.convertYCbCrtoRGB(3, 34713, 65536);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-65281) + "'", int3 == (-65281));
    }

    @Test
    void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_DOT_RANGE;
        org.junit.Assert.assertNotNull(tagInfoByteOrShort0);
    }

    @Test
    void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SMIN_SAMPLE_VALUE;
        org.junit.Assert.assertNotNull(tagInfoAny0);
    }

    @Test
    void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_CONSECUTIVE_BAD_FAX_LINES;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants.TIFF_TAG_COLOR_RESPONSE_UNIT;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MODEL;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_BLACK_AND_WHITE;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_PIXEL_FORMAT;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 255 + "'", int0 == 255);
    }

    @Test
    void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_SPEED_REF_VALUE_MPH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "M" + "'", str0, "M");
    }

    @Test
    void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_DEPTH;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_4;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DNG_PRIVATE_DATA;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_DOES_NOT_EXIST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType5 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational6 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts("M", (int) (byte) -1, (int) (short) 100, tiffDirectoryType5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType5 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType5.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_EXPOSURE_INDEX;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_JPEG_OBSOLETE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_LZW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_CMYK;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_COOL_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry[] paletteEntryArray0 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry> paletteEntryList1 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry>) paletteEntryList1, paletteEntryArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat3 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((java.util.List<org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry>) paletteEntryList1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Palette entries list must be non-null and non-empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paletteEntryArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF_VALUE_EAST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "E" + "'", str0, "E");
    }

    @Test
    void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T82_T43;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XPOSITION;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_DAY_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROPERABILITY_INDEX;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_CFAPATTERN_2;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_IMAGE_HEIGHT;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_WIDTH;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32844 + "'", int0 == 32844);
    }

    @Test
    void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_LENS_SPECIFICATION;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_WHITE_BALANCE_1;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_IT8MP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32897 + "'", int0 == 32897);
    }

    @Test
    void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 95 + "'", int0 == 95);
    }

    @Test
    void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int int0 = org.apache.commons.imaging.formats.tiff.taginfos.TagInfo.LENGTH_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_D75;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.MAKER_NOTE_SAFETY_VALUE_SAFE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_HCUSAGE;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants.EXIF_TAG_FAX_RECV_PARAMS;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_D75;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_MULTI_SEGMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.BYTE_OR_SHORT;
        org.junit.Assert.assertNotNull(abstractFieldTypeList0);
    }

    @Test
    void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_ANNOTATIONS;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_RATING_PERCENT;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MATTEING;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DIFFERENTIAL_VALUE_DIFFERENTIAL_CORRECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.JPEGPROC_VALUE_BASELINE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_FREE_BYTE_COUNTS;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.OLD_SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk dataParserCmyk0 = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk();
        int[][][] intArray1 = new int[][][] {};
        java.awt.image.BufferedImage bufferedImage2 = null;
        org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dataParserCmyk0.parseData(intArray1, bufferedImage2, psdImageContents3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.BufferedImage.getRaster()\" because \"bi\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_MAKER_NOTE_SAFETY;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_TIFF_EPSTANDARD_ID_1;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL;
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational0);
    }

    @Test
    void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXIF_IMAGE_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SHORT_OR_LONG_OR_RATIONAL;
        org.junit.Assert.assertNotNull(abstractFieldTypeList0);
    }

    @Test
    void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_NEW_SUBFILE_TYPE;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IT8HEADER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_NUMBER;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FLASH;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XMP;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.RATIONAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii1 = org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.EXIF_TAG_MD_FILE_UNITS;
        java.nio.ByteOrder byteOrder2 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = fieldTypeRational0.writeData((java.lang.Object) tagInfoAscii1, byteOrder2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Invalid data: [TagInfo. tag: 33452 (0x82ac, name: MD FileUnits] (org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii)");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeRational0);
        org.junit.Assert.assertNotNull(tagInfoAscii1);
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_D55;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.ALL_EXIF_TAGS;
        java.lang.Class<?> wildcardClass1 = tagInfoList0.getClass();
        org.junit.Assert.assertNotNull(tagInfoList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SMAX_SAMPLE_VALUE;
        org.junit.Assert.assertNotNull(tagInfoAny0);
    }

    @Test
    void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants.ALL_GDAL_LIBRARY_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_BACKGROUND_COLOR_INDICATOR;
        boolean boolean1 = tagInfoByte0.isText();
        org.junit.Assert.assertNotNull(tagInfoByte0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_MEASURE_MODE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_MODE_NUMBER;
        org.junit.Assert.assertNotNull(tagInfoByte0);
    }

    @Test
    void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_COPYRIGHT;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_NEUTRAL;
        java.nio.ByteOrder byteOrder1 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.common.RationalNumber rationalNumber2 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray3 = new org.apache.commons.imaging.common.RationalNumber[] { rationalNumber2 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = tagInfoShortOrRational0.encodeValue(byteOrder1, rationalNumberArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"numerator\" because \"value\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoShortOrRational0);
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNotNull(rationalNumberArray3);
    }

    @Test
    void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        short short0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.COLORIMETRIC_REFERENCE_VALUE_OUTPUT_REFERRED;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0 == (short) 1);
    }

    @Test
    void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LATITUDE_REF;
        int int1 = tagInfoAscii0.tag;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.UNCOMPRESSED_VALUE_YES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_DATE_TIME_DIGITIZED;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_COOL_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_ADOBE_DEFLATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_WIDTH;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JPEG_OLD_STYLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_DESCRIPTION;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_HORIZONTAL_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_SUB0;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 69 + "'", int0 == 69);
    }

    @Test
    void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_START_IFD2;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_FOCAL_PLANE_XRESOLUTION;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_PROCESSING_METHOD;
        boolean boolean1 = tagInfoGpsText0.isText();
        org.junit.Assert.assertNotNull(tagInfoGpsText0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_CCITT_GROUP_4;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_RAW_DATA_UNIQUE_ID;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.FLAG_T4_OPTIONS_FILL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SOFTWARE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo6 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) (byte) -1, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort4, 10);
    }

    @Test
    void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_COLOR_MATRIX_2;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JBIG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34661 + "'", int0 == 34661);
    }

    @Test
    void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_FILL_ORDER;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF_VALUE_SOUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "S" + "'", str0, "S");
    }

    @Test
    void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_MEASURE_MODE_VALUE_2_DIMENSIONAL_MEASUREMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SCENE_CAPTURE_TYPE;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_COLOR_INDICATOR;
        java.lang.String str1 = tagInfoByte0.name;
        org.junit.Assert.assertNotNull(tagInfoByte0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ImageColorIndicator" + "'", str1, "ImageColorIndicator");
    }

    @Test
    void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_SATELLITES;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray4, 34713, (int) (byte) 0, false, (-65281));
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray9, (int) '4', 3, true, 17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Error reading image to compress");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 16]");
    }

    @Test
    void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_RESTART_INTERVAL;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_8_BIT_GRAY;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_DAY_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParserBitmap dataParserBitmap0 = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserBitmap();
    }

    @Test
    void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_16_BIT_GRAY;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_MANUAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat fieldTypeFloat2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat((int) (short) 100, "E");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fieldTypeFloat2.getValue(tiffField3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getByteArrayValue()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD0;
        org.junit.Assert.assertTrue("'" + tiffDirectoryType0 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD0 + "'", tiffDirectoryType0.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD0));
    }

    @Test
    void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.imaging.internal.Debug.debug(throwable0, 10);
    }

    @Test
    void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_BGR;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType9, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) '4', (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort4, 65536, tiffDirectoryType9, true);
        int int14 = fieldTypeShort4.getSize();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.ALL_GEO_TIFF_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_LENS_SERIAL_NUMBER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType3, false);
        boolean boolean6 = tiffDirectoryType3.isImageDirectory();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_LINEAR_RAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34892 + "'", int0 == 34892);
    }

    @Test
    void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.EXTRA_SAMPLE_ASSOCIATED_ALPHA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants.EXIF_TAG_GDAL_NO_DATA;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_IMAGE_HISTORY_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FLASH_ENERGY_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_TRACK_REF_VALUE_MAGNETIC_NORTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "M" + "'", str0, "M");
    }

    @Test
    void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SHORT_OR_RATIONAL;
        org.junit.Assert.assertNotNull(abstractFieldTypeList0);
    }

    @Test
    void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType1 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.getFieldType(32946);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Field type 32946 is unsupported");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
    }

    @Test
    void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii fieldTypeAscii0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.ASCII;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort1 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SHARPNESS_1;
        java.nio.ByteOrder byteOrder2 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = fieldTypeAscii0.writeData((java.lang.Object) tagInfoShort1, byteOrder2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Unknown data type: [TagInfo. tag: 41994 (0xa40a, name: Sharpness]");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeAscii0);
        org.junit.Assert.assertNotNull(tagInfoShort1);
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JPEG_2000;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34712 + "'", int0 == 34712);
    }

    @Test
    void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.nio.ByteOrder byteOrder0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory2 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory(byteOrder0, tiffDirectory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"type\" because \"directory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CONTRAST_1_VALUE_HIGH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DIRECTORY_FOOTER_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes("ImageColorIndicator", 34892, 20, tiffDirectoryType6);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SATURATION_1_VALUE_LOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_ITULAB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.ASCII_OR_BYTE;
        org.junit.Assert.assertNotNull(abstractFieldTypeList0);
    }

    @Test
    void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_COOL_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_ALPHA_DATA_DISCARD;
        org.junit.Assert.assertNotNull(tagInfoByte0);
    }

    @Test
    void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.FILL_ORDER_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_3;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_XPKEYWORDS;
        org.junit.Assert.assertNotNull(tagInfoXpString0);
    }

    @Test
    void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_TILE_DEPTH;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_LEAF_DATA;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_T6_GROUP_4_FAX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CONTRAST_1_VALUE_LOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SHARPNESS_1_VALUE_SOFT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_MIXED_RASTER_CONTENT_M;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 255 + "'", int0 == 255);
    }

    @Test
    void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_CONTRAST_1;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_CMYK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 79 + "'", int0 == 79);
    }

    @Test
    void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MAKER_NOTE;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SHORT;
        org.junit.Assert.assertNotNull(fieldTypeShort0);
    }

    @Test
    void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_KODAK_DCR_COMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65000 + "'", int0 == 65000);
    }

    @Test
    void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_EPSON_ERF_COMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.THRESHOLDING_VALUE_RANDOMIZED_DITHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_CCIRLEW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32771 + "'", int0 == 32771);
    }

    @Test
    void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_UNCOMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined tagInfoUndefined0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROPERABILITY_VERSION;
        org.junit.Assert.assertNotNull(tagInfoUndefined0);
    }

    @Test
    void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FNUMBER;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_ISO;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_0001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_HOR_POSITIONING_ERROR;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 73 + "'", int0 == 73);
    }

    @Test
    void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        org.junit.Assert.assertNotNull(tagInfoByte0);
    }

    @Test
    void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.YCB_CR_POSITIONING_VALUE_CENTERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BASELINE_EXPOSURE;
        org.junit.Assert.assertNotNull(tagInfoSRational0);
    }

    @Test
    void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_DAYLIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_COLOR_MATRIX_1;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T4_1D;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants.ALL_ALIAS_SKETCHBOOK_PRO_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS;
        boolean boolean1 = tagInfoShortOrLong0.isOffset();
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_HOST_COMPUTER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_AVERAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MAKE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_BODY_SERIAL_NUMBER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants.COLOR_RESPONSE_UNIT_VALUE_0_0001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_C;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 19 + "'", int0 == 19);
    }

    @Test
    void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_ALTITUDE_REF_VALUE_ABOVE_SEA_LEVEL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants.EXIF_TAG_FAX_SUB_ADDRESS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DNG_LENS_INFO;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_EXIF;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.awt.Color color2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange paletteEntryForRange3 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange((float) (byte) 10, (float) 32897, color2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null colors not allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_STANDARD_LIGHT_A;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CURRENT_PRE_PROFILE_MATRIX;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_LOSSLESS_PREDICTORS;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DIRECTORY_HEADER_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COLOR_MAP;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.WangTagConstants.EXIF_TAG_WANG_ANNOTATION;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader0 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray1 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, tiffDirectoryArray1);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray4 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5, tiffFieldArray4);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader0, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5);
        // The following exception was thrown during execution in test generation
        try {
            tiffContents7.dissect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"offset\" because \"element\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffDirectoryArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_NO_FLASH_FUNCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SATURATION_1;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_CCITT_GROUP_3;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_LOSSLESS_COLOR_AND_GRAYSCALE_L;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_FLASH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXPOSURE_PROGRAM;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_D75;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_XPSUBJECT;
        org.junit.Assert.assertNotNull(tagInfoXpString0);
    }

    @Test
    void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-4) + "'", int0 == (-4));
    }

    @Test
    void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_CCITT_1D;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_USER_COMMENT;
        org.junit.Assert.assertNotNull(tagInfoGpsText0);
    }

    @Test
    void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType8);
        java.nio.ByteOrder byteOrder12 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray14 = tagInfoSByte11.encodeValue(byteOrder12, (byte) 0);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
    }

    @Test
    void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YCBCR_SUB_SAMPLING;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_STRIP_ROW_COUNTS;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_RELATED_IMAGE_WIDTH;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_DOWN_1_2_ROW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType8, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort4, tiffDirectoryType8);
        java.lang.String str12 = fieldTypeShort4.getName();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_D50;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T82_T85;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_NAUTICAL_MILES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "N" + "'", str0, "N");
    }

    @Test
    void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory0 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter1 = null;
        int[] intArray7 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration14 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader16 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder17 = tiffReader16.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles18 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled19 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory0, photometricInterpreter1, 10, (int) (byte) 10, (-65281), intArray7, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration14, byteOrder17, tiles18);
        java.awt.Rectangle rectangle20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterData tiffRasterData21 = dataReaderTiled19.readRasterData(rectangle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"tiles\" because \"this.imageData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy0 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffImageWriterLossy0.write(outputStream1, tiffOutputSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.write.TiffOutputSet.isEmpty()\" because \"outputSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii fieldTypeAscii0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.ASCII;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii1 = org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants.EXIF_TAG_ALIAS_LAYER_METADATA;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort6 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, abstractFieldTypeArray7);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, tiffDirectoryType10);
        java.nio.ByteOrder byteOrder12 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray14 = tagInfoByte11.encodeValue(byteOrder12, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = fieldTypeAscii0.writeData((java.lang.Object) tagInfoAscii1, byteOrder12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Unknown data type: [TagInfo. tag: 50784 (0xc660, name: Alias Layer Metadata]");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeAscii0);
        org.junit.Assert.assertNotNull(tagInfoAscii1);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
    }

    @Test
    void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_TRACK;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 77 + "'", int0 == 77);
    }

    @Test
    void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_BRIGHTNESS_VALUE;
        org.junit.Assert.assertNotNull(tagInfoSRational0);
    }

    @Test
    void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.TIFF_TAG_OPIPROXY;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_EXISTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T81;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DIFFERENTIAL;
        boolean boolean1 = tagInfoShort0.isOffset();
        org.junit.Assert.assertNotNull(tagInfoShort0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("ImageLayer", (int) (byte) 100, 32, tiffDirectoryType3);
    }

    @Test
    void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_DELTA_H;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.ALL_MICROSOFT_HD_PHOTO_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants.EXIF_TAG_OCE_IMAGE_LOGIC_CHARACTERISTICS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_LANDSCAPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_MULTI_PAGE_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb dataParserRgb0 = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb();
    }

    @Test
    void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader1 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance3 = null;
        org.apache.commons.imaging.formats.tiff.TiffReader.Listener listener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffReader1.read(byteSource2, formatCompliance3, listener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.bytesource.ByteSource.getInputStream()\" because \"byteSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_PROPHOTO_RGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_UNKNOWN;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ARTIST;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_IMAGE_NUMBER_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals2 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder3 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals4 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort5 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort10 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, abstractFieldTypeArray11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, tiffDirectoryType14);
        java.nio.ByteOrder byteOrder16 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray18 = tagInfoByte15.encodeValue(byteOrder16, (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray23, 34713, (int) (byte) 0, false, (-65281));
        short short29 = tagInfoShort5.getValue(byteOrder16, byteArray28);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort34 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort34 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList36 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, abstractFieldTypeArray35);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType38 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, tiffDirectoryType38);
        java.nio.ByteOrder byteOrder40 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray42 = tagInfoByte39.encodeValue(byteOrder40, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray43 = tagInfoSRationals4.getValue(byteOrder16, byteArray42);
        byte[] byteArray44 = tagInfoRationals2.encodeValue(byteOrder3, rationalNumberArray43);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data45 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 64, 34712, byteArray44);
        int int46 = data45.length;
        java.lang.String str47 = data45.getElementDescription();
        long long48 = data45.offset;
        org.junit.Assert.assertNotNull(tagInfoRationals2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(tagInfoSRationals4);
        org.junit.Assert.assertNotNull(tagInfoShort5);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 4096 + "'", short29 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 34712 + "'", int46 == 34712);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "TIFF image data: 0 bytes" + "'", str47, "TIFF image data: 0 bytes");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 64L + "'", long48 == 64L);
    }

    @Test
    void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_D65;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 21 + "'", int0 == 21);
    }

    @Test
    void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_WHITE_POINT;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_OPCODE_LIST_2;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_ALTITUDE;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CFAPLANE_COLOR;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROP_OFFSET;
        org.junit.Assert.assertNotNull(tagInfoDirectory0);
    }

    @Test
    void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals2 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder3 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals4 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort5 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort10 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, abstractFieldTypeArray11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, tiffDirectoryType14);
        java.nio.ByteOrder byteOrder16 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray18 = tagInfoByte15.encodeValue(byteOrder16, (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray23, 34713, (int) (byte) 0, false, (-65281));
        short short29 = tagInfoShort5.getValue(byteOrder16, byteArray28);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort34 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort34 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList36 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, abstractFieldTypeArray35);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType38 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, tiffDirectoryType38);
        java.nio.ByteOrder byteOrder40 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray42 = tagInfoByte39.encodeValue(byteOrder40, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray43 = tagInfoSRationals4.getValue(byteOrder16, byteArray42);
        byte[] byteArray44 = tagInfoRationals2.encodeValue(byteOrder3, rationalNumberArray43);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data45 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 64, 34712, byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray49 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.decompressT4_1D(byteArray44, (int) '#', 22, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Decompression error");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoRationals2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(tagInfoSRationals4);
        org.junit.Assert.assertNotNull(tagInfoShort5);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 4096 + "'", short29 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
    }

    @Test
    void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_DEVICE_SETTING_DESCRIPTION;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_COLOR_VALUE;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals2 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder3 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals4 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort5 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort10 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, abstractFieldTypeArray11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, tiffDirectoryType14);
        java.nio.ByteOrder byteOrder16 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray18 = tagInfoByte15.encodeValue(byteOrder16, (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray23, 34713, (int) (byte) 0, false, (-65281));
        short short29 = tagInfoShort5.getValue(byteOrder16, byteArray28);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort34 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort34 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList36 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, abstractFieldTypeArray35);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType38 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, tiffDirectoryType38);
        java.nio.ByteOrder byteOrder40 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray42 = tagInfoByte39.encodeValue(byteOrder40, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray43 = tagInfoSRationals4.getValue(byteOrder16, byteArray42);
        byte[] byteArray44 = tagInfoRationals2.encodeValue(byteOrder3, rationalNumberArray43);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data45 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 64, 34712, byteArray44);
        java.lang.String str46 = data45.getElementDescription();
        org.junit.Assert.assertNotNull(tagInfoRationals2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(tagInfoSRationals4);
        org.junit.Assert.assertNotNull(tagInfoShort5);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 4096 + "'", short29 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "TIFF image data: 0 bytes" + "'", str46, "TIFF image data: 0 bytes");
    }

    @Test
    void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BASELINE_NOISE;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_UP_1_2_ROW_EVEN_COLUMNS_OFFSET_LEFT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_SELF_TIMER_MODE;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong("E", 0, tiffDirectoryType8);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_HORIZONTAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory1 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter2 = null;
        int[] intArray8 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration15 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader17 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder18 = tiffReader17.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled20 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory1, photometricInterpreter2, 10, (int) (byte) 10, (-65281), intArray8, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration15, byteOrder18, tiles19);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab24 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab((int) (short) 1, intArray8, 32769, 3, (int) (byte) 10);
        org.apache.commons.imaging.common.ImageBuilder imageBuilder25 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong26 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder27 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray33 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray34 = tagInfoShortOrLong26.encodeValue(byteOrder27, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            photometricInterpreterCieLab24.interpretPixel(imageBuilder25, intArray33, 69, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.common.ImageBuilder.setRgb(int, int, int)\" because \"imageBuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration15 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration15.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(tagInfoShortOrLong26);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
    }

    @Test
    void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_LEAF_SUB_IFD;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration1 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.lenientValueOf((int) (short) 0);
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration1 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration1.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
    }

    @Test
    void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory0 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter1 = null;
        int[] intArray7 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration14 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader16 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder17 = tiffReader16.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles18 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled19 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory0, photometricInterpreter1, 10, (int) (byte) 10, (-65281), intArray7, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration14, byteOrder17, tiles18);
        java.awt.Rectangle rectangle20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.ImageBuilder imageBuilder23 = dataReaderTiled19.readImageData(rectangle20, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"tiles\" because \"this.imageData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_XPCOMMENT;
        org.junit.Assert.assertNotNull(tagInfoXpString0);
    }

    @Test
    void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii fieldTypeAscii2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii((int) (short) -1, "E");
    }

    @Test
    void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CUSTOM_RENDERED_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 71 + "'", int0 == 71);
    }

    @Test
    void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_FINE_WEATHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy0 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffImageWriterLossy0.write(outputStream1, tiffOutputSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.write.TiffOutputSet.isEmpty()\" because \"outputSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_ROW_INTERLEAVE_FACTOR;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.ALL_GPS_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 89 + "'", int0 == 89);
    }

    @Test
    void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PROFILE_EMBED_POLICY_VALUE_NO_RESTRICTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_IMAGE_DATA_DISCARD;
        org.junit.Assert.assertNotNull(tagInfoByte0);
    }

    @Test
    void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_ADOBE_RGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.awt.Color color2 = null;
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange paletteEntryForRange4 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange(0.0f, (float) 20, color2, color3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null colors not allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_CUSTOM_RENDERED;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType5 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii6 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("", (int) (short) 0, tiffDirectoryType5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType5 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType5.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
    }

    @Test
    void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JPEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_ALPHA_BYTE_COUNT;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        byte[] byteArray0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.gpsVersion();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[2, 3, 0, 0]");
    }

    @Test
    void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("N", (-2), 89, tiffDirectoryType10, false);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType10 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType10.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.EXIF_TAG_MODEL_PIXEL_SCALE_TAG;
        org.junit.Assert.assertNotNull(tagInfoDoubles0);
    }

    @Test
    void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.TIFF_TAG_IMAGE_ID;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.INK_SET_VALUE_NOT_CMYK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_MASKED_AREAS;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CAMERA_CALIBRATION_SIGNATURE;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory0 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter1 = null;
        int[] intArray7 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration14 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader16 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder17 = tiffReader16.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles18 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled19 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory0, photometricInterpreter1, 10, (int) (byte) 10, (-65281), intArray7, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration14, byteOrder17, tiles18);
        java.awt.Rectangle rectangle20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.ImageBuilder imageBuilder23 = dataReaderTiled19.readImageData(rectangle20, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"tiles\" because \"this.imageData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_DEFAULT_IMAGE_COLOR;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_ANALOG_BALANCE;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader0 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray1 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, tiffDirectoryArray1);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray4 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5, tiffFieldArray4);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader0, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList8 = tiffContents7.tiffFields;
        // The following exception was thrown during execution in test generation
        try {
            tiffContents7.dissect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"offset\" because \"element\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffDirectoryArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tiffFieldList8);
    }

    @Test
    void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_CMYK;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.awt.Color color2 = null;
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange paletteEntryForRange4 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange((float) 89, (float) 1L, color2, color3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified values must be v0<v1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType12 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType12, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) '4', (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort7, 65536, tiffDirectoryType12, true);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("", 8, 22, tiffDirectoryType12);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType12 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType12.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_CALIBRATION_SIGNATURE;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort1 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort6 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, abstractFieldTypeArray7);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, tiffDirectoryType10);
        java.nio.ByteOrder byteOrder12 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray14 = tagInfoByte11.encodeValue(byteOrder12, (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray24 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray19, 34713, (int) (byte) 0, false, (-65281));
        short short25 = tagInfoShort1.getValue(byteOrder12, byteArray24);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort30 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray31 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort30 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList32 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, abstractFieldTypeArray31);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType34 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, tiffDirectoryType34);
        java.nio.ByteOrder byteOrder36 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray38 = tagInfoByte35.encodeValue(byteOrder36, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray39 = tagInfoSRationals0.getValue(byteOrder12, byteArray38);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless40 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray38);
        java.io.OutputStream outputStream41 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet42 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffImageWriterLossless40.write(outputStream41, tiffOutputSet42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.write.TiffOutputSet.findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo)\" because \"outputSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
        org.junit.Assert.assertNotNull(tagInfoShort1);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 4096 + "'", short25 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray39);
    }

    @Test
    void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader0 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray1 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, tiffDirectoryArray1);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray4 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5, tiffFieldArray4);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader0, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList8 = tiffContents7.tiffFields;
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader9 = tiffContents7.header;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes10 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_PHOTOSHOP_SETTINGS;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField11 = tiffContents7.findField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoBytes10);
        org.junit.Assert.assertNotNull(tiffDirectoryArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tiffFieldList8);
        org.junit.Assert.assertNull(tiffHeader9);
        org.junit.Assert.assertNotNull(tagInfoBytes10);
        org.junit.Assert.assertNull(tiffField11);
    }

    @Test
    void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CHROMA_BLUR_RADIUS;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.ALL_MOLECULAR_DYNAMICS_GEL_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds("TIFF image data: 0 bytes", 4, 95, tiffDirectoryType9);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.FLAG_T4_OPTIONS_UNCOMPRESSED_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_DISTANCE_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_CELL_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.LONG8;
        org.junit.Assert.assertNotNull(fieldTypeLong8_0);
    }

    @Test
    void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_CFAPATTERN;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort8 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType12 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType12, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort8, tiffDirectoryType12);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType19 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts20 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts("E", 34661, 34713, tiffDirectoryType19);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("ImageLayer", (-4), (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort8, tiffDirectoryType19);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte22 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("", 12, tiffDirectoryType19);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType12 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType12.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType19 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType19.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory0 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter1 = null;
        int[] intArray7 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration14 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader16 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder17 = tiffReader16.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles18 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled19 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory0, photometricInterpreter1, 10, (int) (byte) 10, (-65281), intArray7, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration14, byteOrder17, tiles18);
        java.lang.Class<?> wildcardClass20 = dataReaderTiled19.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_UP_1_2_ROW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_WHITE_BALANCE_2;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MAX_APERTURE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals2 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder3 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals4 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort5 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort10 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, abstractFieldTypeArray11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, tiffDirectoryType14);
        java.nio.ByteOrder byteOrder16 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray18 = tagInfoByte15.encodeValue(byteOrder16, (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray23, 34713, (int) (byte) 0, false, (-65281));
        short short29 = tagInfoShort5.getValue(byteOrder16, byteArray28);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort34 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort34 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList36 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, abstractFieldTypeArray35);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType38 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, tiffDirectoryType38);
        java.nio.ByteOrder byteOrder40 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray42 = tagInfoByte39.encodeValue(byteOrder40, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray43 = tagInfoSRationals4.getValue(byteOrder16, byteArray42);
        byte[] byteArray44 = tagInfoRationals2.encodeValue(byteOrder3, rationalNumberArray43);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort45 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort50 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray51 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort50 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList52 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList52, abstractFieldTypeArray51);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType54 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte55 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList52, tiffDirectoryType54);
        java.nio.ByteOrder byteOrder56 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray58 = tagInfoByte55.encodeValue(byteOrder56, (byte) 0);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray68 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray63, 34713, (int) (byte) 0, false, (-65281));
        short short69 = tagInfoShort45.getValue(byteOrder56, byteArray68);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless70 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray68);
        short[] shortArray71 = tagInfoShorts1.getValue(byteOrder3, byteArray68);
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray81 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray76, 34713, (int) (byte) 0, false, (-65281));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber82 = tagInfoRational0.getValue(byteOrder3, byteArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoRational0);
        org.junit.Assert.assertNotNull(tagInfoShorts1);
        org.junit.Assert.assertNotNull(tagInfoRationals2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(tagInfoSRationals4);
        org.junit.Assert.assertNotNull(tagInfoShort5);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 4096 + "'", short29 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort45);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteOrder56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 4096 + "'", short69 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[4096]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[0, 16]");
    }

    @Test
    void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_D50;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CAMERA_CALIBRATION_1;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T6;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DIFFERENTIAL_VALUE_NO_CORRECTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort1 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort6 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, abstractFieldTypeArray7);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, tiffDirectoryType10);
        java.nio.ByteOrder byteOrder12 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray14 = tagInfoByte11.encodeValue(byteOrder12, (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray24 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray19, 34713, (int) (byte) 0, false, (-65281));
        short short25 = tagInfoShort1.getValue(byteOrder12, byteArray24);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort30 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray31 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort30 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList32 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, abstractFieldTypeArray31);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType34 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, tiffDirectoryType34);
        java.nio.ByteOrder byteOrder36 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray38 = tagInfoByte35.encodeValue(byteOrder36, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray39 = tagInfoSRationals0.getValue(byteOrder12, byteArray38);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless40 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray38);
        java.awt.image.BufferedImage bufferedImage41 = null;
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters43 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffImageWriterLossless40.writeImage(bufferedImage41, outputStream42, tiffImagingParameters43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffImagingParameters.getOutputSet()\" because \"params\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
        org.junit.Assert.assertNotNull(tagInfoShort1);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 4096 + "'", short25 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray39);
    }

    @Test
    void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_OPCODE_LIST_1;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DOP;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CALIBRATION_ILLUMINANT_1;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory2 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter3 = null;
        int[] intArray9 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration16 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader18 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder19 = tiffReader18.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles20 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled21 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory2, photometricInterpreter3, 10, (int) (byte) 10, (-65281), intArray9, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration16, byteOrder19, tiles20);
        byte[] byteArray23 = tagInfoShort1.encodeValue(byteOrder19, (short) 4096);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts24 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational25 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort30 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray31 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort30 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList32 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, abstractFieldTypeArray31);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType34 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, tiffDirectoryType34);
        java.nio.ByteOrder byteOrder36 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray38 = tagInfoByte35.encodeValue(byteOrder36, (byte) 0);
        short[] shortArray39 = new short[] {};
        byte[] byteArray40 = tagInfoShortOrLongOrRational25.encodeValue(byteOrder36, shortArray39);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational41 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort46 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray47 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort46 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList48 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList48, abstractFieldTypeArray47);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType50 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte51 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList48, tiffDirectoryType50);
        java.nio.ByteOrder byteOrder52 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray54 = tagInfoByte51.encodeValue(byteOrder52, (byte) 0);
        short[] shortArray55 = new short[] {};
        byte[] byteArray56 = tagInfoShortOrLongOrRational41.encodeValue(byteOrder52, shortArray55);
        byte[] byteArray57 = tagInfoShorts24.encodeValue(byteOrder36, shortArray55);
        byte[] byteArray62 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray57, 1, (-65281), false, 7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber63 = tagInfoRational0.getValue(byteOrder19, byteArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoRational0);
        org.junit.Assert.assertNotNull(tagInfoShort1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration16 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration16.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[16, 0]");
        org.junit.Assert.assertNotNull(tagInfoShorts24);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational25);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational41);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(byteOrder52);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 16]");
    }

    @Test
    void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_LOW_GAIN_UP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SUBJECT_DISTANCE_RANGE_VALUE_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_INK_NAMES;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.ALL_DNG_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_VERSION_YEAR;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_00001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_TRANSFORMATION;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined tagInfoUndefined0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_PRINT_IM;
        org.junit.Assert.assertNotNull(tagInfoUndefined0);
    }

    @Test
    void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.TIFF_TAG_CLIP_PATH;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort9 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType13 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType13, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort9, tiffDirectoryType13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("hi!", (int) (short) 10, (int) (byte) -1, tiffDirectoryType13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("V", 2, tiffDirectoryType13);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType13 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType13.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType5 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble6 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknown tagInfoUnknown7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknown("ImageColorIndicator", 37, tiffDirectoryType5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType5 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType5.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader0 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray1 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, tiffDirectoryArray1);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray4 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5, tiffFieldArray4);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader0, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator8 = tiffFieldList5.spliterator();
        org.junit.Assert.assertNotNull(tiffDirectoryArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator8);
    }

    @Test
    void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_CFAREPEAT_PATTERN_DIM;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FILE_SOURCE_VALUE_DIGITAL_CAMERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_RGBE;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_STATUS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_IMG_DIRECTION_REF_VALUE_MAGNETIC_NORTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "M" + "'", str0, "M");
    }

    @Test
    void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_OFF_DID_NOT_FIRE_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_ORIGINAL_RAW_FILE_DIGEST;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("N", 3, 23, tiffDirectoryType9);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals2 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder3 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals4 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort5 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort10 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, abstractFieldTypeArray11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, tiffDirectoryType14);
        java.nio.ByteOrder byteOrder16 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray18 = tagInfoByte15.encodeValue(byteOrder16, (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray23, 34713, (int) (byte) 0, false, (-65281));
        short short29 = tagInfoShort5.getValue(byteOrder16, byteArray28);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort34 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort34 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList36 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, abstractFieldTypeArray35);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType38 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, tiffDirectoryType38);
        java.nio.ByteOrder byteOrder40 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray42 = tagInfoByte39.encodeValue(byteOrder40, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray43 = tagInfoSRationals4.getValue(byteOrder16, byteArray42);
        byte[] byteArray44 = tagInfoRationals2.encodeValue(byteOrder3, rationalNumberArray43);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data45 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 64, 34712, byteArray44);
        int int46 = data45.length;
        java.lang.String str47 = data45.getElementDescription();
        int int48 = data45.length;
        org.junit.Assert.assertNotNull(tagInfoRationals2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(tagInfoSRationals4);
        org.junit.Assert.assertNotNull(tagInfoShort5);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 4096 + "'", short29 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 34712 + "'", int46 == 34712);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "TIFF image data: 0 bytes" + "'", str47, "TIFF image data: 0 bytes");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 34712 + "'", int48 == 34712);
    }

    @Test
    void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_NORTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "N" + "'", str0, "N");
    }

    @Test
    void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SATURATION_2;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IPTC_NAA;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.UNCOMPRESSED_VALUE_NO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_AFCP_IPTC;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_OFF_NO_FLASH_FUNCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
    }

    @Test
    void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_HUE_SAT_MAP_DATA1;
        org.junit.Assert.assertNotNull(tagInfoFloats0);
    }

    @Test
    void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.TIFF_TAG_XCLIP_PATH_UNITS;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.util.Comparator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectoryComparator0 = org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory.COMPARATOR;
        org.junit.Assert.assertNotNull(tiffOutputDirectoryComparator0);
    }

    @Test
    void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65 + "'", int0 == 65);
    }

    @Test
    void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_XPTITLE;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = tagInfoXpString0.getValue(tiffField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getFieldType()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoXpString0);
    }

    @Test
    void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts("E", (int) (byte) -1, (-1), tiffDirectoryType6);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
    }

    @Test
    void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SEMINFO;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_PACKBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32773 + "'", int0 == 32773);
    }

    @Test
    void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_HIGH_GAIN_UP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_ISO_STUDIO_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("TIFF image data: 0 bytes", 0, 6, tiffDirectoryType3);
    }

    @Test
    void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_TIME_STAMP;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CUSTOM_RENDERED_VALUE_CUSTOM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        int int1 = tiffImagingParameters0.getSubImageHeight();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SUBJECT_LOCATION;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.awt.Color color2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange paletteEntryForRange3 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange((float) '4', (float) 2, color2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified values must be v0<v1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SENSING_METHOD_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        float[] floatArray7 = new float[] { (short) 4096, (short) 4096, (-2), 34712, 16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat8 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat(20, 3, floatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified data does not contain sufficient elements");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[4096.0, 4096.0, -2.0, 34712.0, 16.0]");
    }

    @Test
    void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTERGRAPH_FLAG_REGISTERS;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_ROTATE_180;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.EXIF_TAG_GEO_KEY_DIRECTORY_TAG;
        java.lang.Class<?> wildcardClass1 = tagInfoShorts0.getClass();
        org.junit.Assert.assertNotNull(tagInfoShorts0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "TIFF image data: 0 bytes");
    }

    @Test
    void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong fieldTypeLong0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SLONG;
        org.junit.Assert.assertNotNull(fieldTypeLong0);
    }

    @Test
    void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants.EXIF_TAG_OCE_SCANJOB_DESCRIPTION;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_CLOUDY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.PROFILE_TYPE_VALUE_UNSPECIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType9, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) '4', (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort4, 65536, tiffDirectoryType9, true);
        boolean boolean14 = tiffDirectoryType9.isImageDirectory();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 255 + "'", int0 == 255);
    }

    @Test
    void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_CELL_WIDTH;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CURRENT_ICCPROFILE;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String str1 = org.apache.commons.imaging.formats.tiff.TiffDirectory.description(89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bad Type" + "'", str1, "Bad Type");
    }

    @Test
    void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TRANSFER_RANGE;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = tagInfoShorts0.getValue(tiffField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getFieldType()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_OPTO_ELECTRIC_CONV_FACTOR;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType7 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("M", 9, 32844, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", (int) (byte) 10, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("", 1, tiffDirectoryType7);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType7 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType7.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_DIGITAL_ZOOM_RATIO;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_ISO_STUDIO_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.VERSION_BIG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43 + "'", int0 == 43);
    }

    @Test
    void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTER_COLOR_PROFILE;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DOP;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational13 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_NEUTRAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort14 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTERLACE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts15 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational16 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort21 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray22 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort21 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList23 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList23, abstractFieldTypeArray22);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType25 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte26 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList23, tiffDirectoryType25);
        java.nio.ByteOrder byteOrder27 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray29 = tagInfoByte26.encodeValue(byteOrder27, (byte) 0);
        short[] shortArray30 = new short[] {};
        byte[] byteArray31 = tagInfoShortOrLongOrRational16.encodeValue(byteOrder27, shortArray30);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational32 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        short[] shortArray46 = new short[] {};
        byte[] byteArray47 = tagInfoShortOrLongOrRational32.encodeValue(byteOrder43, shortArray46);
        byte[] byteArray48 = tagInfoShorts15.encodeValue(byteOrder27, shortArray46);
        byte[] byteArray50 = tagInfoShort14.encodeValue(byteOrder27, (short) (byte) 10);
        short[] shortArray52 = new short[] { (byte) 0 };
        byte[] byteArray53 = tagInfoShortOrRational13.encodeValue(byteOrder27, shortArray52);
        byte[] byteArray55 = tagInfoSByte12.encodeValue(byteOrder27, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber rationalNumber56 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray57 = tagInfoRational0.encodeValue(byteOrder27, rationalNumber56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"numerator\" because \"value\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoRational0);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(tagInfoShortOrRational13);
        org.junit.Assert.assertNotNull(tagInfoShort14);
        org.junit.Assert.assertNotNull(tagInfoShorts15);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational16);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational32);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0]");
    }

    @Test
    void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SHARPNESS_2;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.YCB_CR_POSITIONING_VALUE_CO_SITED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_HUE_SAT_MAP_DIMS;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader2 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder3 = tiffReader2.getByteOrder();
        int[] intArray7 = new int[] { (byte) 1, 14, 22 };
        int int8 = org.apache.commons.imaging.internal.SafeOperations.add(intArray7);
        byte[] byteArray9 = tagInfoLongs0.encodeValue(byteOrder3, intArray7);
        org.junit.Assert.assertNotNull(tagInfoLongs0);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37 + "'", int8 == 37);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 1, 0, 0, 0, 14, 0, 0, 0, 22]");
    }

    @Test
    void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_LOW_GAIN_DOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.imaging.internal.Debug.debug("");
    }

    @Test
    void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        short short0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.COLORIMETRIC_REFERENCE_VALUE_SCENE_REFERRED;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk dataParserCmyk0 = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk();
        int int1 = dataParserCmyk0.getBasicChannelsCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_POINT_TRANSFORMS;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined tagInfoUndefined0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SCENE_TYPE;
        org.junit.Assert.assertNotNull(tagInfoUndefined0);
    }

    @Test
    void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_MULTI_SPOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader1 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        org.apache.commons.imaging.bytesource.ByteSource byteSource2 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters3 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity4 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters3.setPixelDensity(pixelDensity4);
        java.lang.Integer int6 = tiffImagingParameters3.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters8 = tiffImagingParameters3.setXmpXml("V");
        org.apache.commons.imaging.FormatCompliance formatCompliance9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffContents tiffContents10 = tiffReader1.readContents(byteSource2, tiffImagingParameters3, formatCompliance9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.bytesource.ByteSource.getInputStream()\" because \"byteSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(tiffImagingParameters8);
    }

    @Test
    void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_D50;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong fieldTypeLong0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.IFD;
        org.junit.Assert.assertNotNull(fieldTypeLong0);
    }

    @Test
    void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub stub2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.Stub((long) 37, 12);
    }

    @Test
    void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts8 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals9 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder10 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort12 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort17 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray18 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort17 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList19 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList19, abstractFieldTypeArray18);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType21 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte22 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList19, tiffDirectoryType21);
        java.nio.ByteOrder byteOrder23 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray25 = tagInfoByte22.encodeValue(byteOrder23, (byte) 0);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray35 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray30, 34713, (int) (byte) 0, false, (-65281));
        short short36 = tagInfoShort12.getValue(byteOrder23, byteArray35);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort41 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray42 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort41 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList43 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList43, abstractFieldTypeArray42);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType45 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte46 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList43, tiffDirectoryType45);
        java.nio.ByteOrder byteOrder47 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray49 = tagInfoByte46.encodeValue(byteOrder47, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray50 = tagInfoSRationals11.getValue(byteOrder23, byteArray49);
        byte[] byteArray51 = tagInfoRationals9.encodeValue(byteOrder10, rationalNumberArray50);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort52 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort57 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray58 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort57 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList59 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList59, abstractFieldTypeArray58);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType61 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte62 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList59, tiffDirectoryType61);
        java.nio.ByteOrder byteOrder63 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray65 = tagInfoByte62.encodeValue(byteOrder63, (byte) 0);
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray75 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray70, 34713, (int) (byte) 0, false, (-65281));
        short short76 = tagInfoShort52.getValue(byteOrder63, byteArray75);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless77 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray75);
        short[] shortArray78 = tagInfoShorts8.getValue(byteOrder10, byteArray75);
        int[] intArray79 = new int[] {};
        byte[] byteArray80 = tagInfoShortOrLongOrRational7.encodeValue(byteOrder10, intArray79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt81 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(15, 64, (int) 'a', intArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified data does not contain sufficient elements");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoShorts8);
        org.junit.Assert.assertNotNull(tagInfoRationals9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(tagInfoSRationals11);
        org.junit.Assert.assertNotNull(tagInfoShort12);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 4096 + "'", short36 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteOrder47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort52);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) 4096 + "'", short76 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[4096]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[]");
    }

    @Test
    void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SATURATION_1_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_ORIGINAL_RAW_FILE_NAME;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_TRILINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_LINEARIZATION_TABLE;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory0 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat3 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 8, (float) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory6 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter7 = null;
        int[] intArray13 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration20 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader22 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder23 = tiffReader22.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles24 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled25 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory6, photometricInterpreter7, 10, (int) (byte) 10, (-65281), intArray13, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration20, byteOrder23, tiles24);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab29 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(71, intArray13, (int) (short) 100, 77, 5);
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration36 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.PLANAR;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong37 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder38 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray44 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray45 = tagInfoShortOrLong37.encodeValue(byteOrder38, intArray44);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray47 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips49 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray47, 32844);
        int int50 = strips49.getImageDataLength();
        int int51 = strips49.rowsPerStrip;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips dataReaderStrips52 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips(tiffDirectory0, (org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterFloat3, 0, intArray13, 32771, (-1), 95, (-65281), (-2), 0, tiffPlanarConfiguration36, byteOrder38, 95, strips49);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration20 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration20.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration36 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.PLANAR + "'", tiffPlanarConfiguration36.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.PLANAR));
        org.junit.Assert.assertNotNull(tagInfoShortOrLong37);
        org.junit.Assert.assertNotNull(byteOrder38);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dataElementArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32844 + "'", int51 == 32844);
    }

    @Test
    void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ALL_TIFF_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii fieldTypeAscii0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.ASCII;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fieldTypeAscii0.getValue(tiffField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getByteArrayValue()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeAscii0);
    }

    @Test
    void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_MULTI_PAGE_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        int int3 = org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr.convertYCbCrtoRGB(0, 11, 34661);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-65536) + "'", int3 == (-65536));
    }

    @Test
    void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_PRE_PROFILE_MATRIX;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_BGR101010;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TRANSFER_FUNCTION;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_TIFF_EPSTANDARD_ID_2;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_OFFSET_SCHEMA;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder2 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray8 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray9 = tagInfoShortOrLong1.encodeValue(byteOrder2, intArray8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts10 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational11 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort16 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray17 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort16 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList18 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList18, abstractFieldTypeArray17);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType20 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList18, tiffDirectoryType20);
        java.nio.ByteOrder byteOrder22 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray24 = tagInfoByte21.encodeValue(byteOrder22, (byte) 0);
        short[] shortArray25 = new short[] {};
        byte[] byteArray26 = tagInfoShortOrLongOrRational11.encodeValue(byteOrder22, shortArray25);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational27 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort32 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray33 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort32 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList34 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList34, abstractFieldTypeArray33);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType36 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte37 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList34, tiffDirectoryType36);
        java.nio.ByteOrder byteOrder38 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray40 = tagInfoByte37.encodeValue(byteOrder38, (byte) 0);
        short[] shortArray41 = new short[] {};
        byte[] byteArray42 = tagInfoShortOrLongOrRational27.encodeValue(byteOrder38, shortArray41);
        byte[] byteArray43 = tagInfoShorts10.encodeValue(byteOrder22, shortArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = tagInfoSLong0.getValue(byteOrder2, byteArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoSLong0);
        org.junit.Assert.assertNotNull(tagInfoShortOrLong1);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(tagInfoShorts10);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational11);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational27);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteOrder38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
    }

    @Test
    void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.COLOR_SPACE_VALUE_SRGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        int int3 = strips2.getImageDataLength();
        int int4 = strips2.rowsPerStrip;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement6 = strips2.getImageData(255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 255 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32844 + "'", int4 == 32844);
    }

    @Test
    void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_INK_SET;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_SPEED_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_WEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "W" + "'", str0, "W");
    }

    @Test
    void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_PROGRAM_AE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType9, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) '4', (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort4, 65536, tiffDirectoryType9, true);
        int int14 = fieldTypeShort4.getType();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_FIRED_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_RGB;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.EXIF_TAG_MODEL_TRANSFORMATION_TAG;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader2 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder3 = tiffReader2.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals4 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder5 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals6 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort7 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort12 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort12 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList14 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, abstractFieldTypeArray13);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, tiffDirectoryType16);
        java.nio.ByteOrder byteOrder18 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray20 = tagInfoByte17.encodeValue(byteOrder18, (byte) 0);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray30 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray25, 34713, (int) (byte) 0, false, (-65281));
        short short31 = tagInfoShort7.getValue(byteOrder18, byteArray30);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort36 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort36 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList38 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, abstractFieldTypeArray37);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType40 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte41 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, tiffDirectoryType40);
        java.nio.ByteOrder byteOrder42 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray44 = tagInfoByte41.encodeValue(byteOrder42, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray45 = tagInfoSRationals6.getValue(byteOrder18, byteArray44);
        byte[] byteArray46 = tagInfoRationals4.encodeValue(byteOrder5, rationalNumberArray45);
        double[] doubleArray47 = tagInfoDoubles0.getValue(byteOrder3, byteArray46);
        org.junit.Assert.assertNotNull(tagInfoDoubles0);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(tagInfoRationals4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(tagInfoSRationals6);
        org.junit.Assert.assertNotNull(tagInfoShort7);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 4096 + "'", short31 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
    }

    @Test
    void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_VERTICAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_FOCAL_PLANE_YRESOLUTION;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_24_BIT_BGR;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.LONG_OR_SHORT;
        org.junit.Assert.assertNotNull(abstractFieldTypeList0);
    }

    @Test
    void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_ACTIVE_AREA;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SUBJECT_DISTANCE_RANGE_VALUE_MACRO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational tagInfoAsciiOrRational4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational("E", 13, 77, tiffDirectoryType3);
    }

    @Test
    void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement4 = strips2.getImageData(15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataElementArray0);
    }

    @Test
    void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType14, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort10, tiffDirectoryType14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes("S", 34661, (int) ' ', tiffDirectoryType14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational("M", 69, (-1), tiffDirectoryType14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType27 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational28 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType27);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort29 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType27);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte30 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType27);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals31 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort32 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray55 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray50, 34713, (int) (byte) 0, false, (-65281));
        short short56 = tagInfoShort32.getValue(byteOrder43, byteArray55);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort61 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray62 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort61 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList63 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList63, abstractFieldTypeArray62);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType65 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte66 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList63, tiffDirectoryType65);
        java.nio.ByteOrder byteOrder67 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray69 = tagInfoByte66.encodeValue(byteOrder67, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray70 = tagInfoSRationals31.getValue(byteOrder43, byteArray69);
        byte[] byteArray72 = tagInfoSByte30.encodeValue(byteOrder43, (byte) 100);
        org.apache.commons.imaging.common.RationalNumber rationalNumber73 = null;
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray74 = new org.apache.commons.imaging.common.RationalNumber[] { rationalNumber73 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray75 = tagInfoShortOrRational19.encodeValue(byteOrder43, rationalNumberArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"numerator\" because \"value\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffDirectoryType14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType27 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType27.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoSRationals31);
        org.junit.Assert.assertNotNull(tagInfoShort32);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 4096 + "'", short56 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(byteOrder67);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray70);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[100]");
        org.junit.Assert.assertNotNull(rationalNumberArray74);
    }

    @Test
    void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SHARPNESS_1_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_PBGRA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF_VALUE_WEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "W" + "'", str0, "W");
    }

    @Test
    void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory1 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter2 = null;
        int[] intArray8 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration15 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader17 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder18 = tiffReader17.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled20 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory1, photometricInterpreter2, 10, (int) (byte) 10, (-65281), intArray8, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration15, byteOrder18, tiles19);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab24 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(71, intArray8, (int) (short) 100, 77, 5);
        int int25 = org.apache.commons.imaging.internal.SafeOperations.add(intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration15 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration15.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 34905 + "'", int25 == 34905);
    }

    @Test
    void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_LOCALIZED_CAMERA_MODEL;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType3);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts5 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals6 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder7 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals8 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort9 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray15 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort14 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList16 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList16, abstractFieldTypeArray15);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType18 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList16, tiffDirectoryType18);
        java.nio.ByteOrder byteOrder20 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray22 = tagInfoByte19.encodeValue(byteOrder20, (byte) 0);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray32 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray27, 34713, (int) (byte) 0, false, (-65281));
        short short33 = tagInfoShort9.getValue(byteOrder20, byteArray32);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray39 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort38 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList40 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList40, abstractFieldTypeArray39);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType42 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte43 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList40, tiffDirectoryType42);
        java.nio.ByteOrder byteOrder44 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray46 = tagInfoByte43.encodeValue(byteOrder44, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray47 = tagInfoSRationals8.getValue(byteOrder20, byteArray46);
        byte[] byteArray48 = tagInfoRationals6.encodeValue(byteOrder7, rationalNumberArray47);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort49 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort54 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray55 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort54 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList56 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList56, abstractFieldTypeArray55);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType58 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte59 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList56, tiffDirectoryType58);
        java.nio.ByteOrder byteOrder60 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray62 = tagInfoByte59.encodeValue(byteOrder60, (byte) 0);
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray72 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray67, 34713, (int) (byte) 0, false, (-65281));
        short short73 = tagInfoShort49.getValue(byteOrder60, byteArray72);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless74 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray72);
        short[] shortArray75 = tagInfoShorts5.getValue(byteOrder7, byteArray72);
        int[] intArray76 = new int[] {};
        byte[] byteArray77 = tagInfoShortOrLongOrRational4.encodeValue(byteOrder7, intArray76);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray82 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray77, 258, 89, true, 13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Error reading image to compress");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoShorts5);
        org.junit.Assert.assertNotNull(tagInfoRationals6);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(tagInfoSRationals8);
        org.junit.Assert.assertNotNull(tagInfoShort9);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 4096 + "'", short33 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort49);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(byteOrder60);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) 4096 + "'", short73 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[4096]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[]");
    }

    @Test
    void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T4_2D;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tiffRasterDataInt2.getIntValue(4, 65000, (-65281));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (4, 65000)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration1 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.lenientValueOf(34712);
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration1 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration1.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
    }

    @Test
    void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tiffRasterDataInt2.setValue(3, 65, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (3, 65)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = tiffRasterDataInt2.getValue(34713, 32773, 77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (34713, 32773)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(20, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType12 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", 34892, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort7, 6, tiffDirectoryType12, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("TIFF image data: 0 bytes", (int) ' ', 9, tiffDirectoryType12);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType12 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType12.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(22, "");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fieldTypeLong8_2.getValue(tiffField3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getByteArrayValue()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COPYRIGHT;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tiffRasterDataInt2.setIntValue(20, 32897, 32, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (20, 32897)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_16_BIT_BGR565;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXPOSURE_COMPENSATION;
        org.junit.Assert.assertNotNull(tagInfoSRational0);
    }

    @Test
    void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PROFILE_EMBED_POLICY_VALUE_EMBED_NEVER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType5 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", (int) (short) -1, (-4), tiffDirectoryType5, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("M", 95, tiffDirectoryType5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType5 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType5.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PREVIEW_APPLICATION_NAME;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_RATING;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("hi!", 5, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational("", 22, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs("N", 34712, (int) '#', tiffDirectoryType10);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType10 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType10.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType5 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble6 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("", 69, tiffDirectoryType5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType5 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType5.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong fieldTypeLong2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong(8, "");
    }

    @Test
    void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_ORIGINAL_RAW_FILE_DATA;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_VERSION_ID;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.OLD_SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        float[] floatArray8 = new float[] { (-1), 12, 10, 34712, 34676, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat9 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat(77, 73, floatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified data does not contain sufficient elements");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 12.0, 10.0, 34712.0, 34676.0, 1.0]");
    }

    @Test
    void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants.ALL_OCE_SCANJOB_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_BEARING_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PREVIEW_COLORSPACE;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_ISO_STUDIO_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        java.lang.Integer int3 = tiffImagingParameters0.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters0.setXmpXml("V");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet6 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters7 = tiffImagingParameters5.setOutputSet(tiffOutputSet6);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters8 = tiffImagingParameters5.asThis();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(tiffImagingParameters7);
        org.junit.Assert.assertNotNull(tiffImagingParameters8);
    }

    @Test
    void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat fieldTypeFloat0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.FLOAT;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort8 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType12 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType12, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort8, tiffDirectoryType12);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes("S", 34661, (int) ' ', tiffDirectoryType12);
        java.nio.ByteOrder byteOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = fieldTypeFloat0.writeData((java.lang.Object) "S", byteOrder17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Invalid data: S (java.lang.String)");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeFloat0);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType12 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType12.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        int int3 = strips2.getImageDataLength();
        int int4 = strips2.rowsPerStrip;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement6 = strips2.getImageData(95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32844 + "'", int4 == 32844);
    }

    @Test
    void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        int[] intArray4 = new int[] { (byte) 1, 14, 22 };
        int int5 = org.apache.commons.imaging.internal.SafeOperations.add(intArray4);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab9 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(34892, intArray4, 20, 9, (-4));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
    }

    @Test
    void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants.ALL_TIFF_4_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_SUB1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_EAST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "E" + "'", str0, "E");
    }

    @Test
    void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_DOWN_1_2_ROW_EVEN_COLUMNS_OFFSET_LEFT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("hi!", 5, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny("M", 19, (int) '#', tiffDirectoryType8);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_FLASH_ENERGY;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort1 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort6 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, abstractFieldTypeArray7);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, tiffDirectoryType10);
        java.nio.ByteOrder byteOrder12 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray14 = tagInfoByte11.encodeValue(byteOrder12, (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray24 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray19, 34713, (int) (byte) 0, false, (-65281));
        short short25 = tagInfoShort1.getValue(byteOrder12, byteArray24);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort30 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray31 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort30 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList32 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, abstractFieldTypeArray31);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType34 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, tiffDirectoryType34);
        java.nio.ByteOrder byteOrder36 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray38 = tagInfoByte35.encodeValue(byteOrder36, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray39 = tagInfoSRationals0.getValue(byteOrder12, byteArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType48 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte49 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType48);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals50 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType48);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte51 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType48);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational52 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_NEUTRAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort53 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTERLACE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts54 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational55 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort60 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray61 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort60 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList62 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList62, abstractFieldTypeArray61);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType64 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte65 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList62, tiffDirectoryType64);
        java.nio.ByteOrder byteOrder66 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray68 = tagInfoByte65.encodeValue(byteOrder66, (byte) 0);
        short[] shortArray69 = new short[] {};
        byte[] byteArray70 = tagInfoShortOrLongOrRational55.encodeValue(byteOrder66, shortArray69);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational71 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort76 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray77 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort76 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList78 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList78, abstractFieldTypeArray77);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType80 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte81 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList78, tiffDirectoryType80);
        java.nio.ByteOrder byteOrder82 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray84 = tagInfoByte81.encodeValue(byteOrder82, (byte) 0);
        short[] shortArray85 = new short[] {};
        byte[] byteArray86 = tagInfoShortOrLongOrRational71.encodeValue(byteOrder82, shortArray85);
        byte[] byteArray87 = tagInfoShorts54.encodeValue(byteOrder66, shortArray85);
        byte[] byteArray89 = tagInfoShort53.encodeValue(byteOrder66, (short) (byte) 10);
        short[] shortArray91 = new short[] { (byte) 0 };
        byte[] byteArray92 = tagInfoShortOrRational52.encodeValue(byteOrder66, shortArray91);
        byte[] byteArray94 = tagInfoSByte51.encodeValue(byteOrder66, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless95 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteOrder12, byteArray94);
        java.io.OutputStream outputStream96 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet97 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffImageWriterLossless95.write(outputStream96, tiffOutputSet97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.write.TiffOutputSet.findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo)\" because \"outputSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
        org.junit.Assert.assertNotNull(tagInfoShort1);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 4096 + "'", short25 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray39);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType48 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType48.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(tagInfoShortOrRational52);
        org.junit.Assert.assertNotNull(tagInfoShort53);
        org.junit.Assert.assertNotNull(tagInfoShorts54);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational55);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteOrder66);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0]");
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational71);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(byteOrder82);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0]");
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[]");
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[]");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[]");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray91), "[0]");
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray92), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray94), "[0]");
    }

    @Test
    void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXPOSURE_TIME;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PAGE_NUMBER;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_UNCOMPRESSED_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32771 + "'", int0 == 32771);
    }

    @Test
    void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.imaging.internal.Debug.debug(throwable0);
    }

    @Test
    void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_CAMERA_OWNER_NAME;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem tiffMetadataItem1 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem(tiffField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getTagName()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_DID_NOT_FIRE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PREDICTOR_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.OLD_SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((-1), "W");
    }

    @Test
    void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CLEAN_FAX_DATA_VALUE_CLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.imaging.internal.Debug.debug(throwable0, 16);
    }

    @Test
    void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXIF_IMAGE_WIDTH;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MODEL_2;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat2 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 8, (float) (short) 0);
        float float3 = photometricInterpreterFloat2.getMaxFound();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + Float.NEGATIVE_INFINITY + "'", float3 == Float.NEGATIVE_INFINITY);
    }

    @Test
    void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants.EXIF_TAG_FAX_DCS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_HISTORY;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts("E", 34661, 34713, tiffDirectoryType6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("ImageLayer", 34661, 34676, tiffDirectoryType6, false);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_DEFLATE_ADOBE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.RESOLUTION_UNIT_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_WIDTH_RESOLUTION;
        org.junit.Assert.assertNotNull(tagInfoFloat0);
    }

    @Test
    void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CLEAN_FAX_DATA_VALUE_REGENERATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_GRAY_RESPONSE_CURVE;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType3);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort5 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTERLACE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts6 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort12 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort12 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList14 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, abstractFieldTypeArray13);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, tiffDirectoryType16);
        java.nio.ByteOrder byteOrder18 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray20 = tagInfoByte17.encodeValue(byteOrder18, (byte) 0);
        short[] shortArray21 = new short[] {};
        byte[] byteArray22 = tagInfoShortOrLongOrRational7.encodeValue(byteOrder18, shortArray21);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational23 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort28 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray29 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort28 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList30 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList30, abstractFieldTypeArray29);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType32 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte33 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList30, tiffDirectoryType32);
        java.nio.ByteOrder byteOrder34 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray36 = tagInfoByte33.encodeValue(byteOrder34, (byte) 0);
        short[] shortArray37 = new short[] {};
        byte[] byteArray38 = tagInfoShortOrLongOrRational23.encodeValue(byteOrder34, shortArray37);
        byte[] byteArray39 = tagInfoShorts6.encodeValue(byteOrder18, shortArray37);
        byte[] byteArray41 = tagInfoShort5.encodeValue(byteOrder18, (short) (byte) 10);
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray51 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray46, 34713, (int) (byte) 0, false, (-65281));
        // The following exception was thrown during execution in test generation
        try {
            double double52 = tagInfoDouble4.getValue(byteOrder18, byteArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(tagInfoShort5);
        org.junit.Assert.assertNotNull(tagInfoShorts6);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational7);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational23);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 0]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 16]");
    }

    @Test
    void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = tiffRasterDataInt2.getValue((int) (short) 0, 20, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (0, 20)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tiffRasterDataInt2.getIntValue(34713, (int) (short) -1, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (34713, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort1 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational2 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SRATIONAL;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(22, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(20, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", 34892, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort11, 6, tiffDirectoryType16, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals20 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort21 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort26 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray27 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort26 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList28 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList28, abstractFieldTypeArray27);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType30 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte31 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList28, tiffDirectoryType30);
        java.nio.ByteOrder byteOrder32 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray34 = tagInfoByte31.encodeValue(byteOrder32, (byte) 0);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray44 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray39, 34713, (int) (byte) 0, false, (-65281));
        short short45 = tagInfoShort21.getValue(byteOrder32, byteArray44);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort50 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray51 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort50 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList52 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList52, abstractFieldTypeArray51);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType54 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte55 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList52, tiffDirectoryType54);
        java.nio.ByteOrder byteOrder56 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray58 = tagInfoByte55.encodeValue(byteOrder56, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray59 = tagInfoSRationals20.getValue(byteOrder32, byteArray58);
        byte[] byteArray60 = fieldTypeLong8_6.writeData((java.lang.Object) 6, byteOrder32);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField61 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField((int) '4', (org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoShort1, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeRational2, 4, byteArray60);
        org.junit.Assert.assertNotNull(tagInfoShort1);
        org.junit.Assert.assertNotNull(fieldTypeRational2);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType16 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType16.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoSRationals20);
        org.junit.Assert.assertNotNull(tagInfoShort21);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteOrder32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 4096 + "'", short45 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteOrder56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[6, 0, 0, 0]");
    }

    @Test
    void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_SIZE;
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational0);
    }

    @Test
    void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_IMAGE_LAYER;
        java.lang.String str1 = tagInfoShortOrLong0.name;
        java.nio.ByteOrder byteOrder2 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong3 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder4 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray10 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray11 = tagInfoShortOrLong3.encodeValue(byteOrder4, intArray10);
        byte[] byteArray12 = tagInfoShortOrLong0.encodeValue(byteOrder2, intArray10);
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ImageLayer" + "'", str1, "ImageLayer");
        org.junit.Assert.assertNotNull(tagInfoShortOrLong3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
    }

    @Test
    void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_DID_NOT_FIRE_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 88 + "'", int0 == 88);
    }

    @Test
    void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.TIFF_TAG_INDEXED;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SUBJECT_DISTANCE;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte("N", (int) '4', 34712, tiffDirectoryType9);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("N", 0, 34661, tiffDirectoryType6);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_PARTIAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.UNDEFINED;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_3 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        java.nio.ByteOrder byteOrder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = fieldTypeByte0.writeData((java.lang.Object) "hi!", byteOrder4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Invalid data: hi! (java.lang.String)");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeByte0);
    }

    @Test
    void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType7 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("hi!", 5, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational("", 22, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts11 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals12 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals14 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort15 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort20 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray21 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort20 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList22 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList22, abstractFieldTypeArray21);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType24 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte25 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList22, tiffDirectoryType24);
        java.nio.ByteOrder byteOrder26 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray28 = tagInfoByte25.encodeValue(byteOrder26, (byte) 0);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray38 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray33, 34713, (int) (byte) 0, false, (-65281));
        short short39 = tagInfoShort15.getValue(byteOrder26, byteArray38);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort44 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray45 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort44 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList46 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList46, abstractFieldTypeArray45);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType48 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte49 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList46, tiffDirectoryType48);
        java.nio.ByteOrder byteOrder50 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray52 = tagInfoByte49.encodeValue(byteOrder50, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray53 = tagInfoSRationals14.getValue(byteOrder26, byteArray52);
        byte[] byteArray54 = tagInfoRationals12.encodeValue(byteOrder13, rationalNumberArray53);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort55 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort60 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray61 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort60 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList62 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList62, abstractFieldTypeArray61);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType64 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte65 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList62, tiffDirectoryType64);
        java.nio.ByteOrder byteOrder66 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray68 = tagInfoByte65.encodeValue(byteOrder66, (byte) 0);
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray78 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray73, 34713, (int) (byte) 0, false, (-65281));
        short short79 = tagInfoShort55.getValue(byteOrder66, byteArray78);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless80 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray78);
        short[] shortArray81 = tagInfoShorts11.getValue(byteOrder13, byteArray78);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii82 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_NAME;
        java.nio.ByteOrder byteOrder83 = null;
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "E", "", "S", "V", "ImageColorIndicator" };
        byte[] byteArray91 = tagInfoAscii82.encodeValue(byteOrder83, strArray90);
        org.apache.commons.imaging.common.RationalNumber rationalNumber92 = tagInfoRational10.getValue(byteOrder13, byteArray91);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType7 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType7.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoShorts11);
        org.junit.Assert.assertNotNull(tagInfoRationals12);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(tagInfoSRationals14);
        org.junit.Assert.assertNotNull(tagInfoShort15);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 4096 + "'", short39 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort55);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteOrder66);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 4096 + "'", short79 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[4096]");
        org.junit.Assert.assertNotNull(tagInfoAscii82);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray91), "[104, 105, 33, 0, 69, 0, 0, 83, 0, 86, 0, 73, 109, 97, 103, 101, 67, 111, 108, 111, 114, 73, 110, 100, 105, 99, 97, 116, 111, 114, 0]");
        org.junit.Assert.assertNotNull(rationalNumber92);
    }

    @Test
    void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType10, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort6, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("M", 7, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.TiffField tiffField15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tagInfoXpString14.getValue(tiffField15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffField.getFieldType()\" because \"entry\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffDirectoryType10 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType10.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_TRANSPARENCY_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("", 16, 21, tiffDirectoryType3);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList5 = tagInfoByteOrShort4.dataTypes;
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(abstractFieldTypeList5);
    }

    @Test
    void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YPOSITION;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CFALAYOUT;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_NOISE_2;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_ALTITUDE_REF_VALUE_BELOW_SEA_LEVEL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TARGET_PRINTER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.FLAG_T6_OPTIONS_UNCOMPRESSED_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants.EXIF_TAG_GDAL_METADATA;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_GPS;
        org.junit.Assert.assertTrue("'" + tiffDirectoryType0 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_GPS + "'", tiffDirectoryType0.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_GPS));
    }

    @Test
    void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_IMAGE_OFFSET;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.ENTRY_MAX_VALUE_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CALIBRATION_ILLUMINANT_2;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        java.lang.Integer int3 = tiffImagingParameters0.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters0.setXmpXml("V");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet6 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters7 = tiffImagingParameters5.setOutputSet(tiffOutputSet6);
        java.lang.String str8 = tiffImagingParameters5.getXmpXml();
        org.apache.commons.imaging.PixelDensity pixelDensity9 = tiffImagingParameters5.getPixelDensity();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(tiffImagingParameters7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "V" + "'", str8, "V");
        org.junit.Assert.assertNull(pixelDensity9);
    }

    @Test
    void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_SGILOG_24;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34677 + "'", int0 == 34677);
    }

    @Test
    void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational2 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.RATIONAL;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType4 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("M", 21, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeRational2, 79, tiffDirectoryType4);
        org.junit.Assert.assertNotNull(fieldTypeRational2);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType4 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType4.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_NOISE_1;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SAMPLE_FORMAT_VALUE_UNDEFINED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.ALL_TIFF_EP_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.THRESHOLDING_VALUE_ORDERED_DITHER_OR_HALFTONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational1 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.RATIONAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts3 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals4 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder5 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals6 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort7 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort12 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort12 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList14 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, abstractFieldTypeArray13);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, tiffDirectoryType16);
        java.nio.ByteOrder byteOrder18 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray20 = tagInfoByte17.encodeValue(byteOrder18, (byte) 0);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray30 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray25, 34713, (int) (byte) 0, false, (-65281));
        short short31 = tagInfoShort7.getValue(byteOrder18, byteArray30);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort36 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort36 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList38 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, abstractFieldTypeArray37);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType40 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte41 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, tiffDirectoryType40);
        java.nio.ByteOrder byteOrder42 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray44 = tagInfoByte41.encodeValue(byteOrder42, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray45 = tagInfoSRationals6.getValue(byteOrder18, byteArray44);
        byte[] byteArray46 = tagInfoRationals4.encodeValue(byteOrder5, rationalNumberArray45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort47 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort52 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray53 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort52 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList54 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList54, abstractFieldTypeArray53);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType56 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte57 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList54, tiffDirectoryType56);
        java.nio.ByteOrder byteOrder58 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray60 = tagInfoByte57.encodeValue(byteOrder58, (byte) 0);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray70 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray65, 34713, (int) (byte) 0, false, (-65281));
        short short71 = tagInfoShort47.getValue(byteOrder58, byteArray70);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless72 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray70);
        short[] shortArray73 = tagInfoShorts3.getValue(byteOrder5, byteArray70);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField74 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoShorts0, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeRational1, 32769, byteArray70);
        java.lang.String str76 = tiffOutputField74.toString("N");
        int int77 = tiffOutputField74.tag;
        byte[] byteArray78 = tiffOutputField74.getData();
        org.junit.Assert.assertNotNull(tagInfoShorts0);
        org.junit.Assert.assertNotNull(fieldTypeRational1);
        org.junit.Assert.assertNotNull(tagInfoShorts3);
        org.junit.Assert.assertNotNull(tagInfoRationals4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(tagInfoSRationals6);
        org.junit.Assert.assertNotNull(tagInfoShort7);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 4096 + "'", short31 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort47);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteOrder58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 4096 + "'", short71 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[4096]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 258 + "'", int77 == 258);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 16]");
    }

    @Test
    void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX1;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement imageDataElement2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement((long) 71, 32771);
    }

    @Test
    void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.imaging.internal.Debug.debug("M");
    }

    @Test
    void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH;
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList1 = tagInfoShortOrLong0.dataTypes;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
        org.junit.Assert.assertNotNull(abstractFieldTypeList1);
    }

    @Test
    void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tiffRasterDataInt2.setIntValue((int) 'a', 32771, 5, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (97, 32771)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_TONE_CURVE;
        org.junit.Assert.assertNotNull(tagInfoFloats0);
    }

    @Test
    void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        // The following exception was thrown during execution in test generation
        try {
            tiffRasterDataInt2.setIntValue(16, 71, (-1), 65000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (16, 71)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
    }

    @Test
    void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_APPLICATION_NOTES;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_SPOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = tiffRasterDataInt2.getValue(0, (int) (short) 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (0, 4096)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
    }

    @Test
    void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement3 = tiffField0.new OversizeValueElement(15, 34661);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BASELINE_SHARPNESS;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants.ALL_ADOBE_PHOTOSHOP_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray0, (int) (short) 1, 14);
        boolean boolean6 = tiles5.stripsNotTiles();
        int int7 = tiles5.getTileWidth();
        boolean boolean8 = tiles5.stripsNotTiles();
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory3 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter4 = null;
        int[] intArray10 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration17 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader19 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder20 = tiffReader19.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles21 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled22 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory3, photometricInterpreter4, 10, (int) (byte) 10, (-65281), intArray10, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration17, byteOrder20, tiles21);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab26 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(71, intArray10, (int) (short) 100, 77, 5);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel31 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel((-2), intArray10, (int) (short) -1, 64, 12, false);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel36 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(0, intArray10, 9, 13, 13, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration17 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration17.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder20);
    }

    @Test
    void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd tagInfoLongOrIfd0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.TIFF_TAG_SUB_IFD;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType5 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational6 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType5);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals8 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder9 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals10 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort11 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort16 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray17 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort16 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList18 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList18, abstractFieldTypeArray17);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType20 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList18, tiffDirectoryType20);
        java.nio.ByteOrder byteOrder22 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray24 = tagInfoByte21.encodeValue(byteOrder22, (byte) 0);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray34 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray29, 34713, (int) (byte) 0, false, (-65281));
        short short35 = tagInfoShort11.getValue(byteOrder22, byteArray34);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort40 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray41 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort40 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList42 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList42, abstractFieldTypeArray41);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType44 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte45 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList42, tiffDirectoryType44);
        java.nio.ByteOrder byteOrder46 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray48 = tagInfoByte45.encodeValue(byteOrder46, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray49 = tagInfoSRationals10.getValue(byteOrder22, byteArray48);
        byte[] byteArray50 = tagInfoRationals8.encodeValue(byteOrder9, rationalNumberArray49);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort51 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort56 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray57 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort56 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList58 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList58, abstractFieldTypeArray57);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType60 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte61 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList58, tiffDirectoryType60);
        java.nio.ByteOrder byteOrder62 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray64 = tagInfoByte61.encodeValue(byteOrder62, (byte) 0);
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray74 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray69, 34713, (int) (byte) 0, false, (-65281));
        short short75 = tagInfoShort51.getValue(byteOrder62, byteArray74);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless76 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray74);
        short[] shortArray77 = tagInfoShorts7.getValue(byteOrder9, byteArray74);
        int[] intArray78 = new int[] {};
        byte[] byteArray79 = tagInfoShortOrLongOrRational6.encodeValue(byteOrder9, intArray78);
        byte[] byteArray80 = tagInfoLongOrIfd0.encodeValue(byteOrder1, intArray78);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong81 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder82 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray88 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray89 = tagInfoShortOrLong81.encodeValue(byteOrder82, intArray88);
        int[] intArray95 = new int[] { 34892, 32, (short) 10, 11, 65000 };
        byte[] byteArray96 = tagInfoLongOrIfd0.encodeValue(byteOrder82, intArray95);
        org.junit.Assert.assertNotNull(tagInfoLongOrIfd0);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType5 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType5.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoShorts7);
        org.junit.Assert.assertNotNull(tagInfoRationals8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(tagInfoSRationals10);
        org.junit.Assert.assertNotNull(tagInfoShort11);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 4096 + "'", short35 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort51);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(byteOrder62);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 4096 + "'", short75 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[4096]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[]");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLong81);
        org.junit.Assert.assertNotNull(byteOrder82);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[34892, 32, 10, 11, 65000]");
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray96), "[76, -120, 0, 0, 32, 0, 0, 0, 10, 0, 0, 0, 11, 0, 0, 0, -24, -3, 0, 0]");
    }

    @Test
    void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_GRAY_RESPONSE_UNIT;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("ImageLayer", (int) (short) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational("ImageLayer", 77, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("ImageColorIndicator", 77, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("S", 65, (int) (byte) -1, tiffDirectoryType9);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_MONOCHROME_LINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_CLOUDY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_GRAY_GAMMA_2_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SMOOTHNESS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SECURITY_CLASSIFICATION;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts("S", (int) (byte) 100, (int) (short) 0, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText("ImageColorIndicator", 43, tiffDirectoryType8);
        java.lang.String str12 = tagInfoGpsText11.name;
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ImageColorIndicator" + "'", str12, "ImageColorIndicator");
    }

    @Test
    void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_PIXAR_LOG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32909 + "'", int0 == 32909);
    }

    @Test
    void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader1 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder2 = tiffReader1.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource3 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters4 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity5 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters6 = tiffImagingParameters4.setPixelDensity(pixelDensity5);
        java.lang.Integer int7 = tiffImagingParameters4.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters9 = tiffImagingParameters4.setXmpXml("V");
        org.apache.commons.imaging.FormatCompliance formatCompliance10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffContents tiffContents11 = tiffReader1.readContents(byteSource3, tiffImagingParameters9, formatCompliance10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.bytesource.ByteSource.getInputStream()\" because \"byteSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(tiffImagingParameters6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(tiffImagingParameters9);
    }

    @Test
    void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_EXTRA_SAMPLES;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_MINIMAL_B_AND_W_LOSSLESS_S;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_GPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-3) + "'", int0 == (-3));
    }

    @Test
    void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        int int3 = strips2.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory4 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory6 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter7 = null;
        int[] intArray13 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration20 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader22 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder23 = tiffReader22.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles24 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled25 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory6, photometricInterpreter7, 10, (int) (byte) 10, (-65281), intArray13, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration20, byteOrder23, tiles24);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb photometricInterpreterRgb29 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb(34676, intArray13, (int) (byte) -1, 4, 5);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory31 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter32 = null;
        int[] intArray38 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration45 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader47 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder48 = tiffReader47.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles49 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled50 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory31, photometricInterpreter32, 10, (int) (byte) 10, (-65281), intArray38, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration45, byteOrder48, tiles49);
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration56 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort61 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray62 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort61 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList63 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList63, abstractFieldTypeArray62);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType65 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte66 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList63, tiffDirectoryType65);
        java.nio.ByteOrder byteOrder67 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray69 = tagInfoByte66.encodeValue(byteOrder67, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader70 = strips2.getDataReader(tiffDirectory4, (org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterRgb29, (-1), intArray38, (-2), 16, 7, 89, 32, tiffPlanarConfiguration56, byteOrder67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.formats.tiff.TiffDirectory.getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts, boolean)\" because \"directory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration20 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration20.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration45 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration45.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder48);
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration56 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration56.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(abstractFieldTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(byteOrder67);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0]");
    }

    @Test
    void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_IT8LW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32896 + "'", int0 == 32896);
    }

    @Test
    void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        long[] longArray51 = tiffField50.getLongArrayValue();
        long long52 = tiffField50.getCount();
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 34676L + "'", long52 == 34676L);
    }

    @Test
    void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SUBJECT_AREA;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_SPEED_REF_VALUE_KNOTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "N" + "'", str0, "N");
    }

    @Test
    void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat fieldTypeFloat2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat(32844, "Bad Type");
    }

    @Test
    void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_EXTRA_CAMERA_PROFILES;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics();
        float[] floatArray5 = tiffRasterDataInt2.getData();
        float[] floatArray6 = tiffRasterDataInt2.getData();
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_PORTRAIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_PREVIEW_IMAGE_START_IFD0;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_GLOBAL_PARAMETERS_IFD;
        org.junit.Assert.assertNotNull(tagInfoDirectory0);
    }

    @Test
    void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_QTABLES;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PREVIEW_SETTINGS_NAME;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray0, (int) (short) 1, 14);
        boolean boolean6 = tiles5.stripsNotTiles();
        int int7 = tiles5.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray8 = tiles5.getImageData();
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dataElementArray8);
    }

    @Test
    void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.UNDEFINED;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals1 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FOCAL_LENGTH;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(22, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort9 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(20, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", 34892, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort9, 6, tiffDirectoryType14, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals18 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort19 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort24 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray25 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort24 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList26 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList26, abstractFieldTypeArray25);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType28 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte29 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList26, tiffDirectoryType28);
        java.nio.ByteOrder byteOrder30 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray32 = tagInfoByte29.encodeValue(byteOrder30, (byte) 0);
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray42 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray37, 34713, (int) (byte) 0, false, (-65281));
        short short43 = tagInfoShort19.getValue(byteOrder30, byteArray42);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort48 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray49 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort48 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList50 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList50, abstractFieldTypeArray49);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType52 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte53 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList50, tiffDirectoryType52);
        java.nio.ByteOrder byteOrder54 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray56 = tagInfoByte53.encodeValue(byteOrder54, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray57 = tagInfoSRationals18.getValue(byteOrder30, byteArray56);
        byte[] byteArray58 = fieldTypeLong8_4.writeData((java.lang.Object) 6, byteOrder30);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray59 = fieldTypeByte0.writeData((java.lang.Object) tagInfoRationals1, byteOrder30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Invalid data: [TagInfo. tag: 37386 (0x920a, name: FocalLength] (org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals)");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeByte0);
        org.junit.Assert.assertNotNull(tagInfoRationals1);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoSRationals18);
        org.junit.Assert.assertNotNull(tagInfoShort19);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 4096 + "'", short43 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteOrder54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[6, 0, 0, 0]");
    }

    @Test
    void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_APERTURE_VALUE;
        java.nio.ByteOrder byteOrder1 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts2 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational3 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort8 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray9 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort8 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList10 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList10, abstractFieldTypeArray9);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType12 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList10, tiffDirectoryType12);
        java.nio.ByteOrder byteOrder14 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray16 = tagInfoByte13.encodeValue(byteOrder14, (byte) 0);
        short[] shortArray17 = new short[] {};
        byte[] byteArray18 = tagInfoShortOrLongOrRational3.encodeValue(byteOrder14, shortArray17);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational19 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort24 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray25 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort24 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList26 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList26, abstractFieldTypeArray25);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType28 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte29 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList26, tiffDirectoryType28);
        java.nio.ByteOrder byteOrder30 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray32 = tagInfoByte29.encodeValue(byteOrder30, (byte) 0);
        short[] shortArray33 = new short[] {};
        byte[] byteArray34 = tagInfoShortOrLongOrRational19.encodeValue(byteOrder30, shortArray33);
        byte[] byteArray35 = tagInfoShorts2.encodeValue(byteOrder14, shortArray33);
        byte[] byteArray40 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray35, 1, (-65281), false, 7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.common.RationalNumber rationalNumber41 = tagInfoRational0.getValue(byteOrder1, byteArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoRational0);
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNotNull(tagInfoShorts2);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational3);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational19);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 16]");
    }

    @Test
    void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        // The following exception was thrown during execution in test generation
        try {
            tiffRasterDataInt2.setIntValue(6, 9, (int) (short) 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (6, 9)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
    }

    @Test
    void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_BAD_FAX_LINES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder2 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray8 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray9 = tagInfoShortOrLong1.encodeValue(byteOrder2, intArray8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational10 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_NEUTRAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort11 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTERLACE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts12 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational13 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort18 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray19 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort18 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList20 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList20, abstractFieldTypeArray19);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType22 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte23 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList20, tiffDirectoryType22);
        java.nio.ByteOrder byteOrder24 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray26 = tagInfoByte23.encodeValue(byteOrder24, (byte) 0);
        short[] shortArray27 = new short[] {};
        byte[] byteArray28 = tagInfoShortOrLongOrRational13.encodeValue(byteOrder24, shortArray27);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational29 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort34 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort34 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList36 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, abstractFieldTypeArray35);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType38 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, tiffDirectoryType38);
        java.nio.ByteOrder byteOrder40 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray42 = tagInfoByte39.encodeValue(byteOrder40, (byte) 0);
        short[] shortArray43 = new short[] {};
        byte[] byteArray44 = tagInfoShortOrLongOrRational29.encodeValue(byteOrder40, shortArray43);
        byte[] byteArray45 = tagInfoShorts12.encodeValue(byteOrder24, shortArray43);
        byte[] byteArray47 = tagInfoShort11.encodeValue(byteOrder24, (short) (byte) 10);
        short[] shortArray49 = new short[] { (byte) 0 };
        byte[] byteArray50 = tagInfoShortOrRational10.encodeValue(byteOrder24, shortArray49);
        byte[] byteArray51 = tagInfoShortOrLong0.encodeValue(byteOrder2, shortArray49);
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
        org.junit.Assert.assertNotNull(tagInfoShortOrLong1);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(tagInfoShortOrRational10);
        org.junit.Assert.assertNotNull(tagInfoShort11);
        org.junit.Assert.assertNotNull(tagInfoShorts12);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational13);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational29);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 0]");
    }

    @Test
    void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort5 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort5 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList7 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList7, abstractFieldTypeArray6);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList7, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder11 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray13 = tagInfoByte10.encodeValue(byteOrder11, (byte) 0);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray18, 34713, (int) (byte) 0, false, (-65281));
        short short24 = tagInfoShort0.getValue(byteOrder11, byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.decompressT4_1D(byteArray23, 32, 7, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Decompression error");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoShort0);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 4096 + "'", short24 == (short) 4096);
    }

    @Test
    void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort5 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort5 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList7 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList7, abstractFieldTypeArray6);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList7, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder11 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray13 = tagInfoByte10.encodeValue(byteOrder11, (byte) 0);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray18, 34713, (int) (byte) 0, false, (-65281));
        short short24 = tagInfoShort0.getValue(byteOrder11, byteArray23);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless25 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray23);
        java.awt.image.BufferedImage bufferedImage26 = null;
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters28 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity29 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters30 = tiffImagingParameters28.setPixelDensity(pixelDensity29);
        java.lang.Integer int31 = tiffImagingParameters28.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters33 = tiffImagingParameters28.setXmpXml("V");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet34 = tiffImagingParameters28.getOutputSet();
        // The following exception was thrown during execution in test generation
        try {
            tiffImageWriterLossless25.writeImage(bufferedImage26, outputStream27, tiffImagingParameters28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.BufferedImage.getWidth()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoShort0);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 4096 + "'", short24 == (short) 4096);
        org.junit.Assert.assertNotNull(tiffImagingParameters30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(tiffImagingParameters33);
        org.junit.Assert.assertNull(tiffOutputSet34);
    }

    @Test
    void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational1 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.RATIONAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts3 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals4 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder5 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals6 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort7 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort12 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort12 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList14 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, abstractFieldTypeArray13);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, tiffDirectoryType16);
        java.nio.ByteOrder byteOrder18 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray20 = tagInfoByte17.encodeValue(byteOrder18, (byte) 0);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray30 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray25, 34713, (int) (byte) 0, false, (-65281));
        short short31 = tagInfoShort7.getValue(byteOrder18, byteArray30);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort36 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort36 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList38 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, abstractFieldTypeArray37);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType40 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte41 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, tiffDirectoryType40);
        java.nio.ByteOrder byteOrder42 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray44 = tagInfoByte41.encodeValue(byteOrder42, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray45 = tagInfoSRationals6.getValue(byteOrder18, byteArray44);
        byte[] byteArray46 = tagInfoRationals4.encodeValue(byteOrder5, rationalNumberArray45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort47 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort52 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray53 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort52 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList54 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList54, abstractFieldTypeArray53);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType56 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte57 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList54, tiffDirectoryType56);
        java.nio.ByteOrder byteOrder58 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray60 = tagInfoByte57.encodeValue(byteOrder58, (byte) 0);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray70 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray65, 34713, (int) (byte) 0, false, (-65281));
        short short71 = tagInfoShort47.getValue(byteOrder58, byteArray70);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless72 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray70);
        short[] shortArray73 = tagInfoShorts3.getValue(byteOrder5, byteArray70);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField74 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoShorts0, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeRational1, 32769, byteArray70);
        java.lang.String str76 = tiffOutputField74.toString("N");
        int int77 = tiffOutputField74.getSortHint();
        org.junit.Assert.assertNotNull(tagInfoShorts0);
        org.junit.Assert.assertNotNull(fieldTypeRational1);
        org.junit.Assert.assertNotNull(tagInfoShorts3);
        org.junit.Assert.assertNotNull(tagInfoRationals4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(tagInfoSRationals6);
        org.junit.Assert.assertNotNull(tagInfoShort7);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 4096 + "'", short31 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort47);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteOrder58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 4096 + "'", short71 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[4096]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.EXIF_TAG_MD_PREP_DATE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        int[] intArray4 = new int[] { (byte) 1, 14, 22 };
        int int5 = org.apache.commons.imaging.internal.SafeOperations.add(intArray4);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel10 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel((int) '4', intArray4, 1, 11, 7, true);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
    }

    @Test
    void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory0 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter1 = null;
        int[] intArray7 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration14 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader16 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder17 = tiffReader16.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles18 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled19 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory0, photometricInterpreter1, 10, (int) (byte) 10, (-65281), intArray7, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration14, byteOrder17, tiles18);
        java.awt.Rectangle rectangle20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterData tiffRasterData21 = dataReaderTiled19.readRasterData(rectangle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"tiles\" because \"this.imageData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_MODE_VALUE_MANUAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader1 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder2 = tiffReader1.getByteOrder();
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy3 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(byteOrder2);
        java.awt.image.BufferedImage bufferedImage4 = null;
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters6 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity7 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters8 = tiffImagingParameters6.setPixelDensity(pixelDensity7);
        java.lang.Integer int9 = tiffImagingParameters6.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters11 = tiffImagingParameters6.setXmpXml("V");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet12 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters13 = tiffImagingParameters11.setOutputSet(tiffOutputSet12);
        java.lang.String str14 = tiffImagingParameters11.getXmpXml();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory15 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters16 = tiffImagingParameters11.setBufferedImageFactory(bufferedImageFactory15);
        // The following exception was thrown during execution in test generation
        try {
            tiffImageWriterLossy3.writeImage(bufferedImage4, outputStream5, tiffImagingParameters16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.BufferedImage.getWidth()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(tiffImagingParameters8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(tiffImagingParameters11);
        org.junit.Assert.assertNotNull(tiffImagingParameters13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertNotNull(tiffImagingParameters16);
    }

    @Test
    void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(20, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType11 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", 34892, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort6, 6, tiffDirectoryType11, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("hi!", (-65281), (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort6, 95);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType11 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType11.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics();
        float float5 = tiffRasterStatistics4.getMaxValue();
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParserStub dataParserStub0 = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserStub();
        int int1 = dataParserStub0.getBasicChannelsCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        java.lang.Integer int3 = tiffImagingParameters0.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters0.setXmpXml("V");
        tiffImagingParameters5.clearSubImage();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters8 = tiffImagingParameters5.setFileName("M");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet9 = tiffImagingParameters5.getOutputSet();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(tiffImagingParameters8);
        org.junit.Assert.assertNull(tiffOutputSet9);
    }

    @Test
    void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType8, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("N", 6, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns("N", 100, 79, tiffDirectoryType8);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32845 + "'", int0 == 32845);
    }

    @Test
    void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_A;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts("TIFF image data: 0 bytes", (int) (byte) 1, 31, tiffDirectoryType6);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.commons.imaging.bytesource.ByteSource byteSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.AbstractImageParser<org.apache.commons.imaging.formats.tiff.TiffImagingParameters> tiffImagingParametersAbstractImageParser1 = org.apache.commons.imaging.internal.ImageParserFactory.getImageParser(byteSource0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.bytesource.ByteSource.getFileName()\" because \"byteSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        int int0 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.BLACK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        java.lang.Integer int3 = tiffImagingParameters0.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters0.setXmpXml("V");
        tiffImagingParameters5.clearSubImage();
        tiffImagingParameters5.clearSubImage();
        java.lang.String str8 = tiffImagingParameters5.getXmpXml();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "V" + "'", str8, "V");
    }

    @Test
    void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_GRAY_FLOAT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.awt.Color color2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange paletteEntryForRange3 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntryForRange((float) 32844, (float) 100, color2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Specified values must be v0<v1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PREDICTOR_VALUE_FLOATING_POINT_DIFFERENCING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType51 = tiffField50.getFieldType();
        boolean boolean52 = tiffField50.isLocalValue();
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tiffField50.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Unknown value: [J@39df286 for: -1 (0xffffffff: Unknown Tag): ");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(abstractFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_DAYLIGHT_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JBIG_B_AND_W;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants.EXIF_TAG_JPEGTABLES;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement4 = strips2.getImageData(19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataElementArray0);
    }

    @Test
    void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_sRGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab dataParserLab0 = new org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab();
        int int1 = dataParserLab0.getBasicChannelsCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_01;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_LENS_MODEL;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType51 = tiffField50.getFieldType();
        boolean boolean52 = tiffField50.isLocalValue();
        java.lang.String str53 = tiffField50.getValueDescription();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType54 = tiffField50.getFieldType();
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(abstractFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(abstractFieldType54);
    }

    @Test
    void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType51 = tiffField50.getFieldType();
        boolean boolean52 = tiffField50.isLocalValue();
        java.lang.String str53 = tiffField50.getValueDescription();
        int[] intArray54 = tiffField50.getIntArrayValue();
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(abstractFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
    }

    @Test
    void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SBYTE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_5 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals8 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort9 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray15 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort14 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList16 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList16, abstractFieldTypeArray15);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType18 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList16, tiffDirectoryType18);
        java.nio.ByteOrder byteOrder20 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray22 = tagInfoByte19.encodeValue(byteOrder20, (byte) 0);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray32 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray27, 34713, (int) (byte) 0, false, (-65281));
        short short33 = tagInfoShort9.getValue(byteOrder20, byteArray32);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray39 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort38 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList40 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList40, abstractFieldTypeArray39);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType42 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte43 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList40, tiffDirectoryType42);
        java.nio.ByteOrder byteOrder44 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray46 = tagInfoByte43.encodeValue(byteOrder44, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray47 = tagInfoSRationals8.getValue(byteOrder20, byteArray46);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless48 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray46);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_5, (long) 34676, (long) 7, byteArray46, byteOrder49, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType52 = tiffField51.getFieldType();
        boolean boolean53 = tiffField51.isLocalValue();
        java.lang.Object obj54 = fieldTypeByte0.getValue(tiffField51);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = tiffField51.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [J cannot be cast to class java.lang.Number ([J and java.lang.Number are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeByte0);
        org.junit.Assert.assertNotNull(tagInfoSRationals8);
        org.junit.Assert.assertNotNull(tagInfoShort9);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 4096 + "'", short33 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray47);
        org.junit.Assert.assertNotNull(abstractFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.apache.commons.imaging.internal.Debug.debug();
    }

    @Test
    void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_80_BIT_CMYK_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YCBCR_POSITIONING;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort6 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, abstractFieldTypeArray7);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, tiffDirectoryType10);
        java.nio.ByteOrder byteOrder12 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray14 = tagInfoByte11.encodeValue(byteOrder12, (byte) 0);
        short[] shortArray15 = new short[] {};
        byte[] byteArray16 = tagInfoShortOrLongOrRational1.encodeValue(byteOrder12, shortArray15);
        byte[] byteArray18 = tagInfoShort0.encodeValue(byteOrder12, (short) (byte) -1);
        boolean boolean19 = tagInfoShort0.isOffset();
        org.junit.Assert.assertNotNull(tagInfoShort0);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational1);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(69, "Bad Type");
    }

    @Test
    void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_LOSSLESS_JBIG_B_AND_W_J;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_EMBED_POLICY;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_REDUCTION_MATRIX_1;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational2 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_NEUTRAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort3 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTERLACE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts4 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational5 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort10 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, abstractFieldTypeArray11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, tiffDirectoryType14);
        java.nio.ByteOrder byteOrder16 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray18 = tagInfoByte15.encodeValue(byteOrder16, (byte) 0);
        short[] shortArray19 = new short[] {};
        byte[] byteArray20 = tagInfoShortOrLongOrRational5.encodeValue(byteOrder16, shortArray19);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational21 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort26 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray27 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort26 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList28 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList28, abstractFieldTypeArray27);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType30 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte31 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList28, tiffDirectoryType30);
        java.nio.ByteOrder byteOrder32 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray34 = tagInfoByte31.encodeValue(byteOrder32, (byte) 0);
        short[] shortArray35 = new short[] {};
        byte[] byteArray36 = tagInfoShortOrLongOrRational21.encodeValue(byteOrder32, shortArray35);
        byte[] byteArray37 = tagInfoShorts4.encodeValue(byteOrder16, shortArray35);
        byte[] byteArray39 = tagInfoShort3.encodeValue(byteOrder16, (short) (byte) 10);
        short[] shortArray41 = new short[] { (byte) 0 };
        byte[] byteArray42 = tagInfoShortOrRational2.encodeValue(byteOrder16, shortArray41);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals43 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort44 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort49 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray50 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort49 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList51 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList51, abstractFieldTypeArray50);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType53 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte54 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList51, tiffDirectoryType53);
        java.nio.ByteOrder byteOrder55 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray57 = tagInfoByte54.encodeValue(byteOrder55, (byte) 0);
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray67 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray62, 34713, (int) (byte) 0, false, (-65281));
        short short68 = tagInfoShort44.getValue(byteOrder55, byteArray67);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort73 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray74 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort73 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList75 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList75, abstractFieldTypeArray74);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType77 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte78 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList75, tiffDirectoryType77);
        java.nio.ByteOrder byteOrder79 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray81 = tagInfoByte78.encodeValue(byteOrder79, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray82 = tagInfoSRationals43.getValue(byteOrder55, byteArray81);
        byte[] byteArray83 = tagInfoSRationals1.encodeValue(byteOrder16, rationalNumberArray82);
        byte[] byteArray85 = tagInfoLong0.encodeValue(byteOrder16, 34676);
        org.junit.Assert.assertNotNull(tagInfoLong0);
        org.junit.Assert.assertNotNull(tagInfoSRationals1);
        org.junit.Assert.assertNotNull(tagInfoShortOrRational2);
        org.junit.Assert.assertNotNull(tagInfoShort3);
        org.junit.Assert.assertNotNull(tagInfoShorts4);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational5);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational21);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteOrder32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0]");
        org.junit.Assert.assertNotNull(tagInfoSRationals43);
        org.junit.Assert.assertNotNull(tagInfoShort44);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteOrder55);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 4096 + "'", short68 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(byteOrder79);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray82);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[]");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[116, -121, 0, 0]");
    }

    @Test
    void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_DATE_TIME;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType6, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny("", 32897, (int) (short) 0, tiffDirectoryType6);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort5 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort5 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList7 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList7, abstractFieldTypeArray6);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList7, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder11 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray13 = tagInfoByte10.encodeValue(byteOrder11, (byte) 0);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray18, 34713, (int) (byte) 0, false, (-65281));
        short short24 = tagInfoShort0.getValue(byteOrder11, byteArray23);
        boolean boolean25 = tagInfoShort0.isOffset();
        org.junit.Assert.assertNotNull(tagInfoShort0);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 4096 + "'", short24 == (short) 4096);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.BYTE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort6 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, abstractFieldTypeArray7);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts12 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals13 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder14 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals15 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort16 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort21 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray22 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort21 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList23 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList23, abstractFieldTypeArray22);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType25 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte26 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList23, tiffDirectoryType25);
        java.nio.ByteOrder byteOrder27 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray29 = tagInfoByte26.encodeValue(byteOrder27, (byte) 0);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray39 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray34, 34713, (int) (byte) 0, false, (-65281));
        short short40 = tagInfoShort16.getValue(byteOrder27, byteArray39);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort45 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray46 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort45 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList47 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList47, abstractFieldTypeArray46);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType49 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte50 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList47, tiffDirectoryType49);
        java.nio.ByteOrder byteOrder51 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray53 = tagInfoByte50.encodeValue(byteOrder51, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray54 = tagInfoSRationals15.getValue(byteOrder27, byteArray53);
        byte[] byteArray55 = tagInfoRationals13.encodeValue(byteOrder14, rationalNumberArray54);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort56 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort61 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray62 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort61 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList63 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList63, abstractFieldTypeArray62);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType65 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte66 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList63, tiffDirectoryType65);
        java.nio.ByteOrder byteOrder67 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray69 = tagInfoByte66.encodeValue(byteOrder67, (byte) 0);
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray79 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray74, 34713, (int) (byte) 0, false, (-65281));
        short short80 = tagInfoShort56.getValue(byteOrder67, byteArray79);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless81 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray79);
        short[] shortArray82 = tagInfoShorts12.getValue(byteOrder14, byteArray79);
        byte[] byteArray84 = tagInfoByte11.encodeValue(byteOrder14, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray85 = fieldTypeByte0.writeData((java.lang.Object) 2, byteOrder14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Invalid data: 2 (java.lang.Integer)");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldTypeByte0);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tagInfoShorts12);
        org.junit.Assert.assertNotNull(tagInfoRationals13);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(tagInfoSRationals15);
        org.junit.Assert.assertNotNull(tagInfoShort16);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 4096 + "'", short40 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteOrder51);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort56);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(byteOrder67);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) 4096 + "'", short80 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[4096]");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1]");
    }

    @Test
    void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats("", (int) (byte) 1, (int) (byte) 0, tiffDirectoryType3);
        java.nio.ByteOrder byteOrder5 = null;
        float[] floatArray9 = new float[] { (short) 0, 0L, (short) 10 };
        byte[] byteArray10 = tagInfoFloats4.encodeValue(byteOrder5, floatArray9);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT6(byteArray10, 31, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: I/O error");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 65, 32, 0, 0]");
    }

    @Test
    void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType6 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte7 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType6);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("M", 255, 0, tiffDirectoryType6, false);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType6 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType6.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_CONVERTER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.IMAGE_DATA_DISCARD_VALUE_FULL_RESOLUTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType51 = tiffField50.getFieldType();
        boolean boolean52 = tiffField50.isLocalValue();
        java.lang.String str53 = tiffField50.getFieldTypeName();
        java.lang.String str54 = tiffField50.getValueDescription();
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(abstractFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_TWO_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        int int3 = strips2.getImageDataLength();
        int int4 = strips2.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray5 = strips2.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray6 = strips2.getImageData();
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32844 + "'", int4 == 32844);
        org.junit.Assert.assertNotNull(dataElementArray5);
        org.junit.Assert.assertNotNull(dataElementArray6);
    }

    @Test
    void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        int int3 = tiffImagingParameters2.getSubImageY();
        java.lang.String str4 = tiffImagingParameters2.getXmpXml();
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter5 = tiffImagingParameters2.getCustomPhotometricInterpreter();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(photometricInterpreter5);
    }

    @Test
    void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_NEXT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32766 + "'", int0 == 32766);
    }

    @Test
    void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SHUTTER_SPEED_VALUE;
        org.junit.Assert.assertNotNull(tagInfoSRational0);
    }

    @Test
    void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList2 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.ASCII_OR_RATIONAL;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational("N", 19, 32909, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("S", (-65536), abstractFieldTypeList2, 0, tiffDirectoryType10, false);
        org.junit.Assert.assertNotNull(abstractFieldTypeList2);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType10 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType10.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
    }

    @Test
    void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters4 = tiffImagingParameters2.setXmpXml("Bad Type");
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNotNull(tiffImagingParameters4);
    }

    @Test
    void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType4 = tiffRasterDataInt2.getDataType();
        int int5 = tiffRasterDataInt2.getHeight();
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertTrue("'" + tiffRasterDataType4 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType4.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray0, (int) (short) 1, 14);
        int int6 = tiles5.getTileWidth();
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType51 = tiffField50.getFieldType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType52 = tiffField50.getFieldType();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement53 = tiffField50.getOversizeValueElement();
        long long54 = abstractTiffElement53.offset;
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(abstractFieldType51);
        org.junit.Assert.assertNotNull(abstractFieldType52);
        org.junit.Assert.assertNotNull(abstractTiffElement53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 7L + "'", long54 == 7L);
    }

    @Test
    void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType51 = tiffField50.getFieldType();
        boolean boolean52 = tiffField50.isLocalValue();
        java.lang.String str53 = tiffField50.getFieldTypeName();
        java.io.PrintWriter printWriter54 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField50.dump(printWriter54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(abstractFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_YCB_CR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        int int3 = tiffImagingParameters2.getSubImageY();
        java.lang.String str4 = tiffImagingParameters2.getXmpXml();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters2.asThis();
        int int6 = tiffImagingParameters5.getSubImageWidth();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType7 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort12 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort17 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray18 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort17 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList19 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList19, abstractFieldTypeArray18);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType21 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte22 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList19, tiffDirectoryType21);
        java.nio.ByteOrder byteOrder23 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray25 = tagInfoByte22.encodeValue(byteOrder23, (byte) 0);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray35 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray30, 34713, (int) (byte) 0, false, (-65281));
        short short36 = tagInfoShort12.getValue(byteOrder23, byteArray35);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort41 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray42 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort41 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList43 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList43, abstractFieldTypeArray42);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType45 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte46 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList43, tiffDirectoryType45);
        java.nio.ByteOrder byteOrder47 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray49 = tagInfoByte46.encodeValue(byteOrder47, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray50 = tagInfoSRationals11.getValue(byteOrder23, byteArray49);
        byte[] byteArray52 = tagInfoSByte10.encodeValue(byteOrder23, (byte) 100);
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader56 = new org.apache.commons.imaging.formats.tiff.TiffHeader(byteOrder23, 23, (long) 64, true);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType7 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType7.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoSRationals11);
        org.junit.Assert.assertNotNull(tagInfoShort12);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 4096 + "'", short36 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteOrder47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100]");
    }

    @Test
    void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics();
        float[] floatArray5 = tiffRasterDataInt2.getData();
        int int6 = tiffRasterDataInt2.getSamplesPerPixel();
        // The following exception was thrown during execution in test generation
        try {
            float float9 = tiffRasterDataInt2.getValue(3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (3, 35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_SHADOW_SCALE;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort52 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YCBCR_POSITIONING;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational53 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort58 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray59 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort58 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList60 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList60, abstractFieldTypeArray59);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType62 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte63 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList60, tiffDirectoryType62);
        java.nio.ByteOrder byteOrder64 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray66 = tagInfoByte63.encodeValue(byteOrder64, (byte) 0);
        short[] shortArray67 = new short[] {};
        byte[] byteArray68 = tagInfoShortOrLongOrRational53.encodeValue(byteOrder64, shortArray67);
        byte[] byteArray70 = tagInfoShort52.encodeValue(byteOrder64, (short) (byte) -1);
        byte[] byteArray71 = fieldTypeLong8_4.writeData((java.lang.Object) (-65536), byteOrder64);
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(tagInfoShort52);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational53);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(byteOrder64);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[-1, -1]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[0, 0, -1, -1]");
    }

    @Test
    void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType15 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("", 7, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort13, 5, tiffDirectoryType15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", (-4), (int) (byte) 1, tiffDirectoryType15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 5, (int) (short) -1, tiffDirectoryType15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("S", 32946, 34712, tiffDirectoryType15);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType15 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType15.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
    }

    @Test
    void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_16_BIT_GRAY_HALF;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort6 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray7 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort6 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, abstractFieldTypeArray7);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList8, tiffDirectoryType10);
        java.nio.ByteOrder byteOrder12 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray14 = tagInfoByte11.encodeValue(byteOrder12, (byte) 0);
        short[] shortArray15 = new short[] {};
        byte[] byteArray16 = tagInfoShortOrLongOrRational1.encodeValue(byteOrder12, shortArray15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational17 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort22 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray23 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort22 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList24 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList24, abstractFieldTypeArray23);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType26 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte27 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList24, tiffDirectoryType26);
        java.nio.ByteOrder byteOrder28 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray30 = tagInfoByte27.encodeValue(byteOrder28, (byte) 0);
        short[] shortArray31 = new short[] {};
        byte[] byteArray32 = tagInfoShortOrLongOrRational17.encodeValue(byteOrder28, shortArray31);
        byte[] byteArray33 = tagInfoShorts0.encodeValue(byteOrder12, shortArray31);
        byte[] byteArray38 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray33, 1, (-65281), false, 7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray42 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.decompressT4_1D(byteArray38, 32, 79, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Decompression error");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagInfoShorts0);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational1);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational17);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 16]");
    }

    @Test
    void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("TIFF image data: 0 bytes", 34676, 5, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("V", 11, tiffDirectoryType8);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
    }

    @Test
    void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        int int3 = tiffImagingParameters2.getSubImageY();
        java.lang.String str4 = tiffImagingParameters2.getXmpXml();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters2.asThis();
        java.lang.Integer int6 = tiffImagingParameters2.getT6Options();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD3;
        boolean boolean1 = tiffDirectoryType0.isImageDirectory();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType0 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD3 + "'", tiffDirectoryType0.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD3));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_NOISE_PROFILE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CALIBRATION_ILLUMINANT_1;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory2 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter3 = null;
        int[] intArray9 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration16 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader18 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder19 = tiffReader18.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles20 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled21 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory2, photometricInterpreter3, 10, (int) (byte) 10, (-65281), intArray9, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration16, byteOrder19, tiles20);
        byte[] byteArray23 = tagInfoShort1.encodeValue(byteOrder19, (short) 4096);
        double[] doubleArray29 = new double[] { (-1.0f), 20, (-3), 0.0f, (byte) 10 };
        byte[] byteArray30 = tagInfoDoubles0.encodeValue(byteOrder19, doubleArray29);
        byte[] byteArray35 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray30, 21, 0, true, 10);
        org.junit.Assert.assertNotNull(tagInfoDoubles0);
        org.junit.Assert.assertNotNull(tagInfoShort1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration16 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration16.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[16, 0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 20.0, -3.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-65, -16, 0, 0, 0, 0, 0, 0, 64, 52, 0, 0, 0, 0, 0, 0, -64, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 36, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 1]");
    }

    @Test
    void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType1 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.getFieldType(32897);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Field type 32897 is unsupported");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
    }

    @Test
    void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals7 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort8 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort13 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList15 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, abstractFieldTypeArray14);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList15, tiffDirectoryType17);
        java.nio.ByteOrder byteOrder19 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray21 = tagInfoByte18.encodeValue(byteOrder19, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray31 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray26, 34713, (int) (byte) 0, false, (-65281));
        short short32 = tagInfoShort8.getValue(byteOrder19, byteArray31);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort37 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, abstractFieldTypeArray38);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType41 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList39, tiffDirectoryType41);
        java.nio.ByteOrder byteOrder43 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray45 = tagInfoByte42.encodeValue(byteOrder43, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray46 = tagInfoSRationals7.getValue(byteOrder19, byteArray45);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless47 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray45);
        java.nio.ByteOrder byteOrder48 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField50 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_4, (long) 34676, (long) 7, byteArray45, byteOrder48, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType51 = tiffField50.getFieldType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType52 = tiffField50.getFieldType();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement53 = tiffField50.getOversizeValueElement();
        int int54 = tiffField50.getOffset();
        int int55 = tiffField50.getDirectoryType();
        org.junit.Assert.assertNotNull(tagInfoSRationals7);
        org.junit.Assert.assertNotNull(tagInfoShort8);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 4096 + "'", short32 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteOrder43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray46);
        org.junit.Assert.assertNotNull(abstractFieldType51);
        org.junit.Assert.assertNotNull(abstractFieldType52);
        org.junit.Assert.assertNotNull(abstractTiffElement53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 7 + "'", int54 == 7);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 31 + "'", int55 == 31);
    }

    @Test
    void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_OFFSET_SCHEMA;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType4 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType4);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort10 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort10 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, abstractFieldTypeArray11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList12, tiffDirectoryType14);
        java.nio.ByteOrder byteOrder16 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray18 = tagInfoByte15.encodeValue(byteOrder16, (byte) 0);
        byte[] byteArray20 = tagInfoDouble5.encodeValue(byteOrder16, (double) 32773);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType29 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte30 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals31 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte32 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational33 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_NEUTRAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort34 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTERLACE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts35 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational36 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort41 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray42 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort41 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList43 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList43, abstractFieldTypeArray42);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType45 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte46 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList43, tiffDirectoryType45);
        java.nio.ByteOrder byteOrder47 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray49 = tagInfoByte46.encodeValue(byteOrder47, (byte) 0);
        short[] shortArray50 = new short[] {};
        byte[] byteArray51 = tagInfoShortOrLongOrRational36.encodeValue(byteOrder47, shortArray50);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational52 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort57 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray58 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort57 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList59 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList59, abstractFieldTypeArray58);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType61 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte62 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList59, tiffDirectoryType61);
        java.nio.ByteOrder byteOrder63 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray65 = tagInfoByte62.encodeValue(byteOrder63, (byte) 0);
        short[] shortArray66 = new short[] {};
        byte[] byteArray67 = tagInfoShortOrLongOrRational52.encodeValue(byteOrder63, shortArray66);
        byte[] byteArray68 = tagInfoShorts35.encodeValue(byteOrder47, shortArray66);
        byte[] byteArray70 = tagInfoShort34.encodeValue(byteOrder47, (short) (byte) 10);
        short[] shortArray72 = new short[] { (byte) 0 };
        byte[] byteArray73 = tagInfoShortOrRational33.encodeValue(byteOrder47, shortArray72);
        byte[] byteArray75 = tagInfoSByte32.encodeValue(byteOrder47, (byte) 0);
        byte[] byteArray77 = tagInfoDouble5.encodeValue(byteOrder47, (double) 77);
        byte[] byteArray79 = tagInfoSLong0.encodeValue(byteOrder47, 77);
        org.junit.Assert.assertNotNull(tagInfoSLong0);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType4 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType4.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(abstractFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 0, 0, -96, 0, -32, 64]");
        org.junit.Assert.assertTrue("'" + tiffDirectoryType29 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType29.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(tagInfoShortOrRational33);
        org.junit.Assert.assertNotNull(tagInfoShort34);
        org.junit.Assert.assertNotNull(tagInfoShorts35);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational36);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteOrder47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational52);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0]");
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[0]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[0, 0, 0, 0, 0, 64, 83, 64]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[77, 0, 0, 0]");
    }

    @Test
    void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXIF_OFFSET;
        org.junit.Assert.assertNotNull(tagInfoDirectory0);
    }

    @Test
    void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt3 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(255, (-4), intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Raster dimensions less than or equal to zero are not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        java.lang.Integer int3 = tiffImagingParameters0.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters0.setXmpXml("V");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet6 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters7 = tiffImagingParameters5.setOutputSet(tiffOutputSet6);
        java.lang.Integer int8 = tiffImagingParameters7.getT4Options();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(tiffImagingParameters7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.EXIF_TAG_GEO_ASCII_PARAMS_TAG;
        boolean boolean1 = tagInfoAscii0.isText();
        org.junit.Assert.assertNotNull(tagInfoAscii0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader1 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray2 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList3 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList3, tiffDirectoryArray2);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray5 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList6 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList6, tiffFieldArray5);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents8 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader1, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList3, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList6);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList9 = tiffContents8.tiffFields;
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator10 = tiffFieldList9.spliterator();
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType20 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType20);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort22 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType20);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte23 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType20);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals24 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort25 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort30 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray31 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort30 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList32 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, abstractFieldTypeArray31);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType34 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList32, tiffDirectoryType34);
        java.nio.ByteOrder byteOrder36 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray38 = tagInfoByte35.encodeValue(byteOrder36, (byte) 0);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray48 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray43, 34713, (int) (byte) 0, false, (-65281));
        short short49 = tagInfoShort25.getValue(byteOrder36, byteArray48);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort54 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray55 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort54 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList56 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList56, abstractFieldTypeArray55);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType58 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte59 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList56, tiffDirectoryType58);
        java.nio.ByteOrder byteOrder60 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray62 = tagInfoByte59.encodeValue(byteOrder60, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray63 = tagInfoSRationals24.getValue(byteOrder36, byteArray62);
        byte[] byteArray65 = tagInfoSByte23.encodeValue(byteOrder36, (byte) 100);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory66 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(88, tiffFieldList9, (long) 34712, (long) 9, byteOrder36);
        java.nio.ByteOrder byteOrder67 = tiffDirectory66.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts68 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TRANSFER_RANGE;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray70 = tiffDirectory66.getFieldValue(tagInfoShorts68, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Required field \"TransferRange\" is missing");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffDirectoryArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tiffFieldList9);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator10);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType20 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType20.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoSRationals24);
        org.junit.Assert.assertNotNull(tagInfoShort25);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 4096 + "'", short49 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(byteOrder60);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray63);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[100]");
        org.junit.Assert.assertNotNull(byteOrder67);
        org.junit.Assert.assertNotNull(tagInfoShorts68);
    }

    @Test
    void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte0 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SBYTE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_5 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals8 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort9 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort14 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray15 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort14 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList16 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList16, abstractFieldTypeArray15);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType18 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList16, tiffDirectoryType18);
        java.nio.ByteOrder byteOrder20 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray22 = tagInfoByte19.encodeValue(byteOrder20, (byte) 0);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray32 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray27, 34713, (int) (byte) 0, false, (-65281));
        short short33 = tagInfoShort9.getValue(byteOrder20, byteArray32);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort38 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray39 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort38 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList40 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList40, abstractFieldTypeArray39);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType42 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte43 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList40, tiffDirectoryType42);
        java.nio.ByteOrder byteOrder44 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray46 = tagInfoByte43.encodeValue(byteOrder44, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray47 = tagInfoSRationals8.getValue(byteOrder20, byteArray46);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless48 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray46);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_5, (long) 34676, (long) 7, byteArray46, byteOrder49, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType52 = tiffField51.getFieldType();
        boolean boolean53 = tiffField51.isLocalValue();
        java.lang.Object obj54 = fieldTypeByte0.getValue(tiffField51);
        int int55 = tiffField51.getSortHint();
        org.junit.Assert.assertNotNull(fieldTypeByte0);
        org.junit.Assert.assertNotNull(tagInfoSRationals8);
        org.junit.Assert.assertNotNull(tagInfoShort9);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 4096 + "'", short33 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray47);
        org.junit.Assert.assertNotNull(abstractFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
    }

    @Test
    void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_DCTABLES;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics();
        float[] floatArray5 = tiffRasterDataInt2.getData();
        int int6 = tiffRasterDataInt2.getSamplesPerPixel();
        int[] intArray7 = tiffRasterDataInt2.getIntData();
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(16, 2);
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics((float) 79);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = tiffRasterDataInt2.getValue(8, (-4), 32844);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (8, -4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
    }

    @Test
    void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_HIGH_GAIN_DOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational1 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.RATIONAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts3 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_REPEAT_DIM;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals4 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE;
        java.nio.ByteOrder byteOrder5 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals6 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort7 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort12 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray13 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort12 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList14 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, abstractFieldTypeArray13);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList14, tiffDirectoryType16);
        java.nio.ByteOrder byteOrder18 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray20 = tagInfoByte17.encodeValue(byteOrder18, (byte) 0);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray30 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray25, 34713, (int) (byte) 0, false, (-65281));
        short short31 = tagInfoShort7.getValue(byteOrder18, byteArray30);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort36 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray37 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort36 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList38 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, abstractFieldTypeArray37);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType40 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte41 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList38, tiffDirectoryType40);
        java.nio.ByteOrder byteOrder42 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray44 = tagInfoByte41.encodeValue(byteOrder42, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray45 = tagInfoSRationals6.getValue(byteOrder18, byteArray44);
        byte[] byteArray46 = tagInfoRationals4.encodeValue(byteOrder5, rationalNumberArray45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort47 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort52 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray53 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort52 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList54 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList54, abstractFieldTypeArray53);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType56 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte57 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList54, tiffDirectoryType56);
        java.nio.ByteOrder byteOrder58 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray60 = tagInfoByte57.encodeValue(byteOrder58, (byte) 0);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray70 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray65, 34713, (int) (byte) 0, false, (-65281));
        short short71 = tagInfoShort47.getValue(byteOrder58, byteArray70);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless72 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray70);
        short[] shortArray73 = tagInfoShorts3.getValue(byteOrder5, byteArray70);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField74 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoShorts0, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeRational1, 32769, byteArray70);
        java.lang.String str76 = tiffOutputField74.toString("");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType77 = tiffOutputField74.abstractFieldType;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
        org.junit.Assert.assertNotNull(fieldTypeRational1);
        org.junit.Assert.assertNotNull(tagInfoShorts3);
        org.junit.Assert.assertNotNull(tagInfoRationals4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(tagInfoSRationals6);
        org.junit.Assert.assertNotNull(tagInfoShort7);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 4096 + "'", short31 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(tagInfoShort47);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteOrder58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) 4096 + "'", short71 == (short) 4096);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[4096]");
        org.junit.Assert.assertNotNull(abstractFieldType77);
    }
}
