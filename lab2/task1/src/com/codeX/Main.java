package com.codeX;


import java.util.Iterator;

public class  Main<T,U> {


    public static void main(String[] args) {
        // write your code here
String []names=new String[10];
        names = new String[]{"A", "B", "C", "D", "E"};

        customList<String>cs=new customList(names);
        cs.hasNext(names);
        cs.next(names);
    }





}

