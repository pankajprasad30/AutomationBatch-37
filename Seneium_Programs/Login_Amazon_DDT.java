//log in to amazon via excel sheet username and password. Note*- password should be alpha numeric
package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazon_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream f1=new FileInputStream("/Users/apple/eclipse-workspace/Selenium/ExcelSheet/Pankaj.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		 String un=  wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		 String pwd=  wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
				
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement a1=driver.findElement(By.id("ap_email"));
		a1.sendKeys(un);
		a1.sendKeys(Keys.RETURN);
		WebElement a2=driver.findElement(By.id("ap_password"));
		a2.sendKeys(pwd);
		a2.sendKeys(Keys.RETURN);
		//driver.quit();

	}

}
