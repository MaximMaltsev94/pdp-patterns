package t10_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Set {
    private List<Integer> data = new ArrayList<>();

    public void put(int elem) {
        if(!contains(elem)) {
            data.add(elem);
        }
    }

    public void putAll(Collection<Integer> other) {
        for (Integer value : other) {
            put(value);
        }
    }

    public void remove(int elem) {
        data.remove(elem);
    }

    public boolean contains(int elem) {
        return data.indexOf(elem) != -1;
    }

    public Set union(Set other) {
        Set union = new Set();
        union.putAll(this.data);
        union.putAll(other.data);
        return union;
    }

    public Set intersect(Set other) {
        Set intersect = new Set();
        for (Integer datum : this.data) {
            if(other.contains(datum)) {
                intersect.put(datum);
            }
        }
        return intersect;
    }

    @Override
    public String toString() {
        return Arrays.toString(data.toArray());
    }
}
