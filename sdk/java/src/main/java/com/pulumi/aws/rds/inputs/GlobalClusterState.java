// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.aws.rds.inputs.GlobalClusterGlobalClusterMemberArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClusterState extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClusterState Empty = new GlobalClusterState();

    /**
     * RDS Global Cluster Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return RDS Global Cluster Amazon Resource Name (ARN)
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return Name for an automatically created database on cluster creation.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    /**
     * @return If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    @Import(name="engine")
    private @Nullable Output<String> engine;

    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    @Import(name="engineVersionActual")
    private @Nullable Output<String> engineVersionActual;

    public Optional<Output<String>> engineVersionActual() {
        return Optional.ofNullable(this.engineVersionActual);
    }

    /**
     * Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * Global cluster identifier.
     * 
     */
    @Import(name="globalClusterIdentifier")
    private @Nullable Output<String> globalClusterIdentifier;

    /**
     * @return Global cluster identifier.
     * 
     */
    public Optional<Output<String>> globalClusterIdentifier() {
        return Optional.ofNullable(this.globalClusterIdentifier);
    }

    /**
     * Set of objects containing Global Cluster members.
     * 
     */
    @Import(name="globalClusterMembers")
    private @Nullable Output<List<GlobalClusterGlobalClusterMemberArgs>> globalClusterMembers;

    /**
     * @return Set of objects containing Global Cluster members.
     * 
     */
    public Optional<Output<List<GlobalClusterGlobalClusterMemberArgs>>> globalClusterMembers() {
        return Optional.ofNullable(this.globalClusterMembers);
    }

    /**
     * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
     * 
     */
    @Import(name="globalClusterResourceId")
    private @Nullable Output<String> globalClusterResourceId;

    /**
     * @return AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
     * 
     */
    public Optional<Output<String>> globalClusterResourceId() {
        return Optional.ofNullable(this.globalClusterResourceId);
    }

    /**
     * Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     * 
     */
    @Import(name="sourceDbClusterIdentifier")
    private @Nullable Output<String> sourceDbClusterIdentifier;

    /**
     * @return Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     * 
     */
    public Optional<Output<String>> sourceDbClusterIdentifier() {
        return Optional.ofNullable(this.sourceDbClusterIdentifier);
    }

    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="storageEncrypted")
    private @Nullable Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Optional<Output<Boolean>> storageEncrypted() {
        return Optional.ofNullable(this.storageEncrypted);
    }

    private GlobalClusterState() {}

    private GlobalClusterState(GlobalClusterState $) {
        this.arn = $.arn;
        this.databaseName = $.databaseName;
        this.deletionProtection = $.deletionProtection;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.engineVersionActual = $.engineVersionActual;
        this.forceDestroy = $.forceDestroy;
        this.globalClusterIdentifier = $.globalClusterIdentifier;
        this.globalClusterMembers = $.globalClusterMembers;
        this.globalClusterResourceId = $.globalClusterResourceId;
        this.sourceDbClusterIdentifier = $.sourceDbClusterIdentifier;
        this.storageEncrypted = $.storageEncrypted;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClusterState $;

        public Builder() {
            $ = new GlobalClusterState();
        }

        public Builder(GlobalClusterState defaults) {
            $ = new GlobalClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn RDS Global Cluster Amazon Resource Name (ARN)
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn RDS Global Cluster Amazon Resource Name (ARN)
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param databaseName Name for an automatically created database on cluster creation.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Name for an automatically created database on cluster creation.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param deletionProtection If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection If the Global Cluster should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        public Builder engineVersionActual(@Nullable Output<String> engineVersionActual) {
            $.engineVersionActual = engineVersionActual;
            return this;
        }

        public Builder engineVersionActual(String engineVersionActual) {
            return engineVersionActual(Output.of(engineVersionActual));
        }

        /**
         * @param forceDestroy Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param globalClusterIdentifier Global cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder globalClusterIdentifier(@Nullable Output<String> globalClusterIdentifier) {
            $.globalClusterIdentifier = globalClusterIdentifier;
            return this;
        }

        /**
         * @param globalClusterIdentifier Global cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder globalClusterIdentifier(String globalClusterIdentifier) {
            return globalClusterIdentifier(Output.of(globalClusterIdentifier));
        }

        /**
         * @param globalClusterMembers Set of objects containing Global Cluster members.
         * 
         * @return builder
         * 
         */
        public Builder globalClusterMembers(@Nullable Output<List<GlobalClusterGlobalClusterMemberArgs>> globalClusterMembers) {
            $.globalClusterMembers = globalClusterMembers;
            return this;
        }

        /**
         * @param globalClusterMembers Set of objects containing Global Cluster members.
         * 
         * @return builder
         * 
         */
        public Builder globalClusterMembers(List<GlobalClusterGlobalClusterMemberArgs> globalClusterMembers) {
            return globalClusterMembers(Output.of(globalClusterMembers));
        }

        /**
         * @param globalClusterMembers Set of objects containing Global Cluster members.
         * 
         * @return builder
         * 
         */
        public Builder globalClusterMembers(GlobalClusterGlobalClusterMemberArgs... globalClusterMembers) {
            return globalClusterMembers(List.of(globalClusterMembers));
        }

        /**
         * @param globalClusterResourceId AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
         * 
         * @return builder
         * 
         */
        public Builder globalClusterResourceId(@Nullable Output<String> globalClusterResourceId) {
            $.globalClusterResourceId = globalClusterResourceId;
            return this;
        }

        /**
         * @param globalClusterResourceId AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
         * 
         * @return builder
         * 
         */
        public Builder globalClusterResourceId(String globalClusterResourceId) {
            return globalClusterResourceId(Output.of(globalClusterResourceId));
        }

        /**
         * @param sourceDbClusterIdentifier Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
         * 
         * @return builder
         * 
         */
        public Builder sourceDbClusterIdentifier(@Nullable Output<String> sourceDbClusterIdentifier) {
            $.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
            return this;
        }

        /**
         * @param sourceDbClusterIdentifier Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
         * 
         * @return builder
         * 
         */
        public Builder sourceDbClusterIdentifier(String sourceDbClusterIdentifier) {
            return sourceDbClusterIdentifier(Output.of(sourceDbClusterIdentifier));
        }

        /**
         * @param storageEncrypted Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            $.storageEncrypted = storageEncrypted;
            return this;
        }

        /**
         * @param storageEncrypted Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
         * 
         * @return builder
         * 
         */
        public Builder storageEncrypted(Boolean storageEncrypted) {
            return storageEncrypted(Output.of(storageEncrypted));
        }

        public GlobalClusterState build() {
            return $;
        }
    }

}