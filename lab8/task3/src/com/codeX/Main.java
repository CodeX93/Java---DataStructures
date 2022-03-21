package com.codeX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s1;
        System.out.print("Please Enter String 1:\t");
        s1 = sc.next();

    checkPalindrome(s1);
    }
        public static void checkPalindrome (String s1){
            Stack stack1 = new Stack<>();
            Stack stack2 = new Stack<>();


            char c1[] = s1.toCharArray();

            for (int i = 0; i < c1.length; i++) {

                stack1.push(c1[i]);
            }

            while (!stack1.isEmpty()) {

                stack2.push(stack1.peak());
                stack1.pop();
            }

            for (int i = 0; i < c1.length; i++) {

                stack1.push(c1[i]);
            }

            Boolean B=false ;

            while (!stack1.isEmpty() && !stack2.isEmpty()) {
                B = false;
                if (stack1.peak() == stack2.peak()) {
                    B = true;
                } else {
                    break;
                }
                stack1.pop();
                stack2.pop();

            }
            if (B) {
                System.out.println("Para");
            } else {
                System.out.println("Not Para");
            }

        }
    }














