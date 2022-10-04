// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


public final class ResponseHeadersPolicyServerTimingHeadersConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyServerTimingHeadersConfigArgs Empty = new ResponseHeadersPolicyServerTimingHeadersConfigArgs();

    /**
     * A Whether CloudFront adds the `Server-Timing` header to HTTP responses that it sends in response to requests that match a cache behavior that&#39;s associated with this response headers policy.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return A Whether CloudFront adds the `Server-Timing` header to HTTP responses that it sends in response to requests that match a cache behavior that&#39;s associated with this response headers policy.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the Server-Timing header to. Valid range: Minimum value of 0.0. Maximum value of 100.0.
     * 
     */
    @Import(name="samplingRate", required=true)
    private Output<Double> samplingRate;

    /**
     * @return A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the Server-Timing header to. Valid range: Minimum value of 0.0. Maximum value of 100.0.
     * 
     */
    public Output<Double> samplingRate() {
        return this.samplingRate;
    }

    private ResponseHeadersPolicyServerTimingHeadersConfigArgs() {}

    private ResponseHeadersPolicyServerTimingHeadersConfigArgs(ResponseHeadersPolicyServerTimingHeadersConfigArgs $) {
        this.enabled = $.enabled;
        this.samplingRate = $.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyServerTimingHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyServerTimingHeadersConfigArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyServerTimingHeadersConfigArgs();
        }

        public Builder(ResponseHeadersPolicyServerTimingHeadersConfigArgs defaults) {
            $ = new ResponseHeadersPolicyServerTimingHeadersConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled A Whether CloudFront adds the `Server-Timing` header to HTTP responses that it sends in response to requests that match a cache behavior that&#39;s associated with this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled A Whether CloudFront adds the `Server-Timing` header to HTTP responses that it sends in response to requests that match a cache behavior that&#39;s associated with this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param samplingRate A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the Server-Timing header to. Valid range: Minimum value of 0.0. Maximum value of 100.0.
         * 
         * @return builder
         * 
         */
        public Builder samplingRate(Output<Double> samplingRate) {
            $.samplingRate = samplingRate;
            return this;
        }

        /**
         * @param samplingRate A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the Server-Timing header to. Valid range: Minimum value of 0.0. Maximum value of 100.0.
         * 
         * @return builder
         * 
         */
        public Builder samplingRate(Double samplingRate) {
            return samplingRate(Output.of(samplingRate));
        }

        public ResponseHeadersPolicyServerTimingHeadersConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.samplingRate = Objects.requireNonNull($.samplingRate, "expected parameter 'samplingRate' to be non-null");
            return $;
        }
    }

}