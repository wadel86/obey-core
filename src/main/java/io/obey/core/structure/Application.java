package io.obey.core.structure;

import io.obey.core.user.User;

import java.util.List;

public class Application {
    private String id;
    private String name;
    private List<Menu> menus;
    private List<Spot> spots;

    public void processFilters(User user) {
        throw new RuntimeException("Not implemented yet!");
    }
}
