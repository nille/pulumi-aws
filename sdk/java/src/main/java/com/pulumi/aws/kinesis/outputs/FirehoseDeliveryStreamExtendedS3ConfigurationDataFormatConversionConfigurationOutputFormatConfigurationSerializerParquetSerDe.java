// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe {
    /**
     * @return The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     * 
     */
    private @Nullable Integer blockSizeBytes;
    /**
     * @return The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
     * 
     */
    private @Nullable String compression;
    /**
     * @return Indicates whether to enable dictionary compression.
     * 
     */
    private @Nullable Boolean enableDictionaryCompression;
    /**
     * @return The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `0`.
     * 
     */
    private @Nullable Integer maxPaddingBytes;
    /**
     * @return The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * 
     */
    private @Nullable Integer pageSizeBytes;
    /**
     * @return Indicates the version of row format to output. The possible values are `V1` and `V2`. The default is `V1`.
     * 
     */
    private @Nullable String writerVersion;

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe() {}
    /**
     * @return The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     * 
     */
    public Optional<Integer> blockSizeBytes() {
        return Optional.ofNullable(this.blockSizeBytes);
    }
    /**
     * @return The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
     * 
     */
    public Optional<String> compression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * @return Indicates whether to enable dictionary compression.
     * 
     */
    public Optional<Boolean> enableDictionaryCompression() {
        return Optional.ofNullable(this.enableDictionaryCompression);
    }
    /**
     * @return The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `0`.
     * 
     */
    public Optional<Integer> maxPaddingBytes() {
        return Optional.ofNullable(this.maxPaddingBytes);
    }
    /**
     * @return The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * 
     */
    public Optional<Integer> pageSizeBytes() {
        return Optional.ofNullable(this.pageSizeBytes);
    }
    /**
     * @return Indicates the version of row format to output. The possible values are `V1` and `V2`. The default is `V1`.
     * 
     */
    public Optional<String> writerVersion() {
        return Optional.ofNullable(this.writerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer blockSizeBytes;
        private @Nullable String compression;
        private @Nullable Boolean enableDictionaryCompression;
        private @Nullable Integer maxPaddingBytes;
        private @Nullable Integer pageSizeBytes;
        private @Nullable String writerVersion;
        public Builder() {}
        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeBytes = defaults.blockSizeBytes;
    	      this.compression = defaults.compression;
    	      this.enableDictionaryCompression = defaults.enableDictionaryCompression;
    	      this.maxPaddingBytes = defaults.maxPaddingBytes;
    	      this.pageSizeBytes = defaults.pageSizeBytes;
    	      this.writerVersion = defaults.writerVersion;
        }

        @CustomType.Setter
        public Builder blockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }
        @CustomType.Setter
        public Builder compression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }
        @CustomType.Setter
        public Builder enableDictionaryCompression(@Nullable Boolean enableDictionaryCompression) {
            this.enableDictionaryCompression = enableDictionaryCompression;
            return this;
        }
        @CustomType.Setter
        public Builder maxPaddingBytes(@Nullable Integer maxPaddingBytes) {
            this.maxPaddingBytes = maxPaddingBytes;
            return this;
        }
        @CustomType.Setter
        public Builder pageSizeBytes(@Nullable Integer pageSizeBytes) {
            this.pageSizeBytes = pageSizeBytes;
            return this;
        }
        @CustomType.Setter
        public Builder writerVersion(@Nullable String writerVersion) {
            this.writerVersion = writerVersion;
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe build() {
            final var o = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe();
            o.blockSizeBytes = blockSizeBytes;
            o.compression = compression;
            o.enableDictionaryCompression = enableDictionaryCompression;
            o.maxPaddingBytes = maxPaddingBytes;
            o.pageSizeBytes = pageSizeBytes;
            o.writerVersion = writerVersion;
            return o;
        }
    }
}