// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationProfileValidator {
    /**
     * @return Either the JSON Schema content or the ARN of an AWS Lambda function.
     * 
     */
    private @Nullable String content;
    /**
     * @return Type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
     */
    private String type;

    private ConfigurationProfileValidator() {}
    /**
     * @return Either the JSON Schema content or the ARN of an AWS Lambda function.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return Type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileValidator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String content;
        private String type;
        public Builder() {}
        public Builder(ConfigurationProfileValidator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ConfigurationProfileValidator build() {
            final var o = new ConfigurationProfileValidator();
            o.content = content;
            o.type = type;
            return o;
        }
    }
}