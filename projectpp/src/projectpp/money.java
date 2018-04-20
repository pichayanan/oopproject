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
    class money extends MOM {
        
   public static int choose,amount; 
        
    public static double pro,totalp=0,money,change;
    
    calendar c = new calendar();
    
    void pprice(){
        
    }
    
    void bill_1(){
        System.out.println("");
        System.out.println("---------------P&P SHOP---------------");
        
        c.day();
        
        System.out.println("======================================");
        System.out.println("Polaroid            "+sum1+   "   THB");
        System.out.println("Light               "+sum2+   "   THB");
        System.out.println("Box Set             "+sum3+   "   THB");
        total = sum1+sum2+sum3;
        System.out.println("--------------------------------------");
        System.out.println("Total               "+total+"   THB");
        
        
    if(total>=300&&total<500){
        System.out.println(" ----Discount 10%----");
        totalp=total*0.1;
        pro=total-totalp;
    }
    else if(total>=500&&total<1000){
        System.out.println(" ----Discount 10%----");
        System.out.println(" ---Free light 2 M.---");
        totalp=total*0.1;
        pro=total-totalp;
    }
    else if(total>=1000){
        System.out.println(" ---Free set A 1 Set--- ");
    }
    else{
        System.out.println(" --Not In Promotion-- ");
        totalp=total;
        pro=total;
    }
        System.out.println("Promotion          "+pro+"   THB");
                        
        
            
                Scanner mon1=new Scanner(System.in);

                System.out.print("Please enter your money : ");
                money = mon1.nextDouble();
            //}while(!(money>pro));
           if(money<pro){ 
               do{

                System.out.print("Please enter your money : ");
                money = mon1.nextDouble();
               }while(!(money>pro));
            change=money-pro;
            System.out.println("Change       "+change+"   THB"); 
           
           }
           
        else if(money>=pro){
            
            change=money-pro;
            System.out.println("Change       "+change+"   THB");
        }
          if(change/1000!=0){
            amount = (int)change/1000;
            change = change%1000;
            System.out.println("1000 THB : "+amount);
        }
        if(change/500!=0){
            amount = (int)change/500;
            change = change%500;
            System.out.println("500  THB : "+amount);
        }
        if(change/100!=0){
            amount = (int)change/100;
            change = change%100;
            System.out.println("100  THB : "+amount);
        }   
        if(change/50!=0){
            amount = (int)change/50;
            change = change%50;
            System.out.println("50   THB : "+amount);
        }
        if(change/20!=0){
            amount = (int)change/20;
            change = change%20;
            System.out.println("20   THB : "+amount);
        }
        if(change/10!=0){
            amount = (int)change/10;
            change = change%10;
            System.out.println("10   THB : "+amount);
        }
        if(change/5!=0){
            amount = (int)change/5;
            change = change%5;
            System.out.println("5    THB : "+amount);
        }
        if(change/2!=0){
            amount = (int)change/2;
            change = change%2;
            System.out.println("2    THB : "+amount);
      
        }

    
        System.out.println("=========================================");
    } 
    
    
    
    
            
    void bill_2(){
        System.out.println("");
        System.out.println("-----------------P&P SHOP-----------------");
         c.day();
        System.out.println("==========================================");
        System.out.println("Polaroid              "+sum1+"    THB");
        System.out.println("Light                 "+sum2+"    THB");
        System.out.println("Box Set               "+sum3+"    THB");
        total = sum1+sum2+sum3;
        System.out.println("Total                 "+total+"   THB");
       
            Scanner mon1 = new Scanner(System.in);
            System.out.print("Please enter your money : ");
            money = mon1.nextDouble();
           
            
        if(money<total){
           do{ 
            System.out.print("Please enter your money : ");
            money = mon1.nextDouble();
           }while(!(money>total));
            change=money-total;
            System.out.println("Change        "+change+"   THB");
        }
        else{
            
            change=money-total;
            System.out.println("Change        "+change+"   THB");
        }
          if(change/1000!=0){
            amount = (int)change/1000;
            change = change%1000;
            System.out.println("1000 THB : "+amount);
        }
        if(change/500!=0){
            amount = (int)change/500;
            change = change%500;
            System.out.println("500  THB : "+amount);
        }
        if(change/100!=0){
            amount = (int)change/100;
            change = change%100;
            System.out.println("100  THB : "+amount);
        }   
        if(change/50!=0){
            amount = (int)change/50;
            change = change%50;
            System.out.println("50   THB : "+amount);
        }
        if(change/20!=0){
            amount = (int)change/20;
            change = change%20;
            System.out.println("20   THB : "+amount);
        }
        if(change/10!=0){
            amount = (int)change/10;
            change = change%10;
            System.out.println("10   THB : "+amount);
        }
        if(change/5!=0){
            amount = (int)change/5;
            change = change%5;
            System.out.println("5    THB : "+amount);
        }
        if(change/2!=0){
            amount = (int)change/2;
            change = change%2;
            System.out.println("2    THB : "+amount);
      
        }

        System.out.println("=========================================");
      
    }

    
    }
    
    

    

