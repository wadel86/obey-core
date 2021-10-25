package io.obey.core.structure.tile;

import io.obey.core.user.User;

import java.util.List;

public abstract class Tile {
    private String id;
    private String title;
    private String description;
    private Integer position;
    private List<Picture> pictures;

    public boolean filterTile(){
        return true;
    }

    public abstract List<Tile> processTile(User user);
}
