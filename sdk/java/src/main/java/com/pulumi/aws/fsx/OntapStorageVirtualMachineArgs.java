// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OntapStorageVirtualMachineArgs extends com.pulumi.resources.ResourceArgs {

    public static final OntapStorageVirtualMachineArgs Empty = new OntapStorageVirtualMachineArgs();

    /**
     * Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     * 
     */
    @Import(name="activeDirectoryConfiguration")
    private @Nullable Output<OntapStorageVirtualMachineActiveDirectoryConfigurationArgs> activeDirectoryConfiguration;

    /**
     * @return Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     * 
     */
    public Optional<Output<OntapStorageVirtualMachineActiveDirectoryConfigurationArgs>> activeDirectoryConfiguration() {
        return Optional.ofNullable(this.activeDirectoryConfiguration);
    }

    /**
     * The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    /**
     * @return The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
     * 
     */
    @Import(name="rootVolumeSecurityStyle")
    private @Nullable Output<String> rootVolumeSecurityStyle;

    /**
     * @return Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
     * 
     */
    public Optional<Output<String>> rootVolumeSecurityStyle() {
        return Optional.ofNullable(this.rootVolumeSecurityStyle);
    }

    @Import(name="svmAdminPassword")
    private @Nullable Output<String> svmAdminPassword;

    public Optional<Output<String>> svmAdminPassword() {
        return Optional.ofNullable(this.svmAdminPassword);
    }

    /**
     * A map of tags to assign to the storage virtual machine. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the storage virtual machine. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private OntapStorageVirtualMachineArgs() {}

    private OntapStorageVirtualMachineArgs(OntapStorageVirtualMachineArgs $) {
        this.activeDirectoryConfiguration = $.activeDirectoryConfiguration;
        this.fileSystemId = $.fileSystemId;
        this.name = $.name;
        this.rootVolumeSecurityStyle = $.rootVolumeSecurityStyle;
        this.svmAdminPassword = $.svmAdminPassword;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OntapStorageVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OntapStorageVirtualMachineArgs $;

        public Builder() {
            $ = new OntapStorageVirtualMachineArgs();
        }

        public Builder(OntapStorageVirtualMachineArgs defaults) {
            $ = new OntapStorageVirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectoryConfiguration Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryConfiguration(@Nullable Output<OntapStorageVirtualMachineActiveDirectoryConfigurationArgs> activeDirectoryConfiguration) {
            $.activeDirectoryConfiguration = activeDirectoryConfiguration;
            return this;
        }

        /**
         * @param activeDirectoryConfiguration Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryConfiguration(OntapStorageVirtualMachineActiveDirectoryConfigurationArgs activeDirectoryConfiguration) {
            return activeDirectoryConfiguration(Output.of(activeDirectoryConfiguration));
        }

        /**
         * @param fileSystemId The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param fileSystemId The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        /**
         * @param name The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rootVolumeSecurityStyle Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeSecurityStyle(@Nullable Output<String> rootVolumeSecurityStyle) {
            $.rootVolumeSecurityStyle = rootVolumeSecurityStyle;
            return this;
        }

        /**
         * @param rootVolumeSecurityStyle Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeSecurityStyle(String rootVolumeSecurityStyle) {
            return rootVolumeSecurityStyle(Output.of(rootVolumeSecurityStyle));
        }

        public Builder svmAdminPassword(@Nullable Output<String> svmAdminPassword) {
            $.svmAdminPassword = svmAdminPassword;
            return this;
        }

        public Builder svmAdminPassword(String svmAdminPassword) {
            return svmAdminPassword(Output.of(svmAdminPassword));
        }

        /**
         * @param tags A map of tags to assign to the storage virtual machine. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the storage virtual machine. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public OntapStorageVirtualMachineArgs build() {
            $.fileSystemId = Objects.requireNonNull($.fileSystemId, "expected parameter 'fileSystemId' to be non-null");
            return $;
        }
    }

}