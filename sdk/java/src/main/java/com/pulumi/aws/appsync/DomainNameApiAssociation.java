// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appsync.DomainNameApiAssociationArgs;
import com.pulumi.aws.appsync.inputs.DomainNameApiAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AppSync API Association.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appsync.DomainNameApiAssociation;
 * import com.pulumi.aws.appsync.DomainNameApiAssociationArgs;
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
 *         var example = new DomainNameApiAssociation(&#34;example&#34;, DomainNameApiAssociationArgs.builder()        
 *             .apiId(aws_appsync_graphql_api.example().id())
 *             .domainName(aws_appsync_domain_name.example().domain_name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_appsync_domain_name_api_association` can be imported using the AppSync domain name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appsync/domainNameApiAssociation:DomainNameApiAssociation example example.com
 * ```
 * 
 */
@ResourceType(type="aws:appsync/domainNameApiAssociation:DomainNameApiAssociation")
public class DomainNameApiAssociation extends com.pulumi.resources.CustomResource {
    /**
     * API ID.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return API ID.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * Appsync domain name.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Appsync domain name.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainNameApiAssociation(String name) {
        this(name, DomainNameApiAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainNameApiAssociation(String name, DomainNameApiAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainNameApiAssociation(String name, DomainNameApiAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/domainNameApiAssociation:DomainNameApiAssociation", name, args == null ? DomainNameApiAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainNameApiAssociation(String name, Output<String> id, @Nullable DomainNameApiAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/domainNameApiAssociation:DomainNameApiAssociation", name, state, makeResourceOptions(options, id));
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
    public static DomainNameApiAssociation get(String name, Output<String> id, @Nullable DomainNameApiAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainNameApiAssociation(name, id, state, options);
    }
}