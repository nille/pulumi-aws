// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleScope {
    /**
     * @return The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `compliance_resource_types`.
     * 
     */
    private @Nullable String complianceResourceId;
    /**
     * @return A list of resource types of only those AWS resources that you want to trigger an evaluation for the ruleE.g., `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `compliance_resource_id`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
     * 
     */
    private @Nullable List<String> complianceResourceTypes;
    /**
     * @return The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
     * 
     */
    private @Nullable String tagKey;
    /**
     * @return The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
     * 
     */
    private @Nullable String tagValue;

    private RuleScope() {}
    /**
     * @return The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `compliance_resource_types`.
     * 
     */
    public Optional<String> complianceResourceId() {
        return Optional.ofNullable(this.complianceResourceId);
    }
    /**
     * @return A list of resource types of only those AWS resources that you want to trigger an evaluation for the ruleE.g., `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `compliance_resource_id`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
     * 
     */
    public List<String> complianceResourceTypes() {
        return this.complianceResourceTypes == null ? List.of() : this.complianceResourceTypes;
    }
    /**
     * @return The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
     * 
     */
    public Optional<String> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }
    /**
     * @return The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
     * 
     */
    public Optional<String> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String complianceResourceId;
        private @Nullable List<String> complianceResourceTypes;
        private @Nullable String tagKey;
        private @Nullable String tagValue;
        public Builder() {}
        public Builder(RuleScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceId = defaults.complianceResourceId;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        @CustomType.Setter
        public Builder complianceResourceId(@Nullable String complianceResourceId) {
            this.complianceResourceId = complianceResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder complianceResourceTypes(@Nullable List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public Builder complianceResourceTypes(String... complianceResourceTypes) {
            return complianceResourceTypes(List.of(complianceResourceTypes));
        }
        @CustomType.Setter
        public Builder tagKey(@Nullable String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        @CustomType.Setter
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public RuleScope build() {
            final var o = new RuleScope();
            o.complianceResourceId = complianceResourceId;
            o.complianceResourceTypes = complianceResourceTypes;
            o.tagKey = tagKey;
            o.tagValue = tagValue;
            return o;
        }
    }
}