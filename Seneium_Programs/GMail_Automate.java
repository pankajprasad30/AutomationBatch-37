// Checking that gmail can be automated or not, reult its not
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMail_Automate {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.partialLinkText("Sign in")).click();
		WebElement login=driver.findElement(By.xpath("//input[@id='identifierId']"));
		login.sendKeys("pankajprasad4798");
		login.sendKeys(Keys.RETURN);
		
	}

}
