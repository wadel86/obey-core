package io.obey.core.structure;

import io.obey.core.structure.tile.Tile;
import lombok.Builder;

import java.util.List;

@Builder
public class SpotContent {
    private String id;
    private String title;
    private List<Tile> tiles;
}
