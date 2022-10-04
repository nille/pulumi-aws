// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetEipsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetEipsResult {
    /**
     * @return List of all the allocation IDs for address for use with EC2-VPC.
     * 
     */
    private List<String> allocationIds;
    private @Nullable List<GetEipsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of all the Elastic IP addresses.
     * 
     */
    private List<String> publicIps;
    private Map<String,String> tags;

    private GetEipsResult() {}
    /**
     * @return List of all the allocation IDs for address for use with EC2-VPC.
     * 
     */
    public List<String> allocationIds() {
        return this.allocationIds;
    }
    public List<GetEipsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of all the Elastic IP addresses.
     * 
     */
    public List<String> publicIps() {
        return this.publicIps;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEipsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allocationIds;
        private @Nullable List<GetEipsFilter> filters;
        private String id;
        private List<String> publicIps;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetEipsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationIds = defaults.allocationIds;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.publicIps = defaults.publicIps;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder allocationIds(List<String> allocationIds) {
            this.allocationIds = Objects.requireNonNull(allocationIds);
            return this;
        }
        public Builder allocationIds(String... allocationIds) {
            return allocationIds(List.of(allocationIds));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetEipsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetEipsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder publicIps(List<String> publicIps) {
            this.publicIps = Objects.requireNonNull(publicIps);
            return this;
        }
        public Builder publicIps(String... publicIps) {
            return publicIps(List.of(publicIps));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetEipsResult build() {
            final var o = new GetEipsResult();
            o.allocationIds = allocationIds;
            o.filters = filters;
            o.id = id;
            o.publicIps = publicIps;
            o.tags = tags;
            return o;
        }
    }
}