import java.util.*;
class neg_exce extends Exception
{
  public neg_exce(String n)
  {
     super(n);
  }
}
class posexce
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number of elements");
   int num=sc.nextInt();
   System.out.println("enter the elements");
   int a[] =new int[num];
    
   int sum=0,count=0,avg,temp;
   
   for(int i=0;i<num;i++)
   {
     try
   {
       a[i]=sc.nextInt();
      temp=a[i];
      if(a[i]>0)
      {
         sum+=temp;
         count+=1;
      }
      else{
        throw new neg_exce(Integer.toString(temp));
        }
      
   }catch( neg_exce ne){
   System.out.print(ne.getMessage());
   System.out.println(" - is a negative number");
   }
 }
 System.out.println("sum of +ve numbers is :- "+sum);
 System.out.println("Number of +ve numbers is :-"+count);
 System.out.println("average : "+((float)sum/count));
}
}
   
   
