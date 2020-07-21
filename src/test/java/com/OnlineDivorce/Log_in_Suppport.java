package com.OnlineDivorce;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Log_in_Suppport extends WebDriverSettings {

    @Test
    public void log_in_Sup () {
        driver.get(URLDivorceSupportStage);
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[1]/div/div/input").sendKeys("qa@support.com");
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[2]/div/div/input").sendKeys("4E4QjmwjfD");
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[3]/div/button").click();
        assertEquals("Welcome QA!", driver.findElement(By.cssSelector("#header-navbar > ul.nav-header.pull-right > li:nth-child(2) > p")).getText());


    }


}
