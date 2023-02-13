package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class AddToCartPage {

	static WebDriver driver = Base.getDriver();

	public static WebElement getItemNameEle() {
		return driver.findElement(By.xpath("//div[@class='_2-uG6-']//a"));
	}

	public static WebElement getItemPriceEle() {
		return driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
	}

}
