package DemoQAlertPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class DemoQAlertPage {

	static WebDriver driver = Base.getDriver();

	public static WebElement getFirstClickMeButton() {
		return driver.findElement(By.xpath("//button[@id='alertButton']"));
	}

	public static WebElement getSecondClickMeButton() {
		return driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	}

	public static WebElement getThirdClickMeButton() {
		return driver.findElement(By.xpath("//button[@id='confirmButton']"));
	}

	public static WebElement getFourthClickMeButton() {
		return driver.findElement(By.xpath("//button[@id='promtButton']"));
	}

}
