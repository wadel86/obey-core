package io.obey.core.structure.tile;

import io.obey.core.br.BusinessRule;
import io.obey.core.user.User;

import java.util.List;

public class DynamicTile extends Tile{

    private BusinessRule businessRule;

    @Override
    public List<Tile> processTile(User user) {
        throw new RuntimeException("Not implemented yet!");
    }
}
