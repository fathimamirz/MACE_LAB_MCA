package calculator;
public class div implements cal
{
   public double e,f;
   public div(double e,double f)
   {
     this.e=e;
     this.f=f;
   }
   public void operations()
   {
     System.out.println("division of "+e+" & "+f+" is: "+(e/f));
   }
}
