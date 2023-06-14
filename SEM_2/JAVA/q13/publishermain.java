import java.util.*;
class publisher
{
    String pName;
    publisher(String nm)
    {
        pName=nm;
    }
    void display()
    {
        System.out.println("Publisher Name:"+pName);
    }
}
class book extends publisher
{
    String bName;
    book(String pName,String bn)
    {
        super(pName);
        bName=bn;
    }
    void display()
    {
        super.display();
        System.out.println("Book Name:"+bName);
    }
}
class literature extends book
{
    String litName;
    literature(String pName,String bName,String ln)
    {
        super(pName,bName);
        litName=ln;
    }
    void display()
    {
        super.display();
        System.out.println("Literature:"+litName);
    }
}
class fiction extends book
{
    String ficName;
    fiction(String pName,String bName,String fn)
    {
        super(pName,bName);
        ficName=fn;
    }
    void display()
    {
        super.display();
        System.out.println("Fiction:"+ficName);
    }
}
class publishermain
{
    public static void main(String a[])
    {
        literature l=new literature("Penguin","I too had a love story","ITHALS");
        fiction f=new fiction("HP","Looking for Alaska","LFA");
        l.display();
        f.display();
    }
}
