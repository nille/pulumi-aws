// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetSpotPriceFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSpotPriceResult {
    private @Nullable String availabilityZone;
    private @Nullable List<GetSpotPriceFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String instanceType;
    /**
     * @return Most recent Spot Price value for the given instance type and AZ.
     * 
     */
    private String spotPrice;
    /**
     * @return The timestamp at which the Spot Price value was published.
     * 
     */
    private String spotPriceTimestamp;

    private GetSpotPriceResult() {}
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public List<GetSpotPriceFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Most recent Spot Price value for the given instance type and AZ.
     * 
     */
    public String spotPrice() {
        return this.spotPrice;
    }
    /**
     * @return The timestamp at which the Spot Price value was published.
     * 
     */
    public String spotPriceTimestamp() {
        return this.spotPriceTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpotPriceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable List<GetSpotPriceFilter> filters;
        private String id;
        private @Nullable String instanceType;
        private String spotPrice;
        private String spotPriceTimestamp;
        public Builder() {}
        public Builder(GetSpotPriceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceType = defaults.instanceType;
    	      this.spotPrice = defaults.spotPrice;
    	      this.spotPriceTimestamp = defaults.spotPriceTimestamp;
        }

        @CustomType.Setter
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetSpotPriceFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSpotPriceFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder spotPrice(String spotPrice) {
            this.spotPrice = Objects.requireNonNull(spotPrice);
            return this;
        }
        @CustomType.Setter
        public Builder spotPriceTimestamp(String spotPriceTimestamp) {
            this.spotPriceTimestamp = Objects.requireNonNull(spotPriceTimestamp);
            return this;
        }
        public GetSpotPriceResult build() {
            final var o = new GetSpotPriceResult();
            o.availabilityZone = availabilityZone;
            o.filters = filters;
            o.id = id;
            o.instanceType = instanceType;
            o.spotPrice = spotPrice;
            o.spotPriceTimestamp = spotPriceTimestamp;
            return o;
        }
    }
}