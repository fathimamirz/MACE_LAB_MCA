package calculator;
import java.util.*;
class calculation
{
   public static void main(String args[])
   {
     double a,b;
     Scanner sc= new Scanner(System.in);
     System.out.println("enter values 2 values");
     a=sc.nextDouble();
     b=sc.nextDouble();
     add ad=new add(a,b);
     ad.operations();
     sub su=new sub(a,b);
     su.operations();
     div di=new div(a,b);
     di.operations();
     mul mu=new mul(a,b);
     mu.operations();
    }
}
     
