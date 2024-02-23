package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream f1=new FileInputStream("/Users/apple/eclipse-workspace/Selenium/ExcelSheet/Pankaj.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		Sheet s1=wb.getSheet("login");
		Row r1= s1.getRow(1);
		Cell c1=r1.getCell(0);
		String value1=c1.getStringCellValue();
		System.out.println(value1);
		Row r2=s1.getRow(1);
		Cell c2=r2.getCell(1);
		String pwd1=c2.getStringCellValue();
		System.out.println(pwd1);
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement a1=driver.findElement(By.id("ap_email"));
		a1.sendKeys(value1);
		a1.sendKeys(Keys.RETURN);
		WebElement a2=driver.findElement(By.id("ap_password"));
		a2.sendKeys(pwd1);
		a2.sendKeys(Keys.RETURN);

	}

}
