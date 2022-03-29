package com.cydeo.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends PageBase {
    HomePage homePage = new HomePage();
    @FindBy(linkText = "Log Out")
    public WebElement logoutBtn;

    public void logout(){
        homePage.name.click();
        logoutBtn.click();
    }


}
