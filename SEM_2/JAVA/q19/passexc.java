import java.util.Scanner;
import java.io.*;
class verification extends Exception{
       verification(String s){
       super(s);
       }
}
class passexc{
    public static void main(String str[]){
           try{
              Scanner sc=new Scanner(System.in);
              System.out.println("Authentication of username & passworsd");
              System.out.println("username");
              String nm=sc.next();
              System.out.println("password :-");
              String pass=sc.next();
              check(nm,pass);
           }
           catch(verification v){
               System.out.println("Denied because of......"+v);
           }
    }
    public static void check(String nm,String pass) throws verification
    {
      if(nm.equals("mirza")&&pass.equals("fathima@123"))
          System.out.println("Login Success");
      else
         throw new verification("Incorrect login credentials");
    }
}
      
      
                
                
