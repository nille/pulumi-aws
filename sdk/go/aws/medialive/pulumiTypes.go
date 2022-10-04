// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package medialive

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type InputDestination struct {
	// A unique name for the location the RTMP stream is being pushed to.
	StreamName string `pulumi:"streamName"`
}

// InputDestinationInput is an input type that accepts InputDestinationArgs and InputDestinationOutput values.
// You can construct a concrete instance of `InputDestinationInput` via:
//
//	InputDestinationArgs{...}
type InputDestinationInput interface {
	pulumi.Input

	ToInputDestinationOutput() InputDestinationOutput
	ToInputDestinationOutputWithContext(context.Context) InputDestinationOutput
}

type InputDestinationArgs struct {
	// A unique name for the location the RTMP stream is being pushed to.
	StreamName pulumi.StringInput `pulumi:"streamName"`
}

func (InputDestinationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*InputDestination)(nil)).Elem()
}

func (i InputDestinationArgs) ToInputDestinationOutput() InputDestinationOutput {
	return i.ToInputDestinationOutputWithContext(context.Background())
}

func (i InputDestinationArgs) ToInputDestinationOutputWithContext(ctx context.Context) InputDestinationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputDestinationOutput)
}

// InputDestinationArrayInput is an input type that accepts InputDestinationArray and InputDestinationArrayOutput values.
// You can construct a concrete instance of `InputDestinationArrayInput` via:
//
//	InputDestinationArray{ InputDestinationArgs{...} }
type InputDestinationArrayInput interface {
	pulumi.Input

	ToInputDestinationArrayOutput() InputDestinationArrayOutput
	ToInputDestinationArrayOutputWithContext(context.Context) InputDestinationArrayOutput
}

type InputDestinationArray []InputDestinationInput

func (InputDestinationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputDestination)(nil)).Elem()
}

func (i InputDestinationArray) ToInputDestinationArrayOutput() InputDestinationArrayOutput {
	return i.ToInputDestinationArrayOutputWithContext(context.Background())
}

func (i InputDestinationArray) ToInputDestinationArrayOutputWithContext(ctx context.Context) InputDestinationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputDestinationArrayOutput)
}

type InputDestinationOutput struct{ *pulumi.OutputState }

func (InputDestinationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InputDestination)(nil)).Elem()
}

func (o InputDestinationOutput) ToInputDestinationOutput() InputDestinationOutput {
	return o
}

func (o InputDestinationOutput) ToInputDestinationOutputWithContext(ctx context.Context) InputDestinationOutput {
	return o
}

// A unique name for the location the RTMP stream is being pushed to.
func (o InputDestinationOutput) StreamName() pulumi.StringOutput {
	return o.ApplyT(func(v InputDestination) string { return v.StreamName }).(pulumi.StringOutput)
}

type InputDestinationArrayOutput struct{ *pulumi.OutputState }

func (InputDestinationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputDestination)(nil)).Elem()
}

func (o InputDestinationArrayOutput) ToInputDestinationArrayOutput() InputDestinationArrayOutput {
	return o
}

func (o InputDestinationArrayOutput) ToInputDestinationArrayOutputWithContext(ctx context.Context) InputDestinationArrayOutput {
	return o
}

func (o InputDestinationArrayOutput) Index(i pulumi.IntInput) InputDestinationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InputDestination {
		return vs[0].([]InputDestination)[vs[1].(int)]
	}).(InputDestinationOutput)
}

type InputInputDevice struct {
	// The unique ID for the device.
	Id string `pulumi:"id"`
}

// InputInputDeviceInput is an input type that accepts InputInputDeviceArgs and InputInputDeviceOutput values.
// You can construct a concrete instance of `InputInputDeviceInput` via:
//
//	InputInputDeviceArgs{...}
type InputInputDeviceInput interface {
	pulumi.Input

	ToInputInputDeviceOutput() InputInputDeviceOutput
	ToInputInputDeviceOutputWithContext(context.Context) InputInputDeviceOutput
}

type InputInputDeviceArgs struct {
	// The unique ID for the device.
	Id pulumi.StringInput `pulumi:"id"`
}

func (InputInputDeviceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*InputInputDevice)(nil)).Elem()
}

func (i InputInputDeviceArgs) ToInputInputDeviceOutput() InputInputDeviceOutput {
	return i.ToInputInputDeviceOutputWithContext(context.Background())
}

func (i InputInputDeviceArgs) ToInputInputDeviceOutputWithContext(ctx context.Context) InputInputDeviceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputInputDeviceOutput)
}

