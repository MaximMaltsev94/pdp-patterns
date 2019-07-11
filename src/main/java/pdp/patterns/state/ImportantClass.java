package pdp.patterns.state;

import java.util.HashMap;
import java.util.Map;

public class ImportantClass {
    private int importantData;
    private State currentState;

    private Map<Integer, State> stateMapping;

    public ImportantClass() {
        this.currentState = new State1();
        stateMapping = new HashMap<Integer, State>() {{
            put(10, new State1());
            put(20, new State2());
        }};
    }

    public void setImportantData(int importantData) {
        this.importantData = importantData;
        currentState = stateMapping.getOrDefault(importantData, stateMapping.get(10));
    }

    public void doAction() {
        currentState.doAction();
    }
}
