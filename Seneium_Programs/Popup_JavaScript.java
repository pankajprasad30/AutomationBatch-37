//How to handle java script pop up handle
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_JavaScript {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/Automation/learningHTML1.html");
		//driver.switchTo().alert().accept();// for handeling java script pop up
		driver.switchTo().alert().dismiss();
		WebElement firstname= driver.findElement(By.id("1"));
		firstname.sendKeys("pankaj");

	}

}
