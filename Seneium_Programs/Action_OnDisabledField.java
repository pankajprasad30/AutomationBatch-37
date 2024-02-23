package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_OnDisabledField {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/Automation/learningHTML1.html");
		driver.findElement(By.id("121")).sendKeys("Prasad");
		//Exception : Element Not Interactable Exception

	}

}
