// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs();

    /**
     * Name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs() {}

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
