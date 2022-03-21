package com.codeX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        // write your code here
        System.out.print("Please Enter the Expression to Check:\t");
        String expression = sc.next();


        char[] exp = expression.toCharArray();

        for (int i = 0; i < exp.length; i++) {

            if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
                st.push(exp[i]);
            }


        }
        st.display();
        System.out.println("");

Boolean B=true;
try {

    for (int i = 0; i < exp.length; i++) {

        if (B && st.peak() != null ) {

            if (exp[i] == ')' && st.peak().equals('(')) {
                //System.out.println("H");
                st.pop();
                //st.display();
                B = true;
            }
            if (exp[i] == '}' && st.peak().equals('{')) {
                //System.out.println("H");
                st.pop();
                //st.display();
                B = true;
            }
            if (exp[i] == ']' && st.peak().equals('[')) {
                //System.out.println("H");
                st.pop();
                // st.display();
                B = true;
            }

        }else{B=false;
        break;}

    }
if(B){
    System.out.println("VALID");
}else System.out.println("NOT VALID");

}catch (NullPointerException e ){
    System.out.println("Invalid Expression");
    e.printStackTrace();
}
//                if(st.isEmpty()) {System.out.println("Correct Expression");}
//else System.out.println("Not");
//



    }
}

