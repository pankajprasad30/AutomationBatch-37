// //get window will give you browser id of parent & child browser
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Method_getWindowHandles {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.google.com");
	    System.out.println(a1.getWindowHandles());

	}

}
