package com.codeX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        // write your code here

        System.out.print("Enter the Binary Number: \t");
        int bin=sc.nextInt();
        System.out.println(getBinary(bin));


    }

    public static String getBinary(int num){
    String number="";
        Stack<Integer> stack=new Stack<>();

        if(num<1){number="-1";}
        else {

            while (num != 1) {

                stack.push(num%2);
                num/=2;
            }
        }
        System.out.print(1);
        while (!stack.isEmpty()){
            number=number+stack.peak();
            stack.pop();
        }

        return number;
    }


}
