// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * @return Inspect the request cookies.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    private RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the request cookies.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies cookies;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody jsonBody;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.cookies = defaults.cookies;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch build() {
            final var o = new RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch();
            o.allQueryArguments = allQueryArguments;
            o.body = body;
            o.cookies = cookies;
            o.jsonBody = jsonBody;
            o.method = method;
            o.queryString = queryString;
            o.singleHeader = singleHeader;
            o.singleQueryArgument = singleQueryArgument;
            o.uriPath = uriPath;
            return o;
        }
    }
}