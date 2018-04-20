package projectpp;

import java.util.Scanner;
public class Menu extends money  {
    
    static String g,m,il,ip;
    static String []a = new String[3] ;
    static int number;
    static String id[] ={"12345","01234"};
    static String pw[] ={"54321","43210"};
    static String co[] ={"Mr.Gon Tanseng(VIP)","Mrs.Doaw Jinapol(VIP)"};
    
    polaroid p = new polaroid();
    light l = new light();
    set s = new set();
   
    
    Menu(){
        super();
    }
   
   
    public void menu1(){
     a[0]="Polaroid";
     a[1]="Light";
     a[2]="Box Set";
    do{
        System.out.println("                         ### MENU ###                        ");
        System.out.println("1 : "+a[0]);
        System.out.println("2 : "+a[1]);
        System.out.println("3 : "+a[2]);
        
        Scanner mn = new Scanner(System.in);
        System.out.print("Enter Menu >> ");
          number = mn.nextInt(); 
        System.out.println("-------------------------------------------------------------");
   
          switch(number){
              case 1 : System.out.println("            >>-----------" + a[0] +" -----------<<"); 
                       p.print(); break;
              case 2 : System.out.println("            >>-------------" + a[1] + "------------<<");   
                       l.print(); break;  
              case 3 : System.out.println("            >>-----------" + a[2] + "------------<<");  
                       s.print(); break;
          }
    }while(number!=1&&number!=2&&number!=3);
     again(); 
    }
    
    
    public void again(){
    do{
       Scanner sc = new Scanner(System.in);
       System.out.print("Do you wants to order again?(Y/N) : ");
       g = sc.nextLine();
    }while(!(g.equals("Y")||(g.equals("y"))||(g.equals("N"))||(g.equals("n"))));
       if(g.equals("Y")||g.equals("y")){
       System.out.println("-------------------------------------------------------------");
       this.menu1();
    }
       else if(g.equals("N")||g.equals("n")){
       this.setbill();  
    }
    }
    
    
    public void setbill(){
    do{
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Are you Member??(Y/N) : ");
        m = sc1.nextLine();
    }while(!(m.equals("Y")||(m.equals("y"))||(m.equals("N"))||(m.equals("n"))));
        if(m.equals("Y")||m.equals("y")){
          do{  
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter Your Member ID : ");
            il = sc2.nextLine();
            
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Enter Your Password  : ");
            ip = sc3.nextLine();
          }while(!(il.equals(id[0])&&ip.equals(pw[0])||il.equals(id[1])&&ip.equals(pw[1]))); 
   
    System.out.println("");  
    System.out.println("_____________________________________________________________");
    System.out.println("|                     - - - Promotion - - -                 |");
    System.out.println("| [1] Buy 300  discount 10%                                 |");
    System.out.println("| [2] Buy 500  discount 10% free light 2 m.                 |");
    System.out.println("| [3] Buy 1000 discount free set A 1 Set                    |");
    System.out.println("|___________________________________________________________|");
    
    
    bill_1();
    if(il.equals(id[0])&&ip.equals(pw[0])){
        System.out.println("Member(VIP)  : "+co[0]);}
    else if(il.equals(id[1])&&ip.equals(pw[1])){
        System.out.println("Member(VIP)  : "+co[1]);}   
        }
    else if(m.equals("N")||m.equals("n")){
    bill_2();
    System.out.println("My Customer");
    }
 }    
}
