// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReportPlanReportDeliveryChannel {
    /**
     * @return A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    private @Nullable List<String> formats;
    /**
     * @return The unique name of the S3 bucket that receives your reports.
     * 
     */
    private String s3BucketName;
    /**
     * @return The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    private @Nullable String s3KeyPrefix;

    private ReportPlanReportDeliveryChannel() {}
    /**
     * @return A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    public List<String> formats() {
        return this.formats == null ? List.of() : this.formats;
    }
    /**
     * @return The unique name of the S3 bucket that receives your reports.
     * 
     */
    public String s3BucketName() {
        return this.s3BucketName;
    }
    /**
     * @return The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    public Optional<String> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportPlanReportDeliveryChannel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> formats;
        private String s3BucketName;
        private @Nullable String s3KeyPrefix;
        public Builder() {}
        public Builder(ReportPlanReportDeliveryChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formats = defaults.formats;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        @CustomType.Setter
        public Builder formats(@Nullable List<String> formats) {
            this.formats = formats;
            return this;
        }
        public Builder formats(String... formats) {
            return formats(List.of(formats));
        }
        @CustomType.Setter
        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }
        @CustomType.Setter
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public ReportPlanReportDeliveryChannel build() {
            final var o = new ReportPlanReportDeliveryChannel();
            o.formats = formats;
            o.s3BucketName = s3BucketName;
            o.s3KeyPrefix = s3KeyPrefix;
            return o;
        }
    }
}