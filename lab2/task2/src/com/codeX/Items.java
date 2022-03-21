package com.codeX;

import java.util.ArrayList;

public class Items <T,S,D,I>{

    T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public ArrayList<T[]>items=new ArrayList<>();
    ArrayList<String> stringData=new ArrayList<>();
    ArrayList<Double>doubleData=new ArrayList<>();
    ArrayList<Integer>IntegerData=new ArrayList<>();

   public static Items<Items,String,Double,Integer>[] rawData=new Items[]{"A","B","C","D","E",4.225,4.5,33.6,111.34,3,5,67,87,335,67,44};


    public void getRawData(T []t){

        items.add(t);

    }

    public void sortArray() {


        for (T[] t : items) {

            if (t.toString().getClass().equals(stringData.getClass())) {
                String a= t.toString();
                stringData.add(a);
                System.out.println("Added ");
            }


            if (t.getClass().equals(doubleData.getClass())) {

                String a= t.toString();
                Double d=Double.parseDouble(a);
                doubleData.add(d);
                System.out.println("Added ");
            }

            if (t.getClass().equals(IntegerData.getClass())) {


                String a= t.toString();
                Integer d=Integer.parseInt(a);
                IntegerData.add(d);
                System.out.println("Added ");
            }

        }
    }

        public void DisplayBoxes(){

            System.out.println("For String Boxes");
            System.out.println(stringData);
//Display MAX elemnt in Array
//            for(String s:stringData){
//
//
//            }


            System.out.println("For Double Boxes");
            System.out.println(doubleData);

            System.out.println("For Integer Boxes");
            System.out.println(IntegerData);

        }





    }












