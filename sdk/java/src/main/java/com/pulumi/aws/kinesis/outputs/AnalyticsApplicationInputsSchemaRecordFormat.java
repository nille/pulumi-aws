// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParameters;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationInputsSchemaRecordFormat {
    /**
     * @return The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    private @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParameters mappingParameters;
    /**
     * @return The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    private @Nullable String recordFormatType;

    private AnalyticsApplicationInputsSchemaRecordFormat() {}
    /**
     * @return The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    public Optional<AnalyticsApplicationInputsSchemaRecordFormatMappingParameters> mappingParameters() {
        return Optional.ofNullable(this.mappingParameters);
    }
    /**
     * @return The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    public Optional<String> recordFormatType() {
        return Optional.ofNullable(this.recordFormatType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParameters mappingParameters;
        private @Nullable String recordFormatType;
        public Builder() {}
        public Builder(AnalyticsApplicationInputsSchemaRecordFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappingParameters = defaults.mappingParameters;
    	      this.recordFormatType = defaults.recordFormatType;
        }

        @CustomType.Setter
        public Builder mappingParameters(@Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParameters mappingParameters) {
            this.mappingParameters = mappingParameters;
            return this;
        }
        @CustomType.Setter
        public Builder recordFormatType(@Nullable String recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }
        public AnalyticsApplicationInputsSchemaRecordFormat build() {
            final var o = new AnalyticsApplicationInputsSchemaRecordFormat();
            o.mappingParameters = mappingParameters;
            o.recordFormatType = recordFormatType;
            return o;
        }
    }
}