package com.codeX;

public class Main {
   public static Stack<Integer> st=new Stack();

    public static void DisplayBottomsUp(Stack s){
        Stack stack=new Stack();
        Node temp = s.top;
        while (temp != null) {

            // print node data
            stack.push(s.peak());
            stack.peak();
            s.pop();
            // assign temp link to temp
            temp = temp.next;
        }
        st.display(stack);
    }



    public static void main(String[] args) {
	// write your code here



        st.push(32);
        st.push(12);
        st.push(42);
        st.push(52);
        st.push(72);
        st.display(st);



        System.out.print("\nBottoms Up is....\n");
        DisplayBottomsUp(st);




    }
}
