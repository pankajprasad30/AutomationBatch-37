// how to right click in selenium, launch google.com and on gmail do rigt click
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Perform {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail= driver.findElement(By.linkText("Gmail"));
		
		Actions a1=new Actions(driver);
		a1.contextClick(gmail).perform();
		

	}

}
