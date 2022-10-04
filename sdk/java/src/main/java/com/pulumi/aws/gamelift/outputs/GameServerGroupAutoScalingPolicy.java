// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.outputs;

import com.pulumi.aws.gamelift.outputs.GameServerGroupAutoScalingPolicyTargetTrackingConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GameServerGroupAutoScalingPolicy {
    /**
     * @return Length of time, in seconds, it takes for a new instance to start
     * new game server processes and register with GameLift FleetIQ.
     * Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up,
     * because it avoids prematurely starting new instances. Defaults to `60`.
     * 
     */
    private @Nullable Integer estimatedInstanceWarmup;
    private GameServerGroupAutoScalingPolicyTargetTrackingConfiguration targetTrackingConfiguration;

    private GameServerGroupAutoScalingPolicy() {}
    /**
     * @return Length of time, in seconds, it takes for a new instance to start
     * new game server processes and register with GameLift FleetIQ.
     * Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up,
     * because it avoids prematurely starting new instances. Defaults to `60`.
     * 
     */
    public Optional<Integer> estimatedInstanceWarmup() {
        return Optional.ofNullable(this.estimatedInstanceWarmup);
    }
    public GameServerGroupAutoScalingPolicyTargetTrackingConfiguration targetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupAutoScalingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer estimatedInstanceWarmup;
        private GameServerGroupAutoScalingPolicyTargetTrackingConfiguration targetTrackingConfiguration;
        public Builder() {}
        public Builder(GameServerGroupAutoScalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedInstanceWarmup = defaults.estimatedInstanceWarmup;
    	      this.targetTrackingConfiguration = defaults.targetTrackingConfiguration;
        }

        @CustomType.Setter
        public Builder estimatedInstanceWarmup(@Nullable Integer estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }
        @CustomType.Setter
        public Builder targetTrackingConfiguration(GameServerGroupAutoScalingPolicyTargetTrackingConfiguration targetTrackingConfiguration) {
            this.targetTrackingConfiguration = Objects.requireNonNull(targetTrackingConfiguration);
            return this;
        }
        public GameServerGroupAutoScalingPolicy build() {
            final var o = new GameServerGroupAutoScalingPolicy();
            o.estimatedInstanceWarmup = estimatedInstanceWarmup;
            o.targetTrackingConfiguration = targetTrackingConfiguration;
            return o;
        }
    }
}