package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDashboardPage {

	private WebDriver driver;

	public AccountDashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	private By successRegisterMsg = By.xpath("//li//span");

	public String getSuccessMessage() {
		return driver.findElement(successRegisterMsg).getText();// Thank you for registering with Madison Island.
	}

}
