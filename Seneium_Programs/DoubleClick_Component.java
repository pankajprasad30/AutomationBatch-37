//it has to be resolved with action class,create action class and pass parameneter driver, utilize method double click.perform
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Component {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dble_clck= driver.findElement(By.xpath("//a[.='Mobiles']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(dble_clck).perform();
		a1.doubleClick(dble_clck).perform();
		

	}

}
