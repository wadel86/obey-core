package io.obey.core.structure;

import io.obey.core.authorization.Authorization;
import io.obey.core.structure.tile.Tile;
import io.obey.core.user.User;
import io.obey.core.util.Page;

import java.util.List;

public class Spot {
    private static final Integer PREVIEW_PAGE = 0;
    private static final Integer PREVIEW_SIZE = 8;

    private String id;
    private String title;
    private boolean active;
    private boolean mustAuthenticate;
    private List<Tile> tiles;
    private Authorization authorization;

    public SpotContent getSpotPreview(User user){
        throw new RuntimeException("Not implemented yet!");
    }

    public SpotContent getSpotContent(User user, Page page){
        throw new RuntimeException("Not implemented yet!");
    }

    private List<Tile> processTiles(User user) {
       throw new RuntimeException("Not implemented yet!");
    }

    public boolean isValid(User user) {
        throw new RuntimeException("Not implemented yet!");
    }
}
