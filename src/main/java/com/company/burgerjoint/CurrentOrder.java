/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.burgerjoint;

/**
 *
 * @author Saad
 */
public class CurrentOrder {
    static Order order;
    
    public static void initialise(){
        order = new Order();
    }

    public static Order getOrder() {
        return order;
    }
    
    
    
}
