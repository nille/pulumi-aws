// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainEncryptAtRest {
    /**
     * @return Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `elasticsearch_version` of `6.0` or greater.
     * 
     */
    private Boolean enabled;
    private @Nullable String kmsKeyId;

    private DomainEncryptAtRest() {}
    /**
     * @return Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `elasticsearch_version` of `6.0` or greater.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEncryptAtRest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String kmsKeyId;
        public Builder() {}
        public Builder(DomainEncryptAtRest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public DomainEncryptAtRest build() {
            final var o = new DomainEncryptAtRest();
            o.enabled = enabled;
            o.kmsKeyId = kmsKeyId;
            return o;
        }
    }
}