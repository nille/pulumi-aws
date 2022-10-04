// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSecretRotationRule {
    private Integer automaticallyAfterDays;

    private GetSecretRotationRule() {}
    public Integer automaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretRotationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer automaticallyAfterDays;
        public Builder() {}
        public Builder(GetSecretRotationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticallyAfterDays = defaults.automaticallyAfterDays;
        }

        @CustomType.Setter
        public Builder automaticallyAfterDays(Integer automaticallyAfterDays) {
            this.automaticallyAfterDays = Objects.requireNonNull(automaticallyAfterDays);
            return this;
        }
        public GetSecretRotationRule build() {
            final var o = new GetSecretRotationRule();
            o.automaticallyAfterDays = automaticallyAfterDays;
            return o;
        }
    }
}