package com.codeX;
public class customList <T>{




        T  obj;


    public customList(T obj) {


    }

    public <T> void hasNext(T[]obj) {
            Boolean flag=false;
            for (T list : obj) {
                if (list == null) {
                    System.out.println("False");
                }
            }
        System.out.println("True");

        }  //hasNext Function Ends Here...


    public <T> T next(T[]obj) {

        for (T list : obj) {
            return list;

        }

        return null;
    }  //hasNext Function Ends Here...






    }







