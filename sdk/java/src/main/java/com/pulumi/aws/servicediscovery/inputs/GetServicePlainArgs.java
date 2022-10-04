// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePlainArgs Empty = new GetServicePlainArgs();

    /**
     * Name of the service.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the service.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * ID of the namespace that the service belongs to.
     * 
     */
    @Import(name="namespaceId", required=true)
    private String namespaceId;

    /**
     * @return ID of the namespace that the service belongs to.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
    }

    /**
     * Map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetServicePlainArgs() {}

    private GetServicePlainArgs(GetServicePlainArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePlainArgs $;

        public Builder() {
            $ = new GetServicePlainArgs();
        }

        public Builder(GetServicePlainArgs defaults) {
            $ = new GetServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespaceId ID of the namespace that the service belongs to.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetServicePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            return $;
        }
    }

}