package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import baseTests.baseTest;
import pages.AccountDashboardPage;
import pages.RegistrationPage;

public class RegistrationTests extends baseTest {

	String FirstName = "FN Tester";
	String LastName = "LN Tester";
	String Email = "Tester3@Itqan.com";
	String Password = "123456";
	
	
	@Test
	public void userCanRegisterToMadison() {

		homePageObject.clickAccountBtn();
		RegistrationPage registrationPageObject = homePageObject.clickRegisterLink();

		registrationPageObject.setFirstName(FirstName);
		registrationPageObject.setLastName(LastName);
		registrationPageObject.setEmail(Email);
		registrationPageObject.setPassword(Password);
		registrationPageObject.setConfirmPassword(Password);
		registrationPageObject.checkNewsLetter();

		AccountDashboardPage dashboardObject = registrationPageObject.clickRegister();

		assertTrue(dashboardObject.getSuccessMessage().contains("Thank you for registering with Madison Island."),
				"User wasn't registered successfully!");
	}

}
