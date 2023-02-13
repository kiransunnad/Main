package UtilPackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class Util {

	static WebDriver driver = Base.getDriver();

	public static void perfromEscButton() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}

	public static void hoverAnElement(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}

	public static void clickOnEle(WebElement ele) {
		waitForElement(ele);
		ele.click();
	}

	public static String getEleText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public static void switchToSecondWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (!next.equals(parentWindow)) {
				driver.switchTo().window(next);
			}
		}
	}

	public static void waitForElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static void waitForEle() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void switchFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void waitForAlertToBePresent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void sendKeysInAlert() {
		driver.switchTo().alert().sendKeys("Kiran");
		driver.switchTo().alert().accept();
	}

	public static void dragAndDrop(WebElement eleSource, WebElement eleDest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(eleSource, eleDest).build().perform();
	}

}
