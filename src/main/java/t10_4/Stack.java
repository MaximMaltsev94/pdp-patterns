package t10_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack implements Iterable<Integer> {
    private int[] data;
    private int head = -1;

    public Stack(int size) {
        if(size < 0) {
            throw new IllegalArgumentException("размер стека не может быть отрицательным");
        }

        data = new int[size];
    }

    public void setSize(int size) {
        if(size < 0) {
            throw new IllegalArgumentException("размер стека не может быть отрицательным");
        }
        data = Arrays.copyOf(data, size);
        if(head > size) {
            head = size - 1;
        }
    }

    public void put(int value) {
        if(head >= data.length - 1) { // если хотим положить в стэк, а он полон, то увеличиваем его размер на половину
            data = Arrays.copyOf(data, (int)(data.length * 1.5));
        }
        data[++head] = value;//увеличиваем индекс головы на 1 и кладем туда значение (ps порядок именно такой - сначала увеличиваем позицию головы, потом кладем)
    }

    public int get() {
        if(head < 0) {
            throw new NoSuchElementException("стэк пуст");
        }
        return data[head--]; //возвращаем элемент на который указывает голова, и уменьшаем позицию головы (ps порядок именно такой - сначала возвращаем, потом уменьшаем позицию)
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return head >= 0;
        }

        @Override
        public Integer next() {
            return get();
        }
    }
}
