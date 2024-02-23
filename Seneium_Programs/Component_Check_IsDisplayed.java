package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_Check_IsDisplayed {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement find_ele= driver.findElement(By.xpath("//input[@id='fname']"));
		boolean checking_firstname= find_ele.isDisplayed();
		if(checking_firstname==true)
		{
			find_ele.sendKeys("Pankaj");
		}
		else
		{
			System.out.println("Do Nothing");
		}

	}

}
