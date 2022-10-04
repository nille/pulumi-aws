// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.DistributionTrustedSignerItem;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionTrustedSigner {
    /**
     * @return A flag that specifies whether Origin Shield is enabled.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return List of nested attributes for each trusted signer
     * 
     */
    private @Nullable List<DistributionTrustedSignerItem> items;

    private DistributionTrustedSigner() {}
    /**
     * @return A flag that specifies whether Origin Shield is enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return List of nested attributes for each trusted signer
     * 
     */
    public List<DistributionTrustedSignerItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedSigner defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<DistributionTrustedSignerItem> items;
        public Builder() {}
        public Builder(DistributionTrustedSigner defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.items = defaults.items;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder items(@Nullable List<DistributionTrustedSignerItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(DistributionTrustedSignerItem... items) {
            return items(List.of(items));
        }
        public DistributionTrustedSigner build() {
            final var o = new DistributionTrustedSigner();
            o.enabled = enabled;
            o.items = items;
            return o;
        }
    }
}