package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Cart extends Lib {
	
	public static void Ct(WebDriver driver) throws InterruptedException {
		
		System.out.println("Page Title:"+driver.getTitle());
		clickele(driver,".//*[@id='gh-cart-i']").click();
		Thread.sleep(3000);
	}

}
