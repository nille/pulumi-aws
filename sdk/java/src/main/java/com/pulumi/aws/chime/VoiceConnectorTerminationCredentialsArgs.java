// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime;

import com.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VoiceConnectorTerminationCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorTerminationCredentialsArgs Empty = new VoiceConnectorTerminationCredentialsArgs();

    /**
     * List of termination SIP credentials.
     * 
     */
    @Import(name="credentials", required=true)
    private Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> credentials;

    /**
     * @return List of termination SIP credentials.
     * 
     */
    public Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> credentials() {
        return this.credentials;
    }

    /**
     * Amazon Chime Voice Connector ID.
     * 
     */
    @Import(name="voiceConnectorId", required=true)
    private Output<String> voiceConnectorId;

    /**
     * @return Amazon Chime Voice Connector ID.
     * 
     */
    public Output<String> voiceConnectorId() {
        return this.voiceConnectorId;
    }

    private VoiceConnectorTerminationCredentialsArgs() {}

    private VoiceConnectorTerminationCredentialsArgs(VoiceConnectorTerminationCredentialsArgs $) {
        this.credentials = $.credentials;
        this.voiceConnectorId = $.voiceConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VoiceConnectorTerminationCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VoiceConnectorTerminationCredentialsArgs $;

        public Builder() {
            $ = new VoiceConnectorTerminationCredentialsArgs();
        }

        public Builder(VoiceConnectorTerminationCredentialsArgs defaults) {
            $ = new VoiceConnectorTerminationCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials List of termination SIP credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(Output<List<VoiceConnectorTerminationCredentialsCredentialArgs>> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials List of termination SIP credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(List<VoiceConnectorTerminationCredentialsCredentialArgs> credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param credentials List of termination SIP credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(VoiceConnectorTerminationCredentialsCredentialArgs... credentials) {
            return credentials(List.of(credentials));
        }

        /**
         * @param voiceConnectorId Amazon Chime Voice Connector ID.
         * 
         * @return builder
         * 
         */
        public Builder voiceConnectorId(Output<String> voiceConnectorId) {
            $.voiceConnectorId = voiceConnectorId;
            return this;
        }

        /**
         * @param voiceConnectorId Amazon Chime Voice Connector ID.
         * 
         * @return builder
         * 
         */
        public Builder voiceConnectorId(String voiceConnectorId) {
            return voiceConnectorId(Output.of(voiceConnectorId));
        }

        public VoiceConnectorTerminationCredentialsArgs build() {
            $.credentials = Objects.requireNonNull($.credentials, "expected parameter 'credentials' to be non-null");
            $.voiceConnectorId = Objects.requireNonNull($.voiceConnectorId, "expected parameter 'voiceConnectorId' to be non-null");
            return $;
        }
    }

}