// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader {
    private List<String> items;

    private GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader() {}
    public List<String> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> items;
        public Builder() {}
        public Builder(GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        @CustomType.Setter
        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }
        public GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader build() {
            final var o = new GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader();
            o.items = items;
            return o;
        }
    }
}