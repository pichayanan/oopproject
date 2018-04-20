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
import java.util.*;
  
public class calendar {
   public static void day(){
      try { 
         System.out.println("      "+new Date( )); 
          
        } catch (Exception e) { 
          System.out.println("Got an exception!"); 
      }
   }
}