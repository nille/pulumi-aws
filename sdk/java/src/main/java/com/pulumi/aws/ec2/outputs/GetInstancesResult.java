// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetInstancesFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    private @Nullable List<GetInstancesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return IDs of instances found through the filter
     * 
     */
    private List<String> ids;
    private @Nullable List<String> instanceStateNames;
    private Map<String,String> instanceTags;
    /**
     * @return Private IP addresses of instances found through the filter
     * 
     */
    private List<String> privateIps;
    /**
     * @return Public IP addresses of instances found through the filter
     * 
     */
    private List<String> publicIps;

    private GetInstancesResult() {}
    public List<GetInstancesFilter> filters() {
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
     * @return IDs of instances found through the filter
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public List<String> instanceStateNames() {
        return this.instanceStateNames == null ? List.of() : this.instanceStateNames;
    }
    public Map<String,String> instanceTags() {
        return this.instanceTags;
    }
    /**
     * @return Private IP addresses of instances found through the filter
     * 
     */
    public List<String> privateIps() {
        return this.privateIps;
    }
    /**
     * @return Public IP addresses of instances found through the filter
     * 
     */
    public List<String> publicIps() {
        return this.publicIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetInstancesFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable List<String> instanceStateNames;
        private Map<String,String> instanceTags;
        private List<String> privateIps;
        private List<String> publicIps;
        public Builder() {}
        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceStateNames = defaults.instanceStateNames;
    	      this.instanceTags = defaults.instanceTags;
    	      this.privateIps = defaults.privateIps;
    	      this.publicIps = defaults.publicIps;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetInstancesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInstancesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceStateNames(@Nullable List<String> instanceStateNames) {
            this.instanceStateNames = instanceStateNames;
            return this;
        }
        public Builder instanceStateNames(String... instanceStateNames) {
            return instanceStateNames(List.of(instanceStateNames));
        }
        @CustomType.Setter
        public Builder instanceTags(Map<String,String> instanceTags) {
            this.instanceTags = Objects.requireNonNull(instanceTags);
            return this;
        }
        @CustomType.Setter
        public Builder privateIps(List<String> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }
        @CustomType.Setter
        public Builder publicIps(List<String> publicIps) {
            this.publicIps = Objects.requireNonNull(publicIps);
            return this;
        }
        public Builder publicIps(String... publicIps) {
            return publicIps(List.of(publicIps));
        }
        public GetInstancesResult build() {
            final var o = new GetInstancesResult();
            o.filters = filters;
            o.id = id;
            o.ids = ids;
            o.instanceStateNames = instanceStateNames;
            o.instanceTags = instanceTags;
            o.privateIps = privateIps;
            o.publicIps = publicIps;
            return o;
        }
    }
}