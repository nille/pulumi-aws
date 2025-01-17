// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides information on a Service Catalog Product.
 *
 * > **Tip:** A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.servicecatalog.getProduct({
 *     id: "prod-dnigbtea24ste",
 * });
 * ```
 */
export function getProduct(args: GetProductArgs, opts?: pulumi.InvokeOptions): Promise<GetProductResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:servicecatalog/getProduct:getProduct", {
        "acceptLanguage": args.acceptLanguage,
        "id": args.id,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getProduct.
 */
export interface GetProductArgs {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    acceptLanguage?: string;
    /**
     * Product ID.
     */
    id: string;
    /**
     * Tags to apply to the product.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getProduct.
 */
export interface GetProductResult {
    readonly acceptLanguage?: string;
    /**
     * ARN of the product.
     */
    readonly arn: string;
    /**
     * Time when the product was created.
     */
    readonly createdTime: string;
    /**
     * Description of the product.
     */
    readonly description: string;
    /**
     * Distributor (i.e., vendor) of the product.
     */
    readonly distributor: string;
    /**
     * Whether the product has a default path.
     */
    readonly hasDefaultPath: boolean;
    readonly id: string;
    /**
     * Name of the product.
     */
    readonly name: string;
    /**
     * Owner of the product.
     */
    readonly owner: string;
    /**
     * Status of the product.
     */
    readonly status: string;
    /**
     * Support information about the product.
     */
    readonly supportDescription: string;
    /**
     * Contact email for product support.
     */
    readonly supportEmail: string;
    /**
     * Contact URL for product support.
     */
    readonly supportUrl: string;
    /**
     * Tags to apply to the product.
     */
    readonly tags: {[key: string]: string};
    /**
     * Type of product.
     */
    readonly type: string;
}
/**
 * Provides information on a Service Catalog Product.
 *
 * > **Tip:** A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.servicecatalog.getProduct({
 *     id: "prod-dnigbtea24ste",
 * });
 * ```
 */
export function getProductOutput(args: GetProductOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProductResult> {
    return pulumi.output(args).apply((a: any) => getProduct(a, opts))
}

/**
 * A collection of arguments for invoking getProduct.
 */
export interface GetProductOutputArgs {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    acceptLanguage?: pulumi.Input<string>;
    /**
     * Product ID.
     */
    id: pulumi.Input<string>;
    /**
     * Tags to apply to the product.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
