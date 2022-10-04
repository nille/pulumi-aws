// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificatePlainArgs Empty = new GetCertificatePlainArgs();

    /**
     * Certificate identifier. For example, `rds-ca-2019`.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Certificate identifier. For example, `rds-ca-2019`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * When enabled, returns the certificate with the latest `ValidTill`.
     * 
     */
    @Import(name="latestValidTill")
    private @Nullable Boolean latestValidTill;

    /**
     * @return When enabled, returns the certificate with the latest `ValidTill`.
     * 
     */
    public Optional<Boolean> latestValidTill() {
        return Optional.ofNullable(this.latestValidTill);
    }

    private GetCertificatePlainArgs() {}

    private GetCertificatePlainArgs(GetCertificatePlainArgs $) {
        this.id = $.id;
        this.latestValidTill = $.latestValidTill;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificatePlainArgs $;

        public Builder() {
            $ = new GetCertificatePlainArgs();
        }

        public Builder(GetCertificatePlainArgs defaults) {
            $ = new GetCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Certificate identifier. For example, `rds-ca-2019`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param latestValidTill When enabled, returns the certificate with the latest `ValidTill`.
         * 
         * @return builder
         * 
         */
        public Builder latestValidTill(@Nullable Boolean latestValidTill) {
            $.latestValidTill = latestValidTill;
            return this;
        }

        public GetCertificatePlainArgs build() {
            return $;
        }
    }

}