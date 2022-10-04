// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.ImageRecipeBlockDeviceMappingEbs;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageRecipeBlockDeviceMapping {
    /**
     * @return Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    private @Nullable String deviceName;
    /**
     * @return Configuration block with Elastic Block Storage (EBS) block device mapping settings. Detailed below.
     * 
     */
    private @Nullable ImageRecipeBlockDeviceMappingEbs ebs;
    /**
     * @return Set to `true` to remove a mapping from the parent image.
     * 
     */
    private @Nullable Boolean noDevice;
    /**
     * @return Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    private @Nullable String virtualName;

    private ImageRecipeBlockDeviceMapping() {}
    /**
     * @return Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Configuration block with Elastic Block Storage (EBS) block device mapping settings. Detailed below.
     * 
     */
    public Optional<ImageRecipeBlockDeviceMappingEbs> ebs() {
        return Optional.ofNullable(this.ebs);
    }
    /**
     * @return Set to `true` to remove a mapping from the parent image.
     * 
     */
    public Optional<Boolean> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * @return Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    public Optional<String> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable ImageRecipeBlockDeviceMappingEbs ebs;
        private @Nullable Boolean noDevice;
        private @Nullable String virtualName;
        public Builder() {}
        public Builder(ImageRecipeBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        @CustomType.Setter
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder ebs(@Nullable ImageRecipeBlockDeviceMappingEbs ebs) {
            this.ebs = ebs;
            return this;
        }
        @CustomType.Setter
        public Builder noDevice(@Nullable Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        @CustomType.Setter
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public ImageRecipeBlockDeviceMapping build() {
            final var o = new ImageRecipeBlockDeviceMapping();
            o.deviceName = deviceName;
            o.ebs = ebs;
            o.noDevice = noDevice;
            o.virtualName = virtualName;
            return o;
        }
    }
}