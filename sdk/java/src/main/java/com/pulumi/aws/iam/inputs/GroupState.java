// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The ARN assigned by AWS for this group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN assigned by AWS for this group.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The group&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both &#34;ADMINS&#34; and &#34;admins&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The group&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both &#34;ADMINS&#34; and &#34;admins&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Path in which to create the group.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path in which to create the group.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The [unique ID][1] assigned by AWS.
     * 
     */
    @Import(name="uniqueId")
    private @Nullable Output<String> uniqueId;

    /**
     * @return The [unique ID][1] assigned by AWS.
     * 
     */
    public Optional<Output<String>> uniqueId() {
        return Optional.ofNullable(this.uniqueId);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.path = $.path;
        this.uniqueId = $.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN assigned by AWS for this group.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN assigned by AWS for this group.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name The group&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both &#34;ADMINS&#34; and &#34;admins&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The group&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both &#34;ADMINS&#34; and &#34;admins&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path in which to create the group.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path in which to create the group.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param uniqueId The [unique ID][1] assigned by AWS.
         * 
         * @return builder
         * 
         */
        public Builder uniqueId(@Nullable Output<String> uniqueId) {
            $.uniqueId = uniqueId;
            return this;
        }

        /**
         * @param uniqueId The [unique ID][1] assigned by AWS.
         * 
         * @return builder
         * 
         */
        public Builder uniqueId(String uniqueId) {
            return uniqueId(Output.of(uniqueId));
        }

        public GroupState build() {
            return $;
        }
    }

}