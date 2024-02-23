//Login to Facebook using id,name locator
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("pankajprasad30");
		driver.findElement(By.name("pass")).sendKeys("Welcome@#_781463");
		driver.findElement(By.name("login")).click();		

	}

}
