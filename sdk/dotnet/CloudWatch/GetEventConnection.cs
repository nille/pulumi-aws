// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch
{
    public static class GetEventConnection
    {
        /// <summary>
        /// Use this data source to retrieve information about a EventBridge connection.
        /// 
        /// &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Aws.CloudWatch.GetEventConnection.InvokeAsync(new Aws.CloudWatch.GetEventConnectionArgs
        ///         {
        ///             Name = "test",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEventConnectionResult> InvokeAsync(GetEventConnectionArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEventConnectionResult>("aws:cloudwatch/getEventConnection:getEventConnection", args ?? new GetEventConnectionArgs(), options.WithVersion());
    }


    public sealed class GetEventConnectionArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetEventConnectionArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEventConnectionResult
    {
        /// <summary>
        /// The ARN (Amazon Resource Name) for the connection.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// The type of authorization to use to connect. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
        /// </summary>
        public readonly string AuthorizationType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the connection.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ARN (Amazon Resource Name) for the secret created from the authorization parameters specified for the connection.
        /// </summary>
        public readonly string SecretArn;

        [OutputConstructor]
        private GetEventConnectionResult(
            string arn,

            string authorizationType,

            string id,

            string name,

            string secretArn)
        {
            Arn = arn;
            AuthorizationType = authorizationType;
            Id = id;
            Name = name;
            SecretArn = secretArn;
        }
    }
}