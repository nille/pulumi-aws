// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Outputs
{

    [OutputType]
    public sealed class VirtualNodeSpecListenerTlsValidationTrustFile
    {
        /// <summary>
        /// The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
        /// </summary>
        public readonly string CertificateChain;

        [OutputConstructor]
        private VirtualNodeSpecListenerTlsValidationTrustFile(string certificateChain)
        {
            CertificateChain = certificateChain;
        }
    }
}