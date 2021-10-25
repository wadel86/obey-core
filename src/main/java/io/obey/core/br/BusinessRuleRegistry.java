package io.obey.core.br;

import java.util.Map;

public class BusinessRuleRegistry {

    Map<String, BusinessRule> businessRules;

    public BusinessRuleRegistry(Map<String, BusinessRule> businessRules) {
        this.businessRules = businessRules;
    }

    BusinessRule get(String rule) {
        throw new RuntimeException("Not implemented yet!");
    }
}
