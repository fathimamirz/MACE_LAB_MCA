package calculator;
public class sub implements cal
{
   public double c,d;
   public sub(double c,double d)
   {
     this.c=c;
     this.d=d;
   }
   public void operations()
   {
      System.out.println("substraction of "+c+" & "+d+" is: "+(c-d));
   }
}
