// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationInputsSchemaRecordColumn {
    /**
     * @return The Mapping reference to the data element.
     * 
     */
    private @Nullable String mapping;
    /**
     * @return Name of the column.
     * 
     */
    private String name;
    /**
     * @return The SQL Type of the column.
     * 
     */
    private String sqlType;

    private AnalyticsApplicationInputsSchemaRecordColumn() {}
    /**
     * @return The Mapping reference to the data element.
     * 
     */
    public Optional<String> mapping() {
        return Optional.ofNullable(this.mapping);
    }
    /**
     * @return Name of the column.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The SQL Type of the column.
     * 
     */
    public String sqlType() {
        return this.sqlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mapping;
        private String name;
        private String sqlType;
        public Builder() {}
        public Builder(AnalyticsApplicationInputsSchemaRecordColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapping = defaults.mapping;
    	      this.name = defaults.name;
    	      this.sqlType = defaults.sqlType;
        }

        @CustomType.Setter
        public Builder mapping(@Nullable String mapping) {
            this.mapping = mapping;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder sqlType(String sqlType) {
            this.sqlType = Objects.requireNonNull(sqlType);
            return this;
        }
        public AnalyticsApplicationInputsSchemaRecordColumn build() {
            final var o = new AnalyticsApplicationInputsSchemaRecordColumn();
            o.mapping = mapping;
            o.name = name;
            o.sqlType = sqlType;
            return o;
        }
    }
}