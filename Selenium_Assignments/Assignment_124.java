/*Launch Growtechminds xpath form do the following  1. Write an Xpath for books
2. Write an Xpath for Mobiles
3. Write an Xpath for Clothes
4. Write an Xpath for Chocolates */

package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_124 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.findElement(By.xpath("//div[@id='main']/div/div[3]/div/div/div/nav/ul/li/ul/li[1]/a")).click();//not working need to check

	}

}
