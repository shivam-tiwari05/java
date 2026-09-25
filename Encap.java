
import java.util.Scanner;

public class Encap {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       
         System.out.println("enter pin:");
       int x=sc.nextInt();
      
        bankAcc b=new bankAcc(x);
       
       
      if (x==b.y) {
        
      
       
      
       System.out.println("choose options:");
       System.out.println(" for withdraw press 1");
       System.out.println("for deposit press 2");
       System.out.println("for check balannce press 3");
       int z=sc.nextInt();
       if (z==1) {
        
        System.out.println("enter withdrw amount");
         double with=sc.nextDouble();
            b.withdaw(with);
            if (with<=b.CheckBal()) {
                
            }

       } else if (z==2) {
        System.out.println("enter deposit amount:");
        double dep=sc.nextDouble();
        b.deposit(dep);
       } else if (z==3) {
        System.out.println("your balance is:");
        b.CheckBal();
       } else {
        System.out.println("error enter valind number");
       }



    } else {
        System.out.println("error wrong pin no.");
    }
   sc.close(); 
} 
}        


class bankAcc {
     int acc=563521;
     private double balance=40;
     private int pin=6263;
        int y;

    public bankAcc(int x) {
        if(x==pin) {
            y=x;
        }
    }
          
     public void deposit(double amt) {
        balance+=amt;
     } 

      
    

     public void withdaw(double amt) {

        balance-=amt;

     }
     public double CheckBal() {
      return balance;

     }

    
    }
