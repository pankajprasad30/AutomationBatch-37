package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath_Relative_Google {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Pankaj");
		driver.findElement(By.xpath("(//input)[3]")).click();

	}

}
