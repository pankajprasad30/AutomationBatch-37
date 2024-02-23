//it will give you the title of the webpage
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Method_getTitle {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.amazon.in");
		System.out.println(a1.getTitle());
	}

}
