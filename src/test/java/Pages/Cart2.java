package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Cart2 extends Lib{

	public static void ct2(WebDriver driver) throws InterruptedException {
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver
				.findElement(By.xpath(".//*[@id='asynccartsummary']/div[1]/table/tbody/tr[1]/td[1]/div")).getText()
				+ driver.findElement(By.xpath(".//*[@id='asynccartsummary']/div[1]/table/tbody/tr[1]/td[2]/div"))
						.getText());
		Thread.sleep(3000);
		clickele(driver, ".//*[@id='ptcBtnBottom']").click();
		
		System.out.println("Title of CNT as Guest:"+driver.getTitle());
		clickele(driver,".//*[@id='gtChk']").click();
		
		
	}

}
