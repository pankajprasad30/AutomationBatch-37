//Find out total no of links
package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_All {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total no of all links in Flipkart are :"+ links.size());
		

	}

}
