/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

/**
 *
 * @author PalmFat
 */
import java.util.Scanner;

abstract class Projectpp {
    public static void main(String[] args){
        
  
        System.out.println("-------------------P&P SHOP-------------------");
        
        login l = new login("You");
        l.setlogin1();
        
        System.out.println("----------------------------------------------");
        
        Menu m = new Menu();
        m.menu1();
        
        
        System.out.println("-----------------Thank You----------------");
        
        
       
        
        
        
        
    
    }}
