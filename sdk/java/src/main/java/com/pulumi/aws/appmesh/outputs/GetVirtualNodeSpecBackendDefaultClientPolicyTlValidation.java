// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeName;
import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrust;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualNodeSpecBackendDefaultClientPolicyTlValidation {
    private List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeName> subjectAlternativeNames;
    private List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrust> trusts;

    private GetVirtualNodeSpecBackendDefaultClientPolicyTlValidation() {}
    public List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeName> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    public List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrust> trusts() {
        return this.trusts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNodeSpecBackendDefaultClientPolicyTlValidation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeName> subjectAlternativeNames;
        private List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrust> trusts;
        public Builder() {}
        public Builder(GetVirtualNodeSpecBackendDefaultClientPolicyTlValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trusts = defaults.trusts;
        }

        @CustomType.Setter
        public Builder subjectAlternativeNames(List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeName> subjectAlternativeNames) {
            this.subjectAlternativeNames = Objects.requireNonNull(subjectAlternativeNames);
            return this;
        }
        public Builder subjectAlternativeNames(GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeName... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        @CustomType.Setter
        public Builder trusts(List<GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrust> trusts) {
            this.trusts = Objects.requireNonNull(trusts);
            return this;
        }
        public Builder trusts(GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrust... trusts) {
            return trusts(List.of(trusts));
        }
        public GetVirtualNodeSpecBackendDefaultClientPolicyTlValidation build() {
            final var o = new GetVirtualNodeSpecBackendDefaultClientPolicyTlValidation();
            o.subjectAlternativeNames = subjectAlternativeNames;
            o.trusts = trusts;
            return o;
        }
    }
}
