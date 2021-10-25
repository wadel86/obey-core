package io.obey.core;

import io.obey.core.structure.Application;
import io.obey.core.structure.Menu;
import io.obey.core.structure.SpotContent;
import io.obey.core.user.User;

public interface AnimationManager {
    Application renderApplicationStructure(String id, User user);
    Menu renderMenuStructure(String id, User user);
    SpotContent renderSpotPreview(String id, User user);
    SpotContent renderSpotContent(String id, User user);
}
