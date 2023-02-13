package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public Base() {
		System.setProperty("webdriver.chrome.driver",
				(System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static WebDriver getDriver() {
		return driver;
	}

}
