//How to handle dropdown
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		WebElement category_dd= driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(category_dd);
		//s1.selectByValue("search-alias=computers");// select by value
		//s1.selectByVisibleText("Electronics");// select by visible text
		s1.selectByIndex(2);// select by index

	}

}
