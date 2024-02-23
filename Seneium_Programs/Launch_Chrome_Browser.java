//Launch empty Chrome browser
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.google.com");
		
	}

}
