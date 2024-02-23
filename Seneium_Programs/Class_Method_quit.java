//driver.quit is used to close both child and parent browser
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Method_quit {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.rediff.com");
		Thread.sleep(3000);
		a1.quit();

	}

}
