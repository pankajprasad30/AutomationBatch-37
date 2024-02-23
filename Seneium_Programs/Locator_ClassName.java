//class name can be used if its unique. drawback is if some webpage have same classname for multiple elements
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ClassName {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("India");

	}

}
