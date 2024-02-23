package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_Check_IsEnabled {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/Automation/learningHTML1.html");
		WebElement enabled_check= driver.findElement(By.id("121"));
		boolean a1= enabled_check.isEnabled();
		if(a1==true && enabled_check.isEnabled()==true)
		{
			enabled_check.sendKeys("Prasad");
			
		}
		else
		{
			System.out.println("Component is Disabled");
			
		}

	}

}
