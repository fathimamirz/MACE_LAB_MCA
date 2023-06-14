import java.util.Scanner;
class addition{
   float real;
   
   float img;
   
   addition()
   {
   Scanner s1=new Scanner(System.in);
    System.out.println("enter real and img");
    real=s1.nextFloat();
    img=s1.nextFloat();
   }
   void add(addition a,addition b)
   {
       float creal,cimg;
   	creal=a.real+b.real;
   	cimg=a.img+b.img;
   	System.out.println(creal+"+"+cimg+"i");
   }
}

class complex{
   public static void main(String args[])
   {
          
          addition a=new addition();
          addition b=new addition();
          System.out.println("the sum of 2 complex numbers is");
          a.add(a,b);
          
          
   }
}

