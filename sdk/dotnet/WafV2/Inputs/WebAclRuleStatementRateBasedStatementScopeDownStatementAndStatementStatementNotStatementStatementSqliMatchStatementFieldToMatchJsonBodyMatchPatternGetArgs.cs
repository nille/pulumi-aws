// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("all")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllGetArgs>? All { get; set; }

        [Input("includedPaths")]
        private InputList<string>? _includedPaths;
        public InputList<string> IncludedPaths
        {
            get => _includedPaths ?? (_includedPaths = new InputList<string>());
            set => _includedPaths = value;
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs()
        {
        }
        public static new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs Empty => new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternGetArgs();
    }
}