package calculator;
public class mul implements cal
{
  public double g,h;
  public mul(double g,double h)
  {
     this.g=g;
     this.h=h;
  }
  public void operations()
  {
     System.out.println("multiplication of "+g+" & "+h+" is: "+(g*h));
  }
}
