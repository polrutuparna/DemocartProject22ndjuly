package PageObjectModel;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartDashBoard {
	
	public WebDriver driver;  
		
	private By searchBox=By.xpath("//input[@placeholder='Search']");
	private By SearchButton=By.xpath("//button[@class='btn btn-default btn-lg']");
	private By AddToCartButton = By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]");
	private By item1 = By.xpath("//p[@class='price']"); //iphone
	private By item2 = By.xpath(""); // samsung
	
	public CartDashBoard(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}	
		public WebElement SearchButton() {
			return driver.findElement(SearchButton);
		
	}
		public WebElement AddToCartButton() {
			return driver.findElement(AddToCartButton);
		}
		public WebElement item1() {
			return driver.findElement(item1);
		}
		public WebElement item2() {
			return driver.findElement(item2);
		}
	
}
