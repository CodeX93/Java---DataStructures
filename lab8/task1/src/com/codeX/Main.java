package com.codeX;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack st=new Stack();

        st.push("My Name is ");
        st.push("Agha ");
        st.push("Shah  ");
        st.push("Haider  ");
        st.pop();

        st.display();
        System.out.println("");
        st.peak();
        if(st.isEmpty()){
            System.out.println("Stack Is Empty");
        }else System.out.println("Stack is Not Empty");

    }
}
