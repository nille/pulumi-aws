// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class InventoryDestinationBucketEncryptionSseKmsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        public InventoryDestinationBucketEncryptionSseKmsGetArgs()
        {
        }
    }
}