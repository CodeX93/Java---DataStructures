package com.codeX;

public class DoublyLinkedList<T extends Comparable> {
    Node head;
    Node tail;


    public void Display() {
        Node last = null;
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ", ");

            current = current.next;
        }

    }

    public void insertFirst(T data) {

        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
            tail = newNode.next;

            return;
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            tail = newNode.next;
            head.previous = null;
            return;
        }
    }

    public void insertLast(T data) {


        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(data);

        current.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        tail.next = null;


    }


    public void InsertBeforeNode(T Bdata, T Ndata) {

        Node current = head;
        if (head == null) {
            System.out.println("Link list is Empty");
        } else if (head != null) {
            while (current != null) {
                if (current.data == Bdata) {
                    Node newNode = new Node(Ndata);
                    newNode.next = current.next;
                    newNode.previous = current;
                    current.next = newNode;
                }

                current = current.next;
            }
        }

    }
        public void InsertAfterNode(T Bdata, T Ndata) {

            Node current=head;
            Node newNode=new Node(Ndata);
            if(head==null){
                System.out.println("Link list is Empty");
            }
            else if(head!=null){
                while(current!=null){
                    if(current.data==Bdata){

                        newNode.next=current.next;
                        current.next=newNode;
                        newNode.previous=current;
                        current=newNode;
                    }

                    if(current==tail){
                        tail.next=current;
                        tail=current;
                        tail.next=null;
                    }

                    current=current.next;
                }
            }

    }

    public void DeleteFirst(){

        if(head==null){
            System.out.println("Link List Not Exist");
        }else {
            head=head.next;
            if(head==tail){head.next=tail;
            tail=null;}
        }

    }

    public void DeleteLast() {
        System.out.println();
        if (head == null) {
            System.out.println("Link List Not Exist");
        } else {
           tail=tail.previous;
           tail=tail.next=null;


        }
    }
    public void deleteAny(T data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        deletenode(current);

    }
    private void deletenode(Node node) {
        if (node != null) {

            if (node.previous != null)
                node.previous.next = node.next;
            else
                head = node.next;
            if (node.next != null)
                node.next.previous = node.previous;
            else
                tail = node.previous;
        }
    }



    public void sortList() {
        Node current = null, index = null;
        T temp;
        //Check whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Current will point to head
            for(current = head; current.next != null; current = current.next) {
                //Index will point to node next to current
                for(index = current.next; index != null; index = index.next) {
                    //If current's data is greater than index's data, swap the data of current and index
                    if(current.data.compareTo(index.data)>0 ) {
                        temp = (T) current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }


public void DeleteDuplicates(){

        Node current=head;
        while(current.next!=null){

            if(current.data==current.next.data){
                deleteAny((T)current.data);

            }
            current=current.next;

        }


}


}

