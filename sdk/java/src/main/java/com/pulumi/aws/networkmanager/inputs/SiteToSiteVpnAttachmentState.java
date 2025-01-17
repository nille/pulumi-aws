// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SiteToSiteVpnAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final SiteToSiteVpnAttachmentState Empty = new SiteToSiteVpnAttachmentState();

    /**
     * The ARN of the attachment.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the attachment.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The policy rule number associated with the attachment.
     * 
     */
    @Import(name="attachmentPolicyRuleNumber")
    private @Nullable Output<Integer> attachmentPolicyRuleNumber;

    /**
     * @return The policy rule number associated with the attachment.
     * 
     */
    public Optional<Output<Integer>> attachmentPolicyRuleNumber() {
        return Optional.ofNullable(this.attachmentPolicyRuleNumber);
    }

    /**
     * The type of attachment.
     * 
     */
    @Import(name="attachmentType")
    private @Nullable Output<String> attachmentType;

    /**
     * @return The type of attachment.
     * 
     */
    public Optional<Output<String>> attachmentType() {
        return Optional.ofNullable(this.attachmentType);
    }

    /**
     * The ARN of a core network.
     * 
     */
    @Import(name="coreNetworkArn")
    private @Nullable Output<String> coreNetworkArn;

    /**
     * @return The ARN of a core network.
     * 
     */
    public Optional<Output<String>> coreNetworkArn() {
        return Optional.ofNullable(this.coreNetworkArn);
    }

    /**
     * The ID of a core network for the VPN attachment.
     * 
     */
    @Import(name="coreNetworkId")
    private @Nullable Output<String> coreNetworkId;

    /**
     * @return The ID of a core network for the VPN attachment.
     * 
     */
    public Optional<Output<String>> coreNetworkId() {
        return Optional.ofNullable(this.coreNetworkId);
    }

    /**
     * The Region where the edge is located.
     * 
     */
    @Import(name="edgeLocation")
    private @Nullable Output<String> edgeLocation;

    /**
     * @return The Region where the edge is located.
     * 
     */
    public Optional<Output<String>> edgeLocation() {
        return Optional.ofNullable(this.edgeLocation);
    }

    /**
     * The ID of the attachment account owner.
     * 
     */
    @Import(name="ownerAccountId")
    private @Nullable Output<String> ownerAccountId;

    /**
     * @return The ID of the attachment account owner.
     * 
     */
    public Optional<Output<String>> ownerAccountId() {
        return Optional.ofNullable(this.ownerAccountId);
    }

    /**
     * The attachment resource ARN.
     * 
     */
    @Import(name="resourceArn")
    private @Nullable Output<String> resourceArn;

    /**
     * @return The attachment resource ARN.
     * 
     */
    public Optional<Output<String>> resourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    /**
     * The name of the segment attachment.
     * 
     */
    @Import(name="segmentName")
    private @Nullable Output<String> segmentName;

    /**
     * @return The name of the segment attachment.
     * 
     */
    public Optional<Output<String>> segmentName() {
        return Optional.ofNullable(this.segmentName);
    }

    /**
     * The state of the attachment.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the attachment.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The ARN of the site-to-site VPN connection.
     * 
     */
    @Import(name="vpnConnectionArn")
    private @Nullable Output<String> vpnConnectionArn;

    /**
     * @return The ARN of the site-to-site VPN connection.
     * 
     */
    public Optional<Output<String>> vpnConnectionArn() {
        return Optional.ofNullable(this.vpnConnectionArn);
    }

    private SiteToSiteVpnAttachmentState() {}

    private SiteToSiteVpnAttachmentState(SiteToSiteVpnAttachmentState $) {
        this.arn = $.arn;
        this.attachmentPolicyRuleNumber = $.attachmentPolicyRuleNumber;
        this.attachmentType = $.attachmentType;
        this.coreNetworkArn = $.coreNetworkArn;
        this.coreNetworkId = $.coreNetworkId;
        this.edgeLocation = $.edgeLocation;
        this.ownerAccountId = $.ownerAccountId;
        this.resourceArn = $.resourceArn;
        this.segmentName = $.segmentName;
        this.state = $.state;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpnConnectionArn = $.vpnConnectionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteToSiteVpnAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteToSiteVpnAttachmentState $;

        public Builder() {
            $ = new SiteToSiteVpnAttachmentState();
        }

        public Builder(SiteToSiteVpnAttachmentState defaults) {
            $ = new SiteToSiteVpnAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the attachment.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the attachment.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param attachmentPolicyRuleNumber The policy rule number associated with the attachment.
         * 
         * @return builder
         * 
         */
        public Builder attachmentPolicyRuleNumber(@Nullable Output<Integer> attachmentPolicyRuleNumber) {
            $.attachmentPolicyRuleNumber = attachmentPolicyRuleNumber;
            return this;
        }

        /**
         * @param attachmentPolicyRuleNumber The policy rule number associated with the attachment.
         * 
         * @return builder
         * 
         */
        public Builder attachmentPolicyRuleNumber(Integer attachmentPolicyRuleNumber) {
            return attachmentPolicyRuleNumber(Output.of(attachmentPolicyRuleNumber));
        }

        /**
         * @param attachmentType The type of attachment.
         * 
         * @return builder
         * 
         */
        public Builder attachmentType(@Nullable Output<String> attachmentType) {
            $.attachmentType = attachmentType;
            return this;
        }

        /**
         * @param attachmentType The type of attachment.
         * 
         * @return builder
         * 
         */
        public Builder attachmentType(String attachmentType) {
            return attachmentType(Output.of(attachmentType));
        }

        /**
         * @param coreNetworkArn The ARN of a core network.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkArn(@Nullable Output<String> coreNetworkArn) {
            $.coreNetworkArn = coreNetworkArn;
            return this;
        }

        /**
         * @param coreNetworkArn The ARN of a core network.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkArn(String coreNetworkArn) {
            return coreNetworkArn(Output.of(coreNetworkArn));
        }

        /**
         * @param coreNetworkId The ID of a core network for the VPN attachment.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkId(@Nullable Output<String> coreNetworkId) {
            $.coreNetworkId = coreNetworkId;
            return this;
        }

        /**
         * @param coreNetworkId The ID of a core network for the VPN attachment.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkId(String coreNetworkId) {
            return coreNetworkId(Output.of(coreNetworkId));
        }

        /**
         * @param edgeLocation The Region where the edge is located.
         * 
         * @return builder
         * 
         */
        public Builder edgeLocation(@Nullable Output<String> edgeLocation) {
            $.edgeLocation = edgeLocation;
            return this;
        }

        /**
         * @param edgeLocation The Region where the edge is located.
         * 
         * @return builder
         * 
         */
        public Builder edgeLocation(String edgeLocation) {
            return edgeLocation(Output.of(edgeLocation));
        }

        /**
         * @param ownerAccountId The ID of the attachment account owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerAccountId(@Nullable Output<String> ownerAccountId) {
            $.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * @param ownerAccountId The ID of the attachment account owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerAccountId(String ownerAccountId) {
            return ownerAccountId(Output.of(ownerAccountId));
        }

        /**
         * @param resourceArn The attachment resource ARN.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The attachment resource ARN.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        /**
         * @param segmentName The name of the segment attachment.
         * 
         * @return builder
         * 
         */
        public Builder segmentName(@Nullable Output<String> segmentName) {
            $.segmentName = segmentName;
            return this;
        }

        /**
         * @param segmentName The name of the segment attachment.
         * 
         * @return builder
         * 
         */
        public Builder segmentName(String segmentName) {
            return segmentName(Output.of(segmentName));
        }

        /**
         * @param state The state of the attachment.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the attachment.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpnConnectionArn The ARN of the site-to-site VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionArn(@Nullable Output<String> vpnConnectionArn) {
            $.vpnConnectionArn = vpnConnectionArn;
            return this;
        }

        /**
         * @param vpnConnectionArn The ARN of the site-to-site VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionArn(String vpnConnectionArn) {
            return vpnConnectionArn(Output.of(vpnConnectionArn));
        }

        public SiteToSiteVpnAttachmentState build() {
            return $;
        }
    }

}
