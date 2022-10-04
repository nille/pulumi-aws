// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NfsFileShareNfsFileShareDefaults {
    /**
     * @return The Unix directory mode in the string form &#34;nnnn&#34;. Defaults to `&#34;0777&#34;`.
     * 
     */
    private @Nullable String directoryMode;
    /**
     * @return The Unix file mode in the string form &#34;nnnn&#34;. Defaults to `&#34;0666&#34;`.
     * 
     */
    private @Nullable String fileMode;
    /**
     * @return The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
     * 
     */
    private @Nullable String groupId;
    /**
     * @return The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
     * 
     */
    private @Nullable String ownerId;

    private NfsFileShareNfsFileShareDefaults() {}
    /**
     * @return The Unix directory mode in the string form &#34;nnnn&#34;. Defaults to `&#34;0777&#34;`.
     * 
     */
    public Optional<String> directoryMode() {
        return Optional.ofNullable(this.directoryMode);
    }
    /**
     * @return The Unix file mode in the string form &#34;nnnn&#34;. Defaults to `&#34;0666&#34;`.
     * 
     */
    public Optional<String> fileMode() {
        return Optional.ofNullable(this.fileMode);
    }
    /**
     * @return The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
     * 
     */
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * @return The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
     * 
     */
    public Optional<String> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsFileShareNfsFileShareDefaults defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String directoryMode;
        private @Nullable String fileMode;
        private @Nullable String groupId;
        private @Nullable String ownerId;
        public Builder() {}
        public Builder(NfsFileShareNfsFileShareDefaults defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryMode = defaults.directoryMode;
    	      this.fileMode = defaults.fileMode;
    	      this.groupId = defaults.groupId;
    	      this.ownerId = defaults.ownerId;
        }

        @CustomType.Setter
        public Builder directoryMode(@Nullable String directoryMode) {
            this.directoryMode = directoryMode;
            return this;
        }
        @CustomType.Setter
        public Builder fileMode(@Nullable String fileMode) {
            this.fileMode = fileMode;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public NfsFileShareNfsFileShareDefaults build() {
            final var o = new NfsFileShareNfsFileShareDefaults();
            o.directoryMode = directoryMode;
            o.fileMode = fileMode;
            o.groupId = groupId;
            o.ownerId = ownerId;
            return o;
        }
    }
}