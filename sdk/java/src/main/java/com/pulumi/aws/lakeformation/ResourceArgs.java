// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    /**
     * Amazon Resource Name (ARN) of the resource, an S3 path.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the resource, an S3 path.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * Role that has read/write access to the resource. If not provided, the Lake Formation service-linked role must exist and is used.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return Role that has read/write access to the resource. If not provided, the Lake Formation service-linked role must exist and is used.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    private ResourceArgs() {}

    private ResourceArgs(ResourceArgs $) {
        this.arn = $.arn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceArgs $;

        public Builder() {
            $ = new ResourceArgs();
        }

        public Builder(ResourceArgs defaults) {
            $ = new ResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the resource, an S3 path.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the resource, an S3 path.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param roleArn Role that has read/write access to the resource. If not provided, the Lake Formation service-linked role must exist and is used.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Role that has read/write access to the resource. If not provided, the Lake Formation service-linked role must exist and is used.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public ResourceArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}