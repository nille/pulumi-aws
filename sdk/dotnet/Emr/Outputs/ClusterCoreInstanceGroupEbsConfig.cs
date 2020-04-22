// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Emr.Outputs
{

    [OutputType]
    public sealed class ClusterCoreInstanceGroupEbsConfig
    {
        public readonly int? Iops;
        public readonly int Size;
        public readonly string Type;
        public readonly int? VolumesPerInstance;

        [OutputConstructor]
        private ClusterCoreInstanceGroupEbsConfig(
            int? iops,

            int size,

            string type,

            int? volumesPerInstance)
        {
            Iops = iops;
            Size = size;
            Type = type;
            VolumesPerInstance = volumesPerInstance;
        }
    }
}