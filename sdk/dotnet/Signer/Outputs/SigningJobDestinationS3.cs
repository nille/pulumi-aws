// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Signer.Outputs
{

    [OutputType]
    public sealed class SigningJobDestinationS3
    {
        /// <summary>
        /// Name of the S3 bucket.
        /// </summary>
        public readonly string Bucket;
        /// <summary>
        /// An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
        /// </summary>
        public readonly string? Prefix;

        [OutputConstructor]
        private SigningJobDestinationS3(
            string bucket,

            string? prefix)
        {
            Bucket = bucket;
            Prefix = prefix;
        }
    }
}