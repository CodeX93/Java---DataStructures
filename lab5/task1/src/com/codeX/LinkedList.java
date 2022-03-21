package com.codeX;

public class LinkedList<T extends Comparable> {
    Node head;

    public void insert(T data) {

        // Create a new node with given data
        Node <T>new_node = new Node(data);

        new_node.next = null;


        if (head == null) {
            head = new_node;
        } else {

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }


    }


    public void printList() {
        Node currNode = head;

        System.out.print("LinkedList: ");


        while (currNode != null) {

            System.out.print(currNode.data + " ");


            currNode = currNode.next;
        }
    }

    //Insert At Start of LinkedList
    public void InsertAtStart(T new_data) {
        // 1 & 2: Allocate the Node &
        //     Put in the data*//*
        Node <T>new_node = new Node(new_data);

        // 3. Make next of new Node as head *//*
        new_node.next = head;

        // 4. Move the head to point to new Node *//*
        head = new_node;
    }

    public void insertAfter(T prev_node, T new_data) {

        Node<T> current = head;
        while (current != null && current.data != prev_node) {
            current = current.next;
        }
        if (current != null) {
            Node<T> newNode = new Node<>(new_data);
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("\nThere is no such Data to be Found in the List");
        }


    }


    void deleteNode(T key) {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void removeFirstNode(Node head) {
        if (head != null) {
            head = head.next;
        }

        // Move the head pointer to the next node
        System.out.println("Linked List is not There");
    }

    public Node removeLastNode(Node head) {
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }

        // Find the second last node
        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;

        return head;
    }

    public void deleteSmallestElement(Node node) {
        if(node == null || node.next == null) {
            System.out.println("The List is Empty");
        }

        Node prevLargest, largest, head, prev;
        head = largest = node;
        prevLargest = null;
        prev = node;
        node = node.next;

        while(node != null) {
            if(node.data.compareTo(largest.data) <0) {
                prevLargest = prev;
                largest = node;
            }

            prev = node;
            node = node.next;
        }



        deleteNode((T)largest.data);
        printList();
    }

    public void deleteLargestElement(Node node) {
        if(node == null || node.next == null) {
            System.out.println("The List is Empty");
        }

        Node prevLargest, largest, head, prev;
        head = largest = node;
        prevLargest = null;
        prev = node;
        node = node.next;

        while(node != null) {
            if(node.data.compareTo(largest.data) >0) {
                prevLargest = prev;
                largest = node;
            }

            prev = node;
            node = node.next;
        }



        deleteNode((T)largest.data);
        printList();
    }






    public void reverse() {

        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        printList();

}
}
