package io.obey.core.br.dsl;

public interface BusinessRuleRegistryDsl {

    default BusinessRuleBuilder rule() {
        BusinessRuleRegistryBuilder businessRuleRegistryBuilder = new BusinessRuleRegistryBuilder();
        return new BusinessRuleBuilder(businessRuleRegistryBuilder);
    }
}
