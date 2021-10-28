package io.obey.core.br;

import io.obey.core.structure.tile.Tile;
import io.obey.core.session.Session;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessRuleFactoryExample extends BusinessRuleFactory {

    public BusinessRuleFactoryExample(){
        super.businessRuleRegistry = rule().withName("recommendation")
                                           .withAction(this::getRecommendation)
                                           .withParamsBuilder(this::buildRecommendationParams)
                                           .build();
    }

    public List<Tile> getRecommendation(Session session, Map<String, String> params){
        return new ArrayList<>();
    }

    public Map<String, String> buildRecommendationParams(Session session, Map<String, String> params){
        return new HashMap<>();
    }
}
