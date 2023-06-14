import java.util.*;
class Employee{
    private int eNo;
    private String eName;
    private double salary;
    public Employee(int eNo,String eName,double salary){
        this.eNo=eNo;
        this.eName=eName;
        this.salary=salary;
    }
    public int getno(){
        return eNo;
    }
    public String getname(){
        return eName;
    }
    public double getsalary(){
        return salary;
    }
}
class employeemana{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of employee");
        int n=sc.nextInt();
        Employee[] emp=new Employee[n];
        for(int i=0;i<n;i++){
            System.out.println("enter details for employee"+(i+1)+":");
            System.out.println("employee no : ");
            int eNo=sc.nextInt();
            System.out.println("employee name :");
            String eName=sc.next();
            System.out.println("salary : ");
            double salary=sc.nextDouble();
            emp[i]=new Employee(eNo,eName,salary);
        }
        System.out.println("enter employee no to search : ");
        int searchno=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(emp[i].getno()==searchno){
                System.out.println("employee found ");
                System.out.println("employee number : "+emp[i].getno());
                System.out.println("employee name : "+emp[i].getname());
                System.out.println("employee salary : "+emp[i].getsalary());
                found=true;
                break;
               
               
            }
        }
        if(!found)
        {
            System.out.println("employee not found ");
        }
    }
}

