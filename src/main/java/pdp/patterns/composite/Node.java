package pdp.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node implements Composite {
    private List<Composite> children;

    public Node(Composite... children) {
        this.children = new ArrayList<>();
        this.children.addAll(Arrays.asList(children));
    }

    @Override
    public long calculate() {
        long sum = 0;
        for (Composite child : children) {
            sum += child.calculate();
        }
        return sum;
    }
}
