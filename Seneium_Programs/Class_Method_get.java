// 1. get method under chrome driver class is used to navigate to any site
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Method_get {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver(); // line used to launch empty browser
		a1.get("https://www.yahoo.com");// line used to navigate to URL

	}

}
