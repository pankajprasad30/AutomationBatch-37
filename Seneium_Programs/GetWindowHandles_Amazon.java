// launch amazon.in, seach for shoes,click on shoes and click on add to carts.
package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		search.sendKeys(Keys.RETURN);
		WebElement shoes=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		shoes.click();
		Set<String> prnt_chld=driver.getWindowHandles();
		System.out.println(prnt_chld);
		Iterator<String> id=prnt_chld.iterator();
		String pcid=id.next();//parent id alone
		String chid=id.next();//child id alone
		System.out.println(pcid);
		System.out.println(chid);
		driver.switchTo().window(chid);
		Thread.sleep(2000);
		//driver.close();
		driver.findElement(By.id("add-to-cart-button")).sendKeys(Keys.RETURN);
		
		
		

	}

}
