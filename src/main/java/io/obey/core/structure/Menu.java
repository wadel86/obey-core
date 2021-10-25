package io.obey.core.structure;

import io.obey.core.authorization.Authorization;
import io.obey.core.user.User;

import java.util.List;

public class Menu {
    private String id;
    private String title;
    private boolean active;
    private boolean mustAuthenticate;
    private List<Menu> menus;
    private List<Spot> spots;
    private Authorization authorization;

    public void processFilters(User user){
       throw new RuntimeException("Not implemented yet!");
    }

    public void filterMenus(User user) {
        throw new RuntimeException("Not implemented yet!");
    }

    public void filterSpots(User user) {
        throw new RuntimeException("Not implemented yet!");
    }

    public boolean isValid(User user) {
        throw new RuntimeException("Not implemented yet!");
    }
}
