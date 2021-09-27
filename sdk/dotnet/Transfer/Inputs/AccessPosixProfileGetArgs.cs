// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Transfer.Inputs
{

    public sealed class AccessPosixProfileGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The POSIX group ID used for all EFS operations by this user.
        /// </summary>
        [Input("gid", required: true)]
        public Input<int> Gid { get; set; } = null!;

        [Input("secondaryGids")]
        private InputList<int>? _secondaryGids;

        /// <summary>
        /// The secondary POSIX group IDs used for all EFS operations by this user.
        /// </summary>
        public InputList<int> SecondaryGids
        {
            get => _secondaryGids ?? (_secondaryGids = new InputList<int>());
            set => _secondaryGids = value;
        }

        /// <summary>
        /// The POSIX user ID used for all EFS operations by this user.
        /// </summary>
        [Input("uid", required: true)]
        public Input<int> Uid { get; set; } = null!;

        public AccessPosixProfileGetArgs()
        {
        }
    }
}