// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowLogDestinationOptions {
    /**
     * @return The format for the flow log. Default value: `plain-text`. Valid values: `plain-text`, `parquet`.
     * 
     */
    private @Nullable String fileFormat;
    /**
     * @return Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3. Default value: `false`.
     * 
     */
    private @Nullable Boolean hiveCompatiblePartitions;
    /**
     * @return Indicates whether to partition the flow log per hour. This reduces the cost and response time for queries. Default value: `false`.
     * 
     */
    private @Nullable Boolean perHourPartition;

    private FlowLogDestinationOptions() {}
    /**
     * @return The format for the flow log. Default value: `plain-text`. Valid values: `plain-text`, `parquet`.
     * 
     */
    public Optional<String> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }
    /**
     * @return Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3. Default value: `false`.
     * 
     */
    public Optional<Boolean> hiveCompatiblePartitions() {
        return Optional.ofNullable(this.hiveCompatiblePartitions);
    }
    /**
     * @return Indicates whether to partition the flow log per hour. This reduces the cost and response time for queries. Default value: `false`.
     * 
     */
    public Optional<Boolean> perHourPartition() {
        return Optional.ofNullable(this.perHourPartition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogDestinationOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fileFormat;
        private @Nullable Boolean hiveCompatiblePartitions;
        private @Nullable Boolean perHourPartition;
        public Builder() {}
        public Builder(FlowLogDestinationOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileFormat = defaults.fileFormat;
    	      this.hiveCompatiblePartitions = defaults.hiveCompatiblePartitions;
    	      this.perHourPartition = defaults.perHourPartition;
        }

        @CustomType.Setter
        public Builder fileFormat(@Nullable String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        @CustomType.Setter
        public Builder hiveCompatiblePartitions(@Nullable Boolean hiveCompatiblePartitions) {
            this.hiveCompatiblePartitions = hiveCompatiblePartitions;
            return this;
        }
        @CustomType.Setter
        public Builder perHourPartition(@Nullable Boolean perHourPartition) {
            this.perHourPartition = perHourPartition;
            return this;
        }
        public FlowLogDestinationOptions build() {
            final var o = new FlowLogDestinationOptions();
            o.fileFormat = fileFormat;
            o.hiveCompatiblePartitions = hiveCompatiblePartitions;
            o.perHourPartition = perHourPartition;
            return o;
        }
    }
}