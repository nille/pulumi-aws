// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.aws.msk.outputs.ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterBrokerNodeGroupInfoConnectivityInfo {
    /**
     * @return Access control settings for brokers. See below.
     * 
     */
    private @Nullable ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess publicAccess;

    private ClusterBrokerNodeGroupInfoConnectivityInfo() {}
    /**
     * @return Access control settings for brokers. See below.
     * 
     */
    public Optional<ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBrokerNodeGroupInfoConnectivityInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess publicAccess;
        public Builder() {}
        public Builder(ClusterBrokerNodeGroupInfoConnectivityInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicAccess = defaults.publicAccess;
        }

        @CustomType.Setter
        public Builder publicAccess(@Nullable ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }
        public ClusterBrokerNodeGroupInfoConnectivityInfo build() {
            final var o = new ClusterBrokerNodeGroupInfoConnectivityInfo();
            o.publicAccess = publicAccess;
            return o;
        }
    }
}