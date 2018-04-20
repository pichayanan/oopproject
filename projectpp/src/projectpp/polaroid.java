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
import projectpp.MOM;
import java.util.Scanner;
class polaroid extends MOM implements colorpolaroid{
public static int x,count_size,count_color;
public static double price_size,price_color,price1,price2,pp;
public void sizep(){
do{
    int g =1;
    while(g<4){
System.out.println(g+"  --->"+(g++)+": size "+g+"x"+g+" "+g+" THB/piece");

//System.out.println("2: size 3x3  3 THB/piece");
//System.out.println("3: size 4x4  4 THB/piece");
    }
Scanner s = new Scanner(System.in);
System.out.print("Which size do you wants : ");
    x = s.nextInt();
    
}while(x!=1&&x!=2&&x!=3);
 if(x==1){
   System.out.println("  ----Choose size 2x2----");
   price_size = 2;
   //choose_po=" polaroid size 2x2 ";
   
   
 }
 else if(x==2){
   System.out.println("  ----Choose size 3x3----");
   price_size = 3;
   //choose_po=" polaroid size 3X3 ";  
 }
 else if(x==3){
   System.out.println("  ----Choose size 4x4----");
   price_size = 4;
   //choose_po="polaroid size 4X4"; 
 }
 super.ccount();
 count_size = count;
}
public void colorp(){
    do{
System.out.println("1: white + 0 THB/piece");
System.out.println("2: color + 2 THB/piece");
Scanner s = new Scanner(System.in);
System.out.print("Which color do you wants : ");
    x = s.nextInt();
}while(x!=1&&x!=2);
if(x==1){
   System.out.println("  ----You Choose White----");
   price_color=0;
    
 }
 else if(x==2){
   System.out.println("  ----You Choose Color----");
   price_color = 2;
     
 }

super.ccount();
count_color = count;
if(count_color>count_size){
System.out.println("  -- You put wrong count -- ");
super.ccount(); 
if(x==1){
        count=count_size-count_color;
        pp=count*2;
    }
    else {
        
    }
    
}
else{
    if(x==1){
        count=count_size-count_color;
        pp=count*2;
    }
    else {
        
    }
    System.out.println("----------------------------------------");
}

}

public void pprice(){
    
    price1 = count_size*price_size;
    price2 = count_color*price_color+pp;
    price_po = price1+price2;
    System.out.println("  >>----- Price is : "+price_po+" THB -----<<");

}
public double ppprice(){
   sum1 = price_po+sum1;
   total = sum1 + sum2 + sum3;
   System.out.println("  >>----- Total is : " +total+ " THB -----<<");
   return total;
}

public void print(){
    this.sizep();
    this.colorp();
    this.pprice();
    this.ppprice();
}
    
    
}
