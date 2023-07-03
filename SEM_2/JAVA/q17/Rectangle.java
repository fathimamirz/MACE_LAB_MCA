package graphics;
public class Rectangle implements Properties
{
    public double len,brdth;
    
    public Rectangle(double len,double brdth)
    {
       this.len=len;
       this.brdth=brdth;
    }
    public void area()
    {
        System.out.println("Area of rectangle is: "+len*brdth);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of rectangle is: "+2*(len+brdth));
    }
}
