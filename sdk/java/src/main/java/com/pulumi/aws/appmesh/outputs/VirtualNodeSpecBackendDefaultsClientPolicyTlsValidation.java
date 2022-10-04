// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation {
    /**
     * @return SANs for a TLS validation context.
     * 
     */
    private @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * @return TLS validation context trust.
     * 
     */
    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust;

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation() {}
    /**
     * @return SANs for a TLS validation context.
     * 
     */
    public Optional<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * @return TLS validation context trust.
     * 
     */
    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust;
        public Builder() {}
        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        @CustomType.Setter
        public Builder subjectAlternativeNames(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        @CustomType.Setter
        public Builder trust(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation build() {
            final var o = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation();
            o.subjectAlternativeNames = subjectAlternativeNames;
            o.trust = trust;
            return o;
        }
    }
}