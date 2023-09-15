/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.company.burgerjoint;

/**
 *
 * @author Nimra
 */
public class BurgerJointMain {

    public static void main(String[] args) {
     HomeWindow homewindow = new HomeWindow();
     homewindow.show();
     CurrentOrder.initialise();
     CurrentBurger.intialise();
       
       
        
        
    }
}
