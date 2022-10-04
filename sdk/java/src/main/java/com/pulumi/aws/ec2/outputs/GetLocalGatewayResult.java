// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLocalGatewayFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalGatewayResult {
    private @Nullable List<GetLocalGatewayFilter> filters;
    private String id;
    /**
     * @return ARN of Outpost
     * 
     */
    private String outpostArn;
    /**
     * @return AWS account identifier that owns the Local Gateway.
     * 
     */
    private String ownerId;
    /**
     * @return State of the local gateway.
     * 
     */
    private String state;
    private Map<String,String> tags;

    private GetLocalGatewayResult() {}
    public List<GetLocalGatewayFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return ARN of Outpost
     * 
     */
    public String outpostArn() {
        return this.outpostArn;
    }
    /**
     * @return AWS account identifier that owns the Local Gateway.
     * 
     */
    public String ownerId() {
        return this.ownerId;
    }
    /**
     * @return State of the local gateway.
     * 
     */
    public String state() {
        return this.state;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetLocalGatewayFilter> filters;
        private String id;
        private String outpostArn;
        private String ownerId;
        private String state;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetLocalGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetLocalGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetLocalGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder outpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }
        @CustomType.Setter
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLocalGatewayResult build() {
            final var o = new GetLocalGatewayResult();
            o.filters = filters;
            o.id = id;
            o.outpostArn = outpostArn;
            o.ownerId = ownerId;
            o.state = state;
            o.tags = tags;
            return o;
        }
    }
}