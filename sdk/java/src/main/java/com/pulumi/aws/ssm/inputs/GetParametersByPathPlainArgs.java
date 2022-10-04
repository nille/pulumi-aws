// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParametersByPathPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParametersByPathPlainArgs Empty = new GetParametersByPathPlainArgs();

    /**
     * Prefix path of the parameter.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Prefix path of the parameter.
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * Whether to recursively return parameters under `path`. Defaults to `false`.
     * 
     */
    @Import(name="recursive")
    private @Nullable Boolean recursive;

    /**
     * @return Whether to recursively return parameters under `path`. Defaults to `false`.
     * 
     */
    public Optional<Boolean> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    @Import(name="withDecryption")
    private @Nullable Boolean withDecryption;

    /**
     * @return Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    public Optional<Boolean> withDecryption() {
        return Optional.ofNullable(this.withDecryption);
    }

    private GetParametersByPathPlainArgs() {}

    private GetParametersByPathPlainArgs(GetParametersByPathPlainArgs $) {
        this.path = $.path;
        this.recursive = $.recursive;
        this.withDecryption = $.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParametersByPathPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParametersByPathPlainArgs $;

        public Builder() {
            $ = new GetParametersByPathPlainArgs();
        }

        public Builder(GetParametersByPathPlainArgs defaults) {
            $ = new GetParametersByPathPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Prefix path of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param recursive Whether to recursively return parameters under `path`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder recursive(@Nullable Boolean recursive) {
            $.recursive = recursive;
            return this;
        }

        /**
         * @param withDecryption Whether to return decrypted `SecureString` value. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder withDecryption(@Nullable Boolean withDecryption) {
            $.withDecryption = withDecryption;
            return this;
        }

        public GetParametersByPathPlainArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}