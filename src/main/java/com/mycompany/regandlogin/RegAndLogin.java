/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.regandlogin;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 * References:
 * IIE. INTRODUCTION tO PROGRAMMING LOGIC MODULE MANUAL 2024. FIRST EDITION: 2024 ed., Accessed 22 Apr. 2025
 * Farrell, Joyce. Java Programming. 2025. Tenth Edition ed., Cengage Learning.
 * "CHATGPT." Chatgpt.com, 2025, chatgpt.com/c/6806296a-6590-8001-80c9-c2e66c27bd00. Accessed 22 Apr. 2025.
 */
public class RegAndLogin {  // (Farrell, 2022)

   
       

    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter your first name:"); // (Farrell, 2022)
        String lastName = JOptionPane.showInputDialog("Enter your last name:"); // (Farrell, 2022)
        String username = JOptionPane.showInputDialog("Create a username (must contain _ and max 5 chars):"); // (Farrell, 2022)
        String password = JOptionPane.showInputDialog("Create a password (8+ chars, 1 capital, 1 number, 1 special char):");// (Farrell, 2022)
        String cellNumber = JOptionPane.showInputDialog("Enter your cell number (e.g., +27831234567):"); // (Farrell, 2022)

        login user = new login(username, password, cellNumber, firstName, lastName); // (Farrell, 2022)

        // Registration Output
        String regMessage = user.registerUser(); //(OpenAI, 2025)
        JOptionPane.showMessageDialog(null, regMessage); //(OpenAI, 2025)

        if (regMessage.equals("User successfully registered.")) { //(OpenAI, 2025)
            // Proceed to login
            String loginUsername = JOptionPane.showInputDialog("Login - Enter username:");  // (Farrell, 2022)
            String loginPassword = JOptionPane.showInputDialog("Login - Enter password:");  // (Farrell, 2022)
            boolean loginSuccess = user.loginUser(loginUsername, loginPassword);  // (Farrell, 2022)

            // Show login status
            JOptionPane.showMessageDialog(null, user.returnLoginStatus(loginSuccess));  // (Farrell, 2022)
        }
    }
}
;
    

