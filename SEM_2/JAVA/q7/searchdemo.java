import java.util.*;
class search{
     int arr[]=new int[10];
     void readin(int n)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter elements");
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
     }
     void searchitem(int item,int n)
     {
         for(int i=0;i<n;i++)
         {
             if(arr[i]==item)
             {
                 System.out.println("element "+item+" found at position "+(i+1));
                 return;
             }
         }
         System.out.println("element "+item+" not found");
     }
}
class searchdemo{
    public static void main(String args[]){
        int n,item;
        Scanner sc=new Scanner(System.in);
        search s=new search();
        System.out.println("size:");
        n=sc.nextInt();
        s.readin(n);
        System.out.println("element to search");
        item=sc.nextInt();
        s.searchitem(item,n);
    }
   
}

