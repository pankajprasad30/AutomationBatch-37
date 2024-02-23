//ID are always unique, so use first if present
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("pankajprasad4798@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome@1234");
		driver.findElement(By.name("login")).click();

	}

}
