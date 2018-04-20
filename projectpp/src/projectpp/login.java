package projectpp;

import java.util.Scanner;
class login {
    private static String username[] ={"6030213021","6030213046"};
    private static String password[] ={"3021","3046"};
    public static String cashier[]={"Wipada","Pichayanan"};

    public String login1,login2;
    
    login(){
        System.out.println("                 - - Welcome To My Shop - -                  "); 
 }
    login( String r){
    this();
        System.out.println("                  ---- Invite Yourself ----                  ");
 }
    
    public void setlogin1(){
        int y;
        for(y=1;y<2;y++){
        System.out.println("_____________________________________________________________");
        }
        
        System.out.println("                   #### Login Cashier ####                   ");
    do{ 
       Scanner username = new Scanner(System.in);
       System.out.print("Username : ");
       login1 = username.nextLine();
    
       Scanner password = new Scanner(System.in);
       System.out.print("Password : ");
       login2 = password.nextLine();
    }while(!(login1.equals(username[0])&&login2.equals(password[0])||login1.equals(username[1])&&login2.equals(password[1]))); 

    if(login1.equals(username[0])&&login2.equals(password[0])){
        System.out.println("Cashier  : "+cashier[0]);}
    else if(login1.equals(username[1]) && login2.equals(password[1])){
        System.out.println("Cashier  : "+cashier[1]);}  
}
}
    
