package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Naukri_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("/Users/apple/eclipse-workspace/Selenium/ExcelSheet/Pankaj.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		String username=w1.getSheet("login").getRow(3).getCell(0).getStringCellValue();
		String password=w1.getSheet("login").getRow(3).getCell(1).getStringCellValue();
				
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys(username);
		driver.findElement(By.id("passwordField")).sendKeys(password);
		driver.findElement(By.xpath("//button[.='Login']")).click();

	}

}
