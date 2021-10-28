package io.obey.core.br;

import io.obey.core.structure.tile.Tile;
import io.obey.core.session.Session;
import io.obey.core.util.Page;

import java.util.List;

public interface BusinessRule {
    List<Tile> process(Session session);
    List<Tile> process(Session session, Page page);
}
