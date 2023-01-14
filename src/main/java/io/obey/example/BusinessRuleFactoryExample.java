package io.obey.example;

import io.obey.core.br.BusinessRuleFactory;
import io.obey.core.session.Session;
import io.obey.core.structure.tile.Tile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessRuleFactoryExample extends BusinessRuleFactory {

    public BusinessRuleFactoryExample(){
        super.businessRuleRegistry = rule().withName("recommendation")
                                           .withAction(this::getRecommendation)
                                           .withParamsBuilder(this::buildRecommendationParams)
                                           .rule()
                                           .withName("latest-movies")
                                           .withAction(this::getLatestMovies)
                                           .withParamsBuilder(this::buildLatestMoviesParams)
                                           .build();
    }

    public List<Tile> getRecommendation(Session session, Map<String, String> params) {
        return new ArrayList<>();
    }

    public Map<String, String> buildRecommendationParams(Session session, Map<String, String> params) {
        return new HashMap<>();
    }

    public List<Tile> getLatestMovies(Session session, Map<String, String> params) {
        return new ArrayList<>();
    }

    public Map<String, String> buildLatestMoviesParams(Session session, Map<String, String> params) {
        return new HashMap<>();
    }
}
