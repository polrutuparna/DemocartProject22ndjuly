package TestCases;
import java.io.IOException; 
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.CommonUtilities;
import Resources.Constant;
import PageObjectModel.CartDashBoard;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class CheckPrice extends baseClass {
	@Test
	public void comparePrice() throws IOException, Exception {
		
		CartDashBoard obj = new CartDashBoard(driver);
		
		//iphone code
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
				driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]")).click();
				
				String a = driver.findElement(By.xpath("//p[@class='price']")).getText();
				
				String[] sp1= a.split("\\s+");
				String iphonecost = sp1[0];
				String afterRemovingDollar = iphonecost.replaceAll("[$,]","");
				 
				//to covert string into double
				double d = Double.parseDouble(afterRemovingDollar);
				System.out.println(d);
				
				Thread.sleep(2000);
				//samsung code
				driver.findElement(By.xpath("//input[@type='text']")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung");
				driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[5]")).click();
				String b = driver.findElement(By.xpath("//p[@class='price']")).getText();
				
				String[] sp2= b.split("\\s+");
				String samsungcost = sp2[0];
				String afterremovingdollar = samsungcost.replaceAll("[$,]", "");
				
				double d2 = Double.parseDouble(afterremovingdollar);
				System.out.println(d2);
				
				//sum of both product
				 double d4 = d+d2;
				 String actual = ("$"+d4);
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
				 String expected = driver.findElement(By.xpath("(//td[@class='text-right'])[12]")).getText();
				 
				 if(!actual.equals(expected)) {
					 System.out.println("Project Successful");
				 }
				 else {
					 System.out.println("Please try again");
				 }
			}

		}

