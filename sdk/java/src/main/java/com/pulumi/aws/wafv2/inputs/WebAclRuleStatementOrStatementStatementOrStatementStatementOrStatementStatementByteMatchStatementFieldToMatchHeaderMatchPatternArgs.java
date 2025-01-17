// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs();

    /**
     * An empty configuration block that is used for inspecting all headers.
     * 
     */
    @Import(name="all")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs> all;

    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
     * 
     */
    @Import(name="excludedHeaders")
    private @Nullable Output<List<String>> excludedHeaders;

    /**
     * @return An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
     * 
     */
    public Optional<Output<List<String>>> excludedHeaders() {
        return Optional.ofNullable(this.excludedHeaders);
    }

    /**
     * An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
     * 
     */
    @Import(name="includedHeaders")
    private @Nullable Output<List<String>> includedHeaders;

    /**
     * @return An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
     * 
     */
    public Optional<Output<List<String>>> includedHeaders() {
        return Optional.ofNullable(this.includedHeaders);
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs() {}

    private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs $) {
        this.all = $.all;
        this.excludedHeaders = $.excludedHeaders;
        this.includedHeaders = $.includedHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs all) {
            return all(Output.of(all));
        }

        /**
         * @param excludedHeaders An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder excludedHeaders(@Nullable Output<List<String>> excludedHeaders) {
            $.excludedHeaders = excludedHeaders;
            return this;
        }

        /**
         * @param excludedHeaders An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder excludedHeaders(List<String> excludedHeaders) {
            return excludedHeaders(Output.of(excludedHeaders));
        }

        /**
         * @param excludedHeaders An array of strings that will be used for inspecting headers that do not have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder excludedHeaders(String... excludedHeaders) {
            return excludedHeaders(List.of(excludedHeaders));
        }

        /**
         * @param includedHeaders An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaders(@Nullable Output<List<String>> includedHeaders) {
            $.includedHeaders = includedHeaders;
            return this;
        }

        /**
         * @param includedHeaders An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaders(List<String> includedHeaders) {
            return includedHeaders(Output.of(includedHeaders));
        }

        /**
         * @param includedHeaders An array of strings that will be used for inspecting headers that have a key that matches one of the provided values.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaders(String... includedHeaders) {
            return includedHeaders(List.of(includedHeaders));
        }

        public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs build() {
            return $;
        }
    }

}
