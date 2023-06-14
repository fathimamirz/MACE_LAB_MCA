import java.util.*;
class student{
   String name;
   String add;
   student(String name,String add)
   {
        this.name=name;
        this.add=add;
   }
   void display()
   {
       System.out.println("Student name: "+name);
       System.out.println("Student address: "+add);
   }
}
interface sports{
      public void displayscore();
}
class results extends student implements sports{
    int score;
    String grade;
    results(String name,String add,int score,String grade){
          super(name,add);
          this.score=score;
          this.grade=grade;
    }
    public void displayscore(){
         System.out.println("sports score: "+score);
    }
    void display()
    {
       super.display();
       displayscore();
       System.out.println("Student grade: "+grade);
    
    }
}
class studmain
{
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
     System.out.println("name: ");
     String name=sc.nextLine();
     System.out.println("address: ");
     String add=sc.nextLine();
     System.out.println("sports score; ");
     int score=sc.nextInt();
     System.out.println("grade: ");
     String grade=sc.nextLine();
     results r= new results(name,add,score,grade);
     r.display();
  }
}
