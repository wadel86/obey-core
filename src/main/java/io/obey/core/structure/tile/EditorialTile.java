package io.obey.core.structure.tile;

import io.obey.core.action.Action;
import io.obey.core.session.Session;

import java.util.List;

public class EditorialTile extends Tile{

    private Action action;

    @Override
    public List<Tile> processTile(Session session) {
        throw new RuntimeException("Not implemented yet!");
    }
}
