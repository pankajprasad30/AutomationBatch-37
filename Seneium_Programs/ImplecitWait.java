package selenium.program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplecitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implecit wait
		WebElement a1= driver.findElement(By.name("q"));
		a1.sendKeys("India");
		//Thread.sleep(2000);// it need since after typing webpage new few seconds to show results
		List <WebElement> results= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count_auto= results.size();
		System.out.println(count_auto);
		//Thread.sleep(2000);
		
		//results.get(3).click();
		results.get(count_auto-7).click();// generic code we have to use like this 10-7=3,note* indexing stats with 0

	}

}
