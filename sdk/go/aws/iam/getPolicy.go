// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source can be used to fetch information about a specific
// IAM policy.
func Lookupolicy(ctx *pulumi.Context, args *GetPolicyArgs) (*GetPolicyResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["arn"] = args.Arn
	}
	outputs, err := ctx.Invoke("aws:iam/getPolicy:getPolicy", inputs)
	if err != nil {
		return nil, err
	}
	ret := GetPolicyResult{}
	if v, ok := outputs["description"]; ok {
		ret.Description = v
	}
	if v, ok := outputs["name"]; ok {
		ret.Name = v
	}
	if v, ok := outputs["path"]; ok {
		ret.Path = v
	}
	if v, ok := outputs["policy"]; ok {
		ret.Policy = v
	}
	return &ret, nil
}

// A collection of arguments for invoking getPolicy.
type GetPolicyArgs struct {
	// ARN of the IAM policy.
	Arn interface{}
}

// A collection of values returned by getPolicy.
type GetPolicyResult struct {
	// The description of the policy.
	Description interface{}
	// The name of the IAM policy.
	Name interface{}
	// The path to the policy.
	Path interface{}
	// The policy document of the policy.
	Policy interface{}
}