package io.obey.core.structure.tile;

import io.obey.core.action.Action;
import io.obey.core.user.User;

import java.util.List;

public class EditorialTile extends Tile{

    private Action action;

    @Override
    public List<Tile> processTile(User user) {
        throw new RuntimeException("Not implemented yet!");
    }
}
