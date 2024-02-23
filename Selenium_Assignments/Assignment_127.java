//Launch www.flipkart.com page,search for books and click on second autosuggestion use xpath to locate autosuggestions.
package assignments.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_127 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement autosuggestion= driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		autosuggestion.sendKeys("books");
		Thread.sleep(2000);
		List<WebElement> dd= driver.findElements(By.xpath("//div/form/ul"));
		int list= dd.size();
		System.out.println(list);
		//Thread.sleep(2000);
		dd.get(list-5).click();// check in free time
		

	}

}
