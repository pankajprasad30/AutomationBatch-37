// we travers from parent tag name to child tag name with the help of single forward / ggf/gf2/father/manish
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath_Absolute {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/apple/Downloads/Automation/learningHTML1.html");
		driver.findElement(By.xpath("(html/body/input)[1]")).sendKeys("pankajprasad30");
		driver.findElement(By.xpath("(html/body/input)[2]")).sendKeys("name");
		driver.findElement(By.xpath("(html/body/input)[3]")).sendKeys("Hello@123");
		driver.findElement(By.xpath("((html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((html/body/form)[2]/input)[3]")).click();
		driver.findElement(By.xpath("((html/body/form)[1]/input)[1]")).sendKeys("Pankaj");
		//driver.findElement(By.xpath("((html/body/form)[1]/input)[2]")).sendKeys("Prasad");// since field is disable so its not working
	    driver.findElement(By.xpath("(html/body/input)[4]")).click();//from this line code is not working need to check
	    driver.findElement(By.xpath("(html/body/input)[5]")).click();
	    driver.findElement(By.xpath("(html/body/input)[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(html/body/a)[1]")).click();
		

	}

}
