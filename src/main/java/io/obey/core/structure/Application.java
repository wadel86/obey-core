package io.obey.core.structure;

import io.obey.core.session.Session;

import java.util.List;

public class Application {
    private String id;
    private String name;
    private List<Menu> menus;
    private List<Spot> spots;

    public void processFilters(Session session) {
        throw new RuntimeException("Not implemented yet!");
    }
}
