package com.bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateName("Govind");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isNotValid = userValidation.validateName("govind");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givneFirstName_WhenLesserThanThreeCharcaters_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean isNotValid = userValidation.validateName("go");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateName("Kumar");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isNotValid = userValidation.validateName("kumar");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givneLastName_WhenLesserThanThreeCharcaters_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean isNotValid = userValidation.validateName("ku");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateEmail("govindsingh6498@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateEmail("govindsingh6498gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("91 9798364309");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("919798364309");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenMobileNumber_WhenGreaterThanTenDigit_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("91 97983643091");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenMobileNumber_WhenLessThanTenDigit_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("91 979836430");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validatePassword("Govind@12345");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCharacter_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validatePassword("gond8063sljg45");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WhenNoNumberCharacter_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validatePassword("gonkfjgsljg");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_WhenOneMoreThanOneSpecailCharacter_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validatePassword("Gond8@#063sljg45");
		Assert.assertFalse(isValid);
	}
	
}
