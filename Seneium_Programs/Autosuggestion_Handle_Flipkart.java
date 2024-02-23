package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Handle_Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement fk_dd= driver.findElement(By.xpath("//input[@name='q']"));
		fk_dd.sendKeys("mouse");
		//fk_dd.click();
		Thread.sleep(2000);
		List<WebElement> a1= driver.findElements(By.xpath("//form/ul/li"));//how to find xpath focus on that
		int auto_count= a1.size();
		System.out.println(auto_count);
		Thread.sleep(2000);
		a1.get(auto_count-7).click();
		
		
		

	}

}
