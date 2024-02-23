//Get the title of flipkart.com and save each word in an array
package assignments.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_111 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle()); 
	// how to save each words in array need to learn	

	}

}
