// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionVpcConfig {
    /**
     * @return List of security group IDs associated with the Lambda function.
     * 
     */
    private List<String> securityGroupIds;
    /**
     * @return List of subnet IDs associated with the Lambda function.
     * 
     */
    private List<String> subnetIds;
    private @Nullable String vpcId;

    private FunctionVpcConfig() {}
    /**
     * @return List of security group IDs associated with the Lambda function.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return List of subnet IDs associated with the Lambda function.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionVpcConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcId;
        public Builder() {}
        public Builder(FunctionVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
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
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public FunctionVpcConfig build() {
            final var o = new FunctionVpcConfig();
            o.securityGroupIds = securityGroupIds;
            o.subnetIds = subnetIds;
            o.vpcId = vpcId;
            return o;
        }
    }
}