package day_5;
import day_4.generic.Comporator3;
import day_4.reflection.MyClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){
        //Make simple model
        //generate some list with those Model objects
        //use stream with custom comparator
        //collect it to String list using some field

        List<MyClass> list = new ArrayList<>(Arrays.asList(
                new MyClass("fff", 444),
                new MyClass("aaa", 222),
                new MyClass("ddd", 555)
        ));

        System.out.println(list);
        List<String> resulList = list.stream().sorted(new Comporator3()).map(m->m.getField1()).collect(Collectors.toList());
        System.out.println(resulList);


    }
}