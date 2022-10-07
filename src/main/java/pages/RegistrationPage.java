package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	private WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	private By firstNameField = By.id("firstname");
	private By lastNameField = By.id("lastname");
	private By emailField = By.id("email_address");
	private By passwordField = By.id("password");
	private By confirmPasswordField = By.id("confirmation");
	private By newsLettersubscriptionCheckbox = By.id("is_subscribed");
	private By registerBtn = By.xpath("//div[@class=\"buttons-set\"]//button");

	public void setFirstName(String FirstName) {
		driver.findElement(firstNameField).sendKeys(FirstName);
	}

	public void setLastName(String LastName) {
		driver.findElement(lastNameField).sendKeys(LastName);
	}

	public void setEmail(String Email) {
		driver.findElement(emailField).sendKeys(Email);
	}

	public void setPassword(String Password) {
		driver.findElement(passwordField).sendKeys(Password);
	}

	public void setConfirmPassword(String PasswordConfirmation) {
		driver.findElement(confirmPasswordField).sendKeys(PasswordConfirmation);
	}

	public void checkNewsLetter() {
		driver.findElement(newsLettersubscriptionCheckbox).click();
	}

	public AccountDashboardPage clickRegister() {
		driver.findElement(registerBtn).click();
		return new AccountDashboardPage(driver);
	}

}
