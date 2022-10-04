// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs();

    /**
     * SANs for a TLS validation context.
     * 
     */
    @Import(name="subjectAlternativeNames")
    private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;

    /**
     * @return SANs for a TLS validation context.
     * 
     */
    public Optional<Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs>> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }

    /**
     * TLS validation context trust.
     * 
     */
    @Import(name="trust", required=true)
    private Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> trust;

    /**
     * @return TLS validation context trust.
     * 
     */
    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> trust() {
        return this.trust;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs() {}

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs $) {
        this.subjectAlternativeNames = $.subjectAlternativeNames;
        this.trust = $.trust;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs();
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs defaults) {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subjectAlternativeNames SANs for a TLS validation context.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames) {
            $.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * @param subjectAlternativeNames SANs for a TLS validation context.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs subjectAlternativeNames) {
            return subjectAlternativeNames(Output.of(subjectAlternativeNames));
        }

        /**
         * @param trust TLS validation context trust.
         * 
         * @return builder
         * 
         */
        public Builder trust(Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> trust) {
            $.trust = trust;
            return this;
        }

        /**
         * @param trust TLS validation context trust.
         * 
         * @return builder
         * 
         */
        public Builder trust(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs trust) {
            return trust(Output.of(trust));
        }

        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs build() {
            $.trust = Objects.requireNonNull($.trust, "expected parameter 'trust' to be non-null");
            return $;
        }
    }

}