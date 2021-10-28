package io.obey.core.structure;

import io.obey.core.authorization.Authorization;
import io.obey.core.session.Session;

import java.util.List;

public class Menu {
    private String id;
    private String title;
    private boolean active;
    private boolean mustAuthenticate;
    private List<Menu> menus;
    private List<Spot> spots;
    private Authorization authorization;

    public void processFilters(Session session){
       throw new RuntimeException("Not implemented yet!");
    }

    public void filterMenus(Session session) {
        throw new RuntimeException("Not implemented yet!");
    }

    public void filterSpots(Session session) {
        throw new RuntimeException("Not implemented yet!");
    }

    public boolean isValid(Session session) {
        throw new RuntimeException("Not implemented yet!");
    }
}
