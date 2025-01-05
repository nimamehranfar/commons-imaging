package org.apache.commons.imaging.randoop;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression9Test {

    public static boolean debug = false;

    @Test
    void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList12 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.BYTE_OR_SHORT;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort24 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType26 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes27 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("", 7, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort24, 5, tiffDirectoryType26);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs28 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", (-4), (int) (byte) 1, tiffDirectoryType26);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs29 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 5, (int) (short) -1, tiffDirectoryType26);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo31 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("Element, offset: 37, length: 12, last: 49", 65536, abstractFieldTypeList12, 80, tiffDirectoryType26, true);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType36 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort37 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("", 16, 21, tiffDirectoryType36);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo38 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) 'a', abstractFieldTypeList12, 14, tiffDirectoryType36);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong40 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("ImageColorIndicator", (int) (byte) 1, tiffDirectoryType36, true);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd tagInfoLongOrIfd41 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd("Element, offset: 0, length: 19, last: 19", 79, (-16776961), tiffDirectoryType36);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("TiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n\tdirectory 0: Root (0)\r\n}\r\n", (-16714752), 32803, tiffDirectoryType36);
        org.junit.Assert.assertNotNull(abstractFieldTypeList12);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType26 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType26.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType36 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType36.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters4 = tiffImagingParameters0.setT4Options((java.lang.Integer) (-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters6 = tiffImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.PixelDensity pixelDensity7 = tiffImagingParameters0.getPixelDensity();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters9 = tiffImagingParameters0.setFileName("");
        org.apache.commons.imaging.PixelDensity pixelDensity10 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters11 = tiffImagingParameters9.setPixelDensity(pixelDensity10);
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNotNull(tiffImagingParameters4);
        org.junit.Assert.assertNotNull(tiffImagingParameters6);
        org.junit.Assert.assertNull(pixelDensity7);
        org.junit.Assert.assertNotNull(tiffImagingParameters9);
        org.junit.Assert.assertNotNull(tiffImagingParameters11);
    }

    @Test
    void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        long long57 = tiffHeader56.offsetToFirstIFD;
        long long58 = tiffHeader56.offsetToFirstIFD;
        java.nio.ByteOrder byteOrder59 = tiffHeader56.byteOrder;
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader60 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray61 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList62 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList62, tiffDirectoryArray61);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray64 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList65 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList65, tiffFieldArray64);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents67 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader60, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList62, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList65);
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader68 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray69 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList70 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList70, tiffDirectoryArray69);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray72 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList73 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList73, tiffFieldArray72);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents75 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader68, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList70, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList73);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents76 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader56, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList62, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList73);
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader77 = tiffContents76.header;
        java.lang.String str78 = tiffHeader77.getElementDescription();
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader79 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray80 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList81 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList81, tiffDirectoryArray80);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray83 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList84 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList84, tiffFieldArray83);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents86 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader79, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList81, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList84);
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader87 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray88 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList89 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList89, tiffDirectoryArray88);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray91 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList92 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList92, tiffFieldArray91);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents94 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader87, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList89, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList92);
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata95 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents94);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents96 = tiffImageMetadata95.contents;
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList97 = tiffImageMetadata95.getAllFields();
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents98 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader77, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList81, tiffFieldList97);
        java.lang.String str99 = tiffHeader77.getElementDescription();
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
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 64L + "'", long57 == 64L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 64L + "'", long58 == 64L);
        org.junit.Assert.assertNotNull(byteOrder59);
        org.junit.Assert.assertNotNull(tiffDirectoryArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(tiffDirectoryArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(tiffHeader77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "TIFF Header" + "'", str78, "TIFF Header");
        org.junit.Assert.assertNotNull(tiffDirectoryArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(tiffDirectoryArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(tiffContents96);
        org.junit.Assert.assertNotNull(tiffFieldList97);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "TIFF Header" + "'", str99, "TIFF Header");
    }

    @Test
    void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList4 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.BYTE_OR_SHORT;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType11 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 14, abstractFieldTypeList4, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType19 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType19, false);
        boolean boolean22 = tiffDirectoryType19.isImageDirectory();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", 22, abstractFieldTypeList4, 32947, tiffDirectoryType19);
        org.junit.Assert.assertNotNull(abstractFieldTypeList4);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType11 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType11.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType19 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType19.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips4 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray5 = strips4.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray5, 48257);
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertNotNull(dataElementArray5);
    }

    @Test
    void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_2 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.IFD8;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("V", 9, tiffDirectoryType8);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("42113 (0xa481: GDALNoData): ", (int) ' ', (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_2, tiffDirectoryType8);
        org.junit.Assert.assertNotNull(fieldTypeLong8_2);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        int int79 = tiffOutputField74.count;
        java.lang.String str80 = tiffOutputField74.toString();
        tiffOutputField74.setSortHint((int) 'a');
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo83 = tiffOutputField74.tagInfo;
        byte[] byteArray84 = tiffOutputField74.getData();
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
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 32769 + "'", int79 == 32769);
        org.junit.Assert.assertNotNull(tagInfo83);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 16]");
    }

    @Test
    void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader1 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder2 = tiffReader1.getByteOrder();
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy3 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(byteOrder2);
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader5 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray6 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList7 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList7, tiffDirectoryArray6);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray9 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList10, tiffFieldArray9);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents12 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader5, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList7, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList10);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList13 = tiffContents12.tiffFields;
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator14 = tiffFieldList13.spliterator();
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType24 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational25 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType24);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort26 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType24);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte27 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType24);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals28 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort29 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort34 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort34 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList36 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, abstractFieldTypeArray35);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType38 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList36, tiffDirectoryType38);
        java.nio.ByteOrder byteOrder40 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray42 = tagInfoByte39.encodeValue(byteOrder40, (byte) 0);
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray52 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray47, 34713, (int) (byte) 0, false, (-65281));
        short short53 = tagInfoShort29.getValue(byteOrder40, byteArray52);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort58 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray59 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort58 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList60 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList60, abstractFieldTypeArray59);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType62 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte63 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList60, tiffDirectoryType62);
        java.nio.ByteOrder byteOrder64 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray66 = tagInfoByte63.encodeValue(byteOrder64, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray67 = tagInfoSRationals28.getValue(byteOrder40, byteArray66);
        byte[] byteArray69 = tagInfoSByte27.encodeValue(byteOrder40, (byte) 100);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory70 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(88, tiffFieldList13, (long) 34712, (long) 9, byteOrder40);
        java.awt.image.BufferedImage bufferedImage71 = tiffDirectory70.getTiffImage();
        java.lang.String str72 = tiffDirectory70.getElementDescription();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters73 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity74 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters75 = tiffImagingParameters73.setPixelDensity(pixelDensity74);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters77 = tiffImagingParameters75.setXmpXml("Bad Type");
        java.awt.image.BufferedImage bufferedImage78 = tiffDirectory70.getTiffImage(tiffImagingParameters75);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType82 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats83 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats("", (int) (byte) 1, (int) (byte) 0, tiffDirectoryType82);
        float[] floatArray85 = tiffDirectory70.getFieldValue(tagInfoFloats83, false);
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory86 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory(byteOrder2, tiffDirectory70);
        int int87 = directory86.type;
        int int88 = directory86.type;
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList89 = directory86.getAllFields();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(tiffDirectoryArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tiffFieldList13);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator14);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType24 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType24.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoSRationals28);
        org.junit.Assert.assertNotNull(tagInfoShort29);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 4096 + "'", short53 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(byteOrder64);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray67);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[100]");
        org.junit.Assert.assertNull(bufferedImage71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(tiffImagingParameters75);
        org.junit.Assert.assertNotNull(tiffImagingParameters77);
        org.junit.Assert.assertNull(bufferedImage78);
        org.junit.Assert.assertNull(floatArray85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 88 + "'", int87 == 88);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 88 + "'", int88 == 88);
        org.junit.Assert.assertNotNull(tiffFieldList89);
    }

    @Test
    void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.imaging.formats.tiff.TiffImageParser tiffImageParser0 = new org.apache.commons.imaging.formats.tiff.TiffImageParser();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters1 = tiffImageParser0.getDefaultParameters();
        boolean boolean3 = tiffImageParser0.canAcceptExtension("ColorSpace");
        boolean boolean5 = tiffImageParser0.canAcceptExtension("32771 (0x8003: Unknown Tag):  (34676 hi!)");
        boolean boolean7 = tiffImageParser0.canAcceptExtension("JPEG image data: 1 bytes");
        java.nio.ByteOrder byteOrder8 = tiffImageParser0.getByteOrder();
        org.apache.commons.imaging.ImageFormat imageFormat9 = null;
        boolean boolean10 = tiffImageParser0.canAcceptType(imageFormat9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = tiffImageParser0.dumpImageFile(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffImagingParameters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters4 = tiffImagingParameters0.setT4Options((java.lang.Integer) (-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters6 = tiffImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters8 = tiffImagingParameters6.setFileName("[TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = tiffImagingParameters6.getPixelDensity();
        int[] intArray14 = new int[] { (byte) 1, 14, 22 };
        int int15 = org.apache.commons.imaging.internal.SafeOperations.add(intArray14);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab19 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(34892, intArray14, 20, 9, (-4));
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters20 = tiffImagingParameters6.setCustomPhotometricInterpreter((org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterCieLab19);
        org.apache.commons.imaging.common.ImageBuilder imageBuilder21 = null;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType31 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs33 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType31, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats34 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats("ImageColorIndicator", 31, (-1), tiffDirectoryType31);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd tagInfoLongOrIfd35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd("TiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\nTiffOutputSet {\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\nbyteOrder: LITTLE_ENDIAN\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n\tdirectory 0: Exif (-2)\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n\tdirectory 1: Root (0)\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n}\r\n", 0, 32771, tiffDirectoryType31);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort47 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(20, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType52 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational53 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType52);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo55 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", 34892, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort47, 6, tiffDirectoryType52, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes56 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("TIFF image data: 0 bytes", (int) ' ', 9, tiffDirectoryType52);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs57 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs("TIFF image data: 0 bytesBad Type: \n\n", 34905, 48, tiffDirectoryType52);
        java.nio.ByteOrder byteOrder58 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat62 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 8, (float) (short) 0);
        int[] intArray63 = photometricInterpreterFloat62.getMinXY();
        float float64 = photometricInterpreterFloat62.getMeanFound();
        float float65 = photometricInterpreterFloat62.getMaxFound();
        int[] intArray66 = photometricInterpreterFloat62.getMaxXY();
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel71 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(95, intArray66, 25, 69, 65536, true);
        byte[] byteArray72 = tagInfoSLongs57.encodeValue(byteOrder58, intArray66);
        byte[] byteArray73 = tagInfoLongOrIfd35.encodeValue(byteOrder36, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            photometricInterpreterCieLab19.interpretPixel(imageBuilder21, intArray66, 1191191296, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNotNull(tiffImagingParameters4);
        org.junit.Assert.assertNotNull(tiffImagingParameters6);
        org.junit.Assert.assertNotNull(tiffImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertNotNull(tiffImagingParameters20);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType31 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType31.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType52 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType52.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0]");
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + Float.NEGATIVE_INFINITY + "'", float65 == Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat3 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat(16, 21, (int) (byte) 1);
        int int6 = tiffRasterDataFloat3.getIntValue(3, 0);
        float[] floatArray7 = tiffRasterDataFloat3.getData();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tiffRasterDataFloat3.getIntValue(32803, 65536, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (32803, 65536)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType13 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte14 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes("ImageColorIndicator", 34892, 20, tiffDirectoryType13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("32771 (0x8003: Unknown Tag): ", 37, tiffDirectoryType13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals("MBad Type: \n\nUnknown Tag (0x8003): ", 16, 13, tiffDirectoryType13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("JPEG image data: 1 bytes", 34677, tiffDirectoryType13);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType13 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType13.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.Object obj1 = null;
        org.apache.commons.imaging.internal.Debug.debug("SRational", obj1);
    }

    @Test
    void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory16.add(tagInfoByte18, (byte) 1);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField22 = tiffOutputDirectory16.findField(71);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType32 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte33 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType32);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals34 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType32);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType32);
        java.nio.ByteOrder byteOrder36 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray38 = tagInfoSByte35.encodeValue(byteOrder36, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory39 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder36);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData40 = tiffOutputDirectory39.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte41 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory39.add(tagInfoByte41, (byte) 1);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField45 = tiffOutputDirectory39.findField(71);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType53 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii54 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType53);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort55 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("", (int) (short) 0, tiffDirectoryType53);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat56 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat("", 17, tiffDirectoryType53);
        tiffOutputDirectory39.add(tagInfoFloat56, (float) 32803);
        tiffOutputDirectory16.setNextDirectory(tiffOutputDirectory39);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> tiffOutputFieldItor60 = tiffOutputDirectory16.iterator();
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType63 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_GPS;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort64 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort("W", 34905, tiffDirectoryType63);
        tiffOutputDirectory16.add(tagInfoSShort64, (short) 10);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType75 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte76 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType75);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals77 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType75);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong78 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong("E", 0, tiffDirectoryType75);
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader80 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder81 = tiffReader80.getByteOrder();
        byte[] byteArray83 = tagInfoSLong78.encodeValue(byteOrder81, 1678379530);
        tiffOutputDirectory16.add(tagInfoSLong78, 24);
        tiffOutputDirectory16.sortFields();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray87 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips89 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray87, 32844);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles92 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray87, (int) (short) 1, 14);
        boolean boolean93 = tiles92.stripsNotTiles();
        boolean boolean94 = tiles92.stripsNotTiles();
        int int95 = tiles92.getTileHeight();
        tiffOutputDirectory16.setTiffImageData((org.apache.commons.imaging.formats.tiff.AbstractTiffImageData) tiles92);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray97 = tiles92.getImageData();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertNotNull(tagInfoByte18);
        org.junit.Assert.assertNull(tiffOutputField22);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType32 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType32.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData40);
        org.junit.Assert.assertNotNull(tagInfoByte41);
        org.junit.Assert.assertNull(tiffOutputField45);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType53 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType53.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
        org.junit.Assert.assertNotNull(tiffOutputFieldItor60);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType63 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_GPS + "'", tiffDirectoryType63.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_GPS));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType75 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType75.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder81);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[100, 10, 10, 10]");
        org.junit.Assert.assertNotNull(dataElementArray87);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 14 + "'", int95 == 14);
        org.junit.Assert.assertNotNull(dataElementArray97);
    }

    @Test
    void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.imaging.formats.tiff.TiffImageParser tiffImageParser0 = new org.apache.commons.imaging.formats.tiff.TiffImageParser();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList2 = tiffImageParser0.getAllBufferedImages(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList7 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.LONG_OR_IFD;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds("T", 34661, (-1), tiffDirectoryType16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("TIFF Header", 42, tiffDirectoryType16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte20 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("[TagInfo. tag: 255 (0xff, name: TIFF Header]", 13, abstractFieldTypeList7, tiffDirectoryType16);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort40 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType45 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs47 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType45, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo49 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) '4', (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort40, 65536, tiffDirectoryType45, true);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles50 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("", 8, 22, tiffDirectoryType45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles51 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("E", 7, (int) (short) 100, tiffDirectoryType45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte52 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("Unknown Tag (0x8003): ", 25, tiffDirectoryType45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte53 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte("", 17, 4, tiffDirectoryType45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles54 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles("[TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]", 34677, 32766, tiffDirectoryType45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes55 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("VBad Type: \n\nBad Type: \n\n", (-65536), abstractFieldTypeList7, 32845, tiffDirectoryType45);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs56 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs("[TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]Unknown Tag (0x8003): ", 32809, (-6316129), tiffDirectoryType45);
        org.junit.Assert.assertNotNull(abstractFieldTypeList7);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType16 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType16.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType45 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType45.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        java.lang.Integer int3 = tiffImagingParameters0.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters0.setXmpXml("V");
        org.apache.commons.imaging.PixelDensity pixelDensity6 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters7 = tiffImagingParameters0.setPixelDensity(pixelDensity6);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter8 = tiffImagingParameters7.getCustomPhotometricInterpreter();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters10 = tiffImagingParameters7.setCompression((java.lang.Integer) 93);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters15 = tiffImagingParameters7.setSubImage(2, 32769, 32947, 42);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters16 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity17 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters18 = tiffImagingParameters16.setPixelDensity(pixelDensity17);
        int int19 = tiffImagingParameters18.getSubImageY();
        java.lang.String str20 = tiffImagingParameters18.getXmpXml();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory22 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter23 = null;
        int[] intArray29 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration36 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader38 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder39 = tiffReader38.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles40 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled41 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory22, photometricInterpreter23, 10, (int) (byte) 10, (-65281), intArray29, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration36, byteOrder39, tiles40);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb photometricInterpreterRgb45 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb(34676, intArray29, (int) (byte) -1, 4, 5);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters46 = tiffImagingParameters18.setCustomPhotometricInterpreter((org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterRgb45);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters48 = tiffImagingParameters46.setFileName("TIFF Header");
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat51 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 29, (float) 21);
        int[] intArray52 = photometricInterpreterFloat51.getMaxXY();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters53 = tiffImagingParameters46.setCustomPhotometricInterpreter((org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterFloat51);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters54 = tiffImagingParameters7.setCustomPhotometricInterpreter((org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterFloat51);
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory55 = tiffImagingParameters7.getBufferedImageFactory();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(tiffImagingParameters7);
        org.junit.Assert.assertNull(photometricInterpreter8);
        org.junit.Assert.assertNotNull(tiffImagingParameters10);
        org.junit.Assert.assertNotNull(tiffImagingParameters15);
        org.junit.Assert.assertNotNull(tiffImagingParameters18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration36 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration36.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder39);
        org.junit.Assert.assertNotNull(tiffImagingParameters46);
        org.junit.Assert.assertNotNull(tiffImagingParameters48);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0]");
        org.junit.Assert.assertNotNull(tiffImagingParameters53);
        org.junit.Assert.assertNotNull(tiffImagingParameters54);
        org.junit.Assert.assertNull(bufferedImageFactory55);
    }

    @Test
    void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        byte[] byteArray53 = tiffField50.getByteArrayValue();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement54 = tiffField50.getOversizeValueElement();
        // The following exception was thrown during execution in test generation
        try {
            int int55 = tiffField50.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.imaging.ImagingException; message: Unknown value: [J@67e6930f for: -1 (0xffffffff: Unknown Tag): ");
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
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 34676L + "'", long52 == 34676L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0]");
        org.junit.Assert.assertNotNull(abstractTiffElement54);
    }

    @Test
    void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat3 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat(16, 21, (int) (byte) 1);
        int[] intArray4 = tiffRasterDataFloat3.getIntData();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics6 = tiffRasterDataFloat3.getSimpleStatistics((float) 34892);
        int int7 = tiffRasterDataFloat3.getSamplesPerPixel();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics8 = tiffRasterDataFloat3.getSimpleStatistics();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics10 = tiffRasterDataFloat3.getSimpleStatistics((float) 13);
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics12 = tiffRasterDataFloat3.getSimpleStatistics((float) 5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(tiffRasterStatistics6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(tiffRasterStatistics8);
        org.junit.Assert.assertNotNull(tiffRasterStatistics10);
        org.junit.Assert.assertNotNull(tiffRasterStatistics12);
    }

    @Test
    void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType8 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType8, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort4, tiffDirectoryType8);
        java.lang.String str12 = fieldTypeShort4.getName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong fieldTypeLong13 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.IFD;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_18 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals21 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort22 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort27 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray28 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort27 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList29 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList29, abstractFieldTypeArray28);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType31 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte32 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList29, tiffDirectoryType31);
        java.nio.ByteOrder byteOrder33 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray35 = tagInfoByte32.encodeValue(byteOrder33, (byte) 0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray45 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray40, 34713, (int) (byte) 0, false, (-65281));
        short short46 = tagInfoShort22.getValue(byteOrder33, byteArray45);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort51 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray52 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort51 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList53 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList53, abstractFieldTypeArray52);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType55 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte56 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList53, tiffDirectoryType55);
        java.nio.ByteOrder byteOrder57 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray59 = tagInfoByte56.encodeValue(byteOrder57, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray60 = tagInfoSRationals21.getValue(byteOrder33, byteArray59);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless61 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray59);
        java.nio.ByteOrder byteOrder62 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField64 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_18, (long) 34676, (long) 7, byteArray59, byteOrder62, 9);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType65 = tiffField64.getFieldType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType66 = tiffField64.getFieldType();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement67 = tiffField64.getOversizeValueElement();
        int int68 = tiffField64.getOffset();
        int int69 = tiffField64.getDirectoryType();
        java.lang.Object obj70 = fieldTypeLong13.getValue(tiffField64);
        java.lang.Object obj71 = fieldTypeShort4.getValue(tiffField64);
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem tiffMetadataItem72 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem(tiffField64);
        int int73 = tiffField64.getSortHint();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement74 = tiffField64.getOversizeValueElement();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType8 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType8.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(fieldTypeLong13);
        org.junit.Assert.assertNotNull(tagInfoSRationals21);
        org.junit.Assert.assertNotNull(tagInfoShort22);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 4096 + "'", short46 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(byteOrder57);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray60);
        org.junit.Assert.assertNotNull(abstractFieldType65);
        org.junit.Assert.assertNotNull(abstractFieldType66);
        org.junit.Assert.assertNotNull(abstractTiffElement67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 7 + "'", int68 == 7);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 31 + "'", int69 == 31);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 9 + "'", int73 == 9);
        org.junit.Assert.assertNotNull(abstractTiffElement74);
    }

    @Test
    void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat(34712, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType3 = tiffRasterDataFloat2.getDataType();
        tiffRasterDataFloat2.setValue(32766, 0, (float) 34712L);
        org.junit.Assert.assertTrue("'" + tiffRasterDataType3 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.FLOAT + "'", tiffRasterDataType3.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.FLOAT));
    }

    @Test
    void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt3 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(65536, (-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Raster dimensions less than or equal to zero are not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int int3 = org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr.convertYCbCrtoRGB(79, 1678379530, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16776961) + "'", int3 == (-16776961));
    }

    @Test
    void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort4 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType9, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", (int) '4', (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort4, 65536, tiffDirectoryType9, true);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_14 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SLONG8;
        int int15 = fieldTypeLong8_14.getSize();
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8 fieldTypeLong8_20 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong8(34712, "hi!");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals23 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort24 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort29 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray30 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort29 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList31 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList31, abstractFieldTypeArray30);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType33 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte34 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList31, tiffDirectoryType33);
        java.nio.ByteOrder byteOrder35 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray37 = tagInfoByte34.encodeValue(byteOrder35, (byte) 0);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray47 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray42, 34713, (int) (byte) 0, false, (-65281));
        short short48 = tagInfoShort24.getValue(byteOrder35, byteArray47);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort53 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray54 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort53 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList55 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList55, abstractFieldTypeArray54);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType57 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte58 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList55, tiffDirectoryType57);
        java.nio.ByteOrder byteOrder59 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray61 = tagInfoByte58.encodeValue(byteOrder59, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray62 = tagInfoSRationals23.getValue(byteOrder35, byteArray61);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless tiffImageWriterLossless63 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless(byteArray61);
        java.nio.ByteOrder byteOrder64 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField66 = new org.apache.commons.imaging.formats.tiff.TiffField(32771, 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeLong8_20, (long) 34676, (long) 7, byteArray61, byteOrder64, 9);
        long[] longArray67 = tiffField66.getLongArrayValue();
        long long68 = tiffField66.getCount();
        java.lang.String str69 = tiffField66.getFieldTypeName();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem tiffMetadataItem70 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.TiffMetadataItem(tiffField66);
        org.apache.commons.imaging.formats.tiff.TiffField tiffField71 = tiffMetadataItem70.getTiffField();
        java.lang.Object obj72 = fieldTypeLong8_14.getValue(tiffField71);
        java.lang.Object obj73 = fieldTypeShort4.getValue(tiffField71);
        int int74 = fieldTypeShort4.getType();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(fieldTypeLong8_14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(tagInfoSRationals23);
        org.junit.Assert.assertNotNull(tagInfoShort24);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteOrder35);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 4096 + "'", short48 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteOrder59);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray62);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 34676L + "'", long68 == 34676L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(tiffField71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CALIBRATION_ILLUMINANT_1;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory1 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter2 = null;
        int[] intArray8 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration15 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader17 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder18 = tiffReader17.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled20 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory1, photometricInterpreter2, 10, (int) (byte) 10, (-65281), intArray8, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration15, byteOrder18, tiles19);
        byte[] byteArray22 = tagInfoShort0.encodeValue(byteOrder18, (short) 4096);
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader24 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray25 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList26 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList26, tiffDirectoryArray25);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray28 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList29 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList29, tiffFieldArray28);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents31 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader24, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList26, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList29);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList32 = tiffContents31.tiffFields;
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator33 = tiffFieldList32.spliterator();
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType43 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational44 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType43);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort45 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType43);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte46 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType43);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals47 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_FORWARD_MATRIX2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort48 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort53 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray54 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort53 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList55 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList55, abstractFieldTypeArray54);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType57 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte58 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList55, tiffDirectoryType57);
        java.nio.ByteOrder byteOrder59 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray61 = tagInfoByte58.encodeValue(byteOrder59, (byte) 0);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray71 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray66, 34713, (int) (byte) 0, false, (-65281));
        short short72 = tagInfoShort48.getValue(byteOrder59, byteArray71);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort77 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray78 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort77 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList79 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList79, abstractFieldTypeArray78);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType81 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte82 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList79, tiffDirectoryType81);
        java.nio.ByteOrder byteOrder83 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray85 = tagInfoByte82.encodeValue(byteOrder83, (byte) 0);
        org.apache.commons.imaging.common.RationalNumber[] rationalNumberArray86 = tagInfoSRationals47.getValue(byteOrder59, byteArray85);
        byte[] byteArray88 = tagInfoSByte46.encodeValue(byteOrder59, (byte) 100);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory89 = new org.apache.commons.imaging.formats.tiff.TiffDirectory(88, tiffFieldList32, (long) 34712, (long) 9, byteOrder59);
        java.nio.ByteOrder byteOrder90 = tiffDirectory89.getByteOrder();
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory directory91 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata.Directory(byteOrder18, tiffDirectory89);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData92 = directory91.getJpegImageData();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList93 = directory91.getAllFields();
        directory91.add("[TagInfo. tag: 22 (0x16, name: GPSDestLongitude]Unknown Tag (0x8003): Bad Type: \n\n", "TiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\nTiffOutputSet {\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\nbyteOrder: LITTLE_ENDIAN\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n\tdirectory 0: Exif (-2)\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n\tdirectory 1: Root (0)\r\nTiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n}\r\n");
        int int97 = directory91.type;
        org.junit.Assert.assertNotNull(tagInfoShort0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration15 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration15.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[16, 0]");
        org.junit.Assert.assertNotNull(tiffDirectoryArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tiffFieldList32);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator33);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType43 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType43.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoSRationals47);
        org.junit.Assert.assertNotNull(tagInfoShort48);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteOrder59);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 4096 + "'", short72 == (short) 4096);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(byteOrder83);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[0]");
        org.junit.Assert.assertNotNull(rationalNumberArray86);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[100]");
        org.junit.Assert.assertNotNull(byteOrder90);
        org.junit.Assert.assertNull(jpegImageData92);
        org.junit.Assert.assertNotNull(tiffFieldList93);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 88 + "'", int97 == 88);
    }

    @Test
    void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat2 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) (short) 1, (float) 32771);
        float float3 = photometricInterpreterFloat2.getMeanFound();
        org.apache.commons.imaging.common.ImageBuilder imageBuilder4 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong9 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder10 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray16 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray17 = tagInfoShortOrLong9.encodeValue(byteOrder10, intArray16);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr photometricInterpreterYCbCr21 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr(9, intArray16, 79, (int) (short) 100, 13);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt22 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(34712, 32895, 34713, intArray16);
        photometricInterpreterFloat2.interpretPixel(imageBuilder4, intArray16, (-16714752), (-16759808));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(tagInfoShortOrLong9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
    }

    @Test
    void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.imaging.formats.tiff.TiffImageParser tiffImageParser0 = new org.apache.commons.imaging.formats.tiff.TiffImageParser();
        java.nio.ByteOrder byteOrder1 = tiffImageParser0.getByteOrder();
        boolean boolean3 = tiffImageParser0.canAcceptExtension("SLong");
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.FormatCompliance formatCompliance5 = tiffImageParser0.getFormatCompliance(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        java.lang.Integer int3 = tiffImagingParameters0.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters0.setXmpXml("V");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory9 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter10 = null;
        int[] intArray16 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration23 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader25 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder26 = tiffReader25.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles27 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled28 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory9, photometricInterpreter10, 10, (int) (byte) 10, (-65281), intArray16, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration23, byteOrder26, tiles27);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab32 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(71, intArray16, (int) (short) 100, 77, 5);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel37 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel((-2), intArray16, (int) (short) -1, 64, 12, false);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel42 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(0, intArray16, 9, 13, 13, false);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters43 = tiffImagingParameters0.setCustomPhotometricInterpreter((org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterBiLevel42);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters45 = tiffImagingParameters0.setXmpXml("Element, offset: 37, length: 12, last: 49Bad Type: \n\n");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters47 = tiffImagingParameters45.setT4Options((java.lang.Integer) 79);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters49 = tiffImagingParameters47.setXmpXml("E");
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory50 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters51 = tiffImagingParameters49.setBufferedImageFactory(bufferedImageFactory50);
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration23 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration23.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNotNull(tiffImagingParameters43);
        org.junit.Assert.assertNotNull(tiffImagingParameters45);
        org.junit.Assert.assertNotNull(tiffImagingParameters47);
        org.junit.Assert.assertNotNull(tiffImagingParameters49);
        org.junit.Assert.assertNotNull(tiffImagingParameters51);
    }

    @Test
    void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational4 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.SRATIONAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("TIFF Header", (int) (short) 100, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeRational4);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo6 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("T", 31, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeRational4);
        int int7 = fieldTypeRational4.getSize();
        org.junit.Assert.assertNotNull(fieldTypeRational4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader0 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray1 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList2 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, tiffDirectoryArray1);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray4 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList5 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5, tiffFieldArray4);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader0, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList2, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList5);
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata8 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents7);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents9 = tiffImageMetadata8.contents;
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList10 = tiffContents9.tiffFields;
        org.apache.commons.imaging.formats.tiff.TiffImageMetadata tiffImageMetadata11 = new org.apache.commons.imaging.formats.tiff.TiffImageMetadata(tiffContents9);
        org.junit.Assert.assertNotNull(tiffDirectoryArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tiffContents9);
        org.junit.Assert.assertNotNull(tiffFieldList10);
    }

    @Test
    void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader1 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder2 = tiffReader1.getByteOrder();
        java.nio.ByteOrder byteOrder3 = tiffReader1.getByteOrder();
        org.apache.commons.imaging.bytesource.ByteSource byteSource4 = null;
        org.apache.commons.imaging.FormatCompliance formatCompliance6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffContents tiffContents7 = tiffReader1.readDirectories(byteSource4, true, formatCompliance6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.bytesource.ByteSource.getInputStream()\" because \"byteSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        int int3 = tiffImagingParameters2.getSubImageY();
        java.lang.String str4 = tiffImagingParameters2.getXmpXml();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters2.asThis();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters7 = tiffImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters9 = tiffImagingParameters2.setFileName("Unknown Tag (0x8003)");
        tiffImagingParameters2.clearSubImage();
        boolean boolean11 = tiffImagingParameters2.isReadThumbnails();
        int int12 = tiffImagingParameters2.getSubImageY();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters17 = tiffImagingParameters2.setSubImage((-1), 34905, (int) (byte) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid sub-image specification: negative x and y values not allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(tiffImagingParameters7);
        org.junit.Assert.assertNotNull(tiffImagingParameters9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory16.add(tagInfoByte18, (byte) 1);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData21 = null;
        tiffOutputDirectory16.setJpegImageData(jpegImageData21);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte23 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_BACKGROUND_COLOR_INDICATOR;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField24 = tiffOutputDirectory16.findField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoByte23);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList25 = tagInfoByte23.dataTypes;
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertNotNull(tagInfoByte18);
        org.junit.Assert.assertNotNull(tagInfoByte23);
        org.junit.Assert.assertNull(tiffOutputField24);
        org.junit.Assert.assertNotNull(abstractFieldTypeList25);
    }

    @Test
    void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt2 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(9006, 8);
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataInt2.getSimpleStatistics((float) 32769);
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
    }

    @Test
    void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("", 16, 21, tiffDirectoryType3);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList5 = tagInfoByteOrShort4.dataTypes;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType11 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("", 69, tiffDirectoryType11);
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
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        int int58 = tagInfoDirectory13.getValue(byteOrder27, byteArray57);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort59 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort64 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray65 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort64 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList66 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, abstractFieldTypeArray65);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType68 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte69 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, tiffDirectoryType68);
        java.nio.ByteOrder byteOrder70 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray72 = tagInfoByte69.encodeValue(byteOrder70, (byte) 0);
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray82 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray77, 34713, (int) (byte) 0, false, (-65281));
        short short83 = tagInfoShort59.getValue(byteOrder70, byteArray82);
        byte[] byteArray84 = tagInfoByteOrShort4.encodeValue(byteOrder27, byteArray82);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet85 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(byteOrder27);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectoryItor86 = tiffOutputSet85.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii87 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_INK_NAMES;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField88 = tiffOutputSet85.findField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoAscii87);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectoryItor89 = tiffOutputSet85.iterator();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory90 = tiffOutputSet85.getOrCreateExifDirectory();
        java.lang.String str92 = tiffOutputSet85.toString("");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField94 = tiffOutputSet85.findField(95);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(abstractFieldTypeList5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType11 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType11.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
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
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 10, 10, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1678379530 + "'", int58 == 1678379530);
        org.junit.Assert.assertNotNull(tagInfoShort59);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteOrder70);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 4096 + "'", short83 == (short) 4096);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 16]");
        org.junit.Assert.assertNotNull(tiffOutputDirectoryItor86);
        org.junit.Assert.assertNotNull(tagInfoAscii87);
        org.junit.Assert.assertNull(tiffOutputField88);
        org.junit.Assert.assertNotNull(tiffOutputDirectoryItor89);
        org.junit.Assert.assertNotNull(tiffOutputDirectory90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "TiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n\tdirectory 0: Root (0)\r\n\tdirectory 1: Exif (-2)\r\n}\r\n" + "'", str92, "TiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n\tdirectory 0: Root (0)\r\n\tdirectory 1: Exif (-2)\r\n}\r\n");
        org.junit.Assert.assertNull(tiffOutputField94);
    }

    @Test
    void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong0 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder1 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray7 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray8 = tagInfoShortOrLong0.encodeValue(byteOrder1, intArray7);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat fieldTypeFloat11 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat(32844, "Bad Type");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats("", (int) (byte) 1, (int) (byte) 0, tiffDirectoryType16);
        java.nio.ByteOrder byteOrder18 = null;
        float[] floatArray22 = new float[] { (short) 0, 0L, (short) 10 };
        byte[] byteArray23 = tagInfoFloats17.encodeValue(byteOrder18, floatArray22);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField24 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoShortOrLong0, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeFloat11, 32844, byteArray23);
        int int25 = tiffOutputField24.tag;
        java.lang.String str26 = tiffOutputField24.toString();
        int int27 = tiffOutputField24.getSortHint();
        org.junit.Assert.assertNotNull(tagInfoShortOrLong0);
        org.junit.Assert.assertNotNull(byteOrder1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 65, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 50717 + "'", int25 == 50717);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt3 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(10, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType4 = tiffRasterDataInt3.getDataType();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics5 = tiffRasterDataInt3.getSimpleStatistics();
        float[] floatArray6 = tiffRasterDataInt3.getData();
        org.apache.commons.imaging.formats.tiff.TiffRasterDataType tiffRasterDataType7 = tiffRasterDataInt3.getDataType();
        float[] floatArray8 = tiffRasterDataInt3.getData();
        int[] intArray9 = tiffRasterDataInt3.getIntData();
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr photometricInterpreterYCbCr13 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr(5, intArray9, (int) (byte) 100, 50725, 34712);
        org.junit.Assert.assertTrue("'" + tiffRasterDataType4 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType4.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(tiffRasterStatistics5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + tiffRasterDataType7 + "' != '" + org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER + "'", tiffRasterDataType7.equals(org.apache.commons.imaging.formats.tiff.TiffRasterDataType.INTEGER));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat3 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat(16, 21, (int) (byte) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics4 = tiffRasterDataFloat3.getSimpleStatistics();
        int[] intArray5 = tiffRasterDataFloat3.getIntData();
        tiffRasterDataFloat3.setIntValue((int) (short) 0, 0, 8, (int) (byte) 0);
        int[] intArray11 = tiffRasterDataFloat3.getIntData();
        // The following exception was thrown during execution in test generation
        try {
            tiffRasterDataFloat3.setIntValue(80, 32768, 50725);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Coordinates out of range (80, 32768)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffRasterStatistics4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory3 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter4 = null;
        int[] intArray10 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration17 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader19 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder20 = tiffReader19.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles21 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled22 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory3, photometricInterpreter4, 10, (int) (byte) 10, (-65281), intArray10, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration17, byteOrder20, tiles21);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab26 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(71, intArray10, (int) (short) 100, 77, 5);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr photometricInterpreterYCbCr30 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr(6, intArray10, 258, 65536, 73);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr photometricInterpreterYCbCr34 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr(64, intArray10, 48, 34677, 0);
        org.apache.commons.imaging.common.ImageBuilder imageBuilder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader37 = null;
        org.apache.commons.imaging.formats.tiff.TiffDirectory[] tiffDirectoryArray38 = new org.apache.commons.imaging.formats.tiff.TiffDirectory[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory> tiffDirectoryList39 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffDirectory>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList39, tiffDirectoryArray38);
        org.apache.commons.imaging.formats.tiff.TiffField[] tiffFieldArray41 = new org.apache.commons.imaging.formats.tiff.TiffField[] {};
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList42 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.TiffField>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList42, tiffFieldArray41);
        org.apache.commons.imaging.formats.tiff.TiffContents tiffContents44 = new org.apache.commons.imaging.formats.tiff.TiffContents(tiffHeader37, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory>) tiffDirectoryList39, (java.util.List<org.apache.commons.imaging.formats.tiff.TiffField>) tiffFieldList42);
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList45 = tiffContents44.tiffFields;
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList46 = tiffContents44.tiffFields;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs49 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_HUE_SAT_MAP_DIMS;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader51 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder52 = tiffReader51.getByteOrder();
        int[] intArray56 = new int[] { (byte) 1, 14, 22 };
        int int57 = org.apache.commons.imaging.internal.SafeOperations.add(intArray56);
        byte[] byteArray58 = tagInfoLongs49.encodeValue(byteOrder52, intArray56);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory59 = new org.apache.commons.imaging.formats.tiff.TiffDirectory((int) ' ', tiffFieldList46, (long) 34905, (long) 255, byteOrder52);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat62 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 32895, (float) (-3));
        int[] intArray69 = new int[] { (byte) 1, 14, 22 };
        int int70 = org.apache.commons.imaging.internal.SafeOperations.add(intArray69);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab74 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(34892, intArray69, 20, 9, (-4));
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel79 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(32773, intArray69, 88, 65, 71, true);
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration87 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.lenientValueOf(19);
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader89 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder90 = tiffReader89.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray92 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips94 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray92, 32844);
        int int95 = strips94.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips dataReaderStrips96 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips(tiffDirectory59, (org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterFloat62, (int) '4', intArray69, 0, 32896, 32773, (int) (byte) 1, 0, 32766, tiffPlanarConfiguration87, byteOrder90, 32844, strips94);
        // The following exception was thrown during execution in test generation
        try {
            photometricInterpreterYCbCr34.interpretPixel(imageBuilder35, intArray69, 25, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.common.ImageBuilder.setRgb(int, int, int)\" because \"imageBuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration17 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration17.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(tiffDirectoryArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tiffFieldArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tiffFieldList45);
        org.junit.Assert.assertNotNull(tiffFieldList46);
        org.junit.Assert.assertNotNull(tagInfoLongs49);
        org.junit.Assert.assertNotNull(byteOrder52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 37 + "'", int57 == 37);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0, 0, 0, 1, 0, 0, 0, 14, 0, 0, 0, 22]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 37 + "'", int70 == 37);
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration87 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration87.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder90);
        org.junit.Assert.assertNotNull(dataElementArray92);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble fieldTypeDouble2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble(32896, "[TagInfo. tag: 37394 (0x9212, name: SecurityClassification]");
    }

    @Test
    void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.imaging.formats.tiff.TiffImageParser tiffImageParser0 = new org.apache.commons.imaging.formats.tiff.TiffImageParser();
        boolean boolean2 = tiffImageParser0.canAcceptExtension("N");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters3 = tiffImageParser0.getDefaultParameters();
        java.lang.String str4 = tiffImageParser0.getDefaultExtension();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.awt.image.BufferedImage> bufferedImageList6 = tiffImageParser0.getAllBufferedImages(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tiffImagingParameters3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tif" + "'", str4, "tif");
    }

    @Test
    void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList8 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.BYTE_OR_SHORT;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType15 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 14, abstractFieldTypeList8, tiffDirectoryType15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("Bad TypeUnknown Tag (0x8003): ", 65, 80, tiffDirectoryType15);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("32771 (0x8003: Unknown Tag):  (34676 hi!)Unknown Tag (0x8003): ", 89, 0, tiffDirectoryType15, true);
        org.junit.Assert.assertNotNull(abstractFieldTypeList8);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType15 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType15.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
    }

    @Test
    void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType27 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational28 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType27);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte29 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("hi!", 5, tiffDirectoryType27);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational30 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational("", 22, tiffDirectoryType27);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong31 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong("hi!", 5, tiffDirectoryType27);
        tiffOutputDirectory16.add(tagInfoSLong31, 89);
        tiffOutputDirectory16.removeField(88);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType46 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs47 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("M", 9, 32844, tiffDirectoryType46);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte48 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", (int) (byte) 10, tiffDirectoryType46);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble49 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("", 1, tiffDirectoryType46);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes50 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes("258 (0x102: BitsPerSample): ", 18, 277408, tiffDirectoryType46);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField51 = tiffOutputDirectory16.findField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoSBytes50);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> tiffOutputFieldItor52 = tiffOutputDirectory16.iterator();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType27 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType27.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType46 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType46.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNull(tiffOutputField51);
        org.junit.Assert.assertNotNull(tiffOutputFieldItor52);
    }

    @Test
    void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString17 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants.EXIF_TAG_XPAUTHOR;
        tiffOutputDirectory16.add(tagInfoXpString17, "W");
        int int20 = tiffOutputDirectory16.getType();
        tiffOutputDirectory16.sortFields();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNotNull(tagInfoXpString17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
    }

    @Test
    void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters4 = tiffImagingParameters0.setT4Options((java.lang.Integer) (-1));
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory5 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters6 = tiffImagingParameters0.setBufferedImageFactory(bufferedImageFactory5);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters8 = tiffImagingParameters6.setFileName("[TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]");
        org.apache.commons.imaging.PixelDensity pixelDensity9 = tiffImagingParameters6.getPixelDensity();
        int[] intArray14 = new int[] { (byte) 1, 14, 22 };
        int int15 = org.apache.commons.imaging.internal.SafeOperations.add(intArray14);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab19 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(34892, intArray14, 20, 9, (-4));
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters20 = tiffImagingParameters6.setCustomPhotometricInterpreter((org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterCieLab19);
        org.apache.commons.imaging.common.ImageBuilder imageBuilder21 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat24 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 8, (float) (short) 0);
        int[] intArray25 = photometricInterpreterFloat24.getMinXY();
        // The following exception was thrown during execution in test generation
        try {
            photometricInterpreterCieLab19.interpretPixel(imageBuilder21, intArray25, 48, (-65281));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNotNull(tiffImagingParameters4);
        org.junit.Assert.assertNotNull(tiffImagingParameters6);
        org.junit.Assert.assertNotNull(tiffImagingParameters8);
        org.junit.Assert.assertNull(pixelDensity9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertNotNull(tiffImagingParameters20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational0 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD;
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
        java.lang.Object obj53 = tagInfoRational0.getValue(tiffField51);
        java.lang.String str54 = tiffField51.toString();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement55 = tiffField51.getOversizeValueElement();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement56 = tiffField51.getOversizeValueElement();
        java.lang.String str57 = tiffField51.getFieldTypeName();
        org.junit.Assert.assertNotNull(tagInfoRational0);
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
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "32771 (0x8003: Unknown Tag):  (34676 hi!)" + "'", str54, "32771 (0x8003: Unknown Tag):  (34676 hi!)");
        org.junit.Assert.assertNotNull(abstractTiffElement55);
        org.junit.Assert.assertNotNull(abstractTiffElement56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        java.lang.String str53 = tiffField50.getTagName();
        long[] longArray54 = tiffField50.getLongArrayValue();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Unknown Tag (0x8003)" + "'", str53, "Unknown Tag (0x8003)");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[]");
    }

    @Test
    void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList9 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.BYTE_OR_SHORT;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType16 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType16);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 14, abstractFieldTypeList9, tiffDirectoryType16);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList23 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.BYTE_OR_SHORT;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType37 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes38 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("", 7, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort35, 5, tiffDirectoryType37);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs39 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", (-4), (int) (byte) 1, tiffDirectoryType37);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs40 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 5, (int) (short) -1, tiffDirectoryType37);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo42 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("Element, offset: 37, length: 12, last: 49", 65536, abstractFieldTypeList23, 80, tiffDirectoryType37, true);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo44 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("K", 32895, abstractFieldTypeList9, 34676, tiffDirectoryType37, true);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong45 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("Element, offset: 0, length: 19, last: 19", 5, 93, tiffDirectoryType37);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined tagInfoUndefined46 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined("SpectralSensitivity", 19, tiffDirectoryType37);
        org.junit.Assert.assertNotNull(abstractFieldTypeList9);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType16 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType16.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(abstractFieldTypeList23);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType37 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType37.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
    }

    @Test
    void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat3 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat((int) '#', 0, (-16776961));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Raster dimensions less than or equal to zero are not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.imaging.formats.tiff.TiffImageParser tiffImageParser0 = new org.apache.commons.imaging.formats.tiff.TiffImageParser();
        java.io.File file1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity3 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters4 = tiffImagingParameters2.setPixelDensity(pixelDensity3);
        java.lang.Integer int5 = tiffImagingParameters2.getT4Options();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters7 = tiffImagingParameters2.setXmpXml("V");
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory11 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter12 = null;
        int[] intArray18 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration25 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader27 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder28 = tiffReader27.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles29 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled30 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory11, photometricInterpreter12, 10, (int) (byte) 10, (-65281), intArray18, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration25, byteOrder28, tiles29);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab photometricInterpreterCieLab34 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab(71, intArray18, (int) (short) 100, 77, 5);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel39 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel((-2), intArray18, (int) (short) -1, 64, 12, false);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel44 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(0, intArray18, 9, 13, 13, false);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters45 = tiffImagingParameters2.setCustomPhotometricInterpreter((org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter) photometricInterpreterBiLevel44);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters47 = tiffImagingParameters2.setXmpXml("Element, offset: 37, length: 12, last: 49Bad Type: \n\n");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters49 = tiffImagingParameters47.setStrict(false);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters51 = tiffImagingParameters47.setT4Options((java.lang.Integer) 32844);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage52 = tiffImageParser0.getBufferedImage(file1, tiffImagingParameters47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tiffImagingParameters4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(tiffImagingParameters7);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration25 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration25.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(tiffImagingParameters45);
        org.junit.Assert.assertNotNull(tiffImagingParameters47);
        org.junit.Assert.assertNotNull(tiffImagingParameters49);
        org.junit.Assert.assertNotNull(tiffImagingParameters51);
    }

    @Test
    void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat4 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 8, (float) (short) 0);
        int[] intArray5 = photometricInterpreterFloat4.getMinXY();
        float float6 = photometricInterpreterFloat4.getMeanFound();
        float float7 = photometricInterpreterFloat4.getMaxFound();
        int[] intArray8 = photometricInterpreterFloat4.getMaxXY();
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel13 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(95, intArray8, 25, 69, 65536, true);
        org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat tiffRasterDataFloat20 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat(16, 21, (int) (byte) 1);
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics21 = tiffRasterDataFloat20.getSimpleStatistics();
        int[] intArray22 = tiffRasterDataFloat20.getIntData();
        int[] intArray23 = tiffRasterDataFloat20.getIntData();
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette photometricInterpreterPalette24 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette(32947, intArray8, (int) '#', (int) (byte) 0, 19, intArray23);
        org.apache.commons.imaging.common.ImageBuilder imageBuilder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffRasterDataInt tiffRasterDataInt29 = new org.apache.commons.imaging.formats.tiff.TiffRasterDataInt(16, 2);
        int int30 = tiffRasterDataInt29.getHeight();
        org.apache.commons.imaging.formats.tiff.TiffRasterStatistics tiffRasterStatistics32 = tiffRasterDataInt29.getSimpleStatistics(79.0f);
        int[] intArray33 = tiffRasterDataInt29.getIntData();
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv photometricInterpreterLogLuv37 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv(64, intArray33, 17, (int) (byte) 100, 64);
        // The following exception was thrown during execution in test generation
        try {
            photometricInterpreterPalette24.interpretPixel(imageBuilder25, intArray33, 32766, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.imaging.common.ImageBuilder.setRgb(int, int, int)\" because \"imageBuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.NEGATIVE_INFINITY + "'", float7 == Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(tiffRasterStatistics21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(tiffRasterStatistics32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory16.add(tagInfoByte18, (byte) 1);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData21 = null;
        tiffOutputDirectory16.setJpegImageData(jpegImageData21);
        java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> tiffOutputFieldList23 = tiffOutputDirectory16.getFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort24 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_EXIF_IMAGE_LENGTH;
        tiffOutputDirectory16.add(tagInfoShort24, (short) 0);
        java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> tiffOutputFieldList27 = tiffOutputDirectory16.getFields();
        java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> tiffOutputFieldList28 = tiffOutputDirectory16.getFields();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffOutputDirectory16.add(tagInfoDouble29, (double) (-16714752));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"length\" because \"tagInfo\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertNotNull(tagInfoByte18);
        org.junit.Assert.assertNotNull(tiffOutputFieldList23);
        org.junit.Assert.assertNotNull(tagInfoShort24);
        org.junit.Assert.assertNotNull(tiffOutputFieldList27);
        org.junit.Assert.assertNotNull(tiffOutputFieldList28);
    }

    @Test
    void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 32844);
        int int3 = strips2.getImageDataLength();
        int int4 = strips2.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray5 = strips2.getImageData();
        int int6 = strips2.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray7 = strips2.getImageData();
        int int8 = strips2.rowsPerStrip;
        boolean boolean9 = strips2.stripsNotTiles();
        org.junit.Assert.assertNotNull(dataElementArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32844 + "'", int4 == 32844);
        org.junit.Assert.assertNotNull(dataElementArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dataElementArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32844 + "'", int8 == 32844);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory16.add(tagInfoByte18, (byte) 1);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField22 = tiffOutputDirectory16.findField(71);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType32 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte33 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType32);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals34 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType32);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType32);
        java.nio.ByteOrder byteOrder36 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray38 = tagInfoSByte35.encodeValue(byteOrder36, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory39 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder36);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData40 = tiffOutputDirectory39.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte41 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory39.add(tagInfoByte41, (byte) 1);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField45 = tiffOutputDirectory39.findField(71);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType53 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii54 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType53);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort55 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("", (int) (short) 0, tiffDirectoryType53);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat56 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat("", 17, tiffDirectoryType53);
        tiffOutputDirectory39.add(tagInfoFloat56, (float) 32803);
        tiffOutputDirectory16.setNextDirectory(tiffOutputDirectory39);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType68 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii69 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType68);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational70 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational("N", 19, 32909, tiffDirectoryType68);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte71 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 34676, tiffDirectoryType68);
        tiffOutputDirectory39.add(tagInfoSByte71, (byte) 1);
        java.lang.String str74 = tagInfoSByte71.toString();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertNotNull(tagInfoByte18);
        org.junit.Assert.assertNull(tiffOutputField22);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType32 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType32.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData40);
        org.junit.Assert.assertNotNull(tagInfoByte41);
        org.junit.Assert.assertNull(tiffOutputField45);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType53 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType53.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType68 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType68.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[TagInfo. tag: 34676 (0x8774, name: E]" + "'", str74, "[TagInfo. tag: 34676 (0x8774, name: E]");
    }

    @Test
    void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        boolean boolean67 = tiffDirectory66.hasTiffImageData();
        java.nio.ByteOrder byteOrder68 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters69 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        int int70 = tiffImagingParameters69.getSubImageHeight();
        int int71 = tiffImagingParameters69.getSubImageHeight();
        boolean boolean72 = tiffImagingParameters69.isReadThumbnails();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters74 = tiffImagingParameters69.setFileName("TIFF image data: 0 bytesBad Type: \n\n");
        java.awt.image.BufferedImage bufferedImage75 = tiffDirectory66.getTiffImage(byteOrder68, tiffImagingParameters69);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tiffImagingParameters74);
        org.junit.Assert.assertNull(bufferedImage75);
    }

    @Test
    void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat photometricInterpreterFloat2 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat((float) 7, 79.0f);
        float float3 = photometricInterpreterFloat2.getMaxFound();
        float float4 = photometricInterpreterFloat2.getMaxFound();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + Float.NEGATIVE_INFINITY + "'", float3 == Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + Float.NEGATIVE_INFINITY + "'", float4 == Float.NEGATIVE_INFINITY);
    }

    @Test
    void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory16.add(tagInfoByte18, (byte) 1);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField22 = tiffOutputDirectory16.findField(71);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType30 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii31 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType30);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort32 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("", (int) (short) 0, tiffDirectoryType30);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat33 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat("", 17, tiffDirectoryType30);
        tiffOutputDirectory16.add(tagInfoFloat33, (float) 32803);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort42 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType46 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs48 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType46, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte49 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (int) (short) 10, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort42, tiffDirectoryType46);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble50 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("", 0, tiffDirectoryType46);
        tiffOutputDirectory16.add(tagInfoDouble50, (double) 80);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong53 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder54 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray60 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray61 = tagInfoShortOrLong53.encodeValue(byteOrder54, intArray60);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat fieldTypeFloat64 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat(32844, "Bad Type");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType69 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats70 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats("", (int) (byte) 1, (int) (byte) 0, tiffDirectoryType69);
        java.nio.ByteOrder byteOrder71 = null;
        float[] floatArray75 = new float[] { (short) 0, 0L, (short) 10 };
        byte[] byteArray76 = tagInfoFloats70.encodeValue(byteOrder71, floatArray75);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField77 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoShortOrLong53, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeFloat64, 32844, byteArray76);
        tiffOutputDirectory16.add(tiffOutputField77);
        java.lang.String str80 = tiffOutputField77.toString("N");
        int int81 = tiffOutputField77.count;
        java.lang.String str83 = tiffOutputField77.toString("[TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]");
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertNotNull(tagInfoByte18);
        org.junit.Assert.assertNull(tiffOutputField22);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType30 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType30.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType46 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType46.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoShortOrLong53);
        org.junit.Assert.assertNotNull(byteOrder54);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0, 0, 0, 0, 0, 0, 0, 0, 65, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 32844 + "'", int81 == 32844);
    }

    @Test
    void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble fieldTypeDouble2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble(48, "TIFF image data: 8 bytes");
    }

    @Test
    void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        byte[] byteArray56 = tiffField50.getByteArrayValue();
        java.nio.ByteOrder byteOrder57 = tiffField50.getByteOrder();
        int int58 = tiffField50.getTag();
        java.lang.String str59 = tiffField50.getValueDescription();
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
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0]");
        org.junit.Assert.assertNull(byteOrder57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32771 + "'", int58 == 32771);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts0 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_TIME_ZONE_OFFSET;
        org.apache.commons.imaging.formats.tiff.TiffImageParser tiffImageParser1 = new org.apache.commons.imaging.formats.tiff.TiffImageParser();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImageParser1.getDefaultParameters();
        java.nio.ByteOrder byteOrder3 = tiffImageParser1.getByteOrder();
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
        byte[] byteArray38 = tagInfoSShorts0.encodeValue(byteOrder3, shortArray35);
        byte[] byteArray41 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT6(byteArray38, (int) (short) 0, 25);
        org.junit.Assert.assertNotNull(tagInfoSShorts0);
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertNotNull(byteOrder3);
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
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 16, 1]");
    }

    @Test
    void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts2 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_YCBCR_SUB_SAMPLING;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType10 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType10);
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
        byte[] byteArray55 = tagInfoSByte13.encodeValue(byteOrder26, (byte) 100);
        org.apache.commons.imaging.formats.tiff.TiffHeader tiffHeader59 = new org.apache.commons.imaging.formats.tiff.TiffHeader(byteOrder26, 23, (long) 64, true);
        long long60 = tiffHeader59.offsetToFirstIFD;
        java.nio.ByteOrder byteOrder61 = tiffHeader59.byteOrder;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType70 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte71 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType70);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals72 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType70);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte73 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType70);
        java.nio.ByteOrder byteOrder74 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray76 = tagInfoSByte73.encodeValue(byteOrder74, (byte) 0);
        byte[] byteArray79 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressModifiedHuffman(byteArray76, 9006, 0);
        short[] shortArray80 = tagInfoShorts2.getValue(byteOrder61, byteArray79);
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData81 = new org.apache.commons.imaging.formats.tiff.JpegImageData(7L, (-65536), byteArray79);
        org.junit.Assert.assertNotNull(tagInfoShorts2);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType10 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType10.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
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
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 64L + "'", long60 == 64L);
        org.junit.Assert.assertNotNull(byteOrder61);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType70 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType70.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder74);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[]");
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray80), "[]");
    }

    @Test
    void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("", 16, 21, tiffDirectoryType3);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList5 = tagInfoByteOrShort4.dataTypes;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType11 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("", 69, tiffDirectoryType11);
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
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        int int58 = tagInfoDirectory13.getValue(byteOrder27, byteArray57);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort59 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort64 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray65 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort64 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList66 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, abstractFieldTypeArray65);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType68 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte69 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, tiffDirectoryType68);
        java.nio.ByteOrder byteOrder70 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray72 = tagInfoByte69.encodeValue(byteOrder70, (byte) 0);
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray82 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray77, 34713, (int) (byte) 0, false, (-65281));
        short short83 = tagInfoShort59.getValue(byteOrder70, byteArray82);
        byte[] byteArray84 = tagInfoByteOrShort4.encodeValue(byteOrder27, byteArray82);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet85 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(byteOrder27);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectoryItor86 = tiffOutputSet85.iterator();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii87 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_INK_NAMES;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField88 = tiffOutputSet85.findField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoAscii87);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectoryItor89 = tiffOutputSet85.iterator();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory90 = tiffOutputSet85.getOrCreateExifDirectory();
        int int91 = tiffOutputDirectory90.getType();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(abstractFieldTypeList5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType11 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType11.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
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
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 10, 10, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1678379530 + "'", int58 == 1678379530);
        org.junit.Assert.assertNotNull(tagInfoShort59);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteOrder70);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 4096 + "'", short83 == (short) 4096);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 16]");
        org.junit.Assert.assertNotNull(tiffOutputDirectoryItor86);
        org.junit.Assert.assertNotNull(tagInfoAscii87);
        org.junit.Assert.assertNull(tiffOutputField88);
        org.junit.Assert.assertNotNull(tiffOutputDirectoryItor89);
        org.junit.Assert.assertNotNull(tiffOutputDirectory90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-2) + "'", int91 == (-2));
    }

    @Test
    void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("", 16, 21, tiffDirectoryType3);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList5 = tagInfoByteOrShort4.dataTypes;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType11 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("", 69, tiffDirectoryType11);
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
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        int int58 = tagInfoDirectory13.getValue(byteOrder27, byteArray57);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort59 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort64 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray65 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort64 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList66 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, abstractFieldTypeArray65);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType68 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte69 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, tiffDirectoryType68);
        java.nio.ByteOrder byteOrder70 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray72 = tagInfoByte69.encodeValue(byteOrder70, (byte) 0);
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray82 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray77, 34713, (int) (byte) 0, false, (-65281));
        short short83 = tagInfoShort59.getValue(byteOrder70, byteArray82);
        byte[] byteArray84 = tagInfoByteOrShort4.encodeValue(byteOrder27, byteArray82);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet85 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(byteOrder27);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory86 = tiffOutputSet85.addGpsDirectory();
        java.lang.String str88 = tiffOutputSet85.toString("T");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory89 = tiffOutputSet85.getGpsDirectory();
        java.lang.String str91 = tiffOutputSet85.toString("[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]");
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory92 = tiffOutputSet85.addRootDirectory();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory93 = tiffOutputSet85.addExifDirectory();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(abstractFieldTypeList5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType11 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType11.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
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
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 10, 10, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1678379530 + "'", int58 == 1678379530);
        org.junit.Assert.assertNotNull(tagInfoShort59);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteOrder70);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 4096 + "'", short83 == (short) 4096);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 16]");
        org.junit.Assert.assertNotNull(tiffOutputDirectory86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "TTiffOutputSet {\r\nTbyteOrder: LITTLE_ENDIAN\r\nT\tdirectory 0: Gps (-3)\r\nT}\r\n" + "'", str88, "TTiffOutputSet {\r\nTbyteOrder: LITTLE_ENDIAN\r\nT\tdirectory 0: Gps (-3)\r\nT}\r\n");
        org.junit.Assert.assertNotNull(tiffOutputDirectory89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]TiffOutputSet {\r\n[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]byteOrder: LITTLE_ENDIAN\r\n[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]\tdirectory 0: Gps (-3)\r\n[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]}\r\n" + "'", str91, "[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]TiffOutputSet {\r\n[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]byteOrder: LITTLE_ENDIAN\r\n[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]\tdirectory 0: Gps (-3)\r\n[TagInfo. tag: 11 (0xb, name: [TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]]}\r\n");
        org.junit.Assert.assertNotNull(tiffOutputDirectory92);
        org.junit.Assert.assertNotNull(tiffOutputDirectory93);
    }

    @Test
    void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals1 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_COLOR_MATRIX_2;
        org.apache.commons.imaging.internal.Debug.debug("ImageColorIndicator", (java.lang.Object) tagInfoSRationals1);
        org.junit.Assert.assertNotNull(tagInfoSRationals1);
    }

    @Test
    void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
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
        java.awt.image.BufferedImage bufferedImage67 = tiffDirectory66.getTiffImage();
        java.lang.String str68 = tiffDirectory66.getElementDescription();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters69 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity70 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters71 = tiffImagingParameters69.setPixelDensity(pixelDensity70);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters73 = tiffImagingParameters71.setXmpXml("Bad Type");
        java.awt.image.BufferedImage bufferedImage74 = tiffDirectory66.getTiffImage(tiffImagingParameters71);
        boolean boolean75 = tiffImagingParameters71.isStrict();
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory76 = tiffImagingParameters71.getBufferedImageFactory();
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
        org.junit.Assert.assertNull(bufferedImage67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(tiffImagingParameters71);
        org.junit.Assert.assertNotNull(tiffImagingParameters73);
        org.junit.Assert.assertNull(bufferedImage74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(bufferedImageFactory76);
    }

    @Test
    void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants.EXIF_TAG_ALPHA_DATA_DISCARD;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField19 = tiffOutputDirectory16.findField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoByte18);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType23 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes24 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes("ImageColorIndicator", 48, (int) (short) 0, tiffDirectoryType23);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType33 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte34 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType33);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType33);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte36 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType33);
        java.nio.ByteOrder byteOrder37 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray39 = tagInfoSByte36.encodeValue(byteOrder37, (byte) 0);
        tiffOutputDirectory16.add(tagInfoSBytes24, byteArray39);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong41 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_WHITE_LEVEL;
        java.nio.ByteOrder byteOrder42 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        int[] intArray48 = new int[] { 34661, 64, (-1), 10, 9 };
        byte[] byteArray49 = tagInfoShortOrLong41.encodeValue(byteOrder42, intArray48);
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat fieldTypeFloat52 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat(32844, "Bad Type");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType57 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats58 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats("", (int) (byte) 1, (int) (byte) 0, tiffDirectoryType57);
        java.nio.ByteOrder byteOrder59 = null;
        float[] floatArray63 = new float[] { (short) 0, 0L, (short) 10 };
        byte[] byteArray64 = tagInfoFloats58.encodeValue(byteOrder59, floatArray63);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField65 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoShortOrLong41, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeFloat52, 32844, byteArray64);
        tiffOutputDirectory16.add(tiffOutputField65);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertNotNull(tagInfoByte18);
        org.junit.Assert.assertNull(tiffOutputField19);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType33 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType33.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLong41);
        org.junit.Assert.assertNotNull(byteOrder42);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[34661, 64, -1, 10, 9]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[101, -121, 0, 0, 64, 0, 0, 0, -1, -1, -1, -1, 10, 0, 0, 0, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0, 0, 0, 0, 0, 0, 0, 0, 65, 32, 0, 0]");
    }

    @Test
    void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType18 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii19 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational20 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational("N", 19, 32909, tiffDirectoryType18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("M", 34892, tiffDirectoryType18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational tagInfoAsciiOrRational22 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational("tifUnknown Tag (0x8003): ", (int) (short) 4096, 65000, tiffDirectoryType18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong23 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong("PreviewImageLength", (int) (byte) -1, tiffDirectoryType18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong25 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("Tiff-Custom", 24, tiffDirectoryType18, true);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs27 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("TIFF image data: 0 bytesBad Type: \n\nTiffOutputSet {\r\nTIFF image data: 0 bytesBad Type: \n\nbyteOrder: LITTLE_ENDIAN\r\nTIFF image data: 0 bytesBad Type: \n\n\tdirectory 0: Gps (-3)\r\nTIFF image data: 0 bytesBad Type: \n\n\tdirectory 1: Root (0)\r\nTIFF image data: 0 bytesBad Type: \n\n\tdirectory 2: Exif (-2)\r\nTIFF image data: 0 bytesBad Type: \n\n\tdirectory 3: Interoperability (-4)\r\nTIFF image data: 0 bytesBad Type: \n\n}\r\n", 5056, (int) (short) 100, tiffDirectoryType18, false);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType18 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType18.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
    }

    @Test
    void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("", 16, 21, tiffDirectoryType3);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList5 = tagInfoByteOrShort4.dataTypes;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType11 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("", 69, tiffDirectoryType11);
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
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        int int58 = tagInfoDirectory13.getValue(byteOrder27, byteArray57);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort59 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort64 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray65 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort64 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList66 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, abstractFieldTypeArray65);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType68 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte69 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, tiffDirectoryType68);
        java.nio.ByteOrder byteOrder70 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray72 = tagInfoByte69.encodeValue(byteOrder70, (byte) 0);
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray82 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray77, 34713, (int) (byte) 0, false, (-65281));
        short short83 = tagInfoShort59.getValue(byteOrder70, byteArray82);
        byte[] byteArray84 = tagInfoByteOrShort4.encodeValue(byteOrder27, byteArray82);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet85 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(byteOrder27);
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectoryItor86 = tiffOutputSet85.iterator();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory87 = tiffOutputSet85.getOrCreateRootDirectory();
        tiffOutputSet85.removeField(65);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory90 = tiffOutputSet85.getGpsDirectory();
        tiffOutputSet85.dump();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(abstractFieldTypeList5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType11 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType11.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
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
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 10, 10, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1678379530 + "'", int58 == 1678379530);
        org.junit.Assert.assertNotNull(tagInfoShort59);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteOrder70);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 4096 + "'", short83 == (short) 4096);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 16]");
        org.junit.Assert.assertNotNull(tiffOutputDirectoryItor86);
        org.junit.Assert.assertNotNull(tiffOutputDirectory87);
        org.junit.Assert.assertNull(tiffOutputDirectory90);
    }

    @Test
    void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs("hi!", 4, (int) (byte) 0, tiffDirectoryType9, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny("", 32897, (int) (short) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat("Bad Type: \n\n", 13, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong14 = org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants.TIFF_TAG_XCLIP_PATH_UNITS;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType20 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType20);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort22 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType20);
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader24 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder25 = tiffReader24.getByteOrder();
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy26 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(byteOrder25);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational27 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_AS_SHOT_NEUTRAL;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort28 = org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants.EXIF_TAG_INTERLACE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts29 = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_MIN_SAMPLE_VALUE;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational30 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort35 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray36 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort35 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList37 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList37, abstractFieldTypeArray36);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType39 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte40 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList37, tiffDirectoryType39);
        java.nio.ByteOrder byteOrder41 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray43 = tagInfoByte40.encodeValue(byteOrder41, (byte) 0);
        short[] shortArray44 = new short[] {};
        byte[] byteArray45 = tagInfoShortOrLongOrRational30.encodeValue(byteOrder41, shortArray44);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational46 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_DEFAULT_CROP_ORIGIN;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort51 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray52 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort51 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList53 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList53, abstractFieldTypeArray52);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType55 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte56 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList53, tiffDirectoryType55);
        java.nio.ByteOrder byteOrder57 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray59 = tagInfoByte56.encodeValue(byteOrder57, (byte) 0);
        short[] shortArray60 = new short[] {};
        byte[] byteArray61 = tagInfoShortOrLongOrRational46.encodeValue(byteOrder57, shortArray60);
        byte[] byteArray62 = tagInfoShorts29.encodeValue(byteOrder41, shortArray60);
        byte[] byteArray64 = tagInfoShort28.encodeValue(byteOrder41, (short) (byte) 10);
        short[] shortArray66 = new short[] { (byte) 0 };
        byte[] byteArray67 = tagInfoShortOrRational27.encodeValue(byteOrder41, shortArray66);
        byte[] byteArray68 = tagInfoByteOrShort22.encodeValue(byteOrder25, shortArray66);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy69 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(byteOrder25);
        byte[] byteArray71 = tagInfoLong14.encodeValue(byteOrder25, (-4));
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy72 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(byteOrder25);
        org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy tiffImageWriterLossy73 = new org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy(byteOrder25);
        byte[] byteArray75 = tagInfoFloat13.encodeValue(byteOrder25, (float) 32803);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory76 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory((-1), byteOrder25);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType87 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational88 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType87);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte89 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("hi!", 5, tiffDirectoryType87);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny tagInfoAny90 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny("M", 19, (int) '#', tiffDirectoryType87);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong91 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong("Element, offset: 37, length: 12, last: 49Bad Type: \n\n", 23, tiffDirectoryType87);
        tiffOutputDirectory76.add(tagInfoSLong91, 0);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(tagInfoLong14);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType20 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType20.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(tagInfoShortOrRational27);
        org.junit.Assert.assertNotNull(tagInfoShort28);
        org.junit.Assert.assertNotNull(tagInfoShorts29);
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational30);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteOrder41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(tagInfoShortOrLongOrRational46);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(byteOrder57);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[0]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-1, -1, -1, -4]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[71, 0, 35, 0]");
        org.junit.Assert.assertTrue("'" + tiffDirectoryType87 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType87.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType14 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte15 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals16 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte17 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte("N", (int) '4', 34712, tiffDirectoryType14);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts("hi!", (int) ' ', 32809, tiffDirectoryType14);
        boolean boolean19 = tiffDirectoryType14.isImageDirectory();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory20 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("MBad Type: \n\nUnknown Tag (0x8003): ", 32769, tiffDirectoryType14);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType14 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType14.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType9 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("", 34713, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals11 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals("E", (int) (byte) 0, (int) (byte) 0, tiffDirectoryType9);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("M", (int) (byte) 1, tiffDirectoryType9);
        java.nio.ByteOrder byteOrder13 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray15 = tagInfoSByte12.encodeValue(byteOrder13, (byte) 0);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory16 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(31, byteOrder13);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData abstractTiffImageData17 = tiffOutputDirectory16.getRawTiffImageData();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte18 = org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants.TIFF_TAG_FAX_PROFILE;
        tiffOutputDirectory16.add(tagInfoByte18, (byte) 1);
        int int21 = tiffOutputDirectory16.getType();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField23 = tiffOutputDirectory16.findField(22);
        int int24 = tiffOutputDirectory16.getType();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType9 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType9.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(abstractTiffImageData17);
        org.junit.Assert.assertNotNull(tagInfoByte18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertNull(tiffOutputField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
    }

    @Test
    void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory2 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory(32773, byteOrder1);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> tiffOutputFieldSpliterator3 = tiffOutputDirectory2.spliterator();
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort12 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(20, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational("hi!", 255, 34712, tiffDirectoryType17);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfo("", 34892, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort12, 6, tiffDirectoryType17, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString21 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString("[TagInfo. tag: 41487 (0xa20f, name: FocalPlaneYResolution]", 11, tiffDirectoryType17);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte22 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("Bad Type: \n\n", (-6316129), tiffDirectoryType17);
        tiffOutputDirectory2.add(tagInfoSByte22, (byte) 100);
        org.junit.Assert.assertNotNull(tiffOutputFieldSpliterator3);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType17 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType17.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType7 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii8 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii("M", 0, 65000, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort9 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort("", (int) (short) 0, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat10 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat("", 17, tiffDirectoryType7);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs11 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_PROFILE_HUE_SAT_MAP_DIMS;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader13 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder14 = tiffReader13.getByteOrder();
        int[] intArray18 = new int[] { (byte) 1, 14, 22 };
        int int19 = org.apache.commons.imaging.internal.SafeOperations.add(intArray18);
        byte[] byteArray20 = tagInfoLongs11.encodeValue(byteOrder14, intArray18);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort21 = org.apache.commons.imaging.formats.tiff.constants.DngTagConstants.EXIF_TAG_CALIBRATION_ILLUMINANT_1;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory22 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter23 = null;
        int[] intArray29 = new int[] { 13, 34892 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration36 = org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY;
        org.apache.commons.imaging.formats.tiff.TiffReader tiffReader38 = new org.apache.commons.imaging.formats.tiff.TiffReader(true);
        java.nio.ByteOrder byteOrder39 = tiffReader38.getByteOrder();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles40 = null;
        org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled dataReaderTiled41 = new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory22, photometricInterpreter23, 10, (int) (byte) 10, (-65281), intArray29, 69, (int) (short) 4096, 3, 100, 17, 32897, tiffPlanarConfiguration36, byteOrder39, tiles40);
        byte[] byteArray43 = tagInfoShort21.encodeValue(byteOrder39, (short) 4096);
        int[] intArray48 = new int[] { (byte) 1, 14, 22 };
        int int49 = org.apache.commons.imaging.internal.SafeOperations.add(intArray48);
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel photometricInterpreterBiLevel54 = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel(37, intArray48, 0, 6, 13, false);
        byte[] byteArray55 = tagInfoLongs11.encodeValue(byteOrder39, intArray48);
        byte[] byteArray57 = tagInfoFloat10.encodeValue(byteOrder39, (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray60 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.decompressT6(byteArray57, (int) (byte) -1, 32947);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tiffDirectoryType7 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType7.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
        org.junit.Assert.assertNotNull(tagInfoLongs11);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37 + "'", int19 == 37);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 0, 1, 0, 0, 0, 14, 0, 0, 0, 22]");
        org.junit.Assert.assertNotNull(tagInfoShort21);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[13, 34892]");
        org.junit.Assert.assertTrue("'" + tiffPlanarConfiguration36 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY + "'", tiffPlanarConfiguration36.equals(org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration.CHUNKY));
        org.junit.Assert.assertNotNull(byteOrder39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[16, 0]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 14, 22]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 37 + "'", int49 == 37);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 0, 0, 1, 0, 0, 0, 14, 0, 0, 0, 22]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 0, 0, 0]");
    }

    @Test
    void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList7 = org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType.ASCII_OR_BYTE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort15 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType17 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes18 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes("", 7, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort15, 5, tiffDirectoryType17);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType29 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational30 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational("", (int) (byte) 1, tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort31 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("ImageColorIndicator", 8, (int) '#', tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte32 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte("E", 32897, tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong34 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong("N", (-2), 89, tiffDirectoryType29, false);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte35 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("Tiff-Custom", 19, (org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType) fieldTypeShort15, tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong37 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong("tif", 22, abstractFieldTypeList7, 34892, tiffDirectoryType29, true);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText38 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText("M", (int) (short) -30875, tiffDirectoryType29);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd tagInfoLongOrIfd40 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd("[TagInfo. tag: 10 (0xa, name: GPSMeasureMode]TiffOutputSet {\r\n[TagInfo. tag: 10 (0xa, name: GPSMeasureMode]byteOrder: LITTLE_ENDIAN\r\n[TagInfo. tag: 10 (0xa, name: GPSMeasureMode]}\r\n", 32896, (-4), tiffDirectoryType29, false);
        org.junit.Assert.assertNotNull(abstractFieldTypeList7);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType17 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES + "'", tiffDirectoryType17.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES));
        org.junit.Assert.assertTrue("'" + tiffDirectoryType29 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType29.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
    }

    @Test
    void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType3 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort("", 16, 21, tiffDirectoryType3);
        java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList5 = tagInfoByteOrShort4.dataTypes;
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType11 = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble12 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble("S", (int) (short) 100, tiffDirectoryType11);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory tagInfoDirectory13 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory("", 69, tiffDirectoryType11);
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
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        int int58 = tagInfoDirectory13.getValue(byteOrder27, byteArray57);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort59 = org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants.EXIF_TAG_COLOR_SPACE;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort64 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort((int) (short) -1, "");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] abstractFieldTypeArray65 = new org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType[] { fieldTypeShort64 };
        java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType> abstractFieldTypeList66 = new java.util.ArrayList<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, abstractFieldTypeArray65);
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType68 = null;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte69 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte("S", (-1), (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType>) abstractFieldTypeList66, tiffDirectoryType68);
        java.nio.ByteOrder byteOrder70 = org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
        byte[] byteArray72 = tagInfoByte69.encodeValue(byteOrder70, (byte) 0);
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        byte[] byteArray82 = org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression.compressT4_2D(byteArray77, 34713, (int) (byte) 0, false, (-65281));
        short short83 = tagInfoShort59.getValue(byteOrder70, byteArray82);
        byte[] byteArray84 = tagInfoByteOrShort4.encodeValue(byteOrder27, byteArray82);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputSet tiffOutputSet85 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputSet(byteOrder27);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> tiffOutputDirectorySpliterator86 = tiffOutputSet85.spliterator();
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory87 = tiffOutputSet85.getGpsDirectory();
        java.lang.String str88 = tiffOutputSet85.toString();
        tiffOutputSet85.removeField(1678379530);
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory91 = tiffOutputSet85.getInteroperabilityDirectory();
        org.junit.Assert.assertTrue("'" + tiffDirectoryType3 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD + "'", tiffDirectoryType3.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD));
        org.junit.Assert.assertNotNull(abstractFieldTypeList5);
        org.junit.Assert.assertTrue("'" + tiffDirectoryType11 + "' != '" + org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1 + "'", tiffDirectoryType11.equals(org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.TIFF_DIRECTORY_IFD1));
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
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 10, 10, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1678379530 + "'", int58 == 1678379530);
        org.junit.Assert.assertNotNull(tagInfoShort59);
        org.junit.Assert.assertNotNull(abstractFieldTypeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteOrder70);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[0, 16]");
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 4096 + "'", short83 == (short) 4096);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 16]");
        org.junit.Assert.assertNotNull(tiffOutputDirectorySpliterator86);
        org.junit.Assert.assertNull(tiffOutputDirectory87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "TiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n" + "'", str88, "TiffOutputSet {\r\nbyteOrder: LITTLE_ENDIAN\r\n}\r\n");
        org.junit.Assert.assertNull(tiffOutputDirectory91);
    }

    @Test
    void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii fieldTypeAscii2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii(32909, "262 (0x106: PhotometricInterpretation): Bad Type: \n\n");
    }

    @Test
    void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.imaging.internal.Debug.debug(throwable0, 32773);
    }

    @Test
    void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters0 = new org.apache.commons.imaging.formats.tiff.TiffImagingParameters();
        org.apache.commons.imaging.PixelDensity pixelDensity1 = null;
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters2 = tiffImagingParameters0.setPixelDensity(pixelDensity1);
        int int3 = tiffImagingParameters2.getSubImageY();
        java.lang.String str4 = tiffImagingParameters2.getXmpXml();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters5 = tiffImagingParameters2.asThis();
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters7 = tiffImagingParameters2.setFileName("hi!");
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters9 = tiffImagingParameters7.setT4Options((java.lang.Integer) 34661);
        org.apache.commons.imaging.formats.tiff.TiffImagingParameters tiffImagingParameters10 = tiffImagingParameters9.asThis();
        int int11 = tiffImagingParameters9.getSubImageX();
        org.junit.Assert.assertNotNull(tiffImagingParameters2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tiffImagingParameters5);
        org.junit.Assert.assertNotNull(tiffImagingParameters7);
        org.junit.Assert.assertNotNull(tiffImagingParameters9);
        org.junit.Assert.assertNotNull(tiffImagingParameters10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble fieldTypeDouble2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble(32947, "JPEG image data: 2 bytes");
    }

    @Test
    void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii fieldTypeAscii2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii((-4), "[TagInfo. tag: 22 (0x16, name: GPSDestLongitude]");
    }

    @Test
    void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
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
        java.awt.image.BufferedImage bufferedImage67 = tiffDirectory66.getTiffImage();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds tagInfoUndefineds68 = org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants.EXIF_TAG_CFAPATTERN;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField70 = tiffDirectory66.findField((org.apache.commons.imaging.formats.tiff.taginfos.TagInfo) tagInfoUndefineds68, false);
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator71 = tiffDirectory66.spliterator();
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldList72 = tiffDirectory66.getDirectoryEntries();
        java.util.Spliterator<org.apache.commons.imaging.formats.tiff.TiffField> tiffFieldSpliterator73 = tiffFieldList72.spliterator();
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
        org.junit.Assert.assertNull(bufferedImage67);
        org.junit.Assert.assertNotNull(tagInfoUndefineds68);
        org.junit.Assert.assertNull(tiffField70);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator71);
        org.junit.Assert.assertNotNull(tiffFieldList72);
        org.junit.Assert.assertNotNull(tiffFieldSpliterator73);
    }
}

