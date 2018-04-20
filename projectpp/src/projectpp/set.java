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
class set extends light {
    public static int x,count_set;
    public static double price_set=0;
    
    
   
public void choice(){
    
 do{
    System.out.println("1:Set A [Polaroid 50 P. (3x3) + Light 2 M.] 180 THB/Piece");
    System.out.println("2:Set B [Polaroid 50 P. (3x3) + Light 4 M.] 200 THB/Piece");
    System.out.println("3:Set C [Polaroid 50 P. (3x3) + Light 6 M.] 220 THB/Piece");
    Scanner sc = new Scanner(System.in);
    System.out.print("Which set do you choose : ");
       x = sc.nextInt();
 }while(x!=1&&x!=2&&x!=3);
 if(x==1){
   System.out.println("  ----Choose SET A----");
   price_set = 180;
 }
 else if(x==2){
   System.out.println("  ----Choose SET B----");
   price_set = 200;
     
 }
 else if(x==3){
   System.out.println("  ----Choose SET C----");
   price_set = 220;
     
 }
 super.ccount();
 count_set = count;
}
public void pprice(){
   price_s = price_set*count_set;
   System.out.println("  >>----- Price is : "+price_s+" THB -----<<");

}
public double ppprice(){
   sum3 = price_s+sum3;
   total = sum1+sum2+sum3;
   System.out.println("  >>----- Total is : " +total+ " THB -----<<");
   return total;
}

public void print(){
    this.choice();
    this.pprice();
    this.ppprice();
}
    
}
