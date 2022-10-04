// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionArgs;
import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs Empty = new ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs();

    /**
     * A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    @Import(name="simpleCriterion")
    private @Nullable Output<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionArgs> simpleCriterion;

    /**
     * @return A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    public Optional<Output<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionArgs>> simpleCriterion() {
        return Optional.ofNullable(this.simpleCriterion);
    }

    /**
     * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    @Import(name="tagCriterion")
    private @Nullable Output<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs> tagCriterion;

    /**
     * @return A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    public Optional<Output<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs>> tagCriterion() {
        return Optional.ofNullable(this.tagCriterion);
    }

    private ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs() {}

    private ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs(ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs $) {
        this.simpleCriterion = $.simpleCriterion;
        this.tagCriterion = $.tagCriterion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param simpleCriterion A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder simpleCriterion(@Nullable Output<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionArgs> simpleCriterion) {
            $.simpleCriterion = simpleCriterion;
            return this;
        }

        /**
         * @param simpleCriterion A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder simpleCriterion(ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionArgs simpleCriterion) {
            return simpleCriterion(Output.of(simpleCriterion));
        }

        /**
         * @param tagCriterion A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder tagCriterion(@Nullable Output<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs> tagCriterion) {
            $.tagCriterion = tagCriterion;
            return this;
        }

        /**
         * @param tagCriterion A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder tagCriterion(ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionArgs tagCriterion) {
            return tagCriterion(Output.of(tagCriterion));
        }

        public ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndArgs build() {
            return $;
        }
    }

}