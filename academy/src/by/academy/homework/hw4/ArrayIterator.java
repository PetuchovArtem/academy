package by.academy.homework.hw4;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private final T[][] array;
    private int cursorLength = 0;
    private int cursorHeight = 0;

    public ArrayIterator(T[][] array) {
        super();
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        while (cursorHeight < array.length && array[cursorHeight].length == 0) {
            cursorHeight++;
        }
        while (cursorHeight < array.length && array[cursorHeight][cursorLength] == null) {
            cursorLength++;
            if (cursorLength == array[cursorHeight].length) {
                cursorLength = 0;
                cursorHeight++;
            }
        }
        return cursorHeight < array.length;
    }

    @Override
    public T next() {
        T element = array[cursorHeight][cursorLength++];
        if (cursorLength == array[cursorHeight].length) {
            cursorLength = 0;
            cursorHeight++;
        }
        return element;
    }
}
