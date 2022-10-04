// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppImageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppImageConfigArgs Empty = new AppImageConfigArgs();

    /**
     * The name of the App Image Config.
     * 
     */
    @Import(name="appImageConfigName", required=true)
    private Output<String> appImageConfigName;

    /**
     * @return The name of the App Image Config.
     * 
     */
    public Output<String> appImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * 
     */
    @Import(name="kernelGatewayImageConfig")
    private @Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig;

    /**
     * @return The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * 
     */
    public Optional<Output<AppImageConfigKernelGatewayImageConfigArgs>> kernelGatewayImageConfig() {
        return Optional.ofNullable(this.kernelGatewayImageConfig);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AppImageConfigArgs() {}

    private AppImageConfigArgs(AppImageConfigArgs $) {
        this.appImageConfigName = $.appImageConfigName;
        this.kernelGatewayImageConfig = $.kernelGatewayImageConfig;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppImageConfigArgs $;

        public Builder() {
            $ = new AppImageConfigArgs();
        }

        public Builder(AppImageConfigArgs defaults) {
            $ = new AppImageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appImageConfigName The name of the App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(Output<String> appImageConfigName) {
            $.appImageConfigName = appImageConfigName;
            return this;
        }

        /**
         * @param appImageConfigName The name of the App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(String appImageConfigName) {
            return appImageConfigName(Output.of(appImageConfigName));
        }

        /**
         * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayImageConfig(@Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig) {
            $.kernelGatewayImageConfig = kernelGatewayImageConfig;
            return this;
        }

        /**
         * @param kernelGatewayImageConfig The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayImageConfig(AppImageConfigKernelGatewayImageConfigArgs kernelGatewayImageConfig) {
            return kernelGatewayImageConfig(Output.of(kernelGatewayImageConfig));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AppImageConfigArgs build() {
            $.appImageConfigName = Objects.requireNonNull($.appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
            return $;
        }
    }

}