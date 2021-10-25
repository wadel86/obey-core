package io.obey.core.action;

import java.util.HashMap;
import java.util.Map;

public class Action<T> {
    private ActionType type;
    private Map<String, String> parameters = new HashMap<>();
    private T rawContent;
}
