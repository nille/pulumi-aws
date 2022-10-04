// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MultiRegionAccessPointDetailsPublicAccessBlock {
    private @Nullable Boolean blockPublicAcls;
    private @Nullable Boolean blockPublicPolicy;
    private @Nullable Boolean ignorePublicAcls;
    private @Nullable Boolean restrictPublicBuckets;

    private MultiRegionAccessPointDetailsPublicAccessBlock() {}
    public Optional<Boolean> blockPublicAcls() {
        return Optional.ofNullable(this.blockPublicAcls);
    }
    public Optional<Boolean> blockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }
    public Optional<Boolean> ignorePublicAcls() {
        return Optional.ofNullable(this.ignorePublicAcls);
    }
    public Optional<Boolean> restrictPublicBuckets() {
        return Optional.ofNullable(this.restrictPublicBuckets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointDetailsPublicAccessBlock defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean blockPublicAcls;
        private @Nullable Boolean blockPublicPolicy;
        private @Nullable Boolean ignorePublicAcls;
        private @Nullable Boolean restrictPublicBuckets;
        public Builder() {}
        public Builder(MultiRegionAccessPointDetailsPublicAccessBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        @CustomType.Setter
        public Builder blockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }
        @CustomType.Setter
        public Builder blockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder ignorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }
        @CustomType.Setter
        public Builder restrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }
        public MultiRegionAccessPointDetailsPublicAccessBlock build() {
            final var o = new MultiRegionAccessPointDetailsPublicAccessBlock();
            o.blockPublicAcls = blockPublicAcls;
            o.blockPublicPolicy = blockPublicPolicy;
            o.ignorePublicAcls = ignorePublicAcls;
            o.restrictPublicBuckets = restrictPublicBuckets;
            return o;
        }
    }
}