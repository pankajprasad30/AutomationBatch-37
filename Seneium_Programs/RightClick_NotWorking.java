// how to automate the webpage where right click is not working.
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick_NotWorking {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		WebElement sbi= driver.findElement(By.xpath("//a[.='CONTINUE TO LOGIN'][1]"));
		sbi.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("PankajPrasad");
		driver.findElement(By.xpath("//input[@id='label2']")).sendKeys("HelloPankaj@123");
		driver.findElement(By.xpath("//input[@id='loginCaptchaValue']")).sendKeys("Pank345");
		driver.findElement(By.xpath("//input[@id='Button2']")).click();

	}

}
