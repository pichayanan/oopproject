package projectpp;

import java.util.Scanner;

abstract class Projectpp {
    public static void main(String[] args){
        
        System.out.println("_____________________________________________________________");
        
        System.out.println("---------------------------P&P SHOP--------------------------");
        
        login l = new login("You");
        l.setlogin1();
        
        System.out.println("-------------------------------------------------------------");
        
        Menu m = new Menu();
        m.menu1();
        
        
        System.out.println("--------------------------Thank You--------------------------");
  }
}
