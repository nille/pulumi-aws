// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve information about Location Service Tracker Associations.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.location.getTrackerAssociations({
 *     trackerName: "example",
 * }));
 * ```
 */
export function getTrackerAssociations(args: GetTrackerAssociationsArgs, opts?: pulumi.InvokeOptions): Promise<GetTrackerAssociationsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:location/getTrackerAssociations:getTrackerAssociations", {
        "trackerName": args.trackerName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTrackerAssociations.
 */
export interface GetTrackerAssociationsArgs {
    /**
     * Name of the tracker resource associated with a geofence collection.
     */
    trackerName: string;
}

/**
 * A collection of values returned by getTrackerAssociations.
 */
export interface GetTrackerAssociationsResult {
    /**
     * List of geofence collection ARNs associated to the tracker resource.
     */
    readonly consumerArns: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly trackerName: string;
}

export function getTrackerAssociationsOutput(args: GetTrackerAssociationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTrackerAssociationsResult> {
    return pulumi.output(args).apply(a => getTrackerAssociations(a, opts))
}

/**
 * A collection of arguments for invoking getTrackerAssociations.
 */
export interface GetTrackerAssociationsOutputArgs {
    /**
     * Name of the tracker resource associated with a geofence collection.
     */
    trackerName: pulumi.Input<string>;
}