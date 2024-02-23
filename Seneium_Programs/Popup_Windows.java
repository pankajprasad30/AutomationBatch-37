//How to handle windows popup
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filebin.net/");
		WebElement upload= driver.findElement(By.xpath("//input[@id='fileField']"));
		Thread.sleep(2000);
		upload.sendKeys("/Users/apple/Downloads/Automation/File Samples/wordpress-pdf-invoice-plugin-sample.pdf");
		
	}

}
