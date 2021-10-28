package io.obey.core.br;

import io.obey.core.structure.tile.Tile;
import io.obey.core.session.Session;
import io.obey.core.util.BiFunction;
import io.obey.core.util.Page;

import java.util.List;
import java.util.Map;

public class BusinessRuleImpl implements BusinessRule {

    private BiFunction<Session, Map<String, String>, List<Tile>> action;
    private BiFunction<Session, Map<String, String>, Map<String, String>> paramsBuilder;
    private Map<String, String> params;

    public BusinessRuleImpl
            (BiFunction<Session, Map<String, String>, List<Tile>> action,
             BiFunction<Session, Map<String, String>, Map<String, String>> paramsBuilder) {
        this.action = action;
        this.paramsBuilder = paramsBuilder;
    }

    @Override
    public List<Tile> process(Session session) {
        return action.apply(session, paramsBuilder.apply(session, params));
    }

    @Override
    public List<Tile> process(Session session, Page page) {
        return null;
    }
}
