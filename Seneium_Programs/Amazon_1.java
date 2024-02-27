package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dd= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		dd.click();
		WebElement usr=driver.findElement(By.id("ap_email"));
		usr.sendKeys("pankajprasad4798@gmail.com");
		usr.sendKeys(Keys.RETURN);
		WebElement pswd=driver.findElement(By.id("ap_password"));
		pswd.sendKeys("Automation@123");
		pswd.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.RETURN);

	}

}
