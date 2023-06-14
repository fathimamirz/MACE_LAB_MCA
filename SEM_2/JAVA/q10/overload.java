class shapes{
    void area(int n){
        System.out.println("Area of square :"+ n*n);
    }
    void area(int a,int b)
    {
        System.out.println("Area of rectangle :"+ a*b);
    }
    void area(double r)
    {
        System.out.println("Area of circle :"+ 3.14*r*r);
    }
}
class overload{
    public static void main(String args[]){
        shapes s=new shapes();
        s.area(5);
        s.area(6,10);
        s.area(4.0);
    }
}

