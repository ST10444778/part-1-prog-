/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.regandlogin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class loginTest {

    @Test
    public void testCorrectUsernameFormat() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        boolean result = user.checkUserName();
        assertTrue(result);
    }

    @Test
    public void testIncorrectUsernameFormat() {
        login user = new login("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        boolean result = user.checkUserName();
        assertFalse(result);
    }

    @Test
    public void testCorrectPasswordComplexity() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        boolean result = user.checkPasswordComplexity();
        assertTrue(result);
    }

    @Test
    public void testIncorrectPasswordComplexity() {
        login user = new login("kyl_1", "password", "+27838968976", "John", "Doe");
        boolean result = user.checkPasswordComplexity();
        assertFalse(result);
    }

    @Test
    public void testCorrectCellNumber() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        boolean result = user.checkCellPhoneNumber();
        assertTrue(result);
    }

    @Test
    public void testIncorrectCellNumber() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "08966553", "John", "Doe");
        boolean result = user.checkCellPhoneNumber();
        assertFalse(result);
    }

    @Test
    public void testLoginSuccess() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        boolean result = user.loginUser("kyl_1", "Ch&&sec@ke99!");
        assertTrue(result);
    }

    @Test
    public void testLoginFail() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        boolean result = user.loginUser("wrong", "wrongpass");
        assertFalse(result);
    }

    @Test
    public void testRegisterSuccessMessage() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        String result = user.registerUser();
        assertEquals("User successfully registered.", result);
    }

    @Test
    public void testUsernameErrorMessage() {
        login user = new login("kyle!!!!!!!", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        String result = user.registerUser();
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", result);
    }

    @Test
    public void testPasswordErrorMessage() {
        login user = new login("kyl_1", "password", "+27838968976", "John", "Doe");
        String result = user.registerUser();
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", result);
    }

    @Test
    public void testCellNumberErrorMessage() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "08966553", "John", "Doe");
        String result = user.registerUser();
        assertEquals("Cell phone number incorrectly formatted or does not contain international code.", result);
    }

    @Test
    public void testReturnLoginStatusSuccess() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        String result = user.returnLoginStatus(true);
        assertEquals("Welcome John, Doe it is great to see you again.", result);
    }

    @Test
    public void testReturnLoginStatusFail() {
        login user = new login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        String result = user.returnLoginStatus(false);
        assertEquals("Username or password incorrect, please try again.", result);
    }
}

  


    
   

