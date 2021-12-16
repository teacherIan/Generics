package com.company;

import java.util.ArrayList;

public class NewAgeClass {
    public static void main(String[] args) {

        Object[] arr = new Object[5];
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        muchBetter(arrayList);
    }

    public static void muchBetter(ArrayList<Integer> arrayList) {

        for(Integer i : arrayList) {
            System.out.println(i * 2);
        }
    }
}
