// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetLaunchTemplateConfigLaunchTemplateSpecification {
    /**
     * @return ID of the launch template.
     * 
     */
    private @Nullable String launchTemplateId;
    /**
     * @return Name of the launch template.
     * 
     */
    private @Nullable String launchTemplateName;
    /**
     * @return Version number of the launch template.
     * 
     */
    private String version;

    private FleetLaunchTemplateConfigLaunchTemplateSpecification() {}
    /**
     * @return ID of the launch template.
     * 
     */
    public Optional<String> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    /**
     * @return Name of the launch template.
     * 
     */
    public Optional<String> launchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    /**
     * @return Version number of the launch template.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigLaunchTemplateSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private String version;
        public Builder() {}
        public Builder(FleetLaunchTemplateConfigLaunchTemplateSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public FleetLaunchTemplateConfigLaunchTemplateSpecification build() {
            final var o = new FleetLaunchTemplateConfigLaunchTemplateSpecification();
            o.launchTemplateId = launchTemplateId;
            o.launchTemplateName = launchTemplateName;
            o.version = version;
            return o;
        }
    }
}