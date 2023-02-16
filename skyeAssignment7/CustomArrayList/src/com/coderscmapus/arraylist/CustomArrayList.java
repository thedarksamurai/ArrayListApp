package com.coderscmapus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<Object> {
    Object[] items = new Object[10];
    int size = 0;
    @Override
    public boolean add(Object item) {
        return add(size, item);
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
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index >= index){
        }
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
