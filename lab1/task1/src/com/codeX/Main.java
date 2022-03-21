package com.codeX;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        // write your code here
        int choice ;
        do {

                System.out.println("1.\t Add dishes to a certain menu\n" +
                        "2.\t Update price of certain dish\n" +
                        "3.\t Remove certain dish from menu\n" +
                        "4.\t Display complete menu\n" +
                        "5.\t Add different menus to restaurant\n" +
                        "0.\t Exit the Program\n\n" +
                        "Please Select from Above:");
                choice = sc.nextInt();


                if (choice == 1) {
                    Dish dish = new Dish();
                    System.out.println("Please Enter your Restaurant Name: ");
                    String RestName=sc.next();
                    dish.AddDishes(RestName);
                }

                if (choice == 2) {
                    System.out.println("Please Enter your Restaurant Name: ");
                    String RestName=sc.next();
                    Dish dish=new Dish();
                    dish.UpdateDishes(RestName);


                }

                if (choice == 3) {
                    System.out.println("Please Enter your Restaurant Name: ");
                    String RestName=sc.next();
                    Dish dish=new Dish();
                    dish.RemoveDishes(RestName);

                }

                if (choice == 4) {


                    System.out.println("Please Enter your Restaurant Name: ");
                    String RestName=sc.next();
                    Menu menu=new Menu();
                    menu.DisplayCompleteMenu(RestName);

                }


                if (choice == 5) {

                    System.out.println("It works on when you add dishes to your Restaurant");

                }

                if (choice == 0) {
                    System.out.println("Program Ended...");
                System.exit(0);

                }


        } while (choice==1 || choice==2 || choice==3 || choice==4 || choice==5  );
    }
}
