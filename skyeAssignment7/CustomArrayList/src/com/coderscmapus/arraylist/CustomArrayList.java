package com.coderscmapus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int size = 0;
    @Override
    public boolean add(Object item) {
        if (items.length == size){
            grow();
        }
        items[size] = item;
        size+=1;
        return true;
    }

    private void grow(){
        Object[] arrs = Arrays.copyOf(items, items.length * 2);
        items = arrs;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        return (T) items[index];
    }

    @Override
    public boolean add(int index, Object item) throws IndexOutOfBoundsException {
        if (index > size){
        }
        if (size == items.length){
            grow();
        }
        for (int i = size-1; i>index; i--){
            items[i+1] = items[i];
        }
        items[index] = item;
        size++;
        return true;
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        Object removedItem = items[index];
        for (int i = index; i < size -1; i++){
            items[i] = items[i + 1];
        }
        size--;
        return (T) removedItem;
    }
}
