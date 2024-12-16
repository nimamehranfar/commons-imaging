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
package org.apache.commons.imaging.formats.tiff.write;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DIRECTORY_FOOTER_LENGTH;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DIRECTORY_HEADER_LENGTH;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.ENTRY_LENGTH;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.ENTRY_MAX_VALUE_LENGTH;

import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.AbstractTiffElement;
import org.apache.commons.imaging.formats.tiff.AbstractTiffImageData;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;

public final class TiffOutputDirectory extends AbstractTiffOutputItem implements Iterable<TiffOutputField> {
    public static final Comparator<TiffOutputDirectory> COMPARATOR = Comparator.comparingInt(TiffOutputDirectory::getType);
    private final int type;
    private final List<TiffOutputField> fields = new ArrayList<>();
    private final ByteOrder byteOrder;
    private TiffOutputDirectory nextDirectory;
    private JpegImageData jpegImageData;
    private AbstractTiffImageData abstractTiffImageData;

    public TiffOutputDirectory(final int type, final ByteOrder byteOrder) {
        this.type = type;
        this.byteOrder = byteOrder;
    }

    public void add(final TagInfoAscii tagInfo, final String... values) throws ImagingException {
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.ASCII, bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoAsciiOrByte tagInfo, final String... values) throws ImagingException {
        final byte[] bytes = tagInfo.encodeValue(AbstractFieldType.ASCII, values, byteOrder);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.ASCII, bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoAsciiOrRational tagInfo, final RationalNumber... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(AbstractFieldType.RATIONAL, values, byteOrder);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.RATIONAL, bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoAsciiOrRational tagInfo, final String... values) throws ImagingException {
        final byte[] bytes = tagInfo.encodeValue(AbstractFieldType.ASCII, values, byteOrder);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.ASCII, bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoByte tagInfo, final byte value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.BYTE, bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoByteOrShort tagInfo, final byte... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.BYTE, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoByteOrShort tagInfo, final short... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoBytes tagInfo, final byte... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.BYTE, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoDouble tagInfo, final double value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.DOUBLE, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoDoubles tagInfo, final double... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.DOUBLE, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoFloat tagInfo, final float value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.FLOAT, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoFloats tagInfo, final float... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.FLOAT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoGpsText tagInfo, final String value) throws ImagingException {
        final byte[] bytes = tagInfo.encodeValue(AbstractFieldType.UNDEFINED, value, byteOrder);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, tagInfo.dataTypes.get(0), bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoLong tagInfo, final int value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.LONG, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoLongs tagInfo, final int... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.LONG, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoRational tagInfo, final RationalNumber value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.RATIONAL, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoRationals tagInfo, final RationalNumber... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.RATIONAL, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSByte tagInfo, final byte value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SBYTE, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSBytes tagInfo, final byte... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SBYTE, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShort tagInfo, final short value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SHORT, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLong tagInfo, final int... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.LONG, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLong tagInfo, final short... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLongOrRational tagInfo, final int... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.LONG, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLongOrRational tagInfo, final RationalNumber... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.RATIONAL, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLongOrRational tagInfo, final short... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrRational tagInfo, final RationalNumber... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.RATIONAL, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrRational tagInfo, final short... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShorts tagInfo, final short... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSLong tagInfo, final int value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SLONG, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSLongs tagInfo, final int... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SLONG, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSRational tagInfo, final RationalNumber value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SRATIONAL, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSRationals tagInfo, final RationalNumber... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SRATIONAL, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSShort tagInfo, final short value) throws ImagingException {
        if (tagInfo.length != 1) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not 1");
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, value);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SSHORT, 1, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSShorts tagInfo, final short... values) throws ImagingException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImagingException("Tag expects " + tagInfo.length + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.SSHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoXpString tagInfo, final String value) throws ImagingException {
        final byte[] bytes = tagInfo.encodeValue(AbstractFieldType.BYTE, value, byteOrder);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo, AbstractFieldType.BYTE, bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TiffOutputField field) {
        fields.add(field);
    }

    public String description() {
        return TiffDirectory.description(getType());
    }

    /**
     * Finds the TiffOutputField for the given tag from this TiffOutputDirectory.
     *
     * <p>
     * If there is no field matching the given tag, null will be returned.
     * </p>
     *
     * @param tag the tag specifying the field
     * @return the field matching tagInfo or null, if the field isn't present
     * @see #findField(TagInfo)
     */
    public TiffOutputField findField(final int tag) {
        for (final TiffOutputField field : fields) {
            if (field.tag == tag) {
                return field;
            }
        }
        return null;
    }

    /**
     * Finds the TiffOutputField for the given TagInfo from this TiffOutputDirectory.
     *
     * <p>
     * If there is no field matching the given TagInfo, null will be returned.
     * </p>
     *
     * @param tagInfo the TagInfo specifying the field
     * @return the field matching tagInfo or null, if the field isn't present
     * @see #findField(int)
     */
    public TiffOutputField findField(final TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public List<TiffOutputField> getFields() {
        return new ArrayList<>(fields);
    }

    @Override
    public String getItemDescription() {
        final TiffDirectoryType dirType = TiffDirectoryType.getExifDirectoryType(getType());
        return "Directory: " + dirType.privateName + " (" + getType() + ")";
    }

    @Override
    public int getItemLength() {
        return ENTRY_LENGTH * fields.size() + DIRECTORY_HEADER_LENGTH + DIRECTORY_FOOTER_LENGTH;
    }

    protected List<AbstractTiffOutputItem> getOutputItems(final TiffOutputSummary outputSummary) throws ImagingException {
        // first validate directory fields.

        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);

        TiffOutputField jpegOffsetField = null;
        if (null != jpegImageData) {
            jpegOffsetField = new TiffOutputField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT, AbstractFieldType.LONG, 1,
                    new byte[ENTRY_MAX_VALUE_LENGTH]);
            add(jpegOffsetField);

            final byte[] lengthValue = AbstractFieldType.LONG.writeData(jpegImageData.length, outputSummary.byteOrder);

            final TiffOutputField jpegLengthField = new TiffOutputField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, AbstractFieldType.LONG, 1,
                    lengthValue);
            add(jpegLengthField);

        }

        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);

        TiffOutputField imageDataOffsetField;
        ImageDataOffsets imageDataInfo = null;
        if (null != abstractTiffImageData) {
            final boolean stripsNotTiles = abstractTiffImageData.stripsNotTiles();

            TagInfo offsetTag;
            TagInfo byteCountsTag;
            if (stripsNotTiles) {
                offsetTag = TiffTagConstants.TIFF_TAG_STRIP_OFFSETS;
                byteCountsTag = TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS;
            } else {
                offsetTag = TiffTagConstants.TIFF_TAG_TILE_OFFSETS;
                byteCountsTag = TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS;
            }

            final AbstractTiffElement.DataElement[] imageData = abstractTiffImageData.getImageData();

            // TiffOutputField imageDataOffsetsField = null;

            final int[] imageDataOffsets = Allocator.intArray(imageData.length);
            final int[] imageDataByteCounts = Allocator.intArray(imageData.length);
            Arrays.setAll(imageDataByteCounts, i -> imageData[i].length);

            // Append imageData-related fields to first directory
            imageDataOffsetField = new TiffOutputField(offsetTag, AbstractFieldType.LONG, imageDataOffsets.length,
                    AbstractFieldType.LONG.writeData(imageDataOffsets, outputSummary.byteOrder));
            add(imageDataOffsetField);

            final byte[] data = AbstractFieldType.LONG.writeData(imageDataByteCounts, outputSummary.byteOrder);
            final TiffOutputField byteCountsField = new TiffOutputField(byteCountsTag, AbstractFieldType.LONG, imageDataByteCounts.length, data);
            add(byteCountsField);

            imageDataInfo = new ImageDataOffsets(imageData, imageDataOffsets, imageDataOffsetField);
        }

        final List<AbstractTiffOutputItem> result = new ArrayList<>();
        result.add(this);
        sortFields();

        for (final TiffOutputField field : fields) {
            if (field.isLocalValue()) {
                continue;
            }

            final AbstractTiffOutputItem item = field.getSeperateValue();
            result.add(item);
            // outputSummary.add(item, field);
        }

        if (null != imageDataInfo) {
            Collections.addAll(result, imageDataInfo.outputItems);

            outputSummary.addTiffImageData(imageDataInfo);
        }

        if (null != jpegImageData) {
            final AbstractTiffOutputItem item = new AbstractTiffOutputItem.Value("JPEG image data", jpegImageData.getData());
            result.add(item);
            outputSummary.add(item, jpegOffsetField);
        }

        return result;
    }

    public JpegImageData getRawJpegImageData() {
        return jpegImageData;
    }

    public AbstractTiffImageData getRawTiffImageData() {
        return abstractTiffImageData;
    }

    public int getType() {
        return type;
    }

    @Override
    public Iterator<TiffOutputField> iterator() {
        return fields.iterator();
    }

    public void removeField(final int tag) {
        final List<TiffOutputField> matches = new ArrayList<>();
        for (final TiffOutputField field : fields) {
            if (field.tag == tag) {
                matches.add(field);
            }
        }
        fields.removeAll(matches);
    }

    public void removeField(final TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    private void removeFieldIfPresent(final TagInfo tagInfo) {
        final TiffOutputField field = findField(tagInfo);
        if (null != field) {
            fields.remove(field);
        }
    }

    public void setJpegImageData(final JpegImageData rawJpegImageData) {
        this.jpegImageData = rawJpegImageData;
    }

    public void setNextDirectory(final TiffOutputDirectory nextDirectory) {
        this.nextDirectory = nextDirectory;
    }

    public void setTiffImageData(final AbstractTiffImageData rawTiffImageData) {
        this.abstractTiffImageData = rawTiffImageData;
    }

    public void sortFields() {
        final Comparator<TiffOutputField> comparator = (e1, e2) -> {
            if (e1.tag != e2.tag) {
                return e1.tag - e2.tag;
            }
            return e1.getSortHint() - e2.getSortHint();
        };
        fields.sort(comparator);
    }

    @Override
    public void writeItem(final BinaryOutputStream bos) throws IOException, ImagingException {
        // Write Directory Field Count
        bos.write2Bytes(fields.size()); // DirectoryFieldCount

        // Write Fields
        for (final TiffOutputField field : fields) {
            field.writeField(bos);

            // Debug.debug("\t" + "writing field (" + field.tag + ", 0x" +
            // Integer.toHexString(field.tag) + ")", field.tagInfo);
            // if (field.tagInfo.isOffset())
            // Debug.debug("\t\tOFFSET!", field.bytes);
        }

        long nextDirectoryOffset = 0;
        if (nextDirectory != null) {
            nextDirectoryOffset = nextDirectory.getOffset();
        }

        // Write nextDirectoryOffset
        if (nextDirectoryOffset == UNDEFINED_VALUE) {
            bos.write4Bytes(0);
        } else {
            bos.write4Bytes((int) nextDirectoryOffset);
        }
    }
}
