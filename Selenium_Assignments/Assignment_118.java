//Login to facebook.com - write email and copy paste same in password
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_118 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pankajprasad4798@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.COMMAND+"a");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.COMMAND+"c");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.COMMAND+"v");

	}

}
