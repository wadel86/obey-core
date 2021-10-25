package io.obey.core;

import io.obey.core.structure.Application;
import io.obey.core.structure.Menu;
import io.obey.core.structure.SpotContent;
import io.obey.core.user.User;

public class AnimationManagerImpl implements AnimationManager{

    @Override
    public Application renderApplicationStructure(String id, User user) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public Menu renderMenuStructure(String id, User user) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public SpotContent renderSpotPreview(String id, User user) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public SpotContent renderSpotContent(String id, User user) {
        throw new RuntimeException("Not implemented yet!");
    }
}
