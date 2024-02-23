//Launch grotechminds registration form and locate dropdowns skills,country and religion perform action on them
package assignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_123 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement skills_dd= driver.findElement(By.id("Skills"));
		Select s1=new Select(skills_dd);
		s1.selectByIndex(1);
		
		WebElement Tech_Skills=driver.findElement(By.id("technicalskills"));
		Select s2=new Select(Tech_Skills);
		s2.selectByValue("Core Java");
		
		WebElement country_dd= driver.findElement(By.id("Country"));
		Select s3=new Select(country_dd);
		s3.selectByVisibleText("India ");
		
		WebElement rel_dd= driver.findElement(By.id("Relegion"));
		Select s4=new Select(rel_dd);
		s4.selectByIndex(1);

	}

}
