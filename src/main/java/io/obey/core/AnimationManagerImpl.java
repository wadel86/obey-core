package io.obey.core;

import io.obey.core.br.BusinessRuleFactory;
import io.obey.core.structure.Application;
import io.obey.core.structure.Menu;
import io.obey.core.structure.SpotContent;
import io.obey.core.session.Session;

public class AnimationManagerImpl implements AnimationManager{

    private final BusinessRuleFactory businessRuleFactory;

    public AnimationManagerImpl(BusinessRuleFactory businessRuleFactory) {
        this.businessRuleFactory = businessRuleFactory;
    }

    @Override
    public Application renderApplication(String id, Session session) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public Menu renderMenu(String id, Session session) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public SpotContent renderSpotPreview(String id, Session session) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public SpotContent renderSpotContent(String id, Session session) {
        throw new RuntimeException("Not implemented yet!");
    }
}
