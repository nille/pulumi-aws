// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationAccount {
    /**
     * @return ARN of the root
     * 
     */
    private @Nullable String arn;
    /**
     * @return Email of the account
     * 
     */
    private @Nullable String email;
    /**
     * @return Identifier of the root
     * 
     */
    private @Nullable String id;
    /**
     * @return The name of the policy type
     * 
     */
    private @Nullable String name;
    /**
     * @return The status of the policy type as it relates to the associated root
     * 
     */
    private @Nullable String status;

    private OrganizationAccount() {}
    /**
     * @return ARN of the root
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Email of the account
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return Identifier of the root
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the policy type
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The status of the policy type as it relates to the associated root
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String email;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String status;
        public Builder() {}
        public Builder(OrganizationAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public OrganizationAccount build() {
            final var o = new OrganizationAccount();
            o.arn = arn;
            o.email = email;
            o.id = id;
            o.name = name;
            o.status = status;
            return o;
        }
    }
}