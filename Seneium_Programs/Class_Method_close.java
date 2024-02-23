//driver.close will close parent browser which has control
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Method_close {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.google.com");
		Thread.sleep(2000);
		a1.close();
		
	}

}
