// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationEgressConfigurationArgs;
import com.pulumi.aws.apprunner.inputs.ServiceNetworkConfigurationIngressConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkConfigurationArgs Empty = new ServiceNetworkConfigurationArgs();

    /**
     * Network configuration settings for outbound message traffic. See Egress Configuration below for more details.
     * 
     */
    @Import(name="egressConfiguration")
    private @Nullable Output<ServiceNetworkConfigurationEgressConfigurationArgs> egressConfiguration;

    /**
     * @return Network configuration settings for outbound message traffic. See Egress Configuration below for more details.
     * 
     */
    public Optional<Output<ServiceNetworkConfigurationEgressConfigurationArgs>> egressConfiguration() {
        return Optional.ofNullable(this.egressConfiguration);
    }

    /**
     * Network configuration settings for inbound network traffic. See Ingress Configuration below for more details.
     * 
     */
    @Import(name="ingressConfiguration")
    private @Nullable Output<ServiceNetworkConfigurationIngressConfigurationArgs> ingressConfiguration;

    /**
     * @return Network configuration settings for inbound network traffic. See Ingress Configuration below for more details.
     * 
     */
    public Optional<Output<ServiceNetworkConfigurationIngressConfigurationArgs>> ingressConfiguration() {
        return Optional.ofNullable(this.ingressConfiguration);
    }

    private ServiceNetworkConfigurationArgs() {}

    private ServiceNetworkConfigurationArgs(ServiceNetworkConfigurationArgs $) {
        this.egressConfiguration = $.egressConfiguration;
        this.ingressConfiguration = $.ingressConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNetworkConfigurationArgs $;

        public Builder() {
            $ = new ServiceNetworkConfigurationArgs();
        }

        public Builder(ServiceNetworkConfigurationArgs defaults) {
            $ = new ServiceNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param egressConfiguration Network configuration settings for outbound message traffic. See Egress Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder egressConfiguration(@Nullable Output<ServiceNetworkConfigurationEgressConfigurationArgs> egressConfiguration) {
            $.egressConfiguration = egressConfiguration;
            return this;
        }

        /**
         * @param egressConfiguration Network configuration settings for outbound message traffic. See Egress Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder egressConfiguration(ServiceNetworkConfigurationEgressConfigurationArgs egressConfiguration) {
            return egressConfiguration(Output.of(egressConfiguration));
        }

        /**
         * @param ingressConfiguration Network configuration settings for inbound network traffic. See Ingress Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder ingressConfiguration(@Nullable Output<ServiceNetworkConfigurationIngressConfigurationArgs> ingressConfiguration) {
            $.ingressConfiguration = ingressConfiguration;
            return this;
        }

        /**
         * @param ingressConfiguration Network configuration settings for inbound network traffic. See Ingress Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder ingressConfiguration(ServiceNetworkConfigurationIngressConfigurationArgs ingressConfiguration) {
            return ingressConfiguration(Output.of(ingressConfiguration));
        }

        public ServiceNetworkConfigurationArgs build() {
            return $;
        }
    }

}
