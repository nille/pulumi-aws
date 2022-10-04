// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobScheduleFrequencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobScheduleFrequencyArgs Empty = new ClassificationJobScheduleFrequencyArgs();

    /**
     * Specifies a daily recurrence pattern for running the job.
     * 
     */
    @Import(name="dailySchedule")
    private @Nullable Output<Boolean> dailySchedule;

    /**
     * @return Specifies a daily recurrence pattern for running the job.
     * 
     */
    public Optional<Output<Boolean>> dailySchedule() {
        return Optional.ofNullable(this.dailySchedule);
    }

    /**
     * Specifies a monthly recurrence pattern for running the job.
     * 
     */
    @Import(name="monthlySchedule")
    private @Nullable Output<Integer> monthlySchedule;

    /**
     * @return Specifies a monthly recurrence pattern for running the job.
     * 
     */
    public Optional<Output<Integer>> monthlySchedule() {
        return Optional.ofNullable(this.monthlySchedule);
    }

    /**
     * Specifies a weekly recurrence pattern for running the job.
     * 
     */
    @Import(name="weeklySchedule")
    private @Nullable Output<String> weeklySchedule;

    /**
     * @return Specifies a weekly recurrence pattern for running the job.
     * 
     */
    public Optional<Output<String>> weeklySchedule() {
        return Optional.ofNullable(this.weeklySchedule);
    }

    private ClassificationJobScheduleFrequencyArgs() {}

    private ClassificationJobScheduleFrequencyArgs(ClassificationJobScheduleFrequencyArgs $) {
        this.dailySchedule = $.dailySchedule;
        this.monthlySchedule = $.monthlySchedule;
        this.weeklySchedule = $.weeklySchedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobScheduleFrequencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobScheduleFrequencyArgs $;

        public Builder() {
            $ = new ClassificationJobScheduleFrequencyArgs();
        }

        public Builder(ClassificationJobScheduleFrequencyArgs defaults) {
            $ = new ClassificationJobScheduleFrequencyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dailySchedule Specifies a daily recurrence pattern for running the job.
         * 
         * @return builder
         * 
         */
        public Builder dailySchedule(@Nullable Output<Boolean> dailySchedule) {
            $.dailySchedule = dailySchedule;
            return this;
        }

        /**
         * @param dailySchedule Specifies a daily recurrence pattern for running the job.
         * 
         * @return builder
         * 
         */
        public Builder dailySchedule(Boolean dailySchedule) {
            return dailySchedule(Output.of(dailySchedule));
        }

        /**
         * @param monthlySchedule Specifies a monthly recurrence pattern for running the job.
         * 
         * @return builder
         * 
         */
        public Builder monthlySchedule(@Nullable Output<Integer> monthlySchedule) {
            $.monthlySchedule = monthlySchedule;
            return this;
        }

        /**
         * @param monthlySchedule Specifies a monthly recurrence pattern for running the job.
         * 
         * @return builder
         * 
         */
        public Builder monthlySchedule(Integer monthlySchedule) {
            return monthlySchedule(Output.of(monthlySchedule));
        }

        /**
         * @param weeklySchedule Specifies a weekly recurrence pattern for running the job.
         * 
         * @return builder
         * 
         */
        public Builder weeklySchedule(@Nullable Output<String> weeklySchedule) {
            $.weeklySchedule = weeklySchedule;
            return this;
        }

        /**
         * @param weeklySchedule Specifies a weekly recurrence pattern for running the job.
         * 
         * @return builder
         * 
         */
        public Builder weeklySchedule(String weeklySchedule) {
            return weeklySchedule(Output.of(weeklySchedule));
        }

        public ClassificationJobScheduleFrequencyArgs build() {
            return $;
        }
    }

}