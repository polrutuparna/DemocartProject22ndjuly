
package Resources;

import java.time.Duration;     

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import PageObjectModel.CartDashBoard;

public class CommonUtilities {

	public static WebDriver driver;

	

	// This method is for handling static dropdown
    public static void handleStaticDropdown(WebElement element, int index) {
		WebElement e =element;
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	
    //This Method is Used to Search an Item on SearchBox
    public static void handleStaticSearch(WebElement searchBox, String index) {
		WebElement e =searchBox;
		Select s = new Select(e);
		s.selectByVisibleText(index); 
    }
    
 // This method is for handle the assertions
    public static void handleAssertions(String expected, String Actual) {
   
    	SoftAssert sa=new SoftAssert();
    	String  expectedString=expected;
		String  actualString=Actual;
		sa.assertEquals(actualString,expectedString);
		sa.assertAll();
    	
    }
  //This Method is used to grab item price
    public static void handleGrabItemPrice( WebElement item ) {
    	String i;
    	i = item.getText();
    	Float c1 = Float.parseFloat(i);
    	
    //System.out.print(i);
    	
    }
    
   //This Method is used to remove Dollar from the Amount
   public static void handleRemoveDollar(String item, Double afterremoveDollar) {
    	String[] sp1=item.split("\\s+");
		String a=sp1[0];
		String removeDollar=a;
		String removeDollar2 =removeDollar.replaceAll("[$,]", "");
		Double afterremoveDollar1= Double.parseDouble(removeDollar2);
	
    }
 
    public static void handlExplictWait(int duration, WebElement element ) {
    
  	  WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
	  wb.until(ExpectedConditions.visibilityOf(element));
	
    
    }
    
    
	
}