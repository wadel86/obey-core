package io.obey.core.br.dsl;

import io.obey.core.util.BiFunction;
import io.obey.core.br.BusinessRuleImpl;
import io.obey.core.br.BusinessRuleRegistry;
import io.obey.core.structure.tile.Tile;
import io.obey.core.user.User;

import java.util.List;
import java.util.Map;

public class BusinessRuleBuilder {

    private BusinessRuleRegistryBuilder parent;

    private String name;
    private BiFunction<User, Map<String, String>, List<Tile>> action;
    private BiFunction<User, Map<String, String>, Map<String, String>> validation;

    public BusinessRuleBuilder(BusinessRuleRegistryBuilder parent) {
        this.parent = parent;
    }

    public BusinessRuleBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BusinessRuleBuilder withAction
            (BiFunction<User, Map<String, String>, List<Tile>> action){
        this.action = action;
        return this;
    }

    public BusinessRuleBuilder withParamsBuilder
            (BiFunction<User, Map<String, String>, Map<String, String>> validation){
        this.validation = validation;
        return this;
    }

    public BusinessRuleBuilder rule(){
        this.parent.addRule(name, new BusinessRuleImpl(action, validation));
        return new BusinessRuleBuilder(this.parent);
    }

    public BusinessRuleRegistry build(){
        this.parent.addRule(name, new BusinessRuleImpl(action, validation));
        return this.parent.build();
    }
}
