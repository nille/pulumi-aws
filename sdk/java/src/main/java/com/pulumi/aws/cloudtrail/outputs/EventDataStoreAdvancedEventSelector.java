// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.outputs;

import com.pulumi.aws.cloudtrail.outputs.EventDataStoreAdvancedEventSelectorFieldSelector;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventDataStoreAdvancedEventSelector {
    /**
     * @return Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    private @Nullable List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors;
    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    private @Nullable String name;

    private EventDataStoreAdvancedEventSelector() {}
    /**
     * @return Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    public List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors() {
        return this.fieldSelectors == null ? List.of() : this.fieldSelectors;
    }
    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDataStoreAdvancedEventSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors;
        private @Nullable String name;
        public Builder() {}
        public Builder(EventDataStoreAdvancedEventSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldSelectors = defaults.fieldSelectors;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder fieldSelectors(@Nullable List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors) {
            this.fieldSelectors = fieldSelectors;
            return this;
        }
        public Builder fieldSelectors(EventDataStoreAdvancedEventSelectorFieldSelector... fieldSelectors) {
            return fieldSelectors(List.of(fieldSelectors));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public EventDataStoreAdvancedEventSelector build() {
            final var o = new EventDataStoreAdvancedEventSelector();
            o.fieldSelectors = fieldSelectors;
            o.name = name;
            return o;
        }
    }
}