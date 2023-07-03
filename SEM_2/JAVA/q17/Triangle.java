package graphics;
import java.lang.Math;
public class Triangle implements Properties
{
    public int a,b,c;
    public Triangle(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void area()
    {
      double s;
      s=(a+b+c)/2;
      System.out.println("Area of triangle is: "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    public void perimeter()
    {
      System.out.println("perimeter of triangle is: "+(a+b+c));
    }
}
