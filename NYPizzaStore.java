/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pc.factory;

/**
 *
 * @author omar
 */
public class NYPizzaStore extends PizzaStore {
     @Override
     Pizza createPizza(String item){
        if(item.equals("Cheese")){
            return new NYstyleCheesePizza();
        }else{
            return null;
        }
    }
    
}
