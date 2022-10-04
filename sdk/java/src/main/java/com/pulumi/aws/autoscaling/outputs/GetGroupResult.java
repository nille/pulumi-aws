// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.GetGroupLaunchTemplate;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return ARN of the Auto Scaling group.
     * 
     */
    private String arn;
    /**
     * @return One or more Availability Zones for the group.
     * 
     */
    private List<String> availabilityZones;
    private Integer defaultCooldown;
    /**
     * @return Desired size of the group.
     * 
     */
    private Integer desiredCapacity;
    /**
     * @return List of metrics enabled for collection.
     * 
     */
    private List<String> enabledMetrics;
    /**
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
     * 
     */
    private Integer healthCheckGracePeriod;
    /**
     * @return Service to use for the health checks. The valid values are EC2 and ELB.
     * 
     */
    private String healthCheckType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the associated launch configuration.
     * 
     */
    private String launchConfiguration;
    private List<GetGroupLaunchTemplate> launchTemplates;
    /**
     * @return One or more load balancers associated with the group.
     * 
     */
    private List<String> loadBalancers;
    /**
     * @return Maximum size of the group.
     * 
     */
    private Integer maxSize;
    /**
     * @return Minimum size of the group.
     * 
     */
    private Integer minSize;
    /**
     * @return Name of the Auto Scaling Group.
     * 
     */
    private String name;
    private Boolean newInstancesProtectedFromScaleIn;
    /**
     * @return Name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    private String placementGroup;
    /**
     * @return ARN of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
     * 
     */
    private String serviceLinkedRoleArn;
    /**
     * @return Current state of the group when DeleteAutoScalingGroup is in progress.
     * 
     */
    private String status;
    /**
     * @return ARNs of the target groups for your load balancer.
     * 
     */
    private List<String> targetGroupArns;
    /**
     * @return The termination policies for the group.
     * 
     */
    private List<String> terminationPolicies;
    /**
     * @return VPC ID for the group.
     * 
     */
    private String vpcZoneIdentifier;

    private GetGroupResult() {}
    /**
     * @return ARN of the Auto Scaling group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return One or more Availability Zones for the group.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    public Integer defaultCooldown() {
        return this.defaultCooldown;
    }
    /**
     * @return Desired size of the group.
     * 
     */
    public Integer desiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * @return List of metrics enabled for collection.
     * 
     */
    public List<String> enabledMetrics() {
        return this.enabledMetrics;
    }
    /**
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
     * 
     */
    public Integer healthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }
    /**
     * @return Service to use for the health checks. The valid values are EC2 and ELB.
     * 
     */
    public String healthCheckType() {
        return this.healthCheckType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the associated launch configuration.
     * 
     */
    public String launchConfiguration() {
        return this.launchConfiguration;
    }
    public List<GetGroupLaunchTemplate> launchTemplates() {
        return this.launchTemplates;
    }
    /**
     * @return One or more load balancers associated with the group.
     * 
     */
    public List<String> loadBalancers() {
        return this.loadBalancers;
    }
    /**
     * @return Maximum size of the group.
     * 
     */
    public Integer maxSize() {
        return this.maxSize;
    }
    /**
     * @return Minimum size of the group.
     * 
     */
    public Integer minSize() {
        return this.minSize;
    }
    /**
     * @return Name of the Auto Scaling Group.
     * 
     */
    public String name() {
        return this.name;
    }
    public Boolean newInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }
    /**
     * @return Name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    public String placementGroup() {
        return this.placementGroup;
    }
    /**
     * @return ARN of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
     * 
     */
    public String serviceLinkedRoleArn() {
        return this.serviceLinkedRoleArn;
    }
    /**
     * @return Current state of the group when DeleteAutoScalingGroup is in progress.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return ARNs of the target groups for your load balancer.
     * 
     */
    public List<String> targetGroupArns() {
        return this.targetGroupArns;
    }
    /**
     * @return The termination policies for the group.
     * 
     */
    public List<String> terminationPolicies() {
        return this.terminationPolicies;
    }
    /**
     * @return VPC ID for the group.
     * 
     */
    public String vpcZoneIdentifier() {
        return this.vpcZoneIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<String> availabilityZones;
        private Integer defaultCooldown;
        private Integer desiredCapacity;
        private List<String> enabledMetrics;
        private Integer healthCheckGracePeriod;
        private String healthCheckType;
        private String id;
        private String launchConfiguration;
        private List<GetGroupLaunchTemplate> launchTemplates;
        private List<String> loadBalancers;
        private Integer maxSize;
        private Integer minSize;
        private String name;
        private Boolean newInstancesProtectedFromScaleIn;
        private String placementGroup;
        private String serviceLinkedRoleArn;
        private String status;
        private List<String> targetGroupArns;
        private List<String> terminationPolicies;
        private String vpcZoneIdentifier;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.defaultCooldown = defaults.defaultCooldown;
    	      this.desiredCapacity = defaults.desiredCapacity;
    	      this.enabledMetrics = defaults.enabledMetrics;
    	      this.healthCheckGracePeriod = defaults.healthCheckGracePeriod;
    	      this.healthCheckType = defaults.healthCheckType;
    	      this.id = defaults.id;
    	      this.launchConfiguration = defaults.launchConfiguration;
    	      this.launchTemplates = defaults.launchTemplates;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
    	      this.name = defaults.name;
    	      this.newInstancesProtectedFromScaleIn = defaults.newInstancesProtectedFromScaleIn;
    	      this.placementGroup = defaults.placementGroup;
    	      this.serviceLinkedRoleArn = defaults.serviceLinkedRoleArn;
    	      this.status = defaults.status;
    	      this.targetGroupArns = defaults.targetGroupArns;
    	      this.terminationPolicies = defaults.terminationPolicies;
    	      this.vpcZoneIdentifier = defaults.vpcZoneIdentifier;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.defaultCooldown = Objects.requireNonNull(defaultCooldown);
            return this;
        }
        @CustomType.Setter
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = Objects.requireNonNull(desiredCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder enabledMetrics(List<String> enabledMetrics) {
            this.enabledMetrics = Objects.requireNonNull(enabledMetrics);
            return this;
        }
        public Builder enabledMetrics(String... enabledMetrics) {
            return enabledMetrics(List.of(enabledMetrics));
        }
        @CustomType.Setter
        public Builder healthCheckGracePeriod(Integer healthCheckGracePeriod) {
            this.healthCheckGracePeriod = Objects.requireNonNull(healthCheckGracePeriod);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckType(String healthCheckType) {
            this.healthCheckType = Objects.requireNonNull(healthCheckType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder launchConfiguration(String launchConfiguration) {
            this.launchConfiguration = Objects.requireNonNull(launchConfiguration);
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplates(List<GetGroupLaunchTemplate> launchTemplates) {
            this.launchTemplates = Objects.requireNonNull(launchTemplates);
            return this;
        }
        public Builder launchTemplates(GetGroupLaunchTemplate... launchTemplates) {
            return launchTemplates(List.of(launchTemplates));
        }
        @CustomType.Setter
        public Builder loadBalancers(List<String> loadBalancers) {
            this.loadBalancers = Objects.requireNonNull(loadBalancers);
            return this;
        }
        public Builder loadBalancers(String... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        @CustomType.Setter
        public Builder maxSize(Integer maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }
        @CustomType.Setter
        public Builder minSize(Integer minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder newInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
            this.newInstancesProtectedFromScaleIn = Objects.requireNonNull(newInstancesProtectedFromScaleIn);
            return this;
        }
        @CustomType.Setter
        public Builder placementGroup(String placementGroup) {
            this.placementGroup = Objects.requireNonNull(placementGroup);
            return this;
        }
        @CustomType.Setter
        public Builder serviceLinkedRoleArn(String serviceLinkedRoleArn) {
            this.serviceLinkedRoleArn = Objects.requireNonNull(serviceLinkedRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder targetGroupArns(List<String> targetGroupArns) {
            this.targetGroupArns = Objects.requireNonNull(targetGroupArns);
            return this;
        }
        public Builder targetGroupArns(String... targetGroupArns) {
            return targetGroupArns(List.of(targetGroupArns));
        }
        @CustomType.Setter
        public Builder terminationPolicies(List<String> terminationPolicies) {
            this.terminationPolicies = Objects.requireNonNull(terminationPolicies);
            return this;
        }
        public Builder terminationPolicies(String... terminationPolicies) {
            return terminationPolicies(List.of(terminationPolicies));
        }
        @CustomType.Setter
        public Builder vpcZoneIdentifier(String vpcZoneIdentifier) {
            this.vpcZoneIdentifier = Objects.requireNonNull(vpcZoneIdentifier);
            return this;
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.arn = arn;
            o.availabilityZones = availabilityZones;
            o.defaultCooldown = defaultCooldown;
            o.desiredCapacity = desiredCapacity;
            o.enabledMetrics = enabledMetrics;
            o.healthCheckGracePeriod = healthCheckGracePeriod;
            o.healthCheckType = healthCheckType;
            o.id = id;
            o.launchConfiguration = launchConfiguration;
            o.launchTemplates = launchTemplates;
            o.loadBalancers = loadBalancers;
            o.maxSize = maxSize;
            o.minSize = minSize;
            o.name = name;
            o.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
            o.placementGroup = placementGroup;
            o.serviceLinkedRoleArn = serviceLinkedRoleArn;
            o.status = status;
            o.targetGroupArns = targetGroupArns;
            o.terminationPolicies = terminationPolicies;
            o.vpcZoneIdentifier = vpcZoneIdentifier;
            return o;
        }
    }
}