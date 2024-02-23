package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_PrintAll {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.flipkart.com");
	    List <WebElement> links= driver.findElements(By.tagName("a"));
	    System.out.println("Total count of links in flipkart are : " +links.size());
	    
	    for(int i=0; i<=links.size()-1; i++)
	    {
	    	WebElement a1= links.get(i);
	    	 String url=a1.getAttribute("href");
	    	 System.out.println(url);
	    	
	    }

	}

}
