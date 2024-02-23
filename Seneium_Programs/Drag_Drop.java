//it can be done by action class, drag & drop
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement drag= driver.findElement(By.id("drag2"));
		WebElement drop= driver.findElement(By.id("div2"));
		
		//WebElement drag1= driver.findElement(By.id("div2"));
		//WebElement drop1= driver.findElement(By.id("drag2"));
		
		
		Actions drag_drop=new Actions(driver);
		drag_drop.dragAndDrop(drag, drop).perform();
		//Thread.sleep(2000);
		//drag_drop.dragAndDrop(drag1, drop1).perform();
		

	}

}
