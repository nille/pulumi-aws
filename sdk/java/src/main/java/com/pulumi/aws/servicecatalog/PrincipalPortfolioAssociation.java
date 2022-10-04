// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.PrincipalPortfolioAssociationArgs;
import com.pulumi.aws.servicecatalog.inputs.PrincipalPortfolioAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Principal Portfolio Association.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicecatalog.PrincipalPortfolioAssociation;
 * import com.pulumi.aws.servicecatalog.PrincipalPortfolioAssociationArgs;
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
 *         var example = new PrincipalPortfolioAssociation(&#34;example&#34;, PrincipalPortfolioAssociationArgs.builder()        
 *             .portfolioId(&#34;port-68656c6c6f&#34;)
 *             .principalArn(&#34;arn:aws:iam::123456789012:user/Eleanor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_servicecatalog_principal_portfolio_association` can be imported using the accept language, principal ARN, and portfolio ID, separated by a comma, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation example en,arn:aws:iam::123456789012:user/Eleanor,port-68656c6c6f
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation")
public class PrincipalPortfolioAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Export(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * Portfolio identifier.
     * 
     */
    @Export(name="portfolioId", type=String.class, parameters={})
    private Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Output<String> portfolioId() {
        return this.portfolioId;
    }
    /**
     * Principal ARN.
     * 
     */
    @Export(name="principalArn", type=String.class, parameters={})
    private Output<String> principalArn;

    /**
     * @return Principal ARN.
     * 
     */
    public Output<String> principalArn() {
        return this.principalArn;
    }
    /**
     * Principal type. Setting this argument empty (e.g., `principal_type = &#34;&#34;`) will result in an error. Valid value is `IAM`. Default is `IAM`.
     * 
     */
    @Export(name="principalType", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalType;

    /**
     * @return Principal type. Setting this argument empty (e.g., `principal_type = &#34;&#34;`) will result in an error. Valid value is `IAM`. Default is `IAM`.
     * 
     */
    public Output<Optional<String>> principalType() {
        return Codegen.optional(this.principalType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrincipalPortfolioAssociation(String name) {
        this(name, PrincipalPortfolioAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrincipalPortfolioAssociation(String name, PrincipalPortfolioAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrincipalPortfolioAssociation(String name, PrincipalPortfolioAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation", name, args == null ? PrincipalPortfolioAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrincipalPortfolioAssociation(String name, Output<String> id, @Nullable PrincipalPortfolioAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/principalPortfolioAssociation:PrincipalPortfolioAssociation", name, state, makeResourceOptions(options, id));
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
    public static PrincipalPortfolioAssociation get(String name, Output<String> id, @Nullable PrincipalPortfolioAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrincipalPortfolioAssociation(name, id, state, options);
    }
}