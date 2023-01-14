package io.obey.core.action;

import java.util.HashMap;
import java.util.Map;

public class Action {
    private ActionType type;
    private Map<String, String> parameters = new HashMap<>();
    private Object rawContent;
}
