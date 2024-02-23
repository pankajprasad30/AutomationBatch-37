package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_Check_IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/Automation/learningHTML1.html");
		WebElement check= driver.findElement(By.xpath("(//input)[13]"));
		check.click();
		Thread.sleep(2000);
		
		if(check.isSelected()== true)
		{
			System.out.println("Click on Submit button");
		}
		else
		{
			check.click();
			
		}
		

	}

}
