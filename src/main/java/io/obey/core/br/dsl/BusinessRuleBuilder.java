package io.obey.core.br.dsl;

import io.obey.core.util.BiFunction;
import io.obey.core.br.BusinessRuleImpl;
import io.obey.core.br.BusinessRuleRegistry;
import io.obey.core.structure.tile.Tile;
import io.obey.core.session.Session;

import java.util.List;
import java.util.Map;

public class BusinessRuleBuilder {

    private BusinessRuleRegistryBuilder parent;

    private String name;
    private BiFunction<Session, Map<String, String>, List<Tile>> action;
    private BiFunction<Session, Map<String, String>, Map<String, String>> paramsBuilder;

    public BusinessRuleBuilder(BusinessRuleRegistryBuilder parent) {
        this.parent = parent;
    }

    public BusinessRuleBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BusinessRuleBuilder withAction
            (BiFunction<Session, Map<String, String>, List<Tile>> action){
        this.action = action;
        return this;
    }

    public BusinessRuleBuilder withParamsBuilder
            (BiFunction<Session, Map<String, String>, Map<String, String>> paramsBuilder){
        this.paramsBuilder = paramsBuilder;
        return this;
    }

    public BusinessRuleBuilder rule(){
        this.parent.addRule(name, new BusinessRuleImpl(action, paramsBuilder));
        return new BusinessRuleBuilder(this.parent);
    }

    public BusinessRuleRegistry build(){
        this.parent.addRule(name, new BusinessRuleImpl(action, paramsBuilder));
        return this.parent.build();
    }
}
