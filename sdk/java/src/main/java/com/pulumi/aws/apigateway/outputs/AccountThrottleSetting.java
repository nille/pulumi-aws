// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountThrottleSetting {
    /**
     * @return Absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    private @Nullable Integer burstLimit;
    /**
     * @return Number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    private @Nullable Double rateLimit;

    private AccountThrottleSetting() {}
    /**
     * @return Absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    public Optional<Integer> burstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }
    /**
     * @return Number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    public Optional<Double> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountThrottleSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer burstLimit;
        private @Nullable Double rateLimit;
        public Builder() {}
        public Builder(AccountThrottleSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.rateLimit = defaults.rateLimit;
        }

        @CustomType.Setter
        public Builder burstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }
        @CustomType.Setter
        public Builder rateLimit(@Nullable Double rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public AccountThrottleSetting build() {
            final var o = new AccountThrottleSetting();
            o.burstLimit = burstLimit;
            o.rateLimit = rateLimit;
            return o;
        }
    }
}