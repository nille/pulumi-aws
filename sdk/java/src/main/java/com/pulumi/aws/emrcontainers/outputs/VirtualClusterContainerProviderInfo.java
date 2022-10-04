// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers.outputs;

import com.pulumi.aws.emrcontainers.outputs.VirtualClusterContainerProviderInfoEksInfo;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class VirtualClusterContainerProviderInfo {
    /**
     * @return Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * 
     */
    private VirtualClusterContainerProviderInfoEksInfo eksInfo;

    private VirtualClusterContainerProviderInfo() {}
    /**
     * @return Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * 
     */
    public VirtualClusterContainerProviderInfoEksInfo eksInfo() {
        return this.eksInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerProviderInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private VirtualClusterContainerProviderInfoEksInfo eksInfo;
        public Builder() {}
        public Builder(VirtualClusterContainerProviderInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eksInfo = defaults.eksInfo;
        }

        @CustomType.Setter
        public Builder eksInfo(VirtualClusterContainerProviderInfoEksInfo eksInfo) {
            this.eksInfo = Objects.requireNonNull(eksInfo);
            return this;
        }
        public VirtualClusterContainerProviderInfo build() {
            final var o = new VirtualClusterContainerProviderInfo();
            o.eksInfo = eksInfo;
            return o;
        }
    }
}