// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds {
    /**
     * @return Name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    private String secretName;

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds() {}
    /**
     * @return Name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    public String secretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretName;
        public Builder() {}
        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        @CustomType.Setter
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds build() {
            final var o = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds();
            o.secretName = secretName;
            return o;
        }
    }
}