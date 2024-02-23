//get window Handle will give you browser id of parent browser
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Method_getWindowHandle {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.google.com");
	    System.out.println(a1.getWindowHandle()); 

	}

}
