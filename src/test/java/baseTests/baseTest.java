package baseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class baseTest {

	private WebDriver driver;
	protected HomePage homePageObject;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		goToMadisonHome();
	}

	@BeforeMethod
	public void goToMadisonHome() {
		driver.get("http://magento-demo.lexiconn.com/");
		homePageObject = new HomePage(driver);
	}

	@AfterClass(enabled = false)
	public void closeDriver() {
		driver.quit();
	}
}
