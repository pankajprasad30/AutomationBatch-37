package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath_Relative {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/Automation/learningHTML1.html");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("pankajprasad70");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("name");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("pankaj");
		//driver.findElement(By.xpath("(//input)[5]")).sendKeys("prasad");
		driver.findElement(By.xpath("(//input)[7]")).click();
		driver.findElement(By.xpath("(//input)[8]")).click();
		driver.findElement(By.xpath("(//input)[9]")).click();
		driver.findElement(By.xpath("(//input)[11]")).click();
		driver.findElement(By.xpath("(//input)[12]")).click();
		driver.findElement(By.xpath("(//input)[13]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a)[1]")).click();

	}

}
