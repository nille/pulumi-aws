# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class GcmChannel(pulumi.CustomResource):
    def __init__(__self__, __name__, __opts__=None, api_key=None, application_id=None, enabled=None):
        """Create a GcmChannel resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if not api_key:
            raise TypeError('Missing required property api_key')
        elif not isinstance(api_key, basestring):
            raise TypeError('Expected property api_key to be a basestring')
        __self__.api_key = api_key
        __props__['apiKey'] = api_key

        if not application_id:
            raise TypeError('Missing required property application_id')
        elif not isinstance(application_id, basestring):
            raise TypeError('Expected property application_id to be a basestring')
        __self__.application_id = application_id
        __props__['applicationId'] = application_id

        if enabled and not isinstance(enabled, bool):
            raise TypeError('Expected property enabled to be a bool')
        __self__.enabled = enabled
        __props__['enabled'] = enabled

        super(GcmChannel, __self__).__init__(
            'aws:pinpoint/gcmChannel:GcmChannel',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'apiKey' in outs:
            self.api_key = outs['apiKey']
        if 'applicationId' in outs:
            self.application_id = outs['applicationId']
        if 'enabled' in outs:
            self.enabled = outs['enabled']