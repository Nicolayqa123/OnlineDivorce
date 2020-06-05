package com.OnlineDivorce.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Case_Details {
    public static WebElement element = null;


    public static WebElement first_name (WebDriver driver) {
        element = driver.findElement(By.name("first_name"));
        return element;
    }
    public static WebElement last_name (WebDriver driver){
        element = driver.findElement(By.name("last_name"));
        return element;
    }
    public static WebElement email (WebDriver driver){
        element = driver.findElement(By.name("email"));
        return element;
    }
    public static WebElement free_eligibikity_check (WebDriver driver){
        element = driver.findElement(By.id("free-eligibikity-check"));
        return element;
    }
    public static WebElement continue_ (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.btn"));
        return element;
    }
    public static WebElement day (WebDriver driver){
        element = driver.findElement(By.name("day"));
        return element;
    }
    public static WebElement year (WebDriver driver){
        element = driver.findElement(By.name("year"));
        return element;
    }
    public static WebElement city_married (WebDriver driver){
        element = driver.findElement(By.name("city_married"));
        return element;
    }
    public static WebElement password (WebDriver driver){
        element = driver.findElement(By.name("password"));
        return element;
    }
}
