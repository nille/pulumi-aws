// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda.Outputs
{

    [OutputType]
    public sealed class EventSourceMappingSelfManagedEventSource
    {
        /// <summary>
        /// A map of endpoints for the self managed source.  For Kafka self-managed sources, the key should be `KAFKA_BOOTSTRAP_SERVERS` and the value should be a string with a comma separated list of broker endpoints.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Endpoints;

        [OutputConstructor]
        private EventSourceMappingSelfManagedEventSource(ImmutableDictionary<string, string> endpoints)
        {
            Endpoints = endpoints;
        }
    }
}