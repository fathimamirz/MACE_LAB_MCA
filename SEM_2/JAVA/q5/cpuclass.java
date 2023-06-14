import java.util.Scanner;
class cpu
{
	float price;
	Scanner s=new Scanner(System.in);
	void get1(){
		System.out.println("enter the price:");
		price=s.nextFloat();
	}
	void disp1()
	{
		System.out.println("price is "+price);
	}
	class processor{
		int ncore;
		String manuf;
		
		void get2()
		{
			System.out.println("enter the no of cores");
			ncore=s.nextInt();
			System.out.println("enter the manufacturer");
			manuf=s.next();
			
		}
		void disp2()
		{
			System.out.println("no of cores is "+ncore);
			System.out.println("core manufacturer is "+manuf);
		}
		
	}
	static class ram
	{
		static int memory;
		static String man;
		Scanner s=new Scanner(System.in);
		void get3()
		{
			System.out.println("enter the memory");
			memory=s.nextInt();
			System.out.println("enter the manufacturer");
			man=s.next();
		}
		static void disp3()
		{
			System.out.println("memory is "+memory);
			System.out.println("memory manufacturer is "+man);
		}
		
		
	}
}
class cpuclass
{
	public static void main(String args[])
	{
	  cpu c= new cpu();
	  c.get1();
	  cpu.processor p=c.new processor();
	  p.get2();
	  cpu.ram r=new cpu.ram();
	  r.get3();
	  System.out.println("\n the details are \n");
	  c.disp1();
	  p.disp2();
	  cpu.ram.disp3();
	}
}

