package com.codeX;

import java.util.ArrayList;
import java.util.Scanner;

public  class Dish extends Menu {

    public static ArrayList<Dish>dishes=new ArrayList<Dish>();

    private String DishName;
    private double DishPrice;


    public String getDishName() {
        return DishName;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public double getDishPrice() {
        return DishPrice;
    }

    public void setDishPrice(double dishPrice) {
        DishPrice = dishPrice;
    }


    public void AddDishes(String RestName) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Please Enter the Dish Name: ");
        String name = sc.next();

        System.out.println("Dish Price: ");
        double price=sc.nextDouble();

        System.out.println("Menu Type");
        String MenuType = sc.next();
        Dish d=new Dish();

        d.setRestaurantName(RestName);
        d.setDishName(name);
        d.setDishPrice(price);
        d.setMenuType(MenuType);

        dishes.add(d);
        System.out.println("Dish Added Successfully.");



    }


    public void UpdateDishes(String RestName) {
        Scanner sc = new Scanner(System.in);



        for(Dish d: dishes){
            if(d.getRestaurantName().equals(RestName))

                System.out.println("Please Enter the Dish Name: ");
                String name = sc.next();
            if(d.getDishName().equals(name)){
                String type=d.getMenuType();
                dishes.remove(d);
                Dish dish=new Dish();
                System.out.println("Please Enter its new price: ");
                double price=sc.nextDouble();

                dish.setRestaurantName(RestName);
                dish.setDishName(name);
                dish.setDishPrice(price);
                dish.setMenuType(type);
                dishes.add(dish);
                System.out.println("Price Updated Successfully.");
                break;
            }

        }

    }


    public void RemoveDishes(String RestName) {
        Scanner sc = new Scanner(System.in);



        for(Dish d: dishes){
            if(d.getRestaurantName().equals(RestName)){

                System.out.println("Please Enter the Dish Name: ");
                String name = sc.next();
                if(d.getDishName().equals(name)) {
                    dishes.remove(d);

                    System.out.println("Dish Removed Successfully.");
                    break;
                }
            }else System.out.println("Dish Not Found");

        }

    }













}
