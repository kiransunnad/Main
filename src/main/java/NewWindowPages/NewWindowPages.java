package NewWindowPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;

public class NewWindowPages {

	static WebDriver driver = Base.getDriver();

	public static WebElement getNewWindowButtonEle() {
		return driver.findElement(By.xpath("//button[text()='New Window']"));
	}

	public static WebElement getSecondWinHeadingEle() {
		return driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	}

}
