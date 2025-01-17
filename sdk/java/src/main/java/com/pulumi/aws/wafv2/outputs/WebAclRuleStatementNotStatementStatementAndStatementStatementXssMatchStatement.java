// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement {
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See `text_transformation` below for details.
     * 
     */
    private List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;

    private WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement() {}
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See `text_transformation` below for details.
     * 
     */
    public List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement build() {
            final var o = new WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatement();
            o.fieldToMatch = fieldToMatch;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}
