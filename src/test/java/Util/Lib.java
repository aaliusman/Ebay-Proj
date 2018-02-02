package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
	
	public static WebElement clickele(WebDriver driver, String xpath) {
		WebElement a=driver.findElement(By.xpath(xpath));
		return a;
		
	}
	
	public static WebElement entertxt(WebDriver driver, String xpath) {
		WebElement b=driver.findElement(By.xpath(xpath));
		return b;
	}

}
