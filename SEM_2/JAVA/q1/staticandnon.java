class staticandnon{
  public static void main(String args[])
  {
      show();
      staticandnon s=new staticandnon();
      s.disp();
   }
      static void show()
      {
         System.out.println("this is a static method");
      }
      void disp()
      {
        System.out.println("this is a non static method invoked using an object");
       }
}   