// InputInputDeviceArrayInput is an input type that accepts InputInputDeviceArray and InputInputDeviceArrayOutput values.
// You can construct a concrete instance of `InputInputDeviceArrayInput` via:
//
//	InputInputDeviceArray{ InputInputDeviceArgs{...} }
type InputInputDeviceArrayInput interface {
	pulumi.Input

	ToInputInputDeviceArrayOutput() InputInputDeviceArrayOutput
	ToInputInputDeviceArrayOutputWithContext(context.Context) InputInputDeviceArrayOutput
}

type InputInputDeviceArray []InputInputDeviceInput

func (InputInputDeviceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputInputDevice)(nil)).Elem()
}

func (i InputInputDeviceArray) ToInputInputDeviceArrayOutput() InputInputDeviceArrayOutput {
	return i.ToInputInputDeviceArrayOutputWithContext(context.Background())
}

func (i InputInputDeviceArray) ToInputInputDeviceArrayOutputWithContext(ctx context.Context) InputInputDeviceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputInputDeviceArrayOutput)
}

type InputInputDeviceOutput struct{ *pulumi.OutputState }

func (InputInputDeviceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InputInputDevice)(nil)).Elem()
}

func (o InputInputDeviceOutput) ToInputInputDeviceOutput() InputInputDeviceOutput {
	return o
}

func (o InputInputDeviceOutput) ToInputInputDeviceOutputWithContext(ctx context.Context) InputInputDeviceOutput {
	return o
}

// The unique ID for the device.
func (o InputInputDeviceOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v InputInputDevice) string { return v.Id }).(pulumi.StringOutput)
}

type InputInputDeviceArrayOutput struct{ *pulumi.OutputState }

func (InputInputDeviceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputInputDevice)(nil)).Elem()
}

func (o InputInputDeviceArrayOutput) ToInputInputDeviceArrayOutput() InputInputDeviceArrayOutput {
	return o
}

func (o InputInputDeviceArrayOutput) ToInputInputDeviceArrayOutputWithContext(ctx context.Context) InputInputDeviceArrayOutput {
	return o
}

func (o InputInputDeviceArrayOutput) Index(i pulumi.IntInput) InputInputDeviceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InputInputDevice {
		return vs[0].([]InputInputDevice)[vs[1].(int)]
	}).(InputInputDeviceOutput)
}

type InputMediaConnectFlow struct {
	// The ARN of the MediaConnect Flow
	FlowArn string `pulumi:"flowArn"`
}

// InputMediaConnectFlowInput is an input type that accepts InputMediaConnectFlowArgs and InputMediaConnectFlowOutput values.
// You can construct a concrete instance of `InputMediaConnectFlowInput` via:
//
//	InputMediaConnectFlowArgs{...}
type InputMediaConnectFlowInput interface {
	pulumi.Input

	ToInputMediaConnectFlowOutput() InputMediaConnectFlowOutput
	ToInputMediaConnectFlowOutputWithContext(context.Context) InputMediaConnectFlowOutput
}

type InputMediaConnectFlowArgs struct {
	// The ARN of the MediaConnect Flow
	FlowArn pulumi.StringInput `pulumi:"flowArn"`
}

func (InputMediaConnectFlowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*InputMediaConnectFlow)(nil)).Elem()
}

func (i InputMediaConnectFlowArgs) ToInputMediaConnectFlowOutput() InputMediaConnectFlowOutput {
	return i.ToInputMediaConnectFlowOutputWithContext(context.Background())
}

func (i InputMediaConnectFlowArgs) ToInputMediaConnectFlowOutputWithContext(ctx context.Context) InputMediaConnectFlowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputMediaConnectFlowOutput)
}

// InputMediaConnectFlowArrayInput is an input type that accepts InputMediaConnectFlowArray and InputMediaConnectFlowArrayOutput values.
// You can construct a concrete instance of `InputMediaConnectFlowArrayInput` via:
//
//	InputMediaConnectFlowArray{ InputMediaConnectFlowArgs{...} }
type InputMediaConnectFlowArrayInput interface {
	pulumi.Input

	ToInputMediaConnectFlowArrayOutput() InputMediaConnectFlowArrayOutput
	ToInputMediaConnectFlowArrayOutputWithContext(context.Context) InputMediaConnectFlowArrayOutput
}

type InputMediaConnectFlowArray []InputMediaConnectFlowInput

func (InputMediaConnectFlowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputMediaConnectFlow)(nil)).Elem()
}

