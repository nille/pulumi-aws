// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudhsmv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterCertificate {
    private @Nullable String awsHardwareCertificate;
    private @Nullable String clusterCertificate;
    private @Nullable String clusterCsr;
    private @Nullable String hsmCertificate;
    private @Nullable String manufacturerHardwareCertificate;

    private ClusterClusterCertificate() {}
    public Optional<String> awsHardwareCertificate() {
        return Optional.ofNullable(this.awsHardwareCertificate);
    }
    public Optional<String> clusterCertificate() {
        return Optional.ofNullable(this.clusterCertificate);
    }
    public Optional<String> clusterCsr() {
        return Optional.ofNullable(this.clusterCsr);
    }
    public Optional<String> hsmCertificate() {
        return Optional.ofNullable(this.hsmCertificate);
    }
    public Optional<String> manufacturerHardwareCertificate() {
        return Optional.ofNullable(this.manufacturerHardwareCertificate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String awsHardwareCertificate;
        private @Nullable String clusterCertificate;
        private @Nullable String clusterCsr;
        private @Nullable String hsmCertificate;
        private @Nullable String manufacturerHardwareCertificate;
        public Builder() {}
        public Builder(ClusterClusterCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsHardwareCertificate = defaults.awsHardwareCertificate;
    	      this.clusterCertificate = defaults.clusterCertificate;
    	      this.clusterCsr = defaults.clusterCsr;
    	      this.hsmCertificate = defaults.hsmCertificate;
    	      this.manufacturerHardwareCertificate = defaults.manufacturerHardwareCertificate;
        }

        @CustomType.Setter
        public Builder awsHardwareCertificate(@Nullable String awsHardwareCertificate) {
            this.awsHardwareCertificate = awsHardwareCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder clusterCertificate(@Nullable String clusterCertificate) {
            this.clusterCertificate = clusterCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder clusterCsr(@Nullable String clusterCsr) {
            this.clusterCsr = clusterCsr;
            return this;
        }
        @CustomType.Setter
        public Builder hsmCertificate(@Nullable String hsmCertificate) {
            this.hsmCertificate = hsmCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder manufacturerHardwareCertificate(@Nullable String manufacturerHardwareCertificate) {
            this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
            return this;
        }
        public ClusterClusterCertificate build() {
            final var o = new ClusterClusterCertificate();
            o.awsHardwareCertificate = awsHardwareCertificate;
            o.clusterCertificate = clusterCertificate;
            o.clusterCsr = clusterCsr;
            o.hsmCertificate = hsmCertificate;
            o.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
            return o;
        }
    }
}
