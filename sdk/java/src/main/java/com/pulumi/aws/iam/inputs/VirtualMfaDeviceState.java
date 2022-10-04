// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMfaDeviceState extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMfaDeviceState Empty = new VirtualMfaDeviceState();

    /**
     * The Amazon Resource Name (ARN) specifying the virtual mfa device.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the virtual mfa device.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base_32_string_seed` is base64-encoded.
     * 
     */
    @Import(name="base32StringSeed")
    private @Nullable Output<String> base32StringSeed;

    /**
     * @return The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base_32_string_seed` is base64-encoded.
     * 
     */
    public Optional<Output<String>> base32StringSeed() {
        return Optional.ofNullable(this.base32StringSeed);
    }

    /**
     * The path for the virtual MFA device.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path for the virtual MFA device.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format.
     * 
     */
    @Import(name="qrCodePng")
    private @Nullable Output<String> qrCodePng;

    /**
     * @return A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format.
     * 
     */
    public Optional<Output<String>> qrCodePng() {
        return Optional.ofNullable(this.qrCodePng);
    }

    /**
     * Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * 
     */
    @Import(name="virtualMfaDeviceName")
    private @Nullable Output<String> virtualMfaDeviceName;

    /**
     * @return The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * 
     */
    public Optional<Output<String>> virtualMfaDeviceName() {
        return Optional.ofNullable(this.virtualMfaDeviceName);
    }

    private VirtualMfaDeviceState() {}

    private VirtualMfaDeviceState(VirtualMfaDeviceState $) {
        this.arn = $.arn;
        this.base32StringSeed = $.base32StringSeed;
        this.path = $.path;
        this.qrCodePng = $.qrCodePng;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.virtualMfaDeviceName = $.virtualMfaDeviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMfaDeviceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMfaDeviceState $;

        public Builder() {
            $ = new VirtualMfaDeviceState();
        }

        public Builder(VirtualMfaDeviceState defaults) {
            $ = new VirtualMfaDeviceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) specifying the virtual mfa device.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) specifying the virtual mfa device.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param base32StringSeed The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base_32_string_seed` is base64-encoded.
         * 
         * @return builder
         * 
         */
        public Builder base32StringSeed(@Nullable Output<String> base32StringSeed) {
            $.base32StringSeed = base32StringSeed;
            return this;
        }

        /**
         * @param base32StringSeed The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base_32_string_seed` is base64-encoded.
         * 
         * @return builder
         * 
         */
        public Builder base32StringSeed(String base32StringSeed) {
            return base32StringSeed(Output.of(base32StringSeed));
        }

        /**
         * @param path The path for the virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path for the virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param qrCodePng A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format.
         * 
         * @return builder
         * 
         */
        public Builder qrCodePng(@Nullable Output<String> qrCodePng) {
            $.qrCodePng = qrCodePng;
            return this;
        }

        /**
         * @param qrCodePng A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format.
         * 
         * @return builder
         * 
         */
        public Builder qrCodePng(String qrCodePng) {
            return qrCodePng(Output.of(qrCodePng));
        }

        /**
         * @param tags Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
         * @param virtualMfaDeviceName The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder virtualMfaDeviceName(@Nullable Output<String> virtualMfaDeviceName) {
            $.virtualMfaDeviceName = virtualMfaDeviceName;
            return this;
        }

        /**
         * @param virtualMfaDeviceName The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder virtualMfaDeviceName(String virtualMfaDeviceName) {
            return virtualMfaDeviceName(Output.of(virtualMfaDeviceName));
        }

        public VirtualMfaDeviceState build() {
            return $;
        }
    }

}