func (i InputMediaConnectFlowArray) ToInputMediaConnectFlowArrayOutput() InputMediaConnectFlowArrayOutput {
	return i.ToInputMediaConnectFlowArrayOutputWithContext(context.Background())
}

func (i InputMediaConnectFlowArray) ToInputMediaConnectFlowArrayOutputWithContext(ctx context.Context) InputMediaConnectFlowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputMediaConnectFlowArrayOutput)
}

type InputMediaConnectFlowOutput struct{ *pulumi.OutputState }

func (InputMediaConnectFlowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InputMediaConnectFlow)(nil)).Elem()
}

func (o InputMediaConnectFlowOutput) ToInputMediaConnectFlowOutput() InputMediaConnectFlowOutput {
	return o
}

func (o InputMediaConnectFlowOutput) ToInputMediaConnectFlowOutputWithContext(ctx context.Context) InputMediaConnectFlowOutput {
	return o
}

// The ARN of the MediaConnect Flow
func (o InputMediaConnectFlowOutput) FlowArn() pulumi.StringOutput {
	return o.ApplyT(func(v InputMediaConnectFlow) string { return v.FlowArn }).(pulumi.StringOutput)
}

type InputMediaConnectFlowArrayOutput struct{ *pulumi.OutputState }

func (InputMediaConnectFlowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputMediaConnectFlow)(nil)).Elem()
}

func (o InputMediaConnectFlowArrayOutput) ToInputMediaConnectFlowArrayOutput() InputMediaConnectFlowArrayOutput {
	return o
}

func (o InputMediaConnectFlowArrayOutput) ToInputMediaConnectFlowArrayOutputWithContext(ctx context.Context) InputMediaConnectFlowArrayOutput {
	return o
}

func (o InputMediaConnectFlowArrayOutput) Index(i pulumi.IntInput) InputMediaConnectFlowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InputMediaConnectFlow {
		return vs[0].([]InputMediaConnectFlow)[vs[1].(int)]
	}).(InputMediaConnectFlowOutput)
}

type InputSecurityGroupWhitelistRule struct {
	// The IPv4 CIDR that's whitelisted.
	Cidr string `pulumi:"cidr"`
}

// InputSecurityGroupWhitelistRuleInput is an input type that accepts InputSecurityGroupWhitelistRuleArgs and InputSecurityGroupWhitelistRuleOutput values.
// You can construct a concrete instance of `InputSecurityGroupWhitelistRuleInput` via:
//
//	InputSecurityGroupWhitelistRuleArgs{...}
type InputSecurityGroupWhitelistRuleInput interface {
	pulumi.Input

	ToInputSecurityGroupWhitelistRuleOutput() InputSecurityGroupWhitelistRuleOutput
	ToInputSecurityGroupWhitelistRuleOutputWithContext(context.Context) InputSecurityGroupWhitelistRuleOutput
}

type InputSecurityGroupWhitelistRuleArgs struct {
	// The IPv4 CIDR that's whitelisted.
	Cidr pulumi.StringInput `pulumi:"cidr"`
}

func (InputSecurityGroupWhitelistRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*InputSecurityGroupWhitelistRule)(nil)).Elem()
}

func (i InputSecurityGroupWhitelistRuleArgs) ToInputSecurityGroupWhitelistRuleOutput() InputSecurityGroupWhitelistRuleOutput {
	return i.ToInputSecurityGroupWhitelistRuleOutputWithContext(context.Background())
}

func (i InputSecurityGroupWhitelistRuleArgs) ToInputSecurityGroupWhitelistRuleOutputWithContext(ctx context.Context) InputSecurityGroupWhitelistRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputSecurityGroupWhitelistRuleOutput)
}

// InputSecurityGroupWhitelistRuleArrayInput is an input type that accepts InputSecurityGroupWhitelistRuleArray and InputSecurityGroupWhitelistRuleArrayOutput values.
// You can construct a concrete instance of `InputSecurityGroupWhitelistRuleArrayInput` via:
//
//	InputSecurityGroupWhitelistRuleArray{ InputSecurityGroupWhitelistRuleArgs{...} }
type InputSecurityGroupWhitelistRuleArrayInput interface {
	pulumi.Input

	ToInputSecurityGroupWhitelistRuleArrayOutput() InputSecurityGroupWhitelistRuleArrayOutput
	ToInputSecurityGroupWhitelistRuleArrayOutputWithContext(context.Context) InputSecurityGroupWhitelistRuleArrayOutput
}

type InputSecurityGroupWhitelistRuleArray []InputSecurityGroupWhitelistRuleInput

func (InputSecurityGroupWhitelistRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputSecurityGroupWhitelistRule)(nil)).Elem()
}

func (i InputSecurityGroupWhitelistRuleArray) ToInputSecurityGroupWhitelistRuleArrayOutput() InputSecurityGroupWhitelistRuleArrayOutput {
	return i.ToInputSecurityGroupWhitelistRuleArrayOutputWithContext(context.Background())
}

func (i InputSecurityGroupWhitelistRuleArray) ToInputSecurityGroupWhitelistRuleArrayOutputWithContext(ctx context.Context) InputSecurityGroupWhitelistRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputSecurityGroupWhitelistRuleArrayOutput)
}

type InputSecurityGroupWhitelistRuleOutput struct{ *pulumi.OutputState }

func (InputSecurityGroupWhitelistRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InputSecurityGroupWhitelistRule)(nil)).Elem()
}

func (o InputSecurityGroupWhitelistRuleOutput) ToInputSecurityGroupWhitelistRuleOutput() InputSecurityGroupWhitelistRuleOutput {
	return o
}

func (o InputSecurityGroupWhitelistRuleOutput) ToInputSecurityGroupWhitelistRuleOutputWithContext(ctx context.Context) InputSecurityGroupWhitelistRuleOutput {
	return o
}

// The IPv4 CIDR that's whitelisted.
func (o InputSecurityGroupWhitelistRuleOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v InputSecurityGroupWhitelistRule) string { return v.Cidr }).(pulumi.StringOutput)
}

type InputSecurityGroupWhitelistRuleArrayOutput struct{ *pulumi.OutputState }

func (InputSecurityGroupWhitelistRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputSecurityGroupWhitelistRule)(nil)).Elem()
}

func (o InputSecurityGroupWhitelistRuleArrayOutput) ToInputSecurityGroupWhitelistRuleArrayOutput() InputSecurityGroupWhitelistRuleArrayOutput {
	return o
}

func (o InputSecurityGroupWhitelistRuleArrayOutput) ToInputSecurityGroupWhitelistRuleArrayOutputWithContext(ctx context.Context) InputSecurityGroupWhitelistRuleArrayOutput {
	return o
}

func (o InputSecurityGroupWhitelistRuleArrayOutput) Index(i pulumi.IntInput) InputSecurityGroupWhitelistRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InputSecurityGroupWhitelistRule {
		return vs[0].([]InputSecurityGroupWhitelistRule)[vs[1].(int)]
	}).(InputSecurityGroupWhitelistRuleOutput)
}

type InputSource struct {
	// The key used to extract the password from EC2 Parameter store.
	PasswordParam string `pulumi:"passwordParam"`
	// The URL where the stream is pulled from.
	Url string `pulumi:"url"`
	// The username for the input source.
	Username string `pulumi:"username"`
}

// InputSourceInput is an input type that accepts InputSourceArgs and InputSourceOutput values.
// You can construct a concrete instance of `InputSourceInput` via:
//
//	InputSourceArgs{...}
type InputSourceInput interface {
	pulumi.Input

	ToInputSourceOutput() InputSourceOutput
	ToInputSourceOutputWithContext(context.Context) InputSourceOutput
}

type InputSourceArgs struct {
	// The key used to extract the password from EC2 Parameter store.
	PasswordParam pulumi.StringInput `pulumi:"passwordParam"`
	// The URL where the stream is pulled from.
	Url pulumi.StringInput `pulumi:"url"`
	// The username for the input source.
	Username pulumi.StringInput `pulumi:"username"`
}

func (InputSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*InputSource)(nil)).Elem()
}

func (i InputSourceArgs) ToInputSourceOutput() InputSourceOutput {
	return i.ToInputSourceOutputWithContext(context.Background())
}

func (i InputSourceArgs) ToInputSourceOutputWithContext(ctx context.Context) InputSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputSourceOutput)
}

// InputSourceArrayInput is an input type that accepts InputSourceArray and InputSourceArrayOutput values.
// You can construct a concrete instance of `InputSourceArrayInput` via:
//
//	InputSourceArray{ InputSourceArgs{...} }
type InputSourceArrayInput interface {
	pulumi.Input

	ToInputSourceArrayOutput() InputSourceArrayOutput
	ToInputSourceArrayOutputWithContext(context.Context) InputSourceArrayOutput
}

type InputSourceArray []InputSourceInput

func (InputSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputSource)(nil)).Elem()
}

func (i InputSourceArray) ToInputSourceArrayOutput() InputSourceArrayOutput {
	return i.ToInputSourceArrayOutputWithContext(context.Background())
}

