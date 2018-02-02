package Pages;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class Home extends Lib {
	public static void hmpage(WebDriver driver) {
		
		entertxt(driver,".//*[@id='gh-ac']").sendKeys("apple watch series");
		//clickele(driver, "//div[@id='gAC']/ul/li[6]/a").click();
		clickele(driver,".//*[@id='gh-btn']").click();
		
	}

}
