# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Certificate']


class Certificate(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_authority_arn: Optional[pulumi.Input[str]] = None,
                 certificate_signing_request: Optional[pulumi.Input[str]] = None,
                 signing_algorithm: Optional[pulumi.Input[str]] = None,
                 template_arn: Optional[pulumi.Input[str]] = None,
                 validity: Optional[pulumi.Input[pulumi.InputType['CertificateValidityArgs']]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a resource to issue a certificate using AWS Certificate Manager Private Certificate Authority (ACM PCA).

        ## Example Usage

        ## Import

        `aws_acmpca_certificate` can not be imported at this time.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_authority_arn: Amazon Resource Name (ARN) of the certificate authority.
        :param pulumi.Input[str] certificate_signing_request: Certificate Signing Request in PEM format.
        :param pulumi.Input[str] signing_algorithm: Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
        :param pulumi.Input[str] template_arn: The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
        :param pulumi.Input[pulumi.InputType['CertificateValidityArgs']] validity: Configures end of the validity period for the certificate. See validity block below.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if certificate_authority_arn is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_authority_arn'")
            __props__['certificate_authority_arn'] = certificate_authority_arn
            if certificate_signing_request is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_signing_request'")
            __props__['certificate_signing_request'] = certificate_signing_request
            if signing_algorithm is None and not opts.urn:
                raise TypeError("Missing required property 'signing_algorithm'")
            __props__['signing_algorithm'] = signing_algorithm
            __props__['template_arn'] = template_arn
            if validity is None and not opts.urn:
                raise TypeError("Missing required property 'validity'")
            __props__['validity'] = validity
            __props__['arn'] = None
            __props__['certificate'] = None
            __props__['certificate_chain'] = None
        super(Certificate, __self__).__init__(
            'aws:acmpca/certificate:Certificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            certificate_authority_arn: Optional[pulumi.Input[str]] = None,
            certificate_chain: Optional[pulumi.Input[str]] = None,
            certificate_signing_request: Optional[pulumi.Input[str]] = None,
            signing_algorithm: Optional[pulumi.Input[str]] = None,
            template_arn: Optional[pulumi.Input[str]] = None,
            validity: Optional[pulumi.Input[pulumi.InputType['CertificateValidityArgs']]] = None) -> 'Certificate':
        """
        Get an existing Certificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the certificate.
        :param pulumi.Input[str] certificate: The PEM-encoded certificate value.
        :param pulumi.Input[str] certificate_authority_arn: Amazon Resource Name (ARN) of the certificate authority.
        :param pulumi.Input[str] certificate_chain: The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
        :param pulumi.Input[str] certificate_signing_request: Certificate Signing Request in PEM format.
        :param pulumi.Input[str] signing_algorithm: Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
        :param pulumi.Input[str] template_arn: The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
        :param pulumi.Input[pulumi.InputType['CertificateValidityArgs']] validity: Configures end of the validity period for the certificate. See validity block below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["arn"] = arn
        __props__["certificate"] = certificate
        __props__["certificate_authority_arn"] = certificate_authority_arn
        __props__["certificate_chain"] = certificate_chain
        __props__["certificate_signing_request"] = certificate_signing_request
        __props__["signing_algorithm"] = signing_algorithm
        __props__["template_arn"] = template_arn
        __props__["validity"] = validity
        return Certificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the certificate.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The PEM-encoded certificate value.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="certificateAuthorityArn")
    def certificate_authority_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the certificate authority.
        """
        return pulumi.get(self, "certificate_authority_arn")

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> pulumi.Output[str]:
        """
        The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter(name="certificateSigningRequest")
    def certificate_signing_request(self) -> pulumi.Output[str]:
        """
        Certificate Signing Request in PEM format.
        """
        return pulumi.get(self, "certificate_signing_request")

    @property
    @pulumi.getter(name="signingAlgorithm")
    def signing_algorithm(self) -> pulumi.Output[str]:
        """
        Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
        """
        return pulumi.get(self, "signing_algorithm")

    @property
    @pulumi.getter(name="templateArn")
    def template_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
        """
        return pulumi.get(self, "template_arn")

    @property
    @pulumi.getter
    def validity(self) -> pulumi.Output['outputs.CertificateValidity']:
        """
        Configures end of the validity period for the certificate. See validity block below.
        """
        return pulumi.get(self, "validity")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
