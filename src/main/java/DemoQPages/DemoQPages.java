package DemoQPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class DemoQPages {

	static WebDriver driver = Base.getDriver();

	public static WebElement getFrmae1Ele() {
		return driver.findElement(By.xpath("//iframe[@id='frame1']"));
	}

	public static WebElement getFrame2Ele() {
		return driver.findElement(By.xpath("//iframe[@srcdoc]"));
	}

	public static WebElement getchildFrmaeContentEle() {
		return driver.findElement(By.xpath("//body/p"));
	}

}
