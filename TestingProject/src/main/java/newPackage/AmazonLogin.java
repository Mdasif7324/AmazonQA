package newPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLogin {
	@Before
	public void forchrome() throws Exception {
						System.out.println("Test for chrome browser is start");
						//launch chrome browser
						System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
						ChromeDriver driver = new ChromeDriver();
				
						//maximize the browser
						driver.manage().window().maximize();
						
						//enter url
						driver.get("https://www.amazon.in/");
						
						//click the sign in
						driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
						
						//enter invalid mobile number with more than 10 digits
						driver.findElement(By.id("ap_email")).sendKeys("962602335544", Keys.ENTER);
						//can't find the account with that mobile number
						
						Thread.sleep(2000);
						
						//clear the old number
						driver.findElement(By.id("ap_email")).clear();
						
						//enter the invalid number with 10 digits
						driver.findElement(By.id("ap_email")).sendKeys("7904182190", Keys.ENTER);
						
						Thread.sleep(2000);
						
						//enter invalid password
						driver.findElement(By.id("ap_password")).sendKeys("Asif123#", Keys.ENTER);
						//password incorrect
						
						Thread.sleep(2000);
						
						//enter valid password
						driver.findElement(By.id("ap_password")).sendKeys("Asif123@", Keys.ENTER);
						//password incorrect
						
						Thread.sleep(2000);
						
						//click the change number
						driver.findElement(By.id("ap_change_login_claim")).click();
						
						Thread.sleep(2000);
						
						//enter valid mobile number
						driver.findElement(By.id("ap_email")).sendKeys("9944515695", Keys.ENTER);
						
						Thread.sleep(2000);
						
						//enter invalid password
						driver.findElement(By.id("ap_password")).sendKeys("Asif123#", Keys.ENTER);
						//password incorrect
						
						Thread.sleep(2000);
						
						//enter valid password
						driver.findElement(By.id("ap_password")).sendKeys("Asif123@", Keys.ENTER);
						//home page should be opened after identified user
						System.out.println("Test for chrome browser is ended");
	}
	
	@Test
	public void foredge() throws Exception {
				System.out.println("Test for edge browser is started");
				//launch the browser
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				EdgeDriver driver = new EdgeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//enter url
				driver.get("https://www.amazon.in/");
				
				//click the sign in
				driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
				
				//enter invalid mobile number with more than 10 digits
				driver.findElement(By.id("ap_email")).sendKeys("962602335544", Keys.ENTER);
				//can't find the account with that mobile number
				
				Thread.sleep(2000);
				
				//clear the old number
				driver.findElement(By.id("ap_email")).clear();
				
				//enter the invalid number with 10 digits
				driver.findElement(By.id("ap_email")).sendKeys("7904182190", Keys.ENTER);
				
				Thread.sleep(2000);
				
				//enter invalid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123#", Keys.ENTER);
				//password incorrect
				
				Thread.sleep(2000);
				
				//enter valid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123@", Keys.ENTER);
				//password incorrect
				
				Thread.sleep(2000);
				
				//click the change number
				driver.findElement(By.id("ap_change_login_claim")).click();
				
				Thread.sleep(2000);
				
				//enter valid mobile number
				driver.findElement(By.id("ap_email")).sendKeys("9944515695", Keys.ENTER);
				
				Thread.sleep(2000);
				
				//enter invalid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123#", Keys.ENTER);
				//password incorrect
				
				Thread.sleep(2000);
				
				//enter valid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123@", Keys.ENTER);
				//home page should be opened after identified user
				System.out.println("Test for edge browser is ended");
	}
	
	@After
	public void forfirefox()throws Exception {
				System.out.println("Test for firefox browser is started");
				//launch the browser
				System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
		
				//maximize the browser
				driver.manage().window().maximize();
				
				//enter url
				driver.get("https://www.amazon.in/");
				
				//click the sign in
				driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
				
				//enter invalid mobile number with more than 10 digits
				driver.findElement(By.id("ap_email")).sendKeys("962602335544", Keys.ENTER);
				//can't find the account with that mobile number
				
				Thread.sleep(2000);
				
				//clear the old number
				driver.findElement(By.id("ap_email")).clear();
				
				//enter the invalid number with 10 digits
				driver.findElement(By.id("ap_email")).sendKeys("7904182190", Keys.ENTER);
				
				Thread.sleep(2000);
				
				//enter invalid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123#", Keys.ENTER);
				//password incorrect
				
				Thread.sleep(2000);
				
				//enter valid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123@", Keys.ENTER);
				//password incorrect
				
				Thread.sleep(2000);
				
				//click the change number
				driver.findElement(By.id("ap_change_login_claim")).click();
				
				Thread.sleep(2000);
				
				//enter valid mobile number
				driver.findElement(By.id("ap_email")).sendKeys("9944515695", Keys.ENTER);
				
				Thread.sleep(2000);
				
				//enter invalid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123#", Keys.ENTER);
				//password incorrect
				
				Thread.sleep(2000);
				
				//enter valid password
				driver.findElement(By.id("ap_password")).sendKeys("Asif123@", Keys.ENTER);
				//home page should be opened after identified user
				System.out.println("Test for firefox browser is ended");
			}

}
