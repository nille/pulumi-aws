// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement {
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations;

    private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement() {}
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement build() {
            final var o = new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement();
            o.fieldToMatch = fieldToMatch;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}