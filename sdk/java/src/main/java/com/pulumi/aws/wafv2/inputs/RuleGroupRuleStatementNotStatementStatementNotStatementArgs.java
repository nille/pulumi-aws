// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementStatementNotStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementNotStatementArgs Empty = new RuleGroupRuleStatementNotStatementStatementNotStatementArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementArgs>> statements;

    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementArgs>> statements() {
        return this.statements;
    }

    private RuleGroupRuleStatementNotStatementStatementNotStatementArgs() {}

    private RuleGroupRuleStatementNotStatementStatementNotStatementArgs(RuleGroupRuleStatementNotStatementStatementNotStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementNotStatementStatementNotStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementNotStatementStatementNotStatementArgs();
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementArgs defaults) {
            $ = new RuleGroupRuleStatementNotStatementStatementNotStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(RuleGroupRuleStatementNotStatementStatementNotStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public RuleGroupRuleStatementNotStatementStatementNotStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}