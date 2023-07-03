package graphics;
public class Circle implements Properties
{
  public double rad;
  public Circle(double rad)
  {
     this.rad=rad;
  }
  public void area()
  {
  
       System.out.println("Area of circle is: "+3.14*rad*rad);
  }
  public void perimeter()
  {
  
       System.out.println("perimeter of circle is: "+2*3.14*rad);
  }
}
