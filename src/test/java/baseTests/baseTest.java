package baseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;

public class baseTest {

	private WebDriver driver;
	protected HomePage homePageObject;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://magento-demo.lexiconn.com/");
		driver.manage().window().maximize();

		homePageObject = new HomePage(driver);
	}

	@AfterClass(enabled = true)
	public void closeDriver() {
		driver.quit();
	}
}
