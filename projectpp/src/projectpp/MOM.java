package projectpp;

import java.util.Scanner;
abstract class MOM {
    
    static int r,count;
    public static double price_po=0,price_l=0,price_s=0,total=0,sum1=0,sum2=0,sum3=0;
    
abstract void pprice();

 public void ccount(){
    Scanner c = new Scanner(System.in);
    System.out.print("How many do you wants : ");
    count = c.nextInt();
}
}
