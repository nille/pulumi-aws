// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent on failure.
        /// </summary>
        [Input("errorTopic")]
        public Input<string>? ErrorTopic { get; set; }

        /// <summary>
        /// Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no notification is sent on success.
        /// </summary>
        [Input("successTopic")]
        public Input<string>? SuccessTopic { get; set; }

        public EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs()
        {
        }
    }
}