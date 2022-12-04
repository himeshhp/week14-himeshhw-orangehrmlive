package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[text()[normalize-space()='Login']]");
    By displayedText = By.xpath("//h6[text()='Dashboard']");
    By forgotPasswordLink = By.xpath("//p[text()='Forgot your password? ']");
    By resetText = By.xpath("//h6[text()='Reset Password']");

    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getAfterLoginText() {
        return getTextFromElement(displayedText);
    }

    public void clickOnForgotPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }

    public String getResetText() {
        return getTextFromElement(resetText);
    }
}
