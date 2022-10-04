// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.worklink.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FleetIdentityProvider {
    /**
     * @return The SAML metadata document provided by the customer’s identity provider.
     * 
     */
    private String samlMetadata;
    /**
     * @return The type of identity provider.
     * 
     */
    private String type;

    private FleetIdentityProvider() {}
    /**
     * @return The SAML metadata document provided by the customer’s identity provider.
     * 
     */
    public String samlMetadata() {
        return this.samlMetadata;
    }
    /**
     * @return The type of identity provider.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIdentityProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String samlMetadata;
        private String type;
        public Builder() {}
        public Builder(FleetIdentityProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samlMetadata = defaults.samlMetadata;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder samlMetadata(String samlMetadata) {
            this.samlMetadata = Objects.requireNonNull(samlMetadata);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FleetIdentityProvider build() {
            final var o = new FleetIdentityProvider();
            o.samlMetadata = samlMetadata;
            o.type = type;
            return o;
        }
    }
}