package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_FUncationality_2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(Keys.ARROW_DOWN);

	}

}
