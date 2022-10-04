// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate {
    /**
     * @return Local file certificate.
     * 
     */
    private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile file;
    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds sds;

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate() {}
    /**
     * @return Local file certificate.
     * 
     */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds> sds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile file;
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds sds;
        public Builder() {}
        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        @CustomType.Setter
        public Builder file(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder sds(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate build() {
            final var o = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate();
            o.file = file;
            o.sds = sds;
            return o;
        }
    }
}