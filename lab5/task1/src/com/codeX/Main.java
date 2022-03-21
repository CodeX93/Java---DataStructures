package com.codeX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int choice=0;
        Scanner sc=new Scanner(System.in);
       LinkedList l=new LinkedList();
        l.insert(7);
        l.insert(9);
        l.insert(9);
        l.insert(44);
        l.insert(100);

       do{
           System.out.println("\n---------------------");
           System.out.println("The Already Exist LinkedList is: ");
           l.printList();
           System.out.println("");
           System.out.println("1.\tInsert element at start\n" +
                   "2.\tInsert element at end\n" +
                   "3.\tInsert element after\n" +
                   "4\tDelete First Element\n" +
                   "5.\tDelete End From End\n" +
                   "6.\tDelete Any Given ELement\n" +
                   "7.\tDelete Max\n" +
                   "8.\tDelete Minimum Element\n" +
                   "9.\tReverse The Linked List\n" +
                   "0.\tExit the Program\nPlease Select From Above:\t");
                choice= sc.nextInt();


                if(choice==1){
                    System.out.println("Please Enter Element");
                    String s=sc.next();
                    l.InsertAtStart(s);}

           if(choice==2){
               System.out.println("Please Enter Element");
               String s=sc.next();
               l.insert(s);}
           if(choice==3){
               System.out.println("Please Enter previous - Element");
               String p=sc.next();
               System.out.println("Please Enter New - Element");
               String n=sc.next();
               l.insertAfter(p,n);}
           if(choice==4){ l.removeFirstNode(l.head);}
           if(choice==5){l.removeLastNode(l.head);}
           if(choice==6){
               System.out.println("Please Enter Element to Delete");
               String s=sc.next();
               l.deleteNode(s);}
           if(choice==7){l.deleteLargestElement(l.head);}
           if(choice==8){l.deleteSmallestElement(l.head);}





           if(choice==9){
               System.out.println("Previous Link");
               l.printList();

               System.out.println("\nReversed ");
               l.printList();
           }

           if(choice==0){
               System.out.println("Program Ended Successfully");
               System.exit(0);}




       }while(choice==1 ||choice==2 || choice==3 || choice==4 || choice==5 || choice==6 || choice==7 || choice==8 || choice==9 || choice==0  );






    }



}
