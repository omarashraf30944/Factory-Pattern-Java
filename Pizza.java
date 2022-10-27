/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pc.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omar
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();
    
    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough..." );
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for(String topping : toppings){
            System.out.println(" " + topping);
        }
    }
    
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    void box(){
        System.out.println("Place pizza in official pizza store box");
    }
    
    public String getName(){
        return name;
    }
    
}
