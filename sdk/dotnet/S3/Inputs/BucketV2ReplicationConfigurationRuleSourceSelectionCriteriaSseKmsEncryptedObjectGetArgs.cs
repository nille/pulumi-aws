// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean which indicates if this criteria is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectGetArgs()
        {
        }
    }
}