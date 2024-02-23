// it is applicable to only those components whose tag name is a, also example if link text is Gmail then we can write Gma which is partial.
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_PartialLinkText {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.partialLinkText("Gma")).click();

	}

}
