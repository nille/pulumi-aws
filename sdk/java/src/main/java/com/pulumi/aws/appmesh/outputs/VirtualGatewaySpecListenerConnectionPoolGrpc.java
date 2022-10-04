// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VirtualGatewaySpecListenerConnectionPoolGrpc {
    /**
     * @return Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    private Integer maxRequests;

    private VirtualGatewaySpecListenerConnectionPoolGrpc() {}
    /**
     * @return Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    public Integer maxRequests() {
        return this.maxRequests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolGrpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxRequests;
        public Builder() {}
        public Builder(VirtualGatewaySpecListenerConnectionPoolGrpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRequests = defaults.maxRequests;
        }

        @CustomType.Setter
        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }
        public VirtualGatewaySpecListenerConnectionPoolGrpc build() {
            final var o = new VirtualGatewaySpecListenerConnectionPoolGrpc();
            o.maxRequests = maxRequests;
            return o;
        }
    }
}