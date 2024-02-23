//Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_116 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.partialLinkText("Arab Emirates")).click();// need to think its pending

	}

}
