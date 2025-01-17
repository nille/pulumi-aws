// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sqs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedrivePolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RedrivePolicyState Empty = new RedrivePolicyState();

    /**
     * The URL of the SQS Queue to which to attach the policy
     * 
     */
    @Import(name="queueUrl")
    private @Nullable Output<String> queueUrl;

    /**
     * @return The URL of the SQS Queue to which to attach the policy
     * 
     */
    public Optional<Output<String>> queueUrl() {
        return Optional.ofNullable(this.queueUrl);
    }

    /**
     * The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
     * 
     */
    @Import(name="redrivePolicy")
    private @Nullable Output<String> redrivePolicy;

    /**
     * @return The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
     * 
     */
    public Optional<Output<String>> redrivePolicy() {
        return Optional.ofNullable(this.redrivePolicy);
    }

    private RedrivePolicyState() {}

    private RedrivePolicyState(RedrivePolicyState $) {
        this.queueUrl = $.queueUrl;
        this.redrivePolicy = $.redrivePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedrivePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedrivePolicyState $;

        public Builder() {
            $ = new RedrivePolicyState();
        }

        public Builder(RedrivePolicyState defaults) {
            $ = new RedrivePolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param queueUrl The URL of the SQS Queue to which to attach the policy
         * 
         * @return builder
         * 
         */
        public Builder queueUrl(@Nullable Output<String> queueUrl) {
            $.queueUrl = queueUrl;
            return this;
        }

        /**
         * @param queueUrl The URL of the SQS Queue to which to attach the policy
         * 
         * @return builder
         * 
         */
        public Builder queueUrl(String queueUrl) {
            return queueUrl(Output.of(queueUrl));
        }

        /**
         * @param redrivePolicy The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
         * 
         * @return builder
         * 
         */
        public Builder redrivePolicy(@Nullable Output<String> redrivePolicy) {
            $.redrivePolicy = redrivePolicy;
            return this;
        }

        /**
         * @param redrivePolicy The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
         * 
         * @return builder
         * 
         */
        public Builder redrivePolicy(String redrivePolicy) {
            return redrivePolicy(Output.of(redrivePolicy));
        }

        public RedrivePolicyState build() {
            return $;
        }
    }

}
