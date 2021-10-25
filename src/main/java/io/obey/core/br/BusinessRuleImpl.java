package io.obey.core.br;

import io.obey.core.structure.tile.Tile;
import io.obey.core.user.User;
import io.obey.core.util.BiFunction;
import io.obey.core.util.Page;

import java.util.List;
import java.util.Map;

public class BusinessRuleImpl implements BusinessRule {

    private BiFunction<User, Map<String, String>, List<Tile>> action;
    private BiFunction<User, Map<String, String>, Map<String, String>> paramsBuilder;
    private Map<String, String> params;

    public BusinessRuleImpl
            (BiFunction<User, Map<String, String>, List<Tile>> action,
             BiFunction<User, Map<String, String>, Map<String, String>> paramsBuilder) {
        this.action = action;
        this.paramsBuilder = paramsBuilder;
    }

    @Override
    public List<Tile> process(User user) {
        return action.apply(user, paramsBuilder.apply(user, params));
    }

    @Override
    public List<Tile> process(User user, Page page) {
        return null;
    }
}
