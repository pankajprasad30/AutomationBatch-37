//better to repractice
package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Handle_Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a1= driver.findElement(By.id("twotabsearchtextbox"));
		a1.sendKeys("books");
		Thread.sleep(2000);
		List <WebElement> b1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		b1.get(6).click();
	}

}
