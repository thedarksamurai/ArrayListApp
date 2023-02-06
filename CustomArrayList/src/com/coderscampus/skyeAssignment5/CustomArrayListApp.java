package com.coderscampus.skyeAssignment5;

public class CustomArrayListApp {
    public static void main(String[] args) {
        CustomList<Integer> numList = new CustomArrayList<>();
        for (int i=0; i< 40; i++){
            numList.add(i);
        }

        for (int i = 0; i < numList.getSize(); i++) {
            System.out.println(numList.get(i));
        }
    }
}