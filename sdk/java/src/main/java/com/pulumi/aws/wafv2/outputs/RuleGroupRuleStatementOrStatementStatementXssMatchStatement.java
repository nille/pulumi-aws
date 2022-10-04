// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementXssMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatementXssMatchStatement {
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private List<RuleGroupRuleStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations;

    private RuleGroupRuleStatementOrStatementStatementXssMatchStatement() {}
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<RuleGroupRuleStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(RuleGroupRuleStatementOrStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<RuleGroupRuleStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementOrStatementStatementXssMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public RuleGroupRuleStatementOrStatementStatementXssMatchStatement build() {
            final var o = new RuleGroupRuleStatementOrStatementStatementXssMatchStatement();
            o.fieldToMatch = fieldToMatch;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}