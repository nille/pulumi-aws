// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs;
import com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultSecurityGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityGroupArgs Empty = new DefaultSecurityGroupArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="egress")
    private @Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<List<DefaultSecurityGroupEgressArgs>>> egress() {
        return Optional.ofNullable(this.egress);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="ingress")
    private @Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<List<DefaultSecurityGroupIngressArgs>>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    @Import(name="revokeRulesOnDelete")
    private @Nullable Output<Boolean> revokeRulesOnDelete;

    public Optional<Output<Boolean>> revokeRulesOnDelete() {
        return Optional.ofNullable(this.revokeRulesOnDelete);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private DefaultSecurityGroupArgs() {}

    private DefaultSecurityGroupArgs(DefaultSecurityGroupArgs $) {
        this.egress = $.egress;
        this.ingress = $.ingress;
        this.revokeRulesOnDelete = $.revokeRulesOnDelete;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultSecurityGroupArgs $;

        public Builder() {
            $ = new DefaultSecurityGroupArgs();
        }

        public Builder(DefaultSecurityGroupArgs defaults) {
            $ = new DefaultSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param egress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder egress(@Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress) {
            $.egress = egress;
            return this;
        }

        /**
         * @param egress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder egress(List<DefaultSecurityGroupEgressArgs> egress) {
            return egress(Output.of(egress));
        }

        /**
         * @param egress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder egress(DefaultSecurityGroupEgressArgs... egress) {
            return egress(List.of(egress));
        }

        /**
         * @param ingress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ingress(@Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress) {
            $.ingress = ingress;
            return this;
        }

        /**
         * @param ingress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ingress(List<DefaultSecurityGroupIngressArgs> ingress) {
            return ingress(Output.of(ingress));
        }

        /**
         * @param ingress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ingress(DefaultSecurityGroupIngressArgs... ingress) {
            return ingress(List.of(ingress));
        }

        public Builder revokeRulesOnDelete(@Nullable Output<Boolean> revokeRulesOnDelete) {
            $.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }

        public Builder revokeRulesOnDelete(Boolean revokeRulesOnDelete) {
            return revokeRulesOnDelete(Output.of(revokeRulesOnDelete));
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public DefaultSecurityGroupArgs build() {
            return $;
        }
    }

}