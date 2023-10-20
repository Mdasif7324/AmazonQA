package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class OrderClass {
	public static void main(String[] args) throws Exception {
		//launch the browser
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter url
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		//find product in search bar
		driver.findElement(By.name("field-keywords")).sendKeys("samsung m34 5g", Keys.ENTER);
		
		Thread.sleep(2000);
		
		//click the product
		driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M34 5G (Waterfall Blue,6GB,128GB)|1')]")).click();
		
		Thread.sleep(2000);
		
		//switch to another tab
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		//add to cart
		driver.findElement(By.id("add-to-cart-button")).click();
		
		System.out.println("the product is added to cart");
	}
}
