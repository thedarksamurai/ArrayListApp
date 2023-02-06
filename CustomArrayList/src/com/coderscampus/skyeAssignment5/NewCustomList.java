package com.coderscampus.skyeAssignment5;

public interface NewCustomList<T> extends CustomList<T> {
    void add(T element);

    T get(int index);

    int getSize();
}
