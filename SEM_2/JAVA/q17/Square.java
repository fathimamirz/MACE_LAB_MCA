package graphics;
public class Square implements Properties
{
public double a;
public Square(double a)
{
   this.a=a;
}
public void area()
{
  System.out.println("Area of square is: "+a*a);
}
public void perimeter()
{
   System.out.println("perimeter of square is: "+4*a);
}
}
