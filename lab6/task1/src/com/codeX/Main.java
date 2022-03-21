package com.codeX;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DoublyLinkedList l=new DoublyLinkedList();
        int choice;
        do{
            System.out.println("\n---------------------");
            System.out.println("The Already Exist LinkedList is: ");
            l.Display();
            System.out.println("");
            System.out.println("1.\tInsert element at start\n" +
                    "2.\tInsert element at Before\n" +
                    "3.\tInsert element after\n" +
                    "4\tDelete First Element\n" +
                    "5.\tDelete End From End\n" +
                    "6.\tDelete Any Given ELement\n" +
                    "7.\tSort Link List\n" +
                    "8.\tDelete Duplicates\n" +

                    "0.\tExit the Program\nPlease Select From Above:\t");
            choice= sc.nextInt();


            if(choice==1){
                System.out.println("Please Enter Element");
                String s=sc.next();
                l.insertFirst(s);}

            if(choice==2){
                System.out.println("Please Enter previous - Element");
                String p=sc.next();
                System.out.println("Please Enter New - Element");
                String n=sc.next();
                l.InsertBeforeNode(p,n);}
            if(choice==3){
                System.out.println("Please Enter previous - Element");
                String p=sc.next();
                System.out.println("Please Enter New - Element");
                String n=sc.next();
                l.InsertAfterNode(p,n);}
            if(choice==4){ l.DeleteFirst();}
            if(choice==5){l.DeleteLast();}
            if(choice==6){
                System.out.println("Please Enter Element to Delete");
                String s=sc.next();
                l.deleteAny(s);}

            if(choice==7){
                System.out.println("Previous Link List: ");
                l.Display();
            l.sortList();
                System.out.println("After Sorting ");
            l.Display();
            }

            if(choice==8){
                l.DeleteDuplicates();
            }

            if(choice==0){
                System.out.println("Program Ended");
                System.exit(0);
            }




        }while(choice==1 ||choice==2 || choice==3 || choice==4 || choice==5 || choice==6 || choice==7 || choice==8 || choice==9 || choice==0  );


    }
}
