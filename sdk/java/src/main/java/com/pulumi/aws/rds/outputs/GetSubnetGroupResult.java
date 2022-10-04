// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubnetGroupResult {
    /**
     * @return ARN for the DB subnet group.
     * 
     */
    private String arn;
    /**
     * @return Provides the description of the DB subnet group.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return Provides the status of the DB subnet group.
     * 
     */
    private String status;
    /**
     * @return Contains a list of subnet identifiers.
     * 
     */
    private List<String> subnetIds;
    /**
     * @return The network type of the DB subnet group.
     * 
     */
    private List<String> supportedNetworkTypes;
    /**
     * @return Provides the VPC ID of the DB subnet group.
     * 
     */
    private String vpcId;

    private GetSubnetGroupResult() {}
    /**
     * @return ARN for the DB subnet group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Provides the description of the DB subnet group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Provides the status of the DB subnet group.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Contains a list of subnet identifiers.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return The network type of the DB subnet group.
     * 
     */
    public List<String> supportedNetworkTypes() {
        return this.supportedNetworkTypes;
    }
    /**
     * @return Provides the VPC ID of the DB subnet group.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String name;
        private String status;
        private List<String> subnetIds;
        private List<String> supportedNetworkTypes;
        private String vpcId;
        public Builder() {}
        public Builder(GetSubnetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.subnetIds = defaults.subnetIds;
    	      this.supportedNetworkTypes = defaults.supportedNetworkTypes;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder supportedNetworkTypes(List<String> supportedNetworkTypes) {
            this.supportedNetworkTypes = Objects.requireNonNull(supportedNetworkTypes);
            return this;
        }
        public Builder supportedNetworkTypes(String... supportedNetworkTypes) {
            return supportedNetworkTypes(List.of(supportedNetworkTypes));
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetSubnetGroupResult build() {
            final var o = new GetSubnetGroupResult();
            o.arn = arn;
            o.description = description;
            o.id = id;
            o.name = name;
            o.status = status;
            o.subnetIds = subnetIds;
            o.supportedNetworkTypes = supportedNetworkTypes;
            o.vpcId = vpcId;
            return o;
        }
    }
}