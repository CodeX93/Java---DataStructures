package com.codeX;

public class Main {


    public static void main (String [] args){


        char cat[][] = new char[][]  {
                new char[] {'C','E','M'},
                new char[] {'B','A','O'},
                new char[] {'X','W','T'}
        };

        char CAT[]=new char[] {'C','A','T'};
        int [][] index=new int[2][3];
        int row=0;
        int col=0;



        for(int k=0;k< CAT.length;k++) {

            for (int i = 0; i < cat.length; i++) {

                for (int j = 0; j < cat.length; j++) {


                    if (cat[i][j] == CAT[k]) {

                        index[row][col]=i;
                        index[row+1][col]=j;
                        col++;

                        //System.out.println("Index of "+CAT[k]+" is (" + i + "," + j + ")");
                    }
                }

            }


        }//k-loop

        System.out.println("C,A,T");
        for(int i=0;i< index.length;i++){

            for(int j=0; j< index[i].length; j++){

                System.out.print(index[i][j]+",");

            }
            System.out.println();

        }
    }//MainFunction




}//MainClass
