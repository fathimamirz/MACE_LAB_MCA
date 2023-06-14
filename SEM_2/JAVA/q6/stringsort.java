import java.util.*;
class sort{
    int n;
    String s[];
    sort(int n)
    {
    this.n=n;
    s=new String[n];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the strings");
    for(int i=0;i<n;i++)
       {
           System.out.print("text"+(i+1)+":");
           s[i]=sc.nextLine();
       
       }
    }
    void sortstring()
    {
    
    String temp=" ";   
    for(int i=0;i<n-1;i++)
      for(int j=0;j<n-i-1;j++)
        if(s[j].compareTo(s[j+1])>0)
        {
           temp=s[j];
           s[j]=s[j+1];
           s[j+1]=temp;
           
        }
      
    }
    void display()
    {

      for(int i=0;i<n;i++)
         System.out.println(s[i]);

    }


}
class stringsort{
   
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no of strings");
     int n=sc.nextInt();
     sort so=new sort(n);
     
     so.sortstring();
     so.display();
    
     }
}



