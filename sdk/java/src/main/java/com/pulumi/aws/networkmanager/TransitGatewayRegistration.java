// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.TransitGatewayRegistrationArgs;
import com.pulumi.aws.networkmanager.inputs.TransitGatewayRegistrationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Registers a transit gateway to a global network. The transit gateway can be in any AWS Region,
 * but it must be owned by the same AWS account that owns the global network.
 * You cannot register a transit gateway in more than one global network.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.GlobalNetwork;
 * import com.pulumi.aws.networkmanager.GlobalNetworkArgs;
 * import com.pulumi.aws.ec2transitgateway.TransitGateway;
 * import com.pulumi.aws.networkmanager.TransitGatewayRegistration;
 * import com.pulumi.aws.networkmanager.TransitGatewayRegistrationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleGlobalNetwork = new GlobalNetwork(&#34;exampleGlobalNetwork&#34;, GlobalNetworkArgs.builder()        
 *             .description(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleTransitGateway = new TransitGateway(&#34;exampleTransitGateway&#34;);
 * 
 *         var exampleTransitGatewayRegistration = new TransitGatewayRegistration(&#34;exampleTransitGatewayRegistration&#34;, TransitGatewayRegistrationArgs.builder()        
 *             .globalNetworkId(exampleGlobalNetwork.id())
 *             .transitGatewayArn(exampleTransitGateway.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_networkmanager_transit_gateway_registration` can be imported using the global network ID and transit gateway ARN, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/transitGatewayRegistration:TransitGatewayRegistration example global-network-0d47f6t230mz46dy4,arn:aws:ec2:us-west-2:123456789012:transit-gateway/tgw-123abc05e04123abc
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/transitGatewayRegistration:TransitGatewayRegistration")
public class TransitGatewayRegistration extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Global Network to register to.
     * 
     */
    @Export(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the Global Network to register to.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The ARN of the Transit Gateway to register.
     * 
     */
    @Export(name="transitGatewayArn", type=String.class, parameters={})
    private Output<String> transitGatewayArn;

    /**
     * @return The ARN of the Transit Gateway to register.
     * 
     */
    public Output<String> transitGatewayArn() {
        return this.transitGatewayArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayRegistration(String name) {
        this(name, TransitGatewayRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayRegistration(String name, TransitGatewayRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayRegistration(String name, TransitGatewayRegistrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayRegistration:TransitGatewayRegistration", name, args == null ? TransitGatewayRegistrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayRegistration(String name, Output<String> id, @Nullable TransitGatewayRegistrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayRegistration:TransitGatewayRegistration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TransitGatewayRegistration get(String name, Output<String> id, @Nullable TransitGatewayRegistrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayRegistration(name, id, state, options);
    }
}