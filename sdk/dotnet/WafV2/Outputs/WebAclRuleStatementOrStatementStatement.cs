// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementOrStatementStatement
    {
        /// <summary>
        /// Logical rule statement used to combine other rule statements with AND logic. See `and_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatement? AndStatement;
        /// <summary>
        /// Rule statement that defines a string match search for AWS WAF to apply to web requests. See `byte_match_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementByteMatchStatement? ByteMatchStatement;
        /// <summary>
        /// Rule statement used to identify web requests based on country of origin. See `geo_match_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementGeoMatchStatement? GeoMatchStatement;
        /// <summary>
        /// Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementIpSetReferenceStatement? IpSetReferenceStatement;
        /// <summary>
        /// Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See `label_match_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementLabelMatchStatement? LabelMatchStatement;
        /// <summary>
        /// Logical rule statement used to negate the results of another rule statement. See `not_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementNotStatement? NotStatement;
        /// <summary>
        /// Logical rule statement used to combine other rule statements with OR logic. See `or_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementOrStatement? OrStatement;
        /// <summary>
        /// Rule statement used to search web request components for a match against a single regular expression. See `regex_match_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementRegexMatchStatement? RegexMatchStatement;
        /// <summary>
        /// Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatement? RegexPatternSetReferenceStatement;
        /// <summary>
        /// Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See `size_constraint_statement` below for more details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementSizeConstraintStatement? SizeConstraintStatement;
        /// <summary>
        /// An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See `sqli_match_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementSqliMatchStatement? SqliMatchStatement;
        /// <summary>
        /// Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See `xss_match_statement` below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementXssMatchStatement? XssMatchStatement;

        [OutputConstructor]
        private WebAclRuleStatementOrStatementStatement(
            Outputs.WebAclRuleStatementOrStatementStatementAndStatement? andStatement,

            Outputs.WebAclRuleStatementOrStatementStatementByteMatchStatement? byteMatchStatement,

            Outputs.WebAclRuleStatementOrStatementStatementGeoMatchStatement? geoMatchStatement,

            Outputs.WebAclRuleStatementOrStatementStatementIpSetReferenceStatement? ipSetReferenceStatement,

            Outputs.WebAclRuleStatementOrStatementStatementLabelMatchStatement? labelMatchStatement,

            Outputs.WebAclRuleStatementOrStatementStatementNotStatement? notStatement,

            Outputs.WebAclRuleStatementOrStatementStatementOrStatement? orStatement,

            Outputs.WebAclRuleStatementOrStatementStatementRegexMatchStatement? regexMatchStatement,

            Outputs.WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatement? regexPatternSetReferenceStatement,

            Outputs.WebAclRuleStatementOrStatementStatementSizeConstraintStatement? sizeConstraintStatement,

            Outputs.WebAclRuleStatementOrStatementStatementSqliMatchStatement? sqliMatchStatement,

            Outputs.WebAclRuleStatementOrStatementStatementXssMatchStatement? xssMatchStatement)
        {
            AndStatement = andStatement;
            ByteMatchStatement = byteMatchStatement;
            GeoMatchStatement = geoMatchStatement;
            IpSetReferenceStatement = ipSetReferenceStatement;
            LabelMatchStatement = labelMatchStatement;
            NotStatement = notStatement;
            OrStatement = orStatement;
            RegexMatchStatement = regexMatchStatement;
            RegexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            SizeConstraintStatement = sizeConstraintStatement;
            SqliMatchStatement = sqliMatchStatement;
            XssMatchStatement = xssMatchStatement;
        }
    }
}
