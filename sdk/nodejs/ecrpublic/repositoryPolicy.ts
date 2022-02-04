// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Elastic Container Registry Public Repository Policy.
 *
 * Note that currently only one policy may be applied to a repository.
 *
 * > **NOTE:** This resource can only be used with `us-east-1` region.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleRepository = new aws.ecrpublic.Repository("exampleRepository", {repositoryName: "Example"});
 * const exampleRepositoryPolicy = new aws.ecrpublic.RepositoryPolicy("exampleRepositoryPolicy", {
 *     repositoryName: exampleRepository.repositoryName,
 *     policy: `{
 *     "Version": "2008-10-17",
 *     "Statement": [
 *         {
 *             "Sid": "new policy",
 *             "Effect": "Allow",
 *             "Principal": "*",
 *             "Action": [
 *                 "ecr:GetDownloadUrlForLayer",
 *                 "ecr:BatchGetImage",
 *                 "ecr:BatchCheckLayerAvailability",
 *                 "ecr:PutImage",
 *                 "ecr:InitiateLayerUpload",
 *                 "ecr:UploadLayerPart",
 *                 "ecr:CompleteLayerUpload",
 *                 "ecr:DescribeRepositories",
 *                 "ecr:GetRepositoryPolicy",
 *                 "ecr:ListImages",
 *                 "ecr:DeleteRepository",
 *                 "ecr:BatchDeleteImage",
 *                 "ecr:SetRepositoryPolicy",
 *                 "ecr:DeleteRepositoryPolicy"
 *             ]
 *         }
 *     ]
 * }
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * ECR Public Repository Policy can be imported using the repository name, e.g.
 *
 * ```sh
 *  $ pulumi import aws:ecrpublic/repositoryPolicy:RepositoryPolicy example example
 * ```
 */
export class RepositoryPolicy extends pulumi.CustomResource {
    /**
     * Get an existing RepositoryPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RepositoryPolicyState, opts?: pulumi.CustomResourceOptions): RepositoryPolicy {
        return new RepositoryPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ecrpublic/repositoryPolicy:RepositoryPolicy';

    /**
     * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RepositoryPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RepositoryPolicy.__pulumiType;
    }

    public readonly policy!: pulumi.Output<string>;
    /**
     * The registry ID where the repository was created.
     */
    public /*out*/ readonly registryId!: pulumi.Output<string>;
    /**
     * Name of the repository to apply the policy.
     */
    public readonly repositoryName!: pulumi.Output<string>;

    /**
     * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RepositoryPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RepositoryPolicyArgs | RepositoryPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RepositoryPolicyState | undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["registryId"] = state ? state.registryId : undefined;
            resourceInputs["repositoryName"] = state ? state.repositoryName : undefined;
        } else {
            const args = argsOrState as RepositoryPolicyArgs | undefined;
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            if ((!args || args.repositoryName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repositoryName'");
            }
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["repositoryName"] = args ? args.repositoryName : undefined;
            resourceInputs["registryId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RepositoryPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RepositoryPolicy resources.
 */
export interface RepositoryPolicyState {
    policy?: pulumi.Input<string>;
    /**
     * The registry ID where the repository was created.
     */
    registryId?: pulumi.Input<string>;
    /**
     * Name of the repository to apply the policy.
     */
    repositoryName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RepositoryPolicy resource.
 */
export interface RepositoryPolicyArgs {
    policy: pulumi.Input<string>;
    /**
     * Name of the repository to apply the policy.
     */
    repositoryName: pulumi.Input<string>;
}