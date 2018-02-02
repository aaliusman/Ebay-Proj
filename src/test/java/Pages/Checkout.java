package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Checkout extends Lib {

	public static void Cop(WebDriver driver) throws InterruptedException {

		System.out.println("Page Title:" + driver.getTitle());
		Thread.sleep(2000);
		System.out.println("Item Title:" + driver.findElement(By.xpath(".//*[@id='itemTitle']")).getText());
		clickele(driver,".//*[@id='isCartBtn_btn']").click();
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		clickele(driver,".//*[@id='ADDON_0']/div/div[2]/div/div[4]/div/button[1]").click();
		
		
	}

}
