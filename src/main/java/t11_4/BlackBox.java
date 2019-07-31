package t11_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BlackBox {

    private Set<Integer> set;

    public BlackBox() {
        this.set = new TreeSet<>();
    }

    public void put(Integer value) {
        set.add(value);
    }

    public void put(Integer ...values) {
        set.addAll(Arrays.asList(values));
    }

    public Integer getMinK(Integer k) {
        if(k < 0 || k > set.size()) {
            throw new IllegalArgumentException("k должно быть больше нуля и меньше размера множества");
        }
        Iterator<Integer> setIterator = set.iterator();
        int iteratorPosition = 1;
        while (setIterator.hasNext()) {
            Integer value = setIterator.next();
            if(iteratorPosition == k) {
                return value;
            }
            iteratorPosition++;
        }
        return -1;
    }

    public Integer getMaxN(Integer n) {
        n = set.size() + 1 - n;
        if(n < 0 || n > set.size()) {
            throw new IllegalArgumentException("n должно быть больше нуля и меньше размера множества");
        }
        return getMinK(n);
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
