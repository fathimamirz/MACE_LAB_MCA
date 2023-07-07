package calculator;
public class add implements cal
{
  public double a,b;
  public add(double a,double b)
  {
       this.a=a;
       this.b=b;
  }
  public void operations()
  {
     System.out.println("addition of "+a+" & "+b+" is: "+(a+b));
  }
}
