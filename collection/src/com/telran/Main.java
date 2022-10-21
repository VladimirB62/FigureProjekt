package com.telran;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       /* int[] array ={1,2,7,3,9};
        array[6] = 8;
        System.out.println(array[6]);//недостаток простого массива*/

        List<Integer> arrayList = new ArrayList<>();//Образец создания ArrayList

        List<Integer> linkedList = new LinkedList<>();

        testList(arrayList);
        testList(linkedList);
        System.out.println("**************************************************************************");
        testList1(arrayList);
        testList1(linkedList);
        System.out.println("*************************************************************************");
        testList2(arrayList);
        testList2(linkedList);

        Set<String> set= new HashSet<>();
        set.add("iguub");
        set.add("jj");
        set.add("ghy");
        set.add("aaaaaaaaaaaaaaaaaaaaaaaaa");
        set.add("asdfgghhhjkkk");
        set.add("a");
        set.add("a");
        System.out.println(set);

    }

    //Tестируем два листа на чтение и добавление and remove from first element
    static void testList(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);

        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }

    static void testList1(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);

        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }
    static void testList2(List list){
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                list.remove(0);

            }
            long finish = System.currentTimeMillis();
            System.out.println(finish-start);
        }




}
