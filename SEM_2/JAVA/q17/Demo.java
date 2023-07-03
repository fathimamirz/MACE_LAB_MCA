package graphics;
import java.util.*;

public class Demo
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter length & breadth of rectangle");
      double len =sc.nextDouble();
      double brdth=sc.nextDouble();
      Rectangle r=new Rectangle(len,brdth);
      System.out.print("Enter 3 sides of triangle");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      Triangle t=new Triangle(a,b,c);
      System.out.print("Enter side of a square");
      double si=sc.nextDouble();
      Square s=new Square(si);
      System.out.print("Enter radius of circle");
      double rad=sc.nextDouble();
      Circle ci=new Circle(rad);
      r.area();
      r.perimeter();
      t.area();
      t.perimeter();
      s.area();
      s.perimeter();
      ci.area();
      ci.perimeter();
     }
}
      
