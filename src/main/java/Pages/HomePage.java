package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class HomePage {

	static WebDriver driver = Base.getDriver();

	public static WebElement getFashionEle() {
		return driver.findElement(By.xpath("//div[text()='Fashion']"));
	}

	public static WebElement getKidsEle() {
		return driver.findElement(By.xpath("//a[text()='Kids']"));
	}

	public static WebElement getBoysAndGirlsJeanEle() {
		return driver.findElement(By.xpath("//a[text()='Boys & Girls Jeans']"));
	}
}
