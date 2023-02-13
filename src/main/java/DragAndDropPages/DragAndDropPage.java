package DragAndDropPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class DragAndDropPage {

	static WebDriver driver = Base.getDriver();

	public static WebElement getAcceptEle() {
		return driver.findElement(By.xpath("//a[text()='Accept']"));
	}

	public static WebElement getNotAcceptableEle() {
		return driver.findElement(By.xpath("//div[text()='Not  Acceptable']"));
	}

	public static WebElement getDropHereEle() {
		return driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
	}

}
