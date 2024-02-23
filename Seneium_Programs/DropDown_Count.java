// need to check its not working,throwing unexpected tagname exception
package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Count {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement skills_dd= driver.findElement(By.xpath("//ul[@id='skills']"));
		Select s1=new Select(skills_dd);
		//s1.selectByIndex(1);
		s1.selectByValue("Technical Skills");
		
		List <WebElement> s2= s1.getOptions();
		int count= s2.size();
		System.out.println(count);
		
		

	}

}
