// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OpenZfsVolumeNfsExportsClientConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenZfsVolumeNfsExportsClientConfigurationArgs Empty = new OpenZfsVolumeNfsExportsClientConfigurationArgs();

    /**
     * - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
     * 
     */
    @Import(name="clients", required=true)
    private Output<String> clients;

    /**
     * @return - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
     * 
     */
    public Output<String> clients() {
        return this.clients;
    }

    /**
     * -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
     * 
     */
    @Import(name="options", required=true)
    private Output<List<String>> options;

    /**
     * @return -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
     * 
     */
    public Output<List<String>> options() {
        return this.options;
    }

    private OpenZfsVolumeNfsExportsClientConfigurationArgs() {}

    private OpenZfsVolumeNfsExportsClientConfigurationArgs(OpenZfsVolumeNfsExportsClientConfigurationArgs $) {
        this.clients = $.clients;
        this.options = $.options;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenZfsVolumeNfsExportsClientConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenZfsVolumeNfsExportsClientConfigurationArgs $;

        public Builder() {
            $ = new OpenZfsVolumeNfsExportsClientConfigurationArgs();
        }

        public Builder(OpenZfsVolumeNfsExportsClientConfigurationArgs defaults) {
            $ = new OpenZfsVolumeNfsExportsClientConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clients - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
         * 
         * @return builder
         * 
         */
        public Builder clients(Output<String> clients) {
            $.clients = clients;
            return this;
        }

        /**
         * @param clients - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
         * 
         * @return builder
         * 
         */
        public Builder clients(String clients) {
            return clients(Output.of(clients));
        }

        /**
         * @param options -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
         * 
         * @return builder
         * 
         */
        public Builder options(Output<List<String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
         * 
         * @return builder
         * 
         */
        public Builder options(List<String> options) {
            return options(Output.of(options));
        }

        /**
         * @param options -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
         * 
         * @return builder
         * 
         */
        public Builder options(String... options) {
            return options(List.of(options));
        }

        public OpenZfsVolumeNfsExportsClientConfigurationArgs build() {
            $.clients = Objects.requireNonNull($.clients, "expected parameter 'clients' to be non-null");
            $.options = Objects.requireNonNull($.options, "expected parameter 'options' to be non-null");
            return $;
        }
    }

}