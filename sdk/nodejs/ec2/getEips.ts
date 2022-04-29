// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a list of Elastic IPs in a region.
 *
 * ## Example Usage
 *
 * The following shows outputing all Elastic IPs with the a specific tag value.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getEips({
 *     tags: {
 *         Env: "dev",
 *     },
 * });
 * export const allocationIds = example.then(example => example.allocationIds);
 * export const publicIps = example.then(example => example.publicIps);
 * ```
 */
export function getEips(args?: GetEipsArgs, opts?: pulumi.InvokeOptions): Promise<GetEipsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2/getEips:getEips", {
        "filters": args.filters,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEips.
 */
export interface GetEipsArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetEipsFilter[];
    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getEips.
 */
export interface GetEipsResult {
    /**
     * A list of all the allocation IDs for address for use with EC2-VPC.
     */
    readonly allocationIds: string[];
    readonly filters?: outputs.ec2.GetEipsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of all the Elastic IP addresses.
     */
    readonly publicIps: string[];
    readonly tags: {[key: string]: string};
}

export function getEipsOutput(args?: GetEipsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEipsResult> {
    return pulumi.output(args).apply(a => getEips(a, opts))
}

/**
 * A collection of arguments for invoking getEips.
 */
export interface GetEipsOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetEipsFilterArgs>[]>;
    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Elastic IPs.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}