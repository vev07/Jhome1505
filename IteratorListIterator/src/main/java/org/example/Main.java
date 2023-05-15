package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listNum = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            listNum.add(i);
        }


        double start2 = System.currentTimeMillis();
        for (Integer x: listNum) {
            int temp = x;
        }
        System.out.println(System.currentTimeMillis() - start2 + " - for-each");
        double start3 = System.currentTimeMillis();
        int listNumSize = listNum.size();
        for (int i = 0; i < listNumSize; i++) {
            int temp = i;
        }
        System.out.println(System.currentTimeMillis() - start3 + " - for ++i");
        double start4 = System.currentTimeMillis();
        for (int i = listNumSize; i >= 0 ; i--) {
            int temp = i;
        }

        System.out.println(System.currentTimeMillis() - start4 + " - for --i");
        double start5 = System.currentTimeMillis();
        Iterator<Integer> iterator = listNum.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        System.out.println(System.currentTimeMillis() - start5 + " - iterator");
        double start6 = System.currentTimeMillis();
        ListIterator<Integer> listIterator = listNum.listIterator();
        while (listIterator.hasNext()) {
         int temp = listIterator.next();
        }
        System.out.println(System.currentTimeMillis() - start6 + " - ListIterator");
    }
}