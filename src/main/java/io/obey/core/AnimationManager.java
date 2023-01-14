package io.obey.core;

import io.obey.core.structure.Application;
import io.obey.core.structure.Menu;
import io.obey.core.structure.SpotContent;
import io.obey.core.session.Session;

public interface AnimationManager {
    Application renderApplication(String id, Session session);
    Menu renderMenu(String id, Session session);
    SpotContent renderSpotPreview(String id, Session session);
    SpotContent renderSpotContent(String id, Session session);
}
