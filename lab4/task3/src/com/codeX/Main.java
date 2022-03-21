package com.codeX;

public class Main {


    public static Boolean checkMatrix(double[][] arr){

        boolean flag=true ;

        for(int i=0;i<3;i++){
            double sum=0;
            for (int j=0;j<3;j++)
            {
                sum+=arr[i][j];
            }
            if(sum!=1){
                flag=false;
                break;}

        }



        return flag;

    }



    public static void main(String[] args) {
	// write your code here


        double[][] arr_name = {
                {0.1,0.6,0.3},
                {0.3,0.4,0.3},
                 {0.5,0.0,0.5}
        };

Boolean B=checkMatrix(arr_name);
if(B)
{
    System.out.println("It is a Markov Matrix");
}
else
{
    System.out.println("It is NOT a Markov Matrix");
}







    }
}
