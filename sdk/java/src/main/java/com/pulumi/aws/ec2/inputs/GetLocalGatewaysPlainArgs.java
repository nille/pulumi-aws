// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewaysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewaysPlainArgs Empty = new GetLocalGatewaysPlainArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetLocalGatewaysFilter> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<List<GetLocalGatewaysFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Mapping of tags, each pair of which must exactly match
     * a pair on the desired local_gateways.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Mapping of tags, each pair of which must exactly match
     * a pair on the desired local_gateways.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLocalGatewaysPlainArgs() {}

    private GetLocalGatewaysPlainArgs(GetLocalGatewaysPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewaysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewaysPlainArgs $;

        public Builder() {
            $ = new GetLocalGatewaysPlainArgs();
        }

        public Builder(GetLocalGatewaysPlainArgs defaults) {
            $ = new GetLocalGatewaysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetLocalGatewaysFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLocalGatewaysFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags Mapping of tags, each pair of which must exactly match
         * a pair on the desired local_gateways.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLocalGatewaysPlainArgs build() {
            return $;
        }
    }

}