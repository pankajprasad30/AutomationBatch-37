package class_program;

public class Non_Static_Method 
{
	void add()
	{
		int a=20,b=30;
		int sum=a+b;
		System.out.println("OutPut from non-static method = "+sum);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method Output");
		Non_Static_Method a1=new Non_Static_Method ();
		a1.add(); //non static method can be called by creating reference variable with its class name
		

	}

}
