// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs Empty = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs() {}

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs();
        }

        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs defaults) {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
