//used for locating a single element and then performing action.
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Method_findElement {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://grotechminds.com/registration");
		a1.findElement(By.id("Username")).sendKeys("PankajPrasad30");

	}

}
