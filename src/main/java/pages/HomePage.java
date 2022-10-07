package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private By accountBtn = By.xpath("//div[@class=\"skip-links\"]//a[contains(.,\"Account\")]");
	private By registerLink = By.linkText("Register");

	public void clickAccountBtn() {
		driver.findElement(accountBtn).click();
	}

	public RegistrationPage clickRegisterLink() {
		driver.findElement(registerLink).click();
		return new RegistrationPage(driver);
	}

}