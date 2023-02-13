package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class KidsJeansPage {

	static WebDriver driver = Base.getDriver();

	public static WebElement getLowToHighEle() {
		return driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
	}

	public static WebElement getFirstItemEle() {
		return driver.findElement(By.xpath("(//a[@class='_2UzuFa'])[1]//img"));
	}

}
