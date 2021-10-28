package io.obey.core.structure;

import io.obey.core.authorization.Authorization;
import io.obey.core.structure.tile.Tile;
import io.obey.core.session.Session;
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

    public SpotContent getSpotPreview(Session session){
        throw new RuntimeException("Not implemented yet!");
    }

    public SpotContent getSpotContent(Session session, Page page){
        throw new RuntimeException("Not implemented yet!");
    }

    private List<Tile> processTiles(Session session) {
       throw new RuntimeException("Not implemented yet!");
    }

    public boolean isValid(Session session) {
        throw new RuntimeException("Not implemented yet!");
    }
}
