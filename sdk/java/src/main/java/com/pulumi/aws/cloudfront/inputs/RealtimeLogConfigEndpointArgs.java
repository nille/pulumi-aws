// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointKinesisStreamConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigEndpointArgs Empty = new RealtimeLogConfigEndpointArgs();

    /**
     * The Amazon Kinesis data stream configuration.
     * 
     */
    @Import(name="kinesisStreamConfig", required=true)
    private Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> kinesisStreamConfig;

    /**
     * @return The Amazon Kinesis data stream configuration.
     * 
     */
    public Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> kinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    /**
     * The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    @Import(name="streamType", required=true)
    private Output<String> streamType;

    /**
     * @return The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    public Output<String> streamType() {
        return this.streamType;
    }

    private RealtimeLogConfigEndpointArgs() {}

    private RealtimeLogConfigEndpointArgs(RealtimeLogConfigEndpointArgs $) {
        this.kinesisStreamConfig = $.kinesisStreamConfig;
        this.streamType = $.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RealtimeLogConfigEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealtimeLogConfigEndpointArgs $;

        public Builder() {
            $ = new RealtimeLogConfigEndpointArgs();
        }

        public Builder(RealtimeLogConfigEndpointArgs defaults) {
            $ = new RealtimeLogConfigEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kinesisStreamConfig The Amazon Kinesis data stream configuration.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStreamConfig(Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> kinesisStreamConfig) {
            $.kinesisStreamConfig = kinesisStreamConfig;
            return this;
        }

        /**
         * @param kinesisStreamConfig The Amazon Kinesis data stream configuration.
         * 
         * @return builder
         * 
         */
        public Builder kinesisStreamConfig(RealtimeLogConfigEndpointKinesisStreamConfigArgs kinesisStreamConfig) {
            return kinesisStreamConfig(Output.of(kinesisStreamConfig));
        }

        /**
         * @param streamType The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
         * 
         * @return builder
         * 
         */
        public Builder streamType(Output<String> streamType) {
            $.streamType = streamType;
            return this;
        }

        /**
         * @param streamType The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
         * 
         * @return builder
         * 
         */
        public Builder streamType(String streamType) {
            return streamType(Output.of(streamType));
        }

        public RealtimeLogConfigEndpointArgs build() {
            $.kinesisStreamConfig = Objects.requireNonNull($.kinesisStreamConfig, "expected parameter 'kinesisStreamConfig' to be non-null");
            $.streamType = Objects.requireNonNull($.streamType, "expected parameter 'streamType' to be non-null");
            return $;
        }
    }

}