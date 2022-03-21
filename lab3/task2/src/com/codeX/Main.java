package com.codeX;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;

        ContactDataBase cdb=new ContactDataBase();

        do {
            System.out.println("Contact Menu");
            System.out.println("1.\tAdd Contact\n" +
                    "2.\tView All Contacts\n" +
                    "3.\tSearch Contact\n" +
                    "4.\tDelete Contact\n" +
                    "5\tQuit\n" +
                    "Please Select from Above: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {

                case 1: {
                    cdb.AddDetails();
                    break;
                }
                case 2: {
                    MyIterator<ContactDataBase> iter = new MyIterator<>(ContactDataBase.arr);
                    while (iter.hasNext()){
                        ContactDataBase temp = iter.next();
                        System.out.println("First name : " + temp.getFirstName() );
                        System.out.println("Last name : " + temp.getLastName() );
                        System.out.println("Email : " + temp.getEmail() );
                        System.out.println("Phone number : " + temp.getPhoneNumber() );
                    }
                }
                break;
                case 3: {
                    System.out.println("Phone Number : ");
                    String PN=sc.next();
                    cdb.SearchContact(PN);
                    break;
                }
                case 4: {;
                    System.out.println("Phone Number : ");
                    String PN=sc.next();
                    cdb.DeleteContact(PN);
                    break;
                }
                case 5: {


                    for(ContactDataBase c:ContactDataBase.arr.array){
                        c.getEmail();
                    }
                    System.out.println("Program Ended Successfully");
                    System.exit(0);
                }


            }
        }while(choice >=1 && choice<=5 );

    }
}
