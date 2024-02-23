package class_program;

public class Constructor_Method 
{
	Constructor_Method ()
	{
		int a=10,b=20;
		int add=a+b;
		System.out.println(add);
	}

	public static void main(String[] args) 
	{
		Constructor_Method a1=new Constructor_Method ();// 1st method to call constructor
		new Constructor_Method (); // 2nd method to call constructor

	}

}
