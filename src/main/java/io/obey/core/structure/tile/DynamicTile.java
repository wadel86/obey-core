package io.obey.core.structure.tile;

import io.obey.core.br.BusinessRule;
import io.obey.core.session.Session;

import java.util.List;

public class DynamicTile extends Tile{

    private BusinessRule businessRule;

    @Override
    public List<Tile> processTile(Session session) {
        throw new RuntimeException("Not implemented yet!");
    }
}
