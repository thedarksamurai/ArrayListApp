package com.coderscampus.skyeAssignment5;

public class CustomArrayList<T> implements NewCustomList<T> {
    private T[] array;
    private int size;

    public CustomArrayList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public void add(T element) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = element;
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }




    @Override
    public int getSize() {
        return size;
    }
}
