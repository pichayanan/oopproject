/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import java.util.Scanner;

/**
 *
 * @author PalmFat
 */
class light extends polaroid implements sizelight,colorlight{
public static int x,count_size,count_color;
public static double price_size=0;

public void sizel(){
    do{
System.out.println("1: size 2 m.  50  THB/piece");
System.out.println("2: size 4 m.  70  THB/piece");
System.out.println("3: size 6 m.  90  THB/piece");
System.out.println("4: size 8 m.  110 THB/piece");
Scanner s = new Scanner(System.in);
System.out.print("Which size do you wants : ");
    x = s.nextInt();
}while(x!=1&&x!=2&&x!=3&&x!=4);
 if(x==1){
   System.out.println("  ----Choose size 2 m.----");
   price_size = 50;
   //choose_l="Light 2m.";
 }
 else if(x==2){
   System.out.println("  ----Choose size 4 m.----");
   price_size = 70;
   //choose_l="Light 4m.";  
 }
 else if(x==3){
   System.out.println("  ----Choose size 6 m.----");
   price_size = 90;
    //choose_l="Light 6m."; 
 }
 else if(x==4){
   System.out.println("  ----Choose size 8 m.----");
   price_size = 110;
  //choose_l="Light 8m.";   
 }
 super.ccount();
 this.count_size = count;
}
public void colorl(){
do{
System.out.println("1: Warmwhite ");
System.out.println("2: Yellow ");
Scanner s = new Scanner(System.in);
System.out.print("Which color do you wants : ");
    x = s.nextInt();
 }while(x!=1&&x!=2);

if(x==1){
   System.out.println("  ----You Choose Warmwhite----");
   
 }
 else if(x==2){
   System.out.println("  ----You Choose Yellow----");
     
 }
 super.ccount();
 this.count_color = count;
 if(count_color>count_size){
    System.out.println("  -- You put wrong count -- ");
super.ccount();
System.out.println("---------------------------------------");
}
else{
    System.out.println("----------------------------------------");
}

}
   public void pprice(){
   price_l = price_size*count_size;
   System.out.println("  >>----- Price is : "+price_l+" THB -----<<");

}
   public double ppprice(){
   sum2 = price_l+sum2;
   total = sum1+sum2+sum3;
   System.out.println("  >>----- Total is : " +total+ " THB -----<<");
   return total;
   }

public void print(){
    this.sizel();
    this.colorl();
    this.pprice();
    this.ppprice();
}
    
}
