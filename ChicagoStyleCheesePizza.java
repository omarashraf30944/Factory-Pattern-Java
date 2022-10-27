/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pc.factory;

/**
 *
 * @author omar
 */
public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza() {
        name = " Chicago style deep dish cheese pizza ";
        dough = " Thick crust dough ";
        sauce = " Plum tomato sauce ";
        
        toppings.add("Shredded mozzarella Cheese");
    }
    
    void cut(){
        System.out.println("Cutting pizza into square slices");
    }
    
}