func (i InputSourceArray) ToInputSourceArrayOutputWithContext(ctx context.Context) InputSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputSourceArrayOutput)
}

type InputSourceOutput struct{ *pulumi.OutputState }

func (InputSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InputSource)(nil)).Elem()
}

func (o InputSourceOutput) ToInputSourceOutput() InputSourceOutput {
	return o
}

func (o InputSourceOutput) ToInputSourceOutputWithContext(ctx context.Context) InputSourceOutput {
	return o
}

// The key used to extract the password from EC2 Parameter store.
func (o InputSourceOutput) PasswordParam() pulumi.StringOutput {
	return o.ApplyT(func(v InputSource) string { return v.PasswordParam }).(pulumi.StringOutput)
}

// The URL where the stream is pulled from.
func (o InputSourceOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v InputSource) string { return v.Url }).(pulumi.StringOutput)
}

// The username for the input source.
func (o InputSourceOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v InputSource) string { return v.Username }).(pulumi.StringOutput)
}

type InputSourceArrayOutput struct{ *pulumi.OutputState }

func (InputSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InputSource)(nil)).Elem()
}

func (o InputSourceArrayOutput) ToInputSourceArrayOutput() InputSourceArrayOutput {
	return o
}

func (o InputSourceArrayOutput) ToInputSourceArrayOutputWithContext(ctx context.Context) InputSourceArrayOutput {
	return o
}

func (o InputSourceArrayOutput) Index(i pulumi.IntInput) InputSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InputSource {
		return vs[0].([]InputSource)[vs[1].(int)]
	}).(InputSourceOutput)
}

type InputVpc struct {
	// A list of up to 5 EC2 VPC security group IDs to attach to the Input.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// A list of 2 VPC subnet IDs from the same VPC.
	SubnetIds []string `pulumi:"subnetIds"`
}

// InputVpcInput is an input type that accepts InputVpcArgs and InputVpcOutput values.
// You can construct a concrete instance of `InputVpcInput` via:
//
//	InputVpcArgs{...}
type InputVpcInput interface {
	pulumi.Input

	ToInputVpcOutput() InputVpcOutput
	ToInputVpcOutputWithContext(context.Context) InputVpcOutput
}

type InputVpcArgs struct {
	// A list of up to 5 EC2 VPC security group IDs to attach to the Input.
	SecurityGroupIds pulumi.StringArrayInput `pulumi:"securityGroupIds"`
	// A list of 2 VPC subnet IDs from the same VPC.
	SubnetIds pulumi.StringArrayInput `pulumi:"subnetIds"`
}

func (InputVpcArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*InputVpc)(nil)).Elem()
}

func (i InputVpcArgs) ToInputVpcOutput() InputVpcOutput {
	return i.ToInputVpcOutputWithContext(context.Background())
}

func (i InputVpcArgs) ToInputVpcOutputWithContext(ctx context.Context) InputVpcOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputVpcOutput)
}

func (i InputVpcArgs) ToInputVpcPtrOutput() InputVpcPtrOutput {
	return i.ToInputVpcPtrOutputWithContext(context.Background())
}

func (i InputVpcArgs) ToInputVpcPtrOutputWithContext(ctx context.Context) InputVpcPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputVpcOutput).ToInputVpcPtrOutputWithContext(ctx)
}

// InputVpcPtrInput is an input type that accepts InputVpcArgs, InputVpcPtr and InputVpcPtrOutput values.
// You can construct a concrete instance of `InputVpcPtrInput` via:
//
//	        InputVpcArgs{...}
//
//	or:
//
//	        nil
type InputVpcPtrInput interface {
	pulumi.Input

	ToInputVpcPtrOutput() InputVpcPtrOutput
	ToInputVpcPtrOutputWithContext(context.Context) InputVpcPtrOutput
}

type inputVpcPtrType InputVpcArgs

func InputVpcPtr(v *InputVpcArgs) InputVpcPtrInput {
	return (*inputVpcPtrType)(v)
}

func (*inputVpcPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**InputVpc)(nil)).Elem()
}

func (i *inputVpcPtrType) ToInputVpcPtrOutput() InputVpcPtrOutput {
	return i.ToInputVpcPtrOutputWithContext(context.Background())
}

func (i *inputVpcPtrType) ToInputVpcPtrOutputWithContext(ctx context.Context) InputVpcPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InputVpcPtrOutput)
}

type InputVpcOutput struct{ *pulumi.OutputState }

