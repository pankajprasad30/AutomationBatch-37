package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement googlesearchtextfield= driver.findElement(By.className("gLFyf")); //googlesearchtextfield is local variable
		googlesearchtextfield.sendKeys("India");
		googlesearchtextfield.sendKeys(Keys.RETURN);

	}

}
