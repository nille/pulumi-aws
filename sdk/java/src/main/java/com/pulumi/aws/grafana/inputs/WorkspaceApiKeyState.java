// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceApiKeyState extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceApiKeyState Empty = new WorkspaceApiKeyState();

    /**
     * The key token in JSON format. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The key token in JSON format. Use this value as a bearer token to authenticate HTTP requests to the workspace.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Specifies the name of the API key. Key names must be unique to the workspace.
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    /**
     * @return Specifies the name of the API key. Key names must be unique to the workspace.
     * 
     */
    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * Specifies the permission level of the API key. Valid values are `VIEWER`, `EDITOR`, or `ADMIN`.
     * 
     */
    @Import(name="keyRole")
    private @Nullable Output<String> keyRole;

    /**
     * @return Specifies the permission level of the API key. Valid values are `VIEWER`, `EDITOR`, or `ADMIN`.
     * 
     */
    public Optional<Output<String>> keyRole() {
        return Optional.ofNullable(this.keyRole);
    }

    /**
     * Specifies the time in seconds until the API key expires. Keys can be valid for up to 30 days.
     * 
     */
    @Import(name="secondsToLive")
    private @Nullable Output<Integer> secondsToLive;

    /**
     * @return Specifies the time in seconds until the API key expires. Keys can be valid for up to 30 days.
     * 
     */
    public Optional<Output<Integer>> secondsToLive() {
        return Optional.ofNullable(this.secondsToLive);
    }

    /**
     * The ID of the workspace that the API key is valid for.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The ID of the workspace that the API key is valid for.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private WorkspaceApiKeyState() {}

    private WorkspaceApiKeyState(WorkspaceApiKeyState $) {
        this.key = $.key;
        this.keyName = $.keyName;
        this.keyRole = $.keyRole;
        this.secondsToLive = $.secondsToLive;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceApiKeyState $;

        public Builder() {
            $ = new WorkspaceApiKeyState();
        }

        public Builder(WorkspaceApiKeyState defaults) {
            $ = new WorkspaceApiKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key token in JSON format. Use this value as a bearer token to authenticate HTTP requests to the workspace.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key token in JSON format. Use this value as a bearer token to authenticate HTTP requests to the workspace.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param keyName Specifies the name of the API key. Key names must be unique to the workspace.
         * 
         * @return builder
         * 
         */
        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName Specifies the name of the API key. Key names must be unique to the workspace.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param keyRole Specifies the permission level of the API key. Valid values are `VIEWER`, `EDITOR`, or `ADMIN`.
         * 
         * @return builder
         * 
         */
        public Builder keyRole(@Nullable Output<String> keyRole) {
            $.keyRole = keyRole;
            return this;
        }

        /**
         * @param keyRole Specifies the permission level of the API key. Valid values are `VIEWER`, `EDITOR`, or `ADMIN`.
         * 
         * @return builder
         * 
         */
        public Builder keyRole(String keyRole) {
            return keyRole(Output.of(keyRole));
        }

        /**
         * @param secondsToLive Specifies the time in seconds until the API key expires. Keys can be valid for up to 30 days.
         * 
         * @return builder
         * 
         */
        public Builder secondsToLive(@Nullable Output<Integer> secondsToLive) {
            $.secondsToLive = secondsToLive;
            return this;
        }

        /**
         * @param secondsToLive Specifies the time in seconds until the API key expires. Keys can be valid for up to 30 days.
         * 
         * @return builder
         * 
         */
        public Builder secondsToLive(Integer secondsToLive) {
            return secondsToLive(Output.of(secondsToLive));
        }

        /**
         * @param workspaceId The ID of the workspace that the API key is valid for.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the workspace that the API key is valid for.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceApiKeyState build() {
            return $;
        }
    }

}