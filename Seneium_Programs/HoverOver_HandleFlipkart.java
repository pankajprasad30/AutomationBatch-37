package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_HandleFlipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//Thread.sleep(3000);
		WebElement fashion= driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		//Thread.sleep(3000);
		Actions a11=new Actions(driver);
		a11.moveToElement(fashion).perform();
		WebElement shirt=driver.findElement(By.linkText("Men's T-Shirts"));
		shirt.click();


	}

}
