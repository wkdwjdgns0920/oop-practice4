package org.example;

public class Customer {

    public void order(String munuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(munuName);
        Cook cook = cooking.makeCook(menuItem);
    }

}
