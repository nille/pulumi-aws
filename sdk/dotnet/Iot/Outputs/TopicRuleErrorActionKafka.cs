// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot.Outputs
{

    [OutputType]
    public sealed class TopicRuleErrorActionKafka
    {
        /// <summary>
        /// Properties of the Apache Kafka producer client. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/apache-kafka-rule-action.html).
        /// </summary>
        public readonly ImmutableDictionary<string, string> ClientProperties;
        /// <summary>
        /// The ARN of Kafka action's VPC `aws.iot.TopicRuleDestination` .
        /// </summary>
        public readonly string DestinationArn;
        /// <summary>
        /// The Kafka message key.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// The Kafka message partition.
        /// </summary>
        public readonly string? Partition;
        /// <summary>
        /// The Kafka topic for messages to be sent to the Kafka broker.
        /// </summary>
        public readonly string Topic;

        [OutputConstructor]
        private TopicRuleErrorActionKafka(
            ImmutableDictionary<string, string> clientProperties,

            string destinationArn,

            string? key,

            string? partition,

            string topic)
        {
            ClientProperties = clientProperties;
            DestinationArn = destinationArn;
            Key = key;
            Partition = partition;
            Topic = topic;
        }
    }
}