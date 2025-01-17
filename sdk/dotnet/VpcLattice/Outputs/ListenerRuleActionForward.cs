// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VpcLattice.Outputs
{

    [OutputType]
    public sealed class ListenerRuleActionForward
    {
        /// <summary>
        /// The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions, you can assign a weight that controls the prioritization and selection of each target group. This means that requests are distributed to individual target groups based on their weights. For example, if two target groups have the same weight, each target group receives half of the traffic.
        /// </summary>
        public readonly ImmutableArray<Outputs.ListenerRuleActionForwardTargetGroup> TargetGroups;

        [OutputConstructor]
        private ListenerRuleActionForward(ImmutableArray<Outputs.ListenerRuleActionForwardTargetGroup> targetGroups)
        {
            TargetGroups = targetGroups;
        }
    }
}
