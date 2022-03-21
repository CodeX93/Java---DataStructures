package com.codeX;

public class Node <T extends Comparable> {

    Node head;
    T data;
    Node tail;
    Node next;
    Node previous;
    Node (T data){
        this.data=data;
    }

}
