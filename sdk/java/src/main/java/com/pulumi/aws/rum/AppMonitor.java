// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rum;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rum.AppMonitorArgs;
import com.pulumi.aws.rum.inputs.AppMonitorState;
import com.pulumi.aws.rum.outputs.AppMonitorAppMonitorConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch RUM App Monitor resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rum.AppMonitor;
 * import com.pulumi.aws.rum.AppMonitorArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new AppMonitor(&#34;example&#34;, AppMonitorArgs.builder()        
 *             .domain(&#34;localhost&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloudwatch RUM App Monitor can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rum/appMonitor:AppMonitor example example
 * ```
 * 
 */
@ResourceType(type="aws:rum/appMonitor:AppMonitor")
public class AppMonitor extends com.pulumi.resources.CustomResource {
    @Export(name="appMonitorConfiguration", type=AppMonitorAppMonitorConfiguration.class, parameters={})
    private Output<AppMonitorAppMonitorConfiguration> appMonitorConfiguration;

    public Output<AppMonitorAppMonitorConfiguration> appMonitorConfiguration() {
        return this.appMonitorConfiguration;
    }
    /**
     * The Amazon Resource Name (ARN) specifying the app monitor.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the app monitor.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter  specifies whether RUM sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges. Default value is `false`.
     * 
     */
    @Export(name="cwLogEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cwLogEnabled;

    /**
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter  specifies whether RUM sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges. Default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> cwLogEnabled() {
        return Codegen.optional(this.cwLogEnabled);
    }
    /**
     * The name of the log group where the copies are stored.
     * 
     */
    @Export(name="cwLogGroup", type=String.class, parameters={})
    private Output<String> cwLogGroup;

    /**
     * @return The name of the log group where the copies are stored.
     * 
     */
    public Output<String> cwLogGroup() {
        return this.cwLogGroup;
    }
    /**
     * configuration data for the app monitor. See app_monitor_configuration below.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return configuration data for the app monitor. See app_monitor_configuration below.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The name of the log stream.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the log stream.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppMonitor(String name) {
        this(name, AppMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppMonitor(String name, AppMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppMonitor(String name, AppMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rum/appMonitor:AppMonitor", name, args == null ? AppMonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppMonitor(String name, Output<String> id, @Nullable AppMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rum/appMonitor:AppMonitor", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AppMonitor get(String name, Output<String> id, @Nullable AppMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppMonitor(name, id, state, options);
    }
}