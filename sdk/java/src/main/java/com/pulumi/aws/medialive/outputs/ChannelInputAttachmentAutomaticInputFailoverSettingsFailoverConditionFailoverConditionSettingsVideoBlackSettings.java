// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings {
    private @Nullable Double blackDetectThreshold;
    private @Nullable Integer videoBlackThresholdMsec;

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings() {}
    public Optional<Double> blackDetectThreshold() {
        return Optional.ofNullable(this.blackDetectThreshold);
    }
    public Optional<Integer> videoBlackThresholdMsec() {
        return Optional.ofNullable(this.videoBlackThresholdMsec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double blackDetectThreshold;
        private @Nullable Integer videoBlackThresholdMsec;
        public Builder() {}
        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blackDetectThreshold = defaults.blackDetectThreshold;
    	      this.videoBlackThresholdMsec = defaults.videoBlackThresholdMsec;
        }

        @CustomType.Setter
        public Builder blackDetectThreshold(@Nullable Double blackDetectThreshold) {
            this.blackDetectThreshold = blackDetectThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder videoBlackThresholdMsec(@Nullable Integer videoBlackThresholdMsec) {
            this.videoBlackThresholdMsec = videoBlackThresholdMsec;
            return this;
        }
        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings build() {
            final var o = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettings();
            o.blackDetectThreshold = blackDetectThreshold;
            o.videoBlackThresholdMsec = videoBlackThresholdMsec;
            return o;
        }
    }
}
