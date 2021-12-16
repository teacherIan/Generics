package com.company;

import java.util.ArrayList;

public class IAmAVeryOldTypeOfClass {


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add("Hello");
        arrayList.add(4);
        arrayList.add(5);

        sadMethod(arrayList);

    }

    public static void sadMethod(ArrayList arrayList) {

        for(Object i : arrayList) {
            System.out.println((int) i * 2);
        }
    }
}
