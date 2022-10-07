package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import baseTests.baseTest;
import pages.AccountDashboardPage;
import pages.RegistrationPage;

public class RegistrationTests extends baseTest {

	@Test
	public void userCanRegister() {

		homePageObject.clickAccountBtn();
		RegistrationPage registrationPageObject = homePageObject.clickRegisterLink();

		registrationPageObject.setFirstName("Tester");
		registrationPageObject.setLastName("First");
		registrationPageObject.setEmail("test3211@email.com");
		registrationPageObject.setPassword("123456");
		registrationPageObject.setConfirmPassword("123456");
		registrationPageObject.checkNewsLetter();

		AccountDashboardPage dashboardObject = registrationPageObject.clickRegister();

		assertTrue(dashboardObject.getSuccessMessage().contains("Thank you for registering with Madison Island."),
				"User wasn't registered successfully!");
	}

}
