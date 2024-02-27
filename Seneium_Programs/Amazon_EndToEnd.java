package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_EndToEnd {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream f1=new FileInputStream("/Users/apple/eclipse-workspace/Selenium/ExcelSheet/Pankaj.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String un=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pwd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys(un);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("levis jeans");
		search.sendKeys(Keys.RETURN);
		
		WebElement jeans=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
		jeans.click();
		Set<String> prnt_chld=driver.getWindowHandles();
		System.out.println(prnt_chld);
		Iterator<String> id=prnt_chld.iterator();
		String prnt=id.next();
		String chld=id.next();
		System.out.println(prnt);
		System.out.println(chld);
		driver.switchTo().window(chld);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='pp-xRDekO-97']")).sendKeys(Keys.RETURN);	
		//driver.findElement(By.xpath("//i[@class='a-icon a-icon-radio']")).click();
		WebElement card=driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		card.click();
		
		
		

	}

}
