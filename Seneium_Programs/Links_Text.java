package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Text {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.flipkart.com");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<=links.size()-1; i++)
		{
			WebElement text=links.get(i);
			String text_msg= text.getText();
			System.out.println(text_msg);
			
			
		}

	}

}
