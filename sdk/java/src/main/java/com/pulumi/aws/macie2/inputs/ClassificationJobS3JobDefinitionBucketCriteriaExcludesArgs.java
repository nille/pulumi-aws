// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs Empty = new ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs();

    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    @Import(name="ands")
    private @Nullable Output<List<ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs>> ands;

    /**
     * @return An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    public Optional<Output<List<ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs>>> ands() {
        return Optional.ofNullable(this.ands);
    }

    private ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs() {}

    private ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs(ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs $) {
        this.ands = $.ands;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder ands(@Nullable Output<List<ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs>> ands) {
            $.ands = ands;
            return this;
        }

        /**
         * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder ands(List<ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs> ands) {
            return ands(Output.of(ands));
        }

        /**
         * @param ands An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder ands(ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndArgs... ands) {
            return ands(List.of(ands));
        }

        public ClassificationJobS3JobDefinitionBucketCriteriaExcludesArgs build() {
            return $;
        }
    }

}