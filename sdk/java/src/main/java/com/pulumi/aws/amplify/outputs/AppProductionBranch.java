// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppProductionBranch {
    /**
     * @return Branch name for the production branch.
     * 
     */
    private @Nullable String branchName;
    /**
     * @return Last deploy time of the production branch.
     * 
     */
    private @Nullable String lastDeployTime;
    /**
     * @return Status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    private @Nullable String status;
    /**
     * @return Thumbnail URL for the production branch.
     * 
     */
    private @Nullable String thumbnailUrl;

    private AppProductionBranch() {}
    /**
     * @return Branch name for the production branch.
     * 
     */
    public Optional<String> branchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * @return Last deploy time of the production branch.
     * 
     */
    public Optional<String> lastDeployTime() {
        return Optional.ofNullable(this.lastDeployTime);
    }
    /**
     * @return Status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Thumbnail URL for the production branch.
     * 
     */
    public Optional<String> thumbnailUrl() {
        return Optional.ofNullable(this.thumbnailUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppProductionBranch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String lastDeployTime;
        private @Nullable String status;
        private @Nullable String thumbnailUrl;
        public Builder() {}
        public Builder(AppProductionBranch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.lastDeployTime = defaults.lastDeployTime;
    	      this.status = defaults.status;
    	      this.thumbnailUrl = defaults.thumbnailUrl;
        }

        @CustomType.Setter
        public Builder branchName(@Nullable String branchName) {
            this.branchName = branchName;
            return this;
        }
        @CustomType.Setter
        public Builder lastDeployTime(@Nullable String lastDeployTime) {
            this.lastDeployTime = lastDeployTime;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder thumbnailUrl(@Nullable String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public AppProductionBranch build() {
            final var o = new AppProductionBranch();
            o.branchName = branchName;
            o.lastDeployTime = lastDeployTime;
            o.status = status;
            o.thumbnailUrl = thumbnailUrl;
            return o;
        }
    }
}