package com.OnlineDivorce.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landing {
    public static WebElement element = null;

    public static WebElement start_Now (WebDriver driver){
        element = driver.findElement(By.cssSelector("body > div.container.top-full-width > div > div.right-wrapper > div > div.col-lg-12.top-main-block > a"));
        return element;
    }
    public static WebElement login (WebDriver driver){
        element = driver.findElement(By.cssSelector("body > div.container.top-full-width > div > div.right-wrapper > div > div.col-lg-12.top-main-block > div.profile-block > div > button"));
        return element;
    }
    public static WebElement E_mail (WebDriver driver){
        element = driver.findElement(By.cssSelector(".login-email"));
        return element;
    }
    public static WebElement Password (WebDriver driver){
        element = driver.findElement(By.cssSelector("input.form-control:nth-child(2)"));
        return element;
    }
    public static WebElement sign_in (WebDriver driver){
        element = driver.findElement(By.cssSelector(".modal-sign-in-button"));
        return element;
    }
    public static WebElement sing_up (WebDriver driver){
        element = driver.findElement(By.cssSelector(".sing-up-text > a:nth-child(1)"));
        return element;
    }
    public static WebElement reset_password (WebDriver driver){
        element = driver.findElement(By.cssSelector(".show-reset-password"));
        return element;
    }
}
