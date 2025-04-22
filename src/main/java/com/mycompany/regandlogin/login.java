/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regandlogin;

/**
 *
 * @author lab_services_student
 */

//we have created a new class
public class login { // (Farrell, 2022)
    
    private String username; // (Farrell, 2022)
    private String password; // (Farrell, 2022)
    private String cellNumber;// (Farrell, 2022)
    private final String firstName;// (Farrell, 2022)
    private final String lastName;// (Farrell, 2022)

    public login(String username, String password, String cellNumber, String firstName, String lastName) { // (Farrell, 2025)
        this.username = username; // (Farrell, 2022)
        this.password = password; // (Farrell, 2022)
        this.cellNumber = cellNumber; // (Farrell, 2022)
        this.firstName = firstName; // (Farrell, 2022)
        this.lastName = lastName;// (Farrell, 2022)
    }

    // Getters and Setters methods
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCellNumber() { return cellNumber; }
    public void setCellNumber(String cellNumber) { this.cellNumber = cellNumber; }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    // the methods for checking if everything is valid
    public boolean checkUserName() {  // (Farrell, 2022)
        return username.contains("_") && username.length() <= 5; // (Farrell, 2022)
    }
    
    // This regex was generated with AI (OpenAI, 2025) to check if the password meets complexity rules
     public boolean checkPasswordComplexity() { //(OpenAI, 2025)
        return password.matches("^(?=.*[A-Z])(?=.*\\\\d)(?=.*[^A-Za-z0-9]).{8,}$"); //(OpenAI, 2025)
    }

    public boolean checkCellPhoneNumber() { //(OpenAI, 2025)
        return cellNumber.matches("^\\+27\\d{9}$"); //(OpenAI, 2025)
    }

    public String registerUser() { //(OpenAI, 2025)
        if (!checkUserName()) { //(OpenAI, 2025)
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity()) { //(OpenAI, 2025)
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()) { //(OpenAI, 2025)
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        return "User successfully registered.";
    }

    public boolean loginUser(String inputUsername, String inputPassword) { //(OpenAI, 2025)
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    public String returnLoginStatus(boolean loggedIn) { // (Farrell, 2022)
        return loggedIn // (Farrell, 2022
                ? "Welcome " + firstName + ", " + lastName + " it is great to see you again."
                : "Username or password incorrect, please try again.";
    }
}