func (InputVpcOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InputVpc)(nil)).Elem()
}

func (o InputVpcOutput) ToInputVpcOutput() InputVpcOutput {
	return o
}

func (o InputVpcOutput) ToInputVpcOutputWithContext(ctx context.Context) InputVpcOutput {
	return o
}

func (o InputVpcOutput) ToInputVpcPtrOutput() InputVpcPtrOutput {
	return o.ToInputVpcPtrOutputWithContext(context.Background())
}

func (o InputVpcOutput) ToInputVpcPtrOutputWithContext(ctx context.Context) InputVpcPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v InputVpc) *InputVpc {
		return &v
	}).(InputVpcPtrOutput)
}

// A list of up to 5 EC2 VPC security group IDs to attach to the Input.
func (o InputVpcOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v InputVpc) []string { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// A list of 2 VPC subnet IDs from the same VPC.
func (o InputVpcOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v InputVpc) []string { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

type InputVpcPtrOutput struct{ *pulumi.OutputState }

func (InputVpcPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InputVpc)(nil)).Elem()
}

func (o InputVpcPtrOutput) ToInputVpcPtrOutput() InputVpcPtrOutput {
	return o
}

func (o InputVpcPtrOutput) ToInputVpcPtrOutputWithContext(ctx context.Context) InputVpcPtrOutput {
	return o
}

func (o InputVpcPtrOutput) Elem() InputVpcOutput {
	return o.ApplyT(func(v *InputVpc) InputVpc {
		if v != nil {
			return *v
		}
		var ret InputVpc
		return ret
	}).(InputVpcOutput)
}

// A list of up to 5 EC2 VPC security group IDs to attach to the Input.
func (o InputVpcPtrOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InputVpc) []string {
		if v == nil {
			return nil
		}
		return v.SecurityGroupIds
	}).(pulumi.StringArrayOutput)
}

// A list of 2 VPC subnet IDs from the same VPC.
func (o InputVpcPtrOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InputVpc) []string {
		if v == nil {
			return nil
		}
		return v.SubnetIds
	}).(pulumi.StringArrayOutput)
}

type MultiplexMultiplexSettings struct {
	// Maximum video buffer delay.
	MaximumVideoBufferDelayMilliseconds *int `pulumi:"maximumVideoBufferDelayMilliseconds"`
	// Transport stream bit rate.
	TransportStreamBitrate int `pulumi:"transportStreamBitrate"`
	// Unique ID for each multiplex.
	TransportStreamId int `pulumi:"transportStreamId"`
	// Transport stream reserved bit rate.
	TransportStreamReservedBitrate *int `pulumi:"transportStreamReservedBitrate"`
}

// MultiplexMultiplexSettingsInput is an input type that accepts MultiplexMultiplexSettingsArgs and MultiplexMultiplexSettingsOutput values.
// You can construct a concrete instance of `MultiplexMultiplexSettingsInput` via:
//
//	MultiplexMultiplexSettingsArgs{...}
type MultiplexMultiplexSettingsInput interface {
	pulumi.Input

	ToMultiplexMultiplexSettingsOutput() MultiplexMultiplexSettingsOutput
	ToMultiplexMultiplexSettingsOutputWithContext(context.Context) MultiplexMultiplexSettingsOutput
}

type MultiplexMultiplexSettingsArgs struct {
	// Maximum video buffer delay.
	MaximumVideoBufferDelayMilliseconds pulumi.IntPtrInput `pulumi:"maximumVideoBufferDelayMilliseconds"`
	// Transport stream bit rate.
	TransportStreamBitrate pulumi.IntInput `pulumi:"transportStreamBitrate"`
	// Unique ID for each multiplex.
	TransportStreamId pulumi.IntInput `pulumi:"transportStreamId"`
	// Transport stream reserved bit rate.
	TransportStreamReservedBitrate pulumi.IntPtrInput `pulumi:"transportStreamReservedBitrate"`
}

func (MultiplexMultiplexSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*MultiplexMultiplexSettings)(nil)).Elem()
}

func (i MultiplexMultiplexSettingsArgs) ToMultiplexMultiplexSettingsOutput() MultiplexMultiplexSettingsOutput {
	return i.ToMultiplexMultiplexSettingsOutputWithContext(context.Background())
}

func (i MultiplexMultiplexSettingsArgs) ToMultiplexMultiplexSettingsOutputWithContext(ctx context.Context) MultiplexMultiplexSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiplexMultiplexSettingsOutput)
}

