package com.codeX;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // run a few simple tests

        GenricArrayList<Integer> num = new GenricArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);

        GenricArrayList<String> str = new GenricArrayList<>();

        str.add("My");
        str.add("Name");
        str.add("Is");
        str.add("Haider");
        str.add("My");
        str.add("Name");
        str.add("Is");
        str.add("Haider");
        str.add("My");
        str.add("Name");
        str.add("Is");
        str.add("Haider");





        System.out.println(Arrays.toString(num.toArray()) );
        System.out.println(Arrays.toString(str.toArray()) );

        num.remove(2);
       System.out.println(Arrays.toString(num.toArray()) );
        str.remove(3);

        System.out.println(Arrays.toString(str.toArray()) );

    }
}
