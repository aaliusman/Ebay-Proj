package Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Cart;
import Pages.Cart2;
import Pages.Checkout;
import Pages.GuessCo;
import Pages.Home;
import Pages.SelectItem;

public class Test {
	
	static WebDriver driver;
	@Before
	public void before() throws InterruptedException {
		System.out.println("this is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Ebay\\chromedriver.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
	}

	@After
	public void after() throws InterruptedException {
		driver.manage().deleteAllCookies();
		Thread.sleep(8000);
	driver.close();

}	@org.junit.Test
	public void test() throws InterruptedException {
		Home hp=new Home();
		hp.hmpage(driver);
		
		Thread.sleep(3000);
		SelectItem si=new SelectItem();
				si.selectit(driver);
				
		Thread.sleep(2000);
		Checkout co=new Checkout();
		co.Cop(driver);
		System.out.println("********");
		
		Cart car=new Cart();
		car.Ct(driver);
		
		System.out.println("*********");
		
		Cart2 car2=new Cart2();
		car2.ct2(driver);
		
		System.out.println("*********");
		GuessCo gco=new GuessCo();
		gco.GCO(driver);
	}

}
