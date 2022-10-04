// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pricing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductFilter {
    /**
     * @return Product attribute name that you want to filter on.
     * 
     */
    private String field;
    /**
     * @return Product attribute value that you want to filter on.
     * 
     */
    private String value;

    private GetProductFilter() {}
    /**
     * @return Product attribute name that you want to filter on.
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return Product attribute value that you want to filter on.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String field;
        private String value;
        public Builder() {}
        public Builder(GetProductFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetProductFilter build() {
            final var o = new GetProductFilter();
            o.field = field;
            o.value = value;
            return o;
        }
    }
}