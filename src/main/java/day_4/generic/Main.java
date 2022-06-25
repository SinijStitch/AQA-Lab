package day_4.generic;

import day_4.reflection.MyClass;

import java.util.*;

public class Main {

    public static void  main(String[] args){
        //Make two different comparators for your Custom class (simple java class with few fields).
        // End users should be able to use ‘min’, ‘max’, ‘sort’ methods with that comparators.

        List<MyClass> list = new ArrayList<>(Arrays.asList(
                new MyClass("fff", 444),
                new MyClass("aaa", 222),
                new MyClass("ddd", 555)
        ));

        System.out.println(list);
        System.out.println(max(list, new Comporator2()));
        System.out.println(min(list, new Comporator2()));
        System.out.println(sort(list, new Comporator2()));
        System.out.println(list);

    }

    private static MyClass max(List<MyClass> list, Comparator<MyClass> comporator2) {
        return Collections.max(list, comporator2);

    }

    private static MyClass min(List<MyClass> list, Comparator<MyClass> comporator2) {
        return Collections.min(list, comporator2);

    }

    private static boolean sort(List<MyClass> list, Comparator<MyClass> comporator2) {
        Collections.sort(list, comporator2);

        return true;
    }
}