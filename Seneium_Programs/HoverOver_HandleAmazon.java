//how to handle HoverOver 1. this can be handle by action class by passing a parameter called as driver, then move to element
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_HandleAmazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a1= driver.findElement(By.id("nav-link-accountList"));
		
		Actions a11=new Actions(driver);
		a11.moveToElement(a1).perform();
		

	}

}
