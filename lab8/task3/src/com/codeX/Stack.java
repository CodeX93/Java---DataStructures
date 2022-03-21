package com.codeX;

public class Stack<T> {
    Node top;
    Node data;

    public Stack(){
        this.top= null;
    }

    public void push(T x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();

        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.next = top;

        // update top reference
        top = temp;
    }


    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.print( temp.data+", ");

                // assign temp link to temp
                temp = temp.next;
            }
        }
    }

    public void pop(){

// check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }


        top = (top).next;
    }

    public T peak(){

        if(top==null){
            System.out.println("Stack is Empty");
            return null;
        }
        else {
            return (T) top.data;
        }

    }

public Boolean isEmpty(){


        if(top==null){

            return true;
        }
        else
        return false;

}







}//Stack Class Ends Here...



