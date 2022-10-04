// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerConnectionPoolGrpc;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerConnectionPoolHttp2;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerConnectionPoolHttp;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerConnectionPool {
    /**
     * @return Connection pool information for gRPC listeners.
     * 
     */
    private @Nullable VirtualGatewaySpecListenerConnectionPoolGrpc grpc;
    /**
     * @return Connection pool information for HTTP listeners.
     * 
     */
    private @Nullable VirtualGatewaySpecListenerConnectionPoolHttp http;
    /**
     * @return Connection pool information for HTTP2 listeners.
     * 
     */
    private @Nullable VirtualGatewaySpecListenerConnectionPoolHttp2 http2;

    private VirtualGatewaySpecListenerConnectionPool() {}
    /**
     * @return Connection pool information for gRPC listeners.
     * 
     */
    public Optional<VirtualGatewaySpecListenerConnectionPoolGrpc> grpc() {
        return Optional.ofNullable(this.grpc);
    }
    /**
     * @return Connection pool information for HTTP listeners.
     * 
     */
    public Optional<VirtualGatewaySpecListenerConnectionPoolHttp> http() {
        return Optional.ofNullable(this.http);
    }
    /**
     * @return Connection pool information for HTTP2 listeners.
     * 
     */
    public Optional<VirtualGatewaySpecListenerConnectionPoolHttp2> http2() {
        return Optional.ofNullable(this.http2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerConnectionPoolGrpc grpc;
        private @Nullable VirtualGatewaySpecListenerConnectionPoolHttp http;
        private @Nullable VirtualGatewaySpecListenerConnectionPoolHttp2 http2;
        public Builder() {}
        public Builder(VirtualGatewaySpecListenerConnectionPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
        }

        @CustomType.Setter
        public Builder grpc(@Nullable VirtualGatewaySpecListenerConnectionPoolGrpc grpc) {
            this.grpc = grpc;
            return this;
        }
        @CustomType.Setter
        public Builder http(@Nullable VirtualGatewaySpecListenerConnectionPoolHttp http) {
            this.http = http;
            return this;
        }
        @CustomType.Setter
        public Builder http2(@Nullable VirtualGatewaySpecListenerConnectionPoolHttp2 http2) {
            this.http2 = http2;
            return this;
        }
        public VirtualGatewaySpecListenerConnectionPool build() {
            final var o = new VirtualGatewaySpecListenerConnectionPool();
            o.grpc = grpc;
            o.http = http;
            o.http2 = http2;
            return o;
        }
    }
}