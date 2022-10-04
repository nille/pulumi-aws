// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces.outputs;

import com.pulumi.aws.workspaces.outputs.GetDirectorySelfServicePermission;
import com.pulumi.aws.workspaces.outputs.GetDirectoryWorkspaceAccessProperty;
import com.pulumi.aws.workspaces.outputs.GetDirectoryWorkspaceCreationProperty;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDirectoryResult {
    /**
     * @return Directory alias.
     * 
     */
    private String alias;
    /**
     * @return User name for the service account.
     * 
     */
    private String customerUserName;
    private String directoryId;
    /**
     * @return Name of the directory.
     * 
     */
    private String directoryName;
    /**
     * @return Directory type.
     * 
     */
    private String directoryType;
    /**
     * @return IP addresses of the DNS servers for the directory.
     * 
     */
    private List<String> dnsIpAddresses;
    /**
     * @return Identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    private String iamRoleId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifiers of the IP access control groups associated with the directory.
     * 
     */
    private List<String> ipGroupIds;
    /**
     * @return Registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    private String registrationCode;
    /**
     * @return The permissions to enable or disable self-service capabilities.
     * 
     */
    private List<GetDirectorySelfServicePermission> selfServicePermissions;
    /**
     * @return Identifiers of the subnets where the directory resides.
     * 
     */
    private List<String> subnetIds;
    /**
     * @return A map of tags assigned to the WorkSpaces directory.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return (Optional) Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    private List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties;
    /**
     * @return The default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    private List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties;
    /**
     * @return The identifier of the security group that is assigned to new WorkSpaces. Defined below.
     * 
     */
    private String workspaceSecurityGroupId;

    private GetDirectoryResult() {}
    /**
     * @return Directory alias.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return User name for the service account.
     * 
     */
    public String customerUserName() {
        return this.customerUserName;
    }
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return Name of the directory.
     * 
     */
    public String directoryName() {
        return this.directoryName;
    }
    /**
     * @return Directory type.
     * 
     */
    public String directoryType() {
        return this.directoryType;
    }
    /**
     * @return IP addresses of the DNS servers for the directory.
     * 
     */
    public List<String> dnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * @return Identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    public String iamRoleId() {
        return this.iamRoleId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifiers of the IP access control groups associated with the directory.
     * 
     */
    public List<String> ipGroupIds() {
        return this.ipGroupIds;
    }
    /**
     * @return Registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    public String registrationCode() {
        return this.registrationCode;
    }
    /**
     * @return The permissions to enable or disable self-service capabilities.
     * 
     */
    public List<GetDirectorySelfServicePermission> selfServicePermissions() {
        return this.selfServicePermissions;
    }
    /**
     * @return Identifiers of the subnets where the directory resides.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return A map of tags assigned to the WorkSpaces directory.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return (Optional) Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    public List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties() {
        return this.workspaceAccessProperties;
    }
    /**
     * @return The default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    public List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties() {
        return this.workspaceCreationProperties;
    }
    /**
     * @return The identifier of the security group that is assigned to new WorkSpaces. Defined below.
     * 
     */
    public String workspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alias;
        private String customerUserName;
        private String directoryId;
        private String directoryName;
        private String directoryType;
        private List<String> dnsIpAddresses;
        private String iamRoleId;
        private String id;
        private List<String> ipGroupIds;
        private String registrationCode;
        private List<GetDirectorySelfServicePermission> selfServicePermissions;
        private List<String> subnetIds;
        private @Nullable Map<String,String> tags;
        private List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties;
        private List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties;
        private String workspaceSecurityGroupId;
        public Builder() {}
        public Builder(GetDirectoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.customerUserName = defaults.customerUserName;
    	      this.directoryId = defaults.directoryId;
    	      this.directoryName = defaults.directoryName;
    	      this.directoryType = defaults.directoryType;
    	      this.dnsIpAddresses = defaults.dnsIpAddresses;
    	      this.iamRoleId = defaults.iamRoleId;
    	      this.id = defaults.id;
    	      this.ipGroupIds = defaults.ipGroupIds;
    	      this.registrationCode = defaults.registrationCode;
    	      this.selfServicePermissions = defaults.selfServicePermissions;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.workspaceAccessProperties = defaults.workspaceAccessProperties;
    	      this.workspaceCreationProperties = defaults.workspaceCreationProperties;
    	      this.workspaceSecurityGroupId = defaults.workspaceSecurityGroupId;
        }

        @CustomType.Setter
        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        @CustomType.Setter
        public Builder customerUserName(String customerUserName) {
            this.customerUserName = Objects.requireNonNull(customerUserName);
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        @CustomType.Setter
        public Builder directoryName(String directoryName) {
            this.directoryName = Objects.requireNonNull(directoryName);
            return this;
        }
        @CustomType.Setter
        public Builder directoryType(String directoryType) {
            this.directoryType = Objects.requireNonNull(directoryType);
            return this;
        }
        @CustomType.Setter
        public Builder dnsIpAddresses(List<String> dnsIpAddresses) {
            this.dnsIpAddresses = Objects.requireNonNull(dnsIpAddresses);
            return this;
        }
        public Builder dnsIpAddresses(String... dnsIpAddresses) {
            return dnsIpAddresses(List.of(dnsIpAddresses));
        }
        @CustomType.Setter
        public Builder iamRoleId(String iamRoleId) {
            this.iamRoleId = Objects.requireNonNull(iamRoleId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipGroupIds(List<String> ipGroupIds) {
            this.ipGroupIds = Objects.requireNonNull(ipGroupIds);
            return this;
        }
        public Builder ipGroupIds(String... ipGroupIds) {
            return ipGroupIds(List.of(ipGroupIds));
        }
        @CustomType.Setter
        public Builder registrationCode(String registrationCode) {
            this.registrationCode = Objects.requireNonNull(registrationCode);
            return this;
        }
        @CustomType.Setter
        public Builder selfServicePermissions(List<GetDirectorySelfServicePermission> selfServicePermissions) {
            this.selfServicePermissions = Objects.requireNonNull(selfServicePermissions);
            return this;
        }
        public Builder selfServicePermissions(GetDirectorySelfServicePermission... selfServicePermissions) {
            return selfServicePermissions(List.of(selfServicePermissions));
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder workspaceAccessProperties(List<GetDirectoryWorkspaceAccessProperty> workspaceAccessProperties) {
            this.workspaceAccessProperties = Objects.requireNonNull(workspaceAccessProperties);
            return this;
        }
        public Builder workspaceAccessProperties(GetDirectoryWorkspaceAccessProperty... workspaceAccessProperties) {
            return workspaceAccessProperties(List.of(workspaceAccessProperties));
        }
        @CustomType.Setter
        public Builder workspaceCreationProperties(List<GetDirectoryWorkspaceCreationProperty> workspaceCreationProperties) {
            this.workspaceCreationProperties = Objects.requireNonNull(workspaceCreationProperties);
            return this;
        }
        public Builder workspaceCreationProperties(GetDirectoryWorkspaceCreationProperty... workspaceCreationProperties) {
            return workspaceCreationProperties(List.of(workspaceCreationProperties));
        }
        @CustomType.Setter
        public Builder workspaceSecurityGroupId(String workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = Objects.requireNonNull(workspaceSecurityGroupId);
            return this;
        }
        public GetDirectoryResult build() {
            final var o = new GetDirectoryResult();
            o.alias = alias;
            o.customerUserName = customerUserName;
            o.directoryId = directoryId;
            o.directoryName = directoryName;
            o.directoryType = directoryType;
            o.dnsIpAddresses = dnsIpAddresses;
            o.iamRoleId = iamRoleId;
            o.id = id;
            o.ipGroupIds = ipGroupIds;
            o.registrationCode = registrationCode;
            o.selfServicePermissions = selfServicePermissions;
            o.subnetIds = subnetIds;
            o.tags = tags;
            o.workspaceAccessProperties = workspaceAccessProperties;
            o.workspaceCreationProperties = workspaceCreationProperties;
            o.workspaceSecurityGroupId = workspaceSecurityGroupId;
            return o;
        }
    }
}