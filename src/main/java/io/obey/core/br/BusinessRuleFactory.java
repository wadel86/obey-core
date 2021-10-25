package io.obey.core.br;

import io.obey.core.br.dsl.BusinessRuleRegistryDsl;

import java.util.Map;

public abstract class BusinessRuleFactory implements BusinessRuleRegistryDsl  {

    protected BusinessRuleRegistry businessRuleRegistry;

    public BusinessRule make(String rule, Map<String, String> params){
        throw new RuntimeException("Not implemented yet!");
    }

}
