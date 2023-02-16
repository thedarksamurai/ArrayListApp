package com.coderscmapus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {
        CustomArrayList<Integer> numList = new CustomArrayList<>();
        for (int i=0; i<40; i++){
            numList.add(i);
        }
        numList.add(7, 89);
        int yeetN = numList.remove(0);
        for (int i=0; i< numList.getSize(); i++){
            System.out.println(numList.get(i));
        }
        System.out.println(numList.getSize());
        System.out.println("---------------");
        System.out.println(yeetN);
    }
}