package day_4.generic;

import day_4.reflection.MyClass;
import java.util.Comparator;

public class Comporator2 implements Comparator<MyClass> {
        public int compare(MyClass o1, MyClass o2) {
            return o1.getField2().compareTo(o2.getField2());
        }
    }