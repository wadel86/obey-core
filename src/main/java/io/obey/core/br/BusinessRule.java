package io.obey.core.br;

import io.obey.core.structure.tile.Tile;
import io.obey.core.user.User;
import io.obey.core.util.Page;

import java.util.List;

public interface BusinessRule {
    List<Tile> process(User user);
    List<Tile> process(User user, Page page);
}
