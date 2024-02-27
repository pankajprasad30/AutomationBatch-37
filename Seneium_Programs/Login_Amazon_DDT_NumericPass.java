//with old method for numeric password its giving illegalstatement exception.
//change password line in code.
package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazon_DDT_NumericPass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream a1=new FileInputStream("/Users/apple/eclipse-workspace/Selenium/ExcelSheet/Pankaj.xlsx");
		Workbook wb=WorkbookFactory.create(a1);
		String un=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		//String pwd= wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		String pwd=NumberToTextConverter.toText(wb.getSheet("login").getRow(2).getCell(1).getNumericCellValue());
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		

	}

}
