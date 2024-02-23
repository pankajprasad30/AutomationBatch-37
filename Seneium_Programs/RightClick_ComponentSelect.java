//how to select component after right click ? This can be done by robot class.
//need to check why java robot class is not working
package selenium.program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ComponentSelect {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail= driver.findElement(By.linkText("Gmail"));
		
		Actions a1=new Actions(driver);
		a1.contextClick(gmail).perform();
		
		Robot r1=new Robot();	
		r1.keyPress(KeyEvent.VK_DOWN);// Virtul Keys, with this we can select component from right click.
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);// if want to select 2nd option then two times we have to write same code
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);

	}

}
