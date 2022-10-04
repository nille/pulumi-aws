// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceActionDefinition {
    /**
     * @return ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
     * 
     */
    private @Nullable String assumeRole;
    /**
     * @return Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
     * 
     */
    private String name;
    /**
     * @return List of parameters in JSON format. For example: `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TARGET\&#34;}]` or `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TEXT_VALUE\&#34;}]`.
     * 
     */
    private @Nullable String parameters;
    /**
     * @return Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
     * 
     */
    private @Nullable String type;
    /**
     * @return SSM document version. For example, `1`.
     * 
     */
    private String version;

    private ServiceActionDefinition() {}
    /**
     * @return ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
     * 
     */
    public Optional<String> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }
    /**
     * @return Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of parameters in JSON format. For example: `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TARGET\&#34;}]` or `[{\&#34;Name\&#34;:\&#34;InstanceId\&#34;,\&#34;Type\&#34;:\&#34;TEXT_VALUE\&#34;}]`.
     * 
     */
    public Optional<String> parameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * @return Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return SSM document version. For example, `1`.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceActionDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String assumeRole;
        private String name;
        private @Nullable String parameters;
        private @Nullable String type;
        private String version;
        public Builder() {}
        public Builder(ServiceActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assumeRole = defaults.assumeRole;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder assumeRole(@Nullable String assumeRole) {
            this.assumeRole = assumeRole;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ServiceActionDefinition build() {
            final var o = new ServiceActionDefinition();
            o.assumeRole = assumeRole;
            o.name = name;
            o.parameters = parameters;
            o.type = type;
            o.version = version;
            return o;
        }
    }
}