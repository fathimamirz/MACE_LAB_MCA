import java.util.*;
interface parameters{
  
     public void area();
     
     public void perimeter();
     
 }
 class rectangle implements parameters{
     double len,brdth;
     double ar,pr;
     rectangle(double len,double brdth)
     {
        this.len=len;
        this.brdth=brdth;
     }
     public void area(){
         ar=len*brdth;
         System.out.println("area of rectangle with length "+len+" and breadth "+brdth+" is: "+ar);
     }
     public void perimeter()
     {
        pr=2*(len+brdth);
        System.out.println("perimeter of rectangle with length "+len+" and breadth "+brdth+" is: "+pr);
     }
}
class circle implements parameters{
    double rad;
    double ar,pr;
    circle(double rad)
    {
       this.rad=rad;
    }
     public void area(){
         ar=3.14*rad*rad;
         System.out.println("area of circle with radius "+rad+" is: "+ar);
     }
     public void perimeter()
     {
        pr=2*3.14*rad;
        System.out.println("perimeter of circle with radius "+rad+" is: "+pr);
     }
}       
class main
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in) ;
       int ch;
       do
       {
          System.out.println("\n1.Rectangle \n 2.Circle \n 3.exit\nEnter your choice: ");
          ch=s.nextInt();
          switch(ch)
          {
               case 1:System.out.println("Length of rectangle:");
                      double len=s.nextDouble();
                      System.out.println("breadth of rectangle:");
                      double brdth=s.nextDouble();
                      rectangle re=new rectangle(len,brdth);
                      System.out.println("\n RECTANGLE\n");
                      re.perimeter();
                      re.area();
                      break;
               case 2:System.out.println("radius of circle:");
                      double rad=s.nextDouble();
                      circle ci=new circle(rad);
       
                      System.out.println("\nCIRCLE\n");
                      ci.perimeter();
                      ci.area();
                      break;
               case 3:System.out.println("Exit");
                      break;
               
               default:System.out.println("try again");
       
       
          }
      }while(ch!=3);
   }
}
    
       
