package org.apache.commons.imaging.randoop;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression0Test {

    public static boolean debug = false;

    @Test
    void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.LZW_COMPRESSION_BLOCK_SIZE_LARGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65536 + "'", int0 == 65536);
    }

    @Test
    void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_NIKON_NEF_COMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34713 + "'", int0 == 34713);
    }

    @Test
    void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_SGILOG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34676 + "'", int0 == 34676);
    }

    @Test
    void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_COLOR_CHARACTERIZATION;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_DOWN_1_2_ROW_EVEN_COLUMNS_OFFSET_RIGHT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.EXIF_TAG_MD_FILE_TAG;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_DEFLATE_PKZIP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32946 + "'", int0 == 32946);
    }

    @Test
    void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_ALTITUDE_REF;
        org.junit.Assert.assertNotNull(tagInfoByte0);
    }

    @Test
    void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType4 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("hi!", (int) (short) 10, abstractFieldType2, (int) (short) 10, tiffDirectoryType4);
    }

    @Test
    void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_SOUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "S" + "'", str0, "S");
    }

    @Test
    void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_ORIENTATION;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "V" + "'", str0, "V");
    }

    @Test
    void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.MAKER_NOTE_SAFETY_VALUE_UNSAFE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_SHADE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PROFILE_EMBED_POLICY_VALUE_ALLOW_COPYING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.INDEXED_VALUE_INDEXED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_RIGHT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SHADOWS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SOFTWARE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
    void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_BGRA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_A;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.RESOLUTION_UNIT_VALUE_CM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_SHADE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PREVIEW_DATE_TIME;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_ROOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_FINE_WEATHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
    void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_SUB2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int3 = org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr.convertYCbCrtoRGB(3, 34713, 65536);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-65281) + "'", int3 == (-65281));
    }

    @Test
    void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SMIN_SAMPLE_VALUE;
        org.junit.Assert.assertNotNull(tagInfoAny0);
    }

    @Test
    void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants.TIFF_TAG_COLOR_RESPONSE_UNIT;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_BLACK_AND_WHITE;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_PIXEL_FORMAT;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 255 + "'", int0 == 255);
    }

    @Test
    void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_SPEED_REF_VALUE_MPH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "M" + "'", str0, "M");
    }

    @Test
    void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_DEPTH;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_4;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DNG_PRIVATE_DATA;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_DOES_NOT_EXIST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_EXPOSURE_INDEX;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_JPEG_OBSOLETE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_LZW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_CMYK;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_COOL_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
    void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF_VALUE_EAST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "E" + "'", str0, "E");
    }

    @Test
    void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T82_T43;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XPOSITION;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_DAY_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_WIDTH;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32844 + "'", int0 == 32844);
    }

    @Test
    void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_LENS_SPECIFICATION;
        org.junit.Assert.assertNotNull(tagInfoRationals0);
    }

    @Test
    void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_WHITE_BALANCE_1;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_IT8MP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32897 + "'", int0 == 32897);
    }

    @Test
    void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 95 + "'", int0 == 95);
    }

    @Test
    void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int0 = org.apache.commons.imaging.formats.tiff.taginfos.TagInfo.LENGTH_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_D75;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.MAKER_NOTE_SAFETY_VALUE_SAFE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants.EXIF_TAG_FAX_RECV_PARAMS;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_D75;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_MULTI_SEGMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_RATING_PERCENT;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MATTEING;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DIFFERENTIAL_VALUE_DIFFERENTIAL_CORRECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.JPEGPROC_VALUE_BASELINE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.OLD_SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
    void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_TIFF_EPSTANDARD_ID_1;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_XMP;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
    void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_D55;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.ALL_EXIF_TAGS;
        java.lang.Class<?> wildcardClass1 = tagInfoList0.getClass();
        org.junit.Assert.assertNotNull(tagInfoList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SMAX_SAMPLE_VALUE;
        org.junit.Assert.assertNotNull(tagInfoAny0);
    }

    @Test
    void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants.ALL_GDAL_LIBRARY_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_BACKGROUND_COLOR_INDICATOR;
        boolean boolean1 = tagInfoByte0.isText();
        org.junit.Assert.assertNotNull(tagInfoByte0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_COPYRIGHT;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
    void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        short short0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.COLORIMETRIC_REFERENCE_VALUE_OUTPUT_REFERRED;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0 == (short) 1);
    }

    @Test
    void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LATITUDE_REF;
        int int1 = tagInfoAscii0.tag;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.UNCOMPRESSED_VALUE_YES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_COOL_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_ADOBE_DEFLATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JPEG_OLD_STYLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_DESCRIPTION;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_HORIZONTAL_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_SUB0;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 69 + "'", int0 == 69);
    }

    @Test
    void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_START_IFD2;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_CCITT_GROUP_4;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_RAW_DATA_UNIQUE_ID;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.FLAG_T4_OPTIONS_FILL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JBIG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34661 + "'", int0 == 34661);
    }

    @Test
    void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF_VALUE_SOUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "S" + "'", str0, "S");
    }

    @Test
    void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_MEASURE_MODE_VALUE_2_DIMENSIONAL_MEASUREMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SCENE_CAPTURE_TYPE;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_COLOR_INDICATOR;
        java.lang.String str1 = tagInfoByte0.name;
        org.junit.Assert.assertNotNull(tagInfoByte0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ImageColorIndicator" + "'", str1, "ImageColorIndicator");
    }

    @Test
    void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
    void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_RESTART_INTERVAL;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_8_BIT_GRAY;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_DAY_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_16_BIT_GRAY;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_MANUAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
    void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.imaging.internal.Debug.debug(throwable0, 10);
    }

    @Test
    void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_BGR;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.ALL_GEO_TIFF_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_LINEAR_RAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34892 + "'", int0 == 34892);
    }

    @Test
    void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.EXTRA_SAMPLE_ASSOCIATED_ALPHA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_IMAGE_HISTORY_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_TRACK_REF_VALUE_MAGNETIC_NORTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "M" + "'", str0, "M");
    }

    @Test
    void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType1 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.getFieldType(32946);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Field type 32946 is unsupported");
        } catch (org.apache.commons.imaging.ImagingException e) {
            // Expected exception.
        }
    }

    @Test
    void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
    void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JPEG_2000;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34712 + "'", int0 == 34712);
    }

    @Test
    void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
    void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CONTRAST_1_VALUE_HIGH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DIRECTORY_FOOTER_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SATURATION_1_VALUE_LOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_ITULAB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_COOL_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.FILL_ORDER_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_3;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_TILE_DEPTH;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_LEAF_DATA;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_T6_GROUP_4_FAX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CONTRAST_1_VALUE_LOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SHARPNESS_1_VALUE_SOFT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_MIXED_RASTER_CONTENT_M;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 255 + "'", int0 == 255);
    }

    @Test
    void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_CMYK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 79 + "'", int0 == 79);
    }

    @Test
    void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MAKER_NOTE;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_KODAK_DCR_COMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65000 + "'", int0 == 65000);
    }

    @Test
    void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_EPSON_ERF_COMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.THRESHOLDING_VALUE_RANDOMIZED_DITHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_CCIRLEW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32771 + "'", int0 == 32771);
    }

    @Test
    void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_UNCOMPRESSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined tagInfoUndefined0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROPERABILITY_VERSION;
        org.junit.Assert.assertNotNull(tagInfoUndefined0);
    }

    @Test
    void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_0001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_HOR_POSITIONING_ERROR;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 73 + "'", int0 == 73);
    }

    @Test
    void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.YCB_CR_POSITIONING_VALUE_CENTERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_DAYLIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T4_1D;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants.ALL_ALIAS_SKETCHBOOK_PRO_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_HOST_COMPUTER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_AVERAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MAKE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_BODY_SERIAL_NUMBER;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants.COLOR_RESPONSE_UNIT_VALUE_0_0001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_C;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 19 + "'", int0 == 19);
    }

    @Test
    void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_ALTITUDE_REF_VALUE_ABOVE_SEA_LEVEL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants.EXIF_TAG_FAX_SUB_ADDRESS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_EXIF;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
    void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_STANDARD_LIGHT_A;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DIRECTORY_HEADER_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_COLOR_MAP;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_NO_FLASH_FUNCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SATURATION_1;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_CCITT_GROUP_3;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_LOSSLESS_COLOR_AND_GRAYSCALE_L;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_FLASH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_D75;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-4) + "'", int0 == (-4));
    }

    @Test
    void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_CCITT_1D;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
    }

    @Test
    void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_DOWN_1_2_ROW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_D50;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T82_T85;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_NAUTICAL_MILES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "N" + "'", str0, "N");
    }

    @Test
    void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
    void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
    void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
    void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_WHITE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 77 + "'", int0 == 77);
    }

    @Test
    void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_EXISTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T81;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DIFFERENTIAL;
        boolean boolean1 = tagInfoShort0.isOffset();
        org.junit.Assert.assertNotNull(tagInfoShort0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("ImageLayer", (int) (byte) 100, 32, tiffDirectoryType3);
    }

    @Test
    void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BLACK_LEVEL_DELTA_H;
        org.junit.Assert.assertNotNull(tagInfoSRationals0);
    }

    @Test
    void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.ALL_MICROSOFT_HD_PHOTO_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_LANDSCAPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_MULTI_PAGE_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
    void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_PROPHOTO_RGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_UNKNOWN;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_D65;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 21 + "'", int0 == 21);
    }

    @Test
    void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CFAPLANE_COLOR;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTEROP_OFFSET;
        org.junit.Assert.assertNotNull(tagInfoDirectory0);
    }

    @Test
    void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
    void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_DEVICE_SETTING_DESCRIPTION;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IMAGE_COLOR_VALUE;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_UP_1_2_ROW_EVEN_COLUMNS_OFFSET_LEFT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_SELF_TIMER_MODE;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_HORIZONTAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
    void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration1 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.lenientValueOf((int) (short) 0);
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration1 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration1.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
    }

    @Test
    void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CUSTOM_RENDERED_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 71 + "'", int0 == 71);
    }

    @Test
    void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_FINE_WEATHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
    void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.ALL_GPS_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 89 + "'", int0 == 89);
    }

    @Test
    void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PROFILE_EMBED_POLICY_VALUE_NO_RESTRICTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_ADOBE_RGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
    void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_JPEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.EXIF_TAG_MODEL_PIXEL_SCALE_TAG;
        org.junit.Assert.assertNotNull(tagInfoDoubles0);
    }

    @Test
    void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.INK_SET_VALUE_NOT_CMYK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_DEFAULT_IMAGE_COLOR;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
    void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_CMYK;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_CALIBRATION_SIGNATURE;
        org.junit.Assert.assertNotNull(tagInfoAsciiOrByte0);
    }

    @Test
    void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
    void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CHROMA_BLUR_RADIUS;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.ALL_MOLECULAR_DYNAMICS_GEL_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.FLAG_T4_OPTIONS_UNCOMPRESSED_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_CELL_LENGTH;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
    void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
    void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_UP_1_2_ROW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_WHITE_BALANCE_2;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
    void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_D50;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T6;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DIFFERENTIAL_VALUE_NO_CORRECTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
    void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
    void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_LOW_GAIN_UP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SUBJECT_DISTANCE_RANGE_VALUE_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.ALL_DNG_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_VERSION_YEAR;
        org.junit.Assert.assertNotNull(tagInfoBytes0);
    }

    @Test
    void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_00001;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
    void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FILE_SOURCE_VALUE_DIGITAL_CAMERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_RGBE;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_STATUS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_IMG_DIRECTION_REF_VALUE_MAGNETIC_NORTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "M" + "'", str0, "M");
    }

    @Test
    void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_OFF_DID_NOT_FIRE_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_DIR_1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("N", 3, 23, tiffDirectoryType9);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_NORTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "N" + "'", str0, "N");
    }

    @Test
    void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SATURATION_2;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_IPTC_NAA;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.UNCOMPRESSED_VALUE_NO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_OFF_NO_FLASH_FUNCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
    }

    @Test
    void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Comparator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectoryComparator0 = org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory.COMPARATOR;
        org.junit.Assert.assertNotNull(tiffOutputDirectoryComparator0);
    }

    @Test
    void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65 + "'", int0 == 65);
    }

    @Test
    void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
    void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_PACKBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32773 + "'", int0 == 32773);
    }

    @Test
    void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_HIGH_GAIN_UP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_ISO_STUDIO_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.CUSTOM_RENDERED_VALUE_CUSTOM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SUBJECT_LOCATION;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
    void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SENSING_METHOD_EXIF_IFD;
        org.junit.Assert.assertNotNull(tagInfoShort0);
    }

    @Test
    void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
    void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_INTERGRAPH_FLAG_REGISTERS;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_ROTATE_180;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants.EXIF_TAG_GEO_KEY_DIRECTORY_TAG;
        java.lang.Class<?> wildcardClass1 = tagInfoShorts0.getClass();
        org.junit.Assert.assertNotNull(tagInfoShorts0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "TIFF image data: 0 bytes");
    }

    @Test
    void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants.EXIF_TAG_OCE_SCANJOB_DESCRIPTION;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_CLOUDY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.PROFILE_TYPE_VALUE_UNSPECIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 255 + "'", int0 == 255);
    }

    @Test
    void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CURRENT_ICCPROFILE;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String str1 = org.apache.commons.imaging.formats.tiff.TiffDirectory.description(89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bad Type" + "'", str1, "Bad Type");
    }

    @Test
    void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
    void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_ISO_STUDIO_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.VERSION_BIG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43 + "'", int0 == 43);
    }

    @Test
    void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTER_COLOR_PROFILE;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
    void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.YCB_CR_POSITIONING_VALUE_CO_SITED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.GAIN_CONTROL_VALUE_LOW_GAIN_DOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.imaging.internal.Debug.debug("");
    }

    @Test
    void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        short short0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.COLORIMETRIC_REFERENCE_VALUE_SCENE_REFERRED;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined tagInfoUndefined0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SCENE_TYPE;
        org.junit.Assert.assertNotNull(tagInfoUndefined0);
    }

    @Test
    void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_MULTI_SPOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
    void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_D50;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
    void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SATURATION_1_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_FIRED_RETURN_NOT_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_TRILINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
    void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ALL_TIFF_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
    void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_MULTI_PAGE_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int3 = org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr.convertYCbCrtoRGB(0, 11, 34661);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-65536) + "'", int3 == (-65536));
    }

    @Test
    void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_BGR101010;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.LIGHT_SOURCE_VALUE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
    void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.COLOR_SPACE_VALUE_SRGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
    void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_SPEED_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_WEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "W" + "'", str0, "W");
    }

    @Test
    void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_PROGRAM_AE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_FIRED_RETURN_DETECTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_48_BIT_RGB;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_VERTICAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_FOCAL_PLANE_YRESOLUTION;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_24_BIT_BGR;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SUBJECT_DISTANCE_RANGE_VALUE_MACRO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
    void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SHARPNESS_1_VALUE_NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_32_BIT_PBGRA;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF_VALUE_WEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "W" + "'", str0, "W");
    }

    @Test
    void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CODING_METHODS_VALUE_T4_2D;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
    void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration1 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.lenientValueOf(34712);
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration1 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration1.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
    }

    @Test
    void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
    void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
    void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
    void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
    void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_16_BIT_BGR565;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PROFILE_EMBED_POLICY_VALUE_EMBED_NEVER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_ORIGINAL_RAW_FILE_DATA;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.OLD_SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
    void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants.ALL_OCE_SCANJOB_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_BEARING_REF;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PREVIEW_COLORSPACE;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_ISO_STUDIO_TUNGSTEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
    void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
    void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants.ALL_TIFF_4_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_SUB1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_EAST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "E" + "'", str0, "E");
    }

    @Test
    void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_DOWN_1_2_ROW_EVEN_COLUMNS_OFFSET_LEFT_1_2_COLUMN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
    void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PAGE_NUMBER;
        org.junit.Assert.assertNotNull(tagInfoShorts0);
    }

    @Test
    void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_UNCOMPRESSED_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32771 + "'", int0 == 32771);
    }

    @Test
    void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.imaging.internal.Debug.debug(throwable0);
    }

    @Test
    void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
    void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_ON_DID_NOT_FIRE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PREDICTOR_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.OLD_SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CLEAN_FAX_DATA_VALUE_CLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.imaging.internal.Debug.debug(throwable0, 16);
    }

    @Test
    void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_MODEL_2;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants.EXIF_TAG_FAX_DCS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.COMPRESSION_DEFLATE_ADOBE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.RESOLUTION_UNIT_VALUE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.CLEAN_FAX_DATA_VALUE_REGENERATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
    void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
    void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
    void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_SIZE;
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational0);
    }

    @Test
    void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FLASH_VALUE_AUTO_DID_NOT_FIRE_RED_EYE_REDUCTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 88 + "'", int0 == 88);
    }

    @Test
    void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_PARTIAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
    void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_TRANSPARENCY_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns tagInfoUnknowns0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_NOISE_2;
        org.junit.Assert.assertNotNull(tagInfoUnknowns0);
    }

    @Test
    void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_ALTITUDE_REF_VALUE_BELOW_SEA_LEVEL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.FLAG_T6_OPTIONS_UNCOMPRESSED_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.ENTRY_MAX_VALUE_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_SGILOG_24;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34677 + "'", int0 == 34677);
    }

    @Test
    void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_NOISE_1;
        org.junit.Assert.assertNotNull(tagInfoUndefineds0);
    }

    @Test
    void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.SAMPLE_FORMAT_VALUE_UNDEFINED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.ALL_TIFF_EP_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.GRAY_RESPONSE_UNIT_VALUE_0_1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.THRESHOLDING_VALUE_ORDERED_DITHER_OR_HALFTONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.imaging.internal.Debug.debug("M");
    }

    @Test
    void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_IMAGE_LENGTH;
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList1 = tagInfoShortOrLong0.dataTypes;
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
        org.junit.Assert.assertNotNull(abstractFieldTypeList1);
    }

    @Test
    void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
    void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.METERING_MODE_VALUE_SPOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
    void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_BASELINE_SHARPNESS;
        org.junit.Assert.assertNotNull(tagInfoRational0);
    }

    @Test
    void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.List<org.apache.commons.imaging.formats.tiff.taginfos.TagInfo> tagInfoList0 = org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants.ALL_ADOBE_PHOTOSHOP_TAGS;
        org.junit.Assert.assertNotNull(tagInfoList0);
    }

    @Test
    void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.SENSING_METHOD_VALUE_MONOCHROME_LINEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_2_VALUE_CLOUDY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.PREVIEW_COLORSPACE_VALUE_GRAY_GAMMA_2_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_SMOOTHNESS;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_PIXAR_LOG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32909 + "'", int0 == 32909);
    }

    @Test
    void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
    void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.FAX_PROFILE_VALUE_MINIMAL_B_AND_W_LOSSLESS_S;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants.DIRECTORY_TYPE_GPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-3) + "'", int0 == (-3));
    }

    @Test
    void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
    void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_IT8LW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32896 + "'", int0 == 32896);
    }

    @Test
    void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.String str0 = org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants.GPS_TAG_GPS_SPEED_REF_VALUE_KNOTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "N" + "'", str0, "N");
    }

    @Test
    void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_EXTRA_CAMERA_PROFILES;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_PROGRAM_VALUE_PORTRAIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_PREVIEW_IMAGE_START_IFD0;
        org.junit.Assert.assertNotNull(tagInfoLong0);
    }

    @Test
    void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_QTABLES;
        org.junit.Assert.assertNotNull(tagInfoLongs0);
    }

    @Test
    void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
    void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.CALIBRATION_ILLUMINANT_1_VALUE_FLUORESCENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
    void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.imaging.common.BinaryConstant binaryConstant0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT;
        org.junit.Assert.assertNotNull(binaryConstant0);
    }

    @Test
    void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
    void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
    void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii0 = org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants.EXIF_TAG_MD_PREP_DATE;
        org.junit.Assert.assertNotNull(tagInfoAscii0);
    }

    @Test
    void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
    void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXPOSURE_MODE_VALUE_MANUAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
    void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataInt2.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics();
        float float5 = tiffRasterStatistics4.getMaxValue();
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
    void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int int0 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32845 + "'", int0 == 32845);
    }
}

