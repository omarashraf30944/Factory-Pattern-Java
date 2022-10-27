/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.pc.factory;

/**
 *
 * @author omar
 */
public class Factory {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        
        Pizza pizza2 = chicagoStore.orderPizza("Cheese");
        System.out.println("Joel ordered a " + pizza2.getName());
        
        
           
    }
}
