package projectpp;

import java.util.Scanner;

class money extends MOM {
        
public static int choose,amount,choice; 
public static double pro,totalp=0,money,change;
calendar c = new calendar();
    
    void pprice(){}
    
    void bill_1(){
        System.out.println("");
        System.out.println("");
        System.out.println("_____________________________________________________________");
        System.out.println("---------------------------P&P SHOP--------------------------");
        System.out.println("                     P&P SHOP : PSU PHUKET                   ");
        c.day();
        System.out.println("_____________________________________________________________");
        System.out.println("Polaroid                                            "+sum1);
        System.out.println("Light                                               "+sum2);
        System.out.println("Box Set                                             "+sum3);
        total = sum1+sum2+sum3;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total                                               "+total);
        
        
    if(total>=300&&total<500){
        System.out.println(" ---- Discount 10% ----");
        totalp=total*0.1;
        pro=total-totalp;
    }
    else if(total>=500&&total<1000){
        System.out.println(" ---- Discount 10% ----");
        System.out.println(" --- Free light 2 M. ---");
        totalp=total*0.1;
        pro=total-totalp;
    }
    else if(total>=1000){
        System.out.println(" --- Free set A 1 Set --- ");
        totalp=total;
        pro=totalp;
    }
    else{
        System.out.println(" -- Not In Promotion -- ");
        totalp=total;
        pro=total;
    }
        System.out.println("Promotion                                           "+pro);
                       

                Scanner mon1=new Scanner(System.in);
        System.out.print("Please enter your money :                           ");
                money = mon1.nextDouble();
            
           if(money<pro){ 
            
                System.out.println(" Your Money Not Enough ");
                do{System.out.println(" [1] End Program : [2] Enter New Money ");
                  Scanner sc5 = new Scanner(System.in);
                  System.out.print("Which choice do you want? : ");
                  choice=sc5.nextInt();
                  if(choice==1){ 
                }
                  else if(choice==2){
        System.out.print("Please enter your money :                           ");
                    money = mon1.nextDouble(); 
                    change=money-pro;
        System.out.println("Change                                              "+change); 
                  }
               
                }while(choice!=1&&choice!=2);
           }
            else if(money>=pro){
            change=money-pro;
        System.out.println("Change                                              "+change);
           }
           
           System.out.println("-------------------------------------------------------------");
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

        System.out.println("_____________________________________________________________");
    } 
    
      
    void bill_2(){
        System.out.println("");
        System.out.println("");
        System.out.println("_____________________________________________________________");
        System.out.println("---------------------------P&P SHOP--------------------------");
        System.out.println("                     P&P SHOP : PSU PHUKET                   ");
        c.day();
        System.out.println("_____________________________________________________________");
        System.out.println("Polaroid                                            "+sum1);
        System.out.println("Light                                               "+sum2);
        System.out.println("Box Set                                             "+sum3);
        total = sum1+sum2+sum3;
        System.out.println("Total                                               "+total);
       
            Scanner mon1 = new Scanner(System.in);
        System.out.print("Please enter your money :                           ");
            money = mon1.nextDouble();
           
            
        if(money<total){
           System.out.println(" Your Money Not Enough ");
                do{System.out.println(" [1] End Program : [2] Enter New Money ");
                  Scanner sc5 = new Scanner(System.in);
                  System.out.print("Which choice do you want? : ");
                  choice=sc5.nextInt();
                  if(choice==1){  
                }
                  else if(choice==2){
        System.out.print("Please enter your money :                           ");
                    money = mon1.nextDouble(); 
                    change=money-total;
        System.out.println("Change                                              "+change); 
                  }
               
            }while(choice!=1&&choice!=2);
        }
           else{
            change=money-total;
        System.out.println("Change                                              "+change);
          }
        
          System.out.println("-------------------------------------------------------------");
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
           System.out.println("_____________________________________________________________");
      
    }
    }
    
    

    

