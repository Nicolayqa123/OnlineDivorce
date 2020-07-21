package com.OnlineDivorce.Support;

import com.OnlineDivorce.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Page_Order_Support extends WebDriverSettings {
    @Test
    public void Check_order () {
        driver.get("https://divorceradmin.urgentpapers.org/");
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[1]/div/div/input").sendKeys("qa@support.com");
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[2]/div/div/input").sendKeys("4E4QjmwjfD");
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[3]/div/button").click();

        driver.findElementByXPath("//*[@id=\"my-left-menu\"]/ul/li[2]/a").click();
        driver.findElementByXPath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/form/div[1]/div[1]/div/input").sendKeys("10994");
        driver.findElementByXPath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/form/div[3]/button").click();

        assertEquals("10994", driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[1]")).getText());


    }
}
