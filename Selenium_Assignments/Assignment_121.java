//Launch GrowTechminds registration form,locate every element except Dropdowns and Upload file button and perform action on each element using WebElement
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_121 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement firstname= driver.findElement(By.id("fname"));
		firstname.sendKeys("Pankaj");
		WebElement lastname= driver.findElement(By.id("lname"));
		lastname.sendKeys("Prasad");
		WebElement username=driver.findElement(By.id("Username"));
		username.sendKeys("pankajprasad30");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Welcome@123");
		WebElement address=driver.findElement(By.id("w3review"));
		address.sendKeys("Bangalore");
		WebElement paddress= driver.findElement(By.id("Address"));
		paddress.sendKeys("Same as present addresss");
		WebElement pincode= driver.findElement(By.id("Pincode"));
		pincode.sendKeys("560076");
		WebElement agree= driver.findElement(By.name("Agree"));
		agree.click();
		
		

	}

}
