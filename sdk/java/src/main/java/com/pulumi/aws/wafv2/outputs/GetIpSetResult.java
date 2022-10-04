// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpSetResult {
    /**
     * @return An array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     * 
     */
    private List<String> addresses;
    /**
     * @return ARN of the entity.
     * 
     */
    private String arn;
    /**
     * @return Description of the set that helps with identification.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return IP address version of the set.
     * 
     */
    private String ipAddressVersion;
    private String name;
    private String scope;

    private GetIpSetResult() {}
    /**
     * @return An array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
     * 
     */
    public List<String> addresses() {
        return this.addresses;
    }
    /**
     * @return ARN of the entity.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Description of the set that helps with identification.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IP address version of the set.
     * 
     */
    public String ipAddressVersion() {
        return this.ipAddressVersion;
    }
    public String name() {
        return this.name;
    }
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpSetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addresses;
        private String arn;
        private String description;
        private String id;
        private String ipAddressVersion;
        private String name;
        private String scope;
        public Builder() {}
        public Builder(GetIpSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipAddressVersion = defaults.ipAddressVersion;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder addresses(List<String> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddressVersion(String ipAddressVersion) {
            this.ipAddressVersion = Objects.requireNonNull(ipAddressVersion);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetIpSetResult build() {
            final var o = new GetIpSetResult();
            o.addresses = addresses;
            o.arn = arn;
            o.description = description;
            o.id = id;
            o.ipAddressVersion = ipAddressVersion;
            o.name = name;
            o.scope = scope;
            return o;
        }
    }
}