// Second preference is name locator, in case ID look junk value then use name locator
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Name {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("pankajprasad4798@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Welcome@1234");
		driver.findElement(By.name("login")).click();

	}

}
