package Pages;

import org.openqa.selenium.WebDriver;

import Util.Lib;

public class SelectItem extends Lib{
	
	public static void selectit(WebDriver driver)
	{
		clickele(driver, "//ul[@id='ListViewInner']/li[4]/h3/a").click();
	}

}
