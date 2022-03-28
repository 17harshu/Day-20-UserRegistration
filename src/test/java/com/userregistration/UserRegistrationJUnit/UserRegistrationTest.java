package com.userregistration.UserRegistrationJUnit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	//Test Case for FirstName return true
		@Test
		public void checkingFirstname() {
	        UserRegistration userRegistration = new UserRegistration();
		boolean isFirstName = userRegistration.validateFirstName("Rekha");
		Assert.assertTrue(isFirstName);
		}
		
		//Test Case for FirstName return False
		@Test
		public void checkingFirstNameInvalidReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
		boolean isFirstName = userRegistration.validateFirstName("riya");
		Assert.assertFalse(isFirstName);
		}

		// Test Case for LastName return True
		@Test
		public void checkingLastName() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isLastName = userRegistration.validateLastName("Jambhulkar");
			Assert.assertTrue(isLastName);
		}

		// Test Case for LastName return False
		@Test
		public void checkingLastNameInvalidMustReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isLastName = userRegistration.validateLastName("jambhulkar");
			Assert.assertFalse(isLastName);
		}

		// Test Case for EmailId return True
		@Test
		public void checkingEmailId() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isEmailId = userRegistration.validateEmail("jambhulkarrekha@gmail.com");
			Assert.assertTrue(isEmailId);
		}

		// Test Case for EmailId return False
		@Test
		public void checkingEmailIdInvalidMustReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isEmailId = userRegistration.validateEmail(".jambhulkarrekha@111");
			Assert.assertFalse(isEmailId);
		}

		// Test Case for MobileNo return True
		@Test
		public void checkingMobileNo() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isMobileNo = userRegistration.validatePhoneNumber("91 9138124143");
			Assert.assertTrue(isMobileNo);
		}
		
		// Test Case for MobileNo return False
		@Test
		public void checkingMobileNoInvalidMustReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isMobileNo = userRegistration.validatePhoneNumber("656965241");
			Assert.assertFalse(isMobileNo);
		}

		// Test Case for Password return True
		@Test
		public void checkingPassWord() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isPassWord = userRegistration.validatePassword("Rekha@123");
			Assert.assertTrue(isPassWord);
		}

		// Test Case for Password return False
		@Test
		public void checkingPassWordInvalidMustReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
			boolean isPassWord = userRegistration.validatePassword("rek1f");
			Assert.assertFalse(isPassWord);
		}
}
