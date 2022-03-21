package com.codeX;

public class Stack<T> {
    Node top;
    Node data;

    public Stack(){
        this.top= null;
    }

    public void push(T x) // insert at the beginning
    {

        Node temp = new Node();


        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data = x;
        temp.next = top;
        top = temp;
    }


    public void display()
    {

        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print( temp.data+", ");

                temp = temp.next;
            }
        }
    }

    public void pop(){


        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }


        top = (top).next;
    }

    public T peak(){

        if(top==null){
            return null;
        }
        else {
            return (T)top.data;
        }

    }

public Boolean isEmpty(){

        Boolean flag=false;
        if(top==null){
            flag=true;
            return flag;
        }
        else flag=false;
        return flag;

}







}//Stack Class Ends Here...



