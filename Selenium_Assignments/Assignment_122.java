//Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari" in the firstname and copy paste in all 4 text fields using keys
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_122 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement firstname= driver.findElement(By.id("fname"));
		firstname.sendKeys("Manish Kumar Tiwari");
		firstname.sendKeys(Keys.COMMAND+"A");
		firstname.sendKeys(Keys.COMMAND+"C");
		driver.findElement(By.id("lname")).sendKeys(Keys.COMMAND+"v");
		driver.findElement(By.id("Username")).sendKeys(Keys.COMMAND+"V");
		driver.findElement(By.id("password")).sendKeys(Keys.COMMAND+"v");
		driver.findElement(By.id("w3review")).sendKeys(Keys.COMMAND+"V");
		driver.findElement(By.id("Address")).sendKeys(Keys.COMMAND+"v");
		driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys(Keys.COMMAND+"v");
		
		
		

	}

}
