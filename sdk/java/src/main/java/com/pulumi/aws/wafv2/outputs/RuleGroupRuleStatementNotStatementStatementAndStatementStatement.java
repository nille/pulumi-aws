// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatement;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatement {
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatement() {}
    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;
        public Builder() {}
        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        @CustomType.Setter
        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        @CustomType.Setter
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        @CustomType.Setter
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementAndStatementStatement build() {
            final var o = new RuleGroupRuleStatementNotStatementStatementAndStatementStatement();
            o.byteMatchStatement = byteMatchStatement;
            o.geoMatchStatement = geoMatchStatement;
            o.ipSetReferenceStatement = ipSetReferenceStatement;
            o.labelMatchStatement = labelMatchStatement;
            o.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            o.sizeConstraintStatement = sizeConstraintStatement;
            o.sqliMatchStatement = sqliMatchStatement;
            o.xssMatchStatement = xssMatchStatement;
            return o;
        }
    }
}