// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SigningJobRevocationRecord {
    private @Nullable String reason;
    private @Nullable String revokedAt;
    private @Nullable String revokedBy;

    private SigningJobRevocationRecord() {}
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    public Optional<String> revokedAt() {
        return Optional.ofNullable(this.revokedAt);
    }
    public Optional<String> revokedBy() {
        return Optional.ofNullable(this.revokedBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobRevocationRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String reason;
        private @Nullable String revokedAt;
        private @Nullable String revokedBy;
        public Builder() {}
        public Builder(SigningJobRevocationRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reason = defaults.reason;
    	      this.revokedAt = defaults.revokedAt;
    	      this.revokedBy = defaults.revokedBy;
        }

        @CustomType.Setter
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        @CustomType.Setter
        public Builder revokedAt(@Nullable String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        @CustomType.Setter
        public Builder revokedBy(@Nullable String revokedBy) {
            this.revokedBy = revokedBy;
            return this;
        }
        public SigningJobRevocationRecord build() {
            final var o = new SigningJobRevocationRecord();
            o.reason = reason;
            o.revokedAt = revokedAt;
            o.revokedBy = revokedBy;
            return o;
        }
    }
}