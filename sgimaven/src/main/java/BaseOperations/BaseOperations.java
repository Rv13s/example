package BaseOperations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseOperations {
	public static WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.silentOutput", "true");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.silentOutput", "true");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.silentOutput", "true");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}

			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;

	}
	
	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void loadUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	//close tab


	
	//mouse over
	public void mouseOver(WebElement e) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(e).perform();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

	
	public void mousescrolldown() {
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
