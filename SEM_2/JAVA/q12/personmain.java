import java.util.*;
class person
{
    String name;
    String gender;
    String address;
    int age;
    person(String name,String gender,String address,int age)
    {
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}
class employee extends person{
    int empid;
    String compName;
    String qual;
    Double sal;
    employee(String name,String gender,String address,int age,int empid,String compName,String qual,double sal)
    {
        super(name,gender,address,age);
        this.empid=empid;
        this.compName=compName;
        this.qual=qual;
        this.sal=sal;
    }
}
class teacher extends employee{
    String sub;
    String dept;
    int tid;
    teacher(String name,String gender,String address,int age,int empid,String compName,String qual,double sal,String sub,String dept,int tid)
    {
        super(name,gender,address,age,empid,compName,qual,sal);
        this.sub=sub;
        this.dept=dept;
        this.tid=tid;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
        System.out.println("Employee ID:"+empid);
        System.out.println("Company Name:"+compName);
        System.out.println("Qualification:"+qual);
        System.out.println("Salary:"+sal);
        System.out.println("Subject Taught:"+sub);
        System.out.println("Department:"+dept);
        System.out.println("Teacher ID:"+tid);
    }
}
class personmain{
    public static void main(String []a)
    {
        int n,age,empid,tid;
        String  name,gender,address,compName,qual,sub,dept;
        double sal;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees:");
        n=sc.nextInt();
        teacher t[]=new teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Name:");
            name=sc.next();
            System.out.println("Gender:");
             gender=sc.next();
            System.out.println("Address:");
            address=sc.next();
            System.out.println("Age:");
            age=sc.nextInt();
            System.out.println("Employee ID:");
            empid=sc.nextInt();
            System.out.println("Company name:");
            compName=sc.next();
            System.out.println("Qualification:");
            qual=sc.next();
            System.out.println("Salary:");
            sal=sc.nextDouble();
            System.out.println("Subject taught:");
            sub=sc.next();
            System.out.println("Department:");
            dept=sc.next();
            System.out.println("Teacher ID:");
            tid=sc.nextInt();
            t[i]=new teacher(name,gender,address,age,empid,compName,qual,sal,sub,dept,tid);
        }
        System.out.println("Teachers details");
        for(int i=0;i<n;i++){
            t[i].display();
        }
    }
}
