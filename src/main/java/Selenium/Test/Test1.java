package Selenium.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;
import DemoQAlertPage.DemoQAlertPage;
import DemoQPages.DemoQPages;
import DragAndDropPages.DragAndDropPage;
import NewWindowPages.NewWindowPages;
import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.KidsJeansPage;
import UtilPackage.Util;

public class Test1 extends Base {

	@Test(enabled = false)
	public void test1() {
		WebDriver driver = getDriver();
		driver.get("https://www.flipkart.com/");
		Util.perfromEscButton();
		Util.hoverAnElement(HomePage.getFashionEle());
		Util.hoverAnElement(HomePage.getKidsEle());
		Util.hoverAnElement(HomePage.getBoysAndGirlsJeanEle());
		Util.clickOnEle(HomePage.getBoysAndGirlsJeanEle());
		Util.clickOnEle(KidsJeansPage.getLowToHighEle());
		Util.waitForEle();
		Util.hoverAnElement(KidsJeansPage.getFirstItemEle());
		Util.clickOnEle(KidsJeansPage.getFirstItemEle());
		Util.switchToSecondWindow();
		Util.clickOnEle(ItemPage.getItemSizeEle());
		String expectedItemName = Util.getEleText(ItemPage.getItemNameEle());
		String expectedItemPrice = Util.getEleText(ItemPage.getItemPriceEle());
		Util.clickOnEle(ItemPage.getAddToCartButtonEle());
		String actualItemNameOnCartPage = Util.getEleText(AddToCartPage.getItemNameEle());
		String actualItemPriceOnCartPage = Util.getEleText(AddToCartPage.getItemPriceEle());
		Assert.assertEquals(actualItemNameOnCartPage.contains(expectedItemName), true, "Does not match wiht the name");
		Assert.assertEquals(actualItemPriceOnCartPage.contains(expectedItemPrice), true,
				"Does not match with the price");
		driver.quit();

	}

	@Test(enabled = false)
	public void test2() {
		WebDriver driver = getDriver();
		driver.get("https://demoqa.com/nestedframes");
		Util.switchFrame(DemoQPages.getFrmae1Ele());
		Util.switchFrame(DemoQPages.getFrame2Ele());
		String childFrmaeContent = Util.getEleText(DemoQPages.getchildFrmaeContentEle());
		System.out.println("content of child iframe is:- " + childFrmaeContent);
		driver.quit();
	}

	@Test(enabled = false)
	public void test3() {
		WebDriver driver = getDriver();
		driver.get("https://demoqa.com/alerts");
		Util.clickOnEle(DemoQAlertPage.getFirstClickMeButton());
		Util.acceptAlert();
		Util.clickOnEle(DemoQAlertPage.getSecondClickMeButton());
		Util.waitForAlertToBePresent();
		Util.acceptAlert();
		Util.clickOnEle(DemoQAlertPage.getThirdClickMeButton());
		Util.acceptAlert();
		Util.clickOnEle(DemoQAlertPage.getFourthClickMeButton());
		Util.waitForEle();
		Util.sendKeysInAlert();
		driver.quit();
	}

	@Test(enabled = false)
	public void test4() {
		WebDriver driver = getDriver();
		driver.get("https://demoqa.com/droppable");
		Util.clickOnEle(DragAndDropPage.getAcceptEle());
		Util.dragAndDrop(DragAndDropPage.getNotAcceptableEle(), DragAndDropPage.getDropHereEle());
		driver.quit();
	}

	@Test(enabled = true)
	public void test5() {
		WebDriver driver = getDriver();
		driver.get("https://demoqa.com/browser-windows");
		Util.clickOnEle(NewWindowPages.getNewWindowButtonEle());
		Util.switchToSecondWindow();
		String actualText = Util.getEleText(NewWindowPages.getSecondWinHeadingEle());
		Assert.assertEquals(actualText.equals("This is a sample page"), true, "expected text is present");
		driver.quit();
	}

}
