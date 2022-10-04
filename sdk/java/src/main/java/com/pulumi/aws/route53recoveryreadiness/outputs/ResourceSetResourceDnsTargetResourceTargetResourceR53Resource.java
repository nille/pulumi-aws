// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoveryreadiness.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceSetResourceDnsTargetResourceTargetResourceR53Resource {
    /**
     * @return Domain name that is targeted.
     * 
     */
    private @Nullable String domainName;
    /**
     * @return Resource record set ID that is targeted.
     * 
     */
    private @Nullable String recordSetId;

    private ResourceSetResourceDnsTargetResourceTargetResourceR53Resource() {}
    /**
     * @return Domain name that is targeted.
     * 
     */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * @return Resource record set ID that is targeted.
     * 
     */
    public Optional<String> recordSetId() {
        return Optional.ofNullable(this.recordSetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResourceDnsTargetResourceTargetResourceR53Resource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String recordSetId;
        public Builder() {}
        public Builder(ResourceSetResourceDnsTargetResourceTargetResourceR53Resource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.recordSetId = defaults.recordSetId;
        }

        @CustomType.Setter
        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder recordSetId(@Nullable String recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }
        public ResourceSetResourceDnsTargetResourceTargetResourceR53Resource build() {
            final var o = new ResourceSetResourceDnsTargetResourceTargetResourceR53Resource();
            o.domainName = domainName;
            o.recordSetId = recordSetId;
            return o;
        }
    }
}