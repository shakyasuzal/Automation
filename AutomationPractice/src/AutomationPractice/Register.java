package AutomationPractice;


//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();	
	
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String baseUrl = "http://automationpractice.com/";
		driver.get(baseUrl);
		driver.findElement(By.className("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Sujal" + System.currentTimeMillis()/20000 +"@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Sujal");
		driver.findElement(By.id("customer_lastname")).sendKeys("Shakya");
		driver.findElement(By.id("passwd")).sendKeys("!Password123");
		Select Days = new Select(driver.findElement(By.id("days")));
		Days.selectByValue("4");
		Select Month = new Select(driver.findElement(By.id("months")));
		Month.selectByValue("3");
		Select Years = new Select(driver.findElement(By.id("years")));
		Years.selectByValue("1996");
		driver.findElement(By.id("firstname")).sendKeys("Sujal");
		driver.findElement(By.id("lastname")).sendKeys("shakya");
		driver.findElement(By.id("address1")).sendKeys("Basantapur");
		driver.findElement(By.id("city")).sendKeys("Basantapur");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("3");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		Select Country = new Select(driver.findElement(By.id("id_country")));
		Country.selectByValue("21");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(2000);
		
		System.out.print("Registered successfully!");
		
		driver.findElement(By.id("header_logo")).click();
		
		 driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .replace-2x")).click();
		 //first Item
		 Thread.sleep(1000);
		 driver.findElement(By.name("Submit")).click();
		 //Add to cart
		 Thread.sleep(2000);
		 driver.findElement(By.className("cross")).click();
		 //Cross
		 driver.findElement(By.cssSelector(".home")).click();
		 //Home
		 driver.findElement(By.xpath("//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']")).click();
		 //Second Item
		 driver.findElement(By.cssSelector(".exclusive > span")).click();
		 //Add to cart
		 driver.findElement(By.cssSelector("[href *= 'http://automationpractice.com/index.php?controller=order']")).click();
		 //Proceed
		 driver.findElement(By.xpath("//p[@class=\"cart_navigation clearfix\"]/a/span")).click();
		 //Summary
		 Thread.sleep(4000);
		 driver.findElement(By.name("processAddress")).click();
		 //Address
		 driver.findElement(By.id("cgv")).click();
		 driver.findElement(By.name("processCarrier")).click();
		 //Shipping
		 driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		 //Payment
		 driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		 
		 System.out.print("Add to cart successfully");
		driver.close();
		driver.quit();
		    

	}

}
