package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class ItemPage {

	static WebDriver driver = Base.getDriver();

	public static WebElement getItemSizeEle() {
		return driver.findElement(By.xpath("//a[text()='5 - 6 Years']"));
	}

	public static WebElement getItemNameEle() {
		return driver.findElement(By.xpath("//span[@class='G6XhRU']/following-sibling::span"));
	}

	public static WebElement getItemPriceEle() {
		return driver.findElement(By.xpath("(//div[@class='_25b18c']/div)[1]"));
	}

	public static WebElement getAddToCartButtonEle() {
		return driver.findElement(By.xpath("//button[text()='Add to cart']"));
	}

}
