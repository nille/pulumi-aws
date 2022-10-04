// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTableLocalSecondaryIndex {
    /**
     * @return Name of the DynamoDB table.
     * 
     */
    private String name;
    private List<String> nonKeyAttributes;
    private String projectionType;
    private String rangeKey;

    private GetTableLocalSecondaryIndex() {}
    /**
     * @return Name of the DynamoDB table.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<String> nonKeyAttributes() {
        return this.nonKeyAttributes;
    }
    public String projectionType() {
        return this.projectionType;
    }
    public String rangeKey() {
        return this.rangeKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableLocalSecondaryIndex defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<String> nonKeyAttributes;
        private String projectionType;
        private String rangeKey;
        public Builder() {}
        public Builder(GetTableLocalSecondaryIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
    	      this.rangeKey = defaults.rangeKey;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nonKeyAttributes(List<String> nonKeyAttributes) {
            this.nonKeyAttributes = Objects.requireNonNull(nonKeyAttributes);
            return this;
        }
        public Builder nonKeyAttributes(String... nonKeyAttributes) {
            return nonKeyAttributes(List.of(nonKeyAttributes));
        }
        @CustomType.Setter
        public Builder projectionType(String projectionType) {
            this.projectionType = Objects.requireNonNull(projectionType);
            return this;
        }
        @CustomType.Setter
        public Builder rangeKey(String rangeKey) {
            this.rangeKey = Objects.requireNonNull(rangeKey);
            return this;
        }
        public GetTableLocalSecondaryIndex build() {
            final var o = new GetTableLocalSecondaryIndex();
            o.name = name;
            o.nonKeyAttributes = nonKeyAttributes;
            o.projectionType = projectionType;
            o.rangeKey = rangeKey;
            return o;
        }
    }
}