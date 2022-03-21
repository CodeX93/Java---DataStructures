package com.codeX;



public  class Menu extends Restaurant {


    private String MenuType;

    public String getMenuType() {
        return MenuType;
    }

    public void setMenuType(String menuType) {
        MenuType = menuType;
    }


    public void DisplayCompleteMenu(String RestName){

        for(Dish d: Dish.dishes){

            if(d.getRestaurantName().equals(RestName)){

                System.out.println("Menu Type:\t"+d.getMenuType());
                System.out.println("Dish Name:\t"+d.getDishName());
                System.out.println("Dish Price:\t"+d.getDishPrice());
                System.out.println("----------------------------------");

            }
        }


    }

}
