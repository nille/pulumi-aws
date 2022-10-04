// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRuleVariablesIpSet;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRuleVariablesPortSet;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleGroupRuleVariables {
    /**
     * @return Set of configuration blocks that define IP address information. See IP Sets below for details.
     * 
     */
    private @Nullable List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets;
    /**
     * @return Set of configuration blocks that define port range information. See Port Sets below for details.
     * 
     */
    private @Nullable List<RuleGroupRuleGroupRuleVariablesPortSet> portSets;

    private RuleGroupRuleGroupRuleVariables() {}
    /**
     * @return Set of configuration blocks that define IP address information. See IP Sets below for details.
     * 
     */
    public List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets() {
        return this.ipSets == null ? List.of() : this.ipSets;
    }
    /**
     * @return Set of configuration blocks that define port range information. See Port Sets below for details.
     * 
     */
    public List<RuleGroupRuleGroupRuleVariablesPortSet> portSets() {
        return this.portSets == null ? List.of() : this.portSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariables defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets;
        private @Nullable List<RuleGroupRuleGroupRuleVariablesPortSet> portSets;
        public Builder() {}
        public Builder(RuleGroupRuleGroupRuleVariables defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSets = defaults.ipSets;
    	      this.portSets = defaults.portSets;
        }

        @CustomType.Setter
        public Builder ipSets(@Nullable List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets) {
            this.ipSets = ipSets;
            return this;
        }
        public Builder ipSets(RuleGroupRuleGroupRuleVariablesIpSet... ipSets) {
            return ipSets(List.of(ipSets));
        }
        @CustomType.Setter
        public Builder portSets(@Nullable List<RuleGroupRuleGroupRuleVariablesPortSet> portSets) {
            this.portSets = portSets;
            return this;
        }
        public Builder portSets(RuleGroupRuleGroupRuleVariablesPortSet... portSets) {
            return portSets(List.of(portSets));
        }
        public RuleGroupRuleGroupRuleVariables build() {
            final var o = new RuleGroupRuleGroupRuleVariables();
            o.ipSets = ipSets;
            o.portSets = portSets;
            return o;
        }
    }
}