// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeploymentGroupTriggerConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupTriggerConfigurationArgs Empty = new DeploymentGroupTriggerConfigurationArgs();

    /**
     * The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
     * 
     */
    @Import(name="triggerEvents", required=true)
    private Output<List<String>> triggerEvents;

    /**
     * @return The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
     * 
     */
    public Output<List<String>> triggerEvents() {
        return this.triggerEvents;
    }

    /**
     * The name of the notification trigger.
     * 
     */
    @Import(name="triggerName", required=true)
    private Output<String> triggerName;

    /**
     * @return The name of the notification trigger.
     * 
     */
    public Output<String> triggerName() {
        return this.triggerName;
    }

    /**
     * The ARN of the SNS topic through which notifications are sent.
     * 
     */
    @Import(name="triggerTargetArn", required=true)
    private Output<String> triggerTargetArn;

    /**
     * @return The ARN of the SNS topic through which notifications are sent.
     * 
     */
    public Output<String> triggerTargetArn() {
        return this.triggerTargetArn;
    }

    private DeploymentGroupTriggerConfigurationArgs() {}

    private DeploymentGroupTriggerConfigurationArgs(DeploymentGroupTriggerConfigurationArgs $) {
        this.triggerEvents = $.triggerEvents;
        this.triggerName = $.triggerName;
        this.triggerTargetArn = $.triggerTargetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupTriggerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupTriggerConfigurationArgs $;

        public Builder() {
            $ = new DeploymentGroupTriggerConfigurationArgs();
        }

        public Builder(DeploymentGroupTriggerConfigurationArgs defaults) {
            $ = new DeploymentGroupTriggerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param triggerEvents The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
         * 
         * @return builder
         * 
         */
        public Builder triggerEvents(Output<List<String>> triggerEvents) {
            $.triggerEvents = triggerEvents;
            return this;
        }

        /**
         * @param triggerEvents The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
         * 
         * @return builder
         * 
         */
        public Builder triggerEvents(List<String> triggerEvents) {
            return triggerEvents(Output.of(triggerEvents));
        }

        /**
         * @param triggerEvents The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
         * 
         * @return builder
         * 
         */
        public Builder triggerEvents(String... triggerEvents) {
            return triggerEvents(List.of(triggerEvents));
        }

        /**
         * @param triggerName The name of the notification trigger.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(Output<String> triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        /**
         * @param triggerName The name of the notification trigger.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            return triggerName(Output.of(triggerName));
        }

        /**
         * @param triggerTargetArn The ARN of the SNS topic through which notifications are sent.
         * 
         * @return builder
         * 
         */
        public Builder triggerTargetArn(Output<String> triggerTargetArn) {
            $.triggerTargetArn = triggerTargetArn;
            return this;
        }

        /**
         * @param triggerTargetArn The ARN of the SNS topic through which notifications are sent.
         * 
         * @return builder
         * 
         */
        public Builder triggerTargetArn(String triggerTargetArn) {
            return triggerTargetArn(Output.of(triggerTargetArn));
        }

        public DeploymentGroupTriggerConfigurationArgs build() {
            $.triggerEvents = Objects.requireNonNull($.triggerEvents, "expected parameter 'triggerEvents' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            $.triggerTargetArn = Objects.requireNonNull($.triggerTargetArn, "expected parameter 'triggerTargetArn' to be non-null");
            return $;
        }
    }

}
