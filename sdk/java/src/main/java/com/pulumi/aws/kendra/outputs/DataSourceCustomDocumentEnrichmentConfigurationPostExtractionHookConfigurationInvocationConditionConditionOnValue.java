// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValue {
    /**
     * @return A date expressed as an ISO 8601 string. It is important for the time zone to be included in the ISO 8601 date-time format. As of this writing only UTC is supported. For example, `2012-03-25T12:30:10+00:00`.
     * 
     */
    private @Nullable String dateValue;
    /**
     * @return A long integer value.
     * 
     */
    private @Nullable Integer longValue;
    /**
     * @return A list of strings.
     * 
     */
    private @Nullable List<String> stringListValues;
    private @Nullable String stringValue;

    private DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValue() {}
    /**
     * @return A date expressed as an ISO 8601 string. It is important for the time zone to be included in the ISO 8601 date-time format. As of this writing only UTC is supported. For example, `2012-03-25T12:30:10+00:00`.
     * 
     */
    public Optional<String> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }
    /**
     * @return A long integer value.
     * 
     */
    public Optional<Integer> longValue() {
        return Optional.ofNullable(this.longValue);
    }
    /**
     * @return A list of strings.
     * 
     */
    public List<String> stringListValues() {
        return this.stringListValues == null ? List.of() : this.stringListValues;
    }
    public Optional<String> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dateValue;
        private @Nullable Integer longValue;
        private @Nullable List<String> stringListValues;
        private @Nullable String stringValue;
        public Builder() {}
        public Builder(DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateValue = defaults.dateValue;
    	      this.longValue = defaults.longValue;
    	      this.stringListValues = defaults.stringListValues;
    	      this.stringValue = defaults.stringValue;
        }

        @CustomType.Setter
        public Builder dateValue(@Nullable String dateValue) {
            this.dateValue = dateValue;
            return this;
        }
        @CustomType.Setter
        public Builder longValue(@Nullable Integer longValue) {
            this.longValue = longValue;
            return this;
        }
        @CustomType.Setter
        public Builder stringListValues(@Nullable List<String> stringListValues) {
            this.stringListValues = stringListValues;
            return this;
        }
        public Builder stringListValues(String... stringListValues) {
            return stringListValues(List.of(stringListValues));
        }
        @CustomType.Setter
        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValue build() {
            final var o = new DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValue();
            o.dateValue = dateValue;
            o.longValue = longValue;
            o.stringListValues = stringListValues;
            o.stringValue = stringValue;
            return o;
        }
    }
}