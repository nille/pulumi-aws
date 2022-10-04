// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionPlainArgs Empty = new GetFunctionPlainArgs();

    /**
     * Name of the lambda function.
     * 
     */
    @Import(name="functionName", required=true)
    private String functionName;

    /**
     * @return Name of the lambda function.
     * 
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Alias name or version number of the lambda functionE.g., `$LATEST`, `my-alias`, or `1`. When not included: the data source resolves to the most recent published version; if no published version exists: it resolves to the most recent unpublished version.
     * 
     */
    @Import(name="qualifier")
    private @Nullable String qualifier;

    /**
     * @return Alias name or version number of the lambda functionE.g., `$LATEST`, `my-alias`, or `1`. When not included: the data source resolves to the most recent published version; if no published version exists: it resolves to the most recent unpublished version.
     * 
     */
    public Optional<String> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetFunctionPlainArgs() {}

    private GetFunctionPlainArgs(GetFunctionPlainArgs $) {
        this.functionName = $.functionName;
        this.qualifier = $.qualifier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionPlainArgs $;

        public Builder() {
            $ = new GetFunctionPlainArgs();
        }

        public Builder(GetFunctionPlainArgs defaults) {
            $ = new GetFunctionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionName Name of the lambda function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param qualifier Alias name or version number of the lambda functionE.g., `$LATEST`, `my-alias`, or `1`. When not included: the data source resolves to the most recent published version; if no published version exists: it resolves to the most recent unpublished version.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(@Nullable String qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetFunctionPlainArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            return $;
        }
    }

}