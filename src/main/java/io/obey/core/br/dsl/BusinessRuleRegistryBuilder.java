package io.obey.core.br.dsl;

import io.obey.core.br.BusinessRule;
import io.obey.core.br.BusinessRuleRegistry;

import java.util.HashMap;
import java.util.Map;

public class BusinessRuleRegistryBuilder {

    Map<String, BusinessRule> businessRules = new HashMap<>();

    public BusinessRuleRegistryBuilder() {
    }

    public void addRule(String rule, BusinessRule businessRule){
        this.businessRules.put(rule, businessRule);
    }

    public BusinessRuleRegistry build(){
        return new BusinessRuleRegistry(businessRules);
    }
}