func (i MultiplexMultiplexSettingsArgs) ToMultiplexMultiplexSettingsPtrOutput() MultiplexMultiplexSettingsPtrOutput {
	return i.ToMultiplexMultiplexSettingsPtrOutputWithContext(context.Background())
}

func (i MultiplexMultiplexSettingsArgs) ToMultiplexMultiplexSettingsPtrOutputWithContext(ctx context.Context) MultiplexMultiplexSettingsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiplexMultiplexSettingsOutput).ToMultiplexMultiplexSettingsPtrOutputWithContext(ctx)
}

// MultiplexMultiplexSettingsPtrInput is an input type that accepts MultiplexMultiplexSettingsArgs, MultiplexMultiplexSettingsPtr and MultiplexMultiplexSettingsPtrOutput values.
// You can construct a concrete instance of `MultiplexMultiplexSettingsPtrInput` via:
//
//	        MultiplexMultiplexSettingsArgs{...}
//
//	or:
//
//	        nil
type MultiplexMultiplexSettingsPtrInput interface {
	pulumi.Input

	ToMultiplexMultiplexSettingsPtrOutput() MultiplexMultiplexSettingsPtrOutput
	ToMultiplexMultiplexSettingsPtrOutputWithContext(context.Context) MultiplexMultiplexSettingsPtrOutput
}

type multiplexMultiplexSettingsPtrType MultiplexMultiplexSettingsArgs

func MultiplexMultiplexSettingsPtr(v *MultiplexMultiplexSettingsArgs) MultiplexMultiplexSettingsPtrInput {
	return (*multiplexMultiplexSettingsPtrType)(v)
}

func (*multiplexMultiplexSettingsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiplexMultiplexSettings)(nil)).Elem()
}

func (i *multiplexMultiplexSettingsPtrType) ToMultiplexMultiplexSettingsPtrOutput() MultiplexMultiplexSettingsPtrOutput {
	return i.ToMultiplexMultiplexSettingsPtrOutputWithContext(context.Background())
}

func (i *multiplexMultiplexSettingsPtrType) ToMultiplexMultiplexSettingsPtrOutputWithContext(ctx context.Context) MultiplexMultiplexSettingsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MultiplexMultiplexSettingsPtrOutput)
}

type MultiplexMultiplexSettingsOutput struct{ *pulumi.OutputState }

func (MultiplexMultiplexSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*MultiplexMultiplexSettings)(nil)).Elem()
}

func (o MultiplexMultiplexSettingsOutput) ToMultiplexMultiplexSettingsOutput() MultiplexMultiplexSettingsOutput {
	return o
}

func (o MultiplexMultiplexSettingsOutput) ToMultiplexMultiplexSettingsOutputWithContext(ctx context.Context) MultiplexMultiplexSettingsOutput {
	return o
}

func (o MultiplexMultiplexSettingsOutput) ToMultiplexMultiplexSettingsPtrOutput() MultiplexMultiplexSettingsPtrOutput {
	return o.ToMultiplexMultiplexSettingsPtrOutputWithContext(context.Background())
}

func (o MultiplexMultiplexSettingsOutput) ToMultiplexMultiplexSettingsPtrOutputWithContext(ctx context.Context) MultiplexMultiplexSettingsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v MultiplexMultiplexSettings) *MultiplexMultiplexSettings {
		return &v
	}).(MultiplexMultiplexSettingsPtrOutput)
}

// Maximum video buffer delay.
func (o MultiplexMultiplexSettingsOutput) MaximumVideoBufferDelayMilliseconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v MultiplexMultiplexSettings) *int { return v.MaximumVideoBufferDelayMilliseconds }).(pulumi.IntPtrOutput)
}

// Transport stream bit rate.
func (o MultiplexMultiplexSettingsOutput) TransportStreamBitrate() pulumi.IntOutput {
	return o.ApplyT(func(v MultiplexMultiplexSettings) int { return v.TransportStreamBitrate }).(pulumi.IntOutput)
}

// Unique ID for each multiplex.
func (o MultiplexMultiplexSettingsOutput) TransportStreamId() pulumi.IntOutput {
	return o.ApplyT(func(v MultiplexMultiplexSettings) int { return v.TransportStreamId }).(pulumi.IntOutput)
}

// Transport stream reserved bit rate.
func (o MultiplexMultiplexSettingsOutput) TransportStreamReservedBitrate() pulumi.IntPtrOutput {
	return o.ApplyT(func(v MultiplexMultiplexSettings) *int { return v.TransportStreamReservedBitrate }).(pulumi.IntPtrOutput)
}

