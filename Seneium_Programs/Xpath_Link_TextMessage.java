package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Link_TextMessage {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[.='New Releases']")).click();// remember syntex for xpath if in a link text message is present and its unique

	}

}
