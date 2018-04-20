package projectpp;

import java.util.*;
  
public class calendar {
   public static void day(){
      try { 
         System.out.println("                  "+new Date( )); 
        } 
      catch (Exception e) { 
         System.out.println("Got an exception!"); 
        }
   }
}