type MultiplexMultiplexSettingsPtrOutput struct{ *pulumi.OutputState }

func (MultiplexMultiplexSettingsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MultiplexMultiplexSettings)(nil)).Elem()
}

func (o MultiplexMultiplexSettingsPtrOutput) ToMultiplexMultiplexSettingsPtrOutput() MultiplexMultiplexSettingsPtrOutput {
	return o
}

func (o MultiplexMultiplexSettingsPtrOutput) ToMultiplexMultiplexSettingsPtrOutputWithContext(ctx context.Context) MultiplexMultiplexSettingsPtrOutput {
	return o
}

func (o MultiplexMultiplexSettingsPtrOutput) Elem() MultiplexMultiplexSettingsOutput {
	return o.ApplyT(func(v *MultiplexMultiplexSettings) MultiplexMultiplexSettings {
		if v != nil {
			return *v
		}
		var ret MultiplexMultiplexSettings
		return ret
	}).(MultiplexMultiplexSettingsOutput)
}

// Maximum video buffer delay.
func (o MultiplexMultiplexSettingsPtrOutput) MaximumVideoBufferDelayMilliseconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiplexMultiplexSettings) *int {
		if v == nil {
			return nil
		}
		return v.MaximumVideoBufferDelayMilliseconds
	}).(pulumi.IntPtrOutput)
}

// Transport stream bit rate.
func (o MultiplexMultiplexSettingsPtrOutput) TransportStreamBitrate() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiplexMultiplexSettings) *int {
		if v == nil {
			return nil
		}
		return &v.TransportStreamBitrate
	}).(pulumi.IntPtrOutput)
}

// Unique ID for each multiplex.
func (o MultiplexMultiplexSettingsPtrOutput) TransportStreamId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiplexMultiplexSettings) *int {
		if v == nil {
			return nil
		}
		return &v.TransportStreamId
	}).(pulumi.IntPtrOutput)
}

// Transport stream reserved bit rate.
func (o MultiplexMultiplexSettingsPtrOutput) TransportStreamReservedBitrate() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MultiplexMultiplexSettings) *int {
		if v == nil {
			return nil
		}
		return v.TransportStreamReservedBitrate
	}).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InputDestinationInput)(nil)).Elem(), InputDestinationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputDestinationArrayInput)(nil)).Elem(), InputDestinationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputInputDeviceInput)(nil)).Elem(), InputInputDeviceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputInputDeviceArrayInput)(nil)).Elem(), InputInputDeviceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputMediaConnectFlowInput)(nil)).Elem(), InputMediaConnectFlowArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputMediaConnectFlowArrayInput)(nil)).Elem(), InputMediaConnectFlowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputSecurityGroupWhitelistRuleInput)(nil)).Elem(), InputSecurityGroupWhitelistRuleArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputSecurityGroupWhitelistRuleArrayInput)(nil)).Elem(), InputSecurityGroupWhitelistRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputSourceInput)(nil)).Elem(), InputSourceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputSourceArrayInput)(nil)).Elem(), InputSourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputVpcInput)(nil)).Elem(), InputVpcArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*InputVpcPtrInput)(nil)).Elem(), InputVpcArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiplexMultiplexSettingsInput)(nil)).Elem(), MultiplexMultiplexSettingsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*MultiplexMultiplexSettingsPtrInput)(nil)).Elem(), MultiplexMultiplexSettingsArgs{})
	pulumi.RegisterOutputType(InputDestinationOutput{})
	pulumi.RegisterOutputType(InputDestinationArrayOutput{})
	pulumi.RegisterOutputType(InputInputDeviceOutput{})
	pulumi.RegisterOutputType(InputInputDeviceArrayOutput{})
	pulumi.RegisterOutputType(InputMediaConnectFlowOutput{})
	pulumi.RegisterOutputType(InputMediaConnectFlowArrayOutput{})
	pulumi.RegisterOutputType(InputSecurityGroupWhitelistRuleOutput{})
	pulumi.RegisterOutputType(InputSecurityGroupWhitelistRuleArrayOutput{})
	pulumi.RegisterOutputType(InputSourceOutput{})
	pulumi.RegisterOutputType(InputSourceArrayOutput{})
	pulumi.RegisterOutputType(InputVpcOutput{})
	pulumi.RegisterOutputType(InputVpcPtrOutput{})
	pulumi.RegisterOutputType(MultiplexMultiplexSettingsOutput{})
	pulumi.RegisterOutputType(MultiplexMultiplexSettingsPtrOutput{})
}