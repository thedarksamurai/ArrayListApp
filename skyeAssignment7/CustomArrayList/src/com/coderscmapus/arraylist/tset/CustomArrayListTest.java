package com.coderscmapus.arraylist.tset;
import com.coderscmapus.arraylist.CustomArrayList;
import org.junit.jupiter.api .Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void add() {
        //arrange
        CustomArrayList<Integer> sut =new CustomArrayList<>();
        //act
        sut.add(10);
        //assert
        assertEquals(10, sut.get(0));
    }

    @Test
    void getSize() {
        //arrange
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        populateList(sut);
        //act
        int size = sut.getSize();
        //assert
        assertEquals(size, 44);
    }

    @Test
    void should_add_more_than_10_items_to_array() {
        //arrange
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        //act
       for (int i =0; i<11; i++){
           sut.add(i);
       }
        //assert
        assertEquals(11, sut.getSize());
    }

    @Test
    void testAdd() {
        //arrange
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        populateList(sut);
        //act
        sut.add(3, 78000);
        //assert
        assertEquals(78000, sut.get(3));
    }

    @Test
    void remove() {
        //arrange
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        populateList(sut);
        //act
        int yeetSut = sut.remove(0);
        //assert
        assertEquals(yeetSut, 1);
    }
    private void populateList(CustomArrayList<Integer> sut){
        for (int i = 0; i < 40; i++){
            sut.add(i);
        }
        sut.add(10);
        sut.add(6, 9000);
        sut.remove(0);
        sut.remove(5);
        sut.add(10909009);
        sut.remove(9);
        sut.add(2, 598);
        sut.add(5, 678);
        sut.remove(7);
        sut.add(140);
        sut.add(20);
        sut.add(8, 9000);
        sut.remove(10);
        sut.remove(5);
        sut.add(10909009);
        sut.remove(9);
        sut.add(2, 587309045);
        sut.add(5, 678);
        sut.remove(7);
        sut.add(120);
    }
}