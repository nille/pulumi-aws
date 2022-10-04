// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClassifierJsonClassifier {
    /**
     * @return A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
     * 
     */
    private String jsonPath;

    private ClassifierJsonClassifier() {}
    /**
     * @return A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
     * 
     */
    public String jsonPath() {
        return this.jsonPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierJsonClassifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String jsonPath;
        public Builder() {}
        public Builder(ClassifierJsonClassifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonPath = defaults.jsonPath;
        }

        @CustomType.Setter
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = Objects.requireNonNull(jsonPath);
            return this;
        }
        public ClassifierJsonClassifier build() {
            final var o = new ClassifierJsonClassifier();
            o.jsonPath = jsonPath;
            return o;
        }
    }
}