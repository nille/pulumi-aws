// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationConfigurationRuleDestinationReplicationTime {
    /**
     * @return Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
     */
    private @Nullable Integer minutes;
    /**
     * @return The status of RTC. Either `Enabled` or `Disabled`.
     * 
     */
    private @Nullable String status;

    private BucketReplicationConfigurationRuleDestinationReplicationTime() {}
    /**
     * @return Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
     */
    public Optional<Integer> minutes() {
        return Optional.ofNullable(this.minutes);
    }
    /**
     * @return The status of RTC. Either `Enabled` or `Disabled`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestinationReplicationTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer minutes;
        private @Nullable String status;
        public Builder() {}
        public Builder(BucketReplicationConfigurationRuleDestinationReplicationTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = minutes;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public BucketReplicationConfigurationRuleDestinationReplicationTime build() {
            final var o = new BucketReplicationConfigurationRuleDestinationReplicationTime();
            o.minutes = minutes;
            o.status = status;
            return o;
        }
    }
}