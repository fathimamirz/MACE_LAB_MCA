class product
{
	int pcode;
	String pname;
	float price;
	static int check=0;
	product()
	{
		pcode=101;
		pname="Lays";
		price=30;
		check++;
	}
	product(int co,String nm,float pr)
	{
		pcode=co;
		pname=nm;
		price=pr;
		check++;
	}
	void display()
	{
		System.out.println("pcode:"+pcode);
		System.out.println("pname:"+pname);
		System.out.println("price:"+price);
	}
}
class main2
{
	public static void main(String args[])
	{
		product p1=new product();
		product p2=new product(102,"Oreo",20);
		product p3=new product(103,"Pepsi",40);
		p1.display();
		p2.display();
		p3.display();
		if(p1.price<p2.price && p1.price<p3.price)
		System.out.println(p2.pname+" has the lowest price");
		else if(p2.price<p3.price)
		System.out.println(p2.pname+" has the lowest price");
		else
		System.out.println(p3.pname+" has the lowest price");
		System.out.println("Number of objects="+product.check);
	}
}
