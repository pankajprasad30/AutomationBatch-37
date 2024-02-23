// Perform any action on the disabled component and find out which exception we are getting.
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_125 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/Automation/learningHTML1.html");
		WebElement disable= driver.findElement(By.xpath("//input[@id='121']"));
		disable.sendKeys("Prasad");
		// Exception : ElementNotInteractableException

	}

}
