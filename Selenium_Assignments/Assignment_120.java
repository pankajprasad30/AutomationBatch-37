//Launch GrowTechminds registration form,for firstname textfield enter name as Manish Kumar Tiwari,remove Tiwari from it using Keys option
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_120 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(" Manish Kumar Tiwari");
		//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.COMMAND+"a");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);

	}

}
