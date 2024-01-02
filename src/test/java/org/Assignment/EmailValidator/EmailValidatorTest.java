package org.Assignment.EmailValidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testIsValidEmail() {
        EmailValidator validator = new EmailValidator();

        assertTrue(validator.isValidEmail("sandeep.hbtu@gmail.com"));
        assertFalse(validator.isValidEmail("invalid_email"));
        assertFalse(validator.isValidEmail(null));
    }

    @Test
    public void testIsCorporateEmail() {
        EmailValidator validator = new EmailValidator();

        assertFalse(validator.isCorporateEmail("sandeep@comviva.com"));
        assertTrue(validator.isCorporateEmail("sandeep@company.com"));
        assertFalse(validator.isCorporateEmail("sandeep@anothercompany.con"));
        assertFalse(validator.isCorporateEmail(null));
    }
}