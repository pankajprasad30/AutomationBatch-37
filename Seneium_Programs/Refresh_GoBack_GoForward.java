//Navigate to browser templates.
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_GoBack_GoForward {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();//launch empty browser
		driver.manage().window().maximize();
		driver.get("https://amazon.in");//it will navigate to link
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		
		

	}

}
