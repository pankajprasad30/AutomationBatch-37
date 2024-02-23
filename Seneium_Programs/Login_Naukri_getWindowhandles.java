// Naukri Registration page login, how we can switch from parent to child
package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Naukri_getWindowhandles {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement google_login=driver.findElement(By.xpath("//span[.='Google']"));
		google_login.click();
		
		String parentid= driver.getWindowHandle();
		Set<String> parent_child= driver.getWindowHandles();
		System.out.println(parentid);
		System.out.println(parent_child);
		
		Iterator<String> pcid=parent_child.iterator();
		String parentid1= pcid.next();// parent ID from getwindowhandles
		String childid1=pcid.next();//child ID from getwindowhandles
		System.out.println(parentid1);
		System.out.println(childid1);
		
		driver.switchTo().window(childid1);//control is moved to child window
		Thread.sleep(3000);
		
		WebElement user_id= driver.findElement(By.id("identifierId"));
		user_id.sendKeys("pankajprasad4798@gmail.com");
		
		
		
	}

}
