package class_program;

public class Multiple_Static_Methods 
{
	static void add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args) 
	{
		add();
		System.out.println("Starting");
		add();
		mul();
		div();
		sub();
	}
	static void mul()
	{
		System.out.println("Multiply");
	}
	static void div()
	{
		System.out.println("Division");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}

}
