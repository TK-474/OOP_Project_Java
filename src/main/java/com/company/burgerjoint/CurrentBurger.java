/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.burgerjoint;

/**
 *
 * @author Saad
 */
public class CurrentBurger {
    
    public static Burger burger;
    
    public static void intialise(){
        burger = new Burger();
        burger.setBun(new Plain());
    }

    public static Burger getBurger() {
        return burger;
    }
    
    
    
}
