package com.OnlineDivorce.Client;

import com.OnlineDivorce.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class QuestionnareTest extends WebDriverSettings {

    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase(key = "ON-T29")
    public void SSN_yes_no () throws InterruptedException {
        log_in("test121@test.test", "123456");
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByCssSelector(".table-topic").click();
        driver.findElementByCssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-9 > div > div > div:nth-child(2) > div.row > div:nth-child(1) > div > div:nth-child(3) > input").sendKeys("123-13-1232");
        driver.findElementByCssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-9 > div > div > div:nth-child(2) > div.row > div:nth-child(1) > div > label:nth-child(6) > input[type=checkbox]").click();
        assertEquals("", driver.findElement(By.cssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-9 > div > div > div:nth-child(2) > div.row > div:nth-child(1) > div > div:nth-child(3) > input")).getText());
    }

    @com.adaptavist.tm4j.junit.annotation.TestCase(key = "ON-T26")
    public void right_menu () throws InterruptedException {
        log_in("nicolayqa+441@gmail.com", "123456");
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByCssSelector(".table-topic").click();
        driver.findElementByCssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-9 > div > div > div:nth-child(2) > div.row > div:nth-child(3) > div > textarea").clear();
        driver.findElementByCssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-9 > div > div > div:nth-child(2) > div.mt-3.clearfix > div > button.btn.btn-success.float-right").click();
        assertEquals("This answer is required, please provide us with the necessary information.", driver.findElement(By.cssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-9 > div > div > div:nth-child(2) > div.row > div:nth-child(3) > div > span")).getText());
        driver.findElementByCssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-3 > div.content > div > ul > li:nth-child(2)").click();
        assertEquals("* ChildrenTest\n" +
                "test", driver.findElement(By.cssSelector("#root > div > div:nth-child(1) > div.right-side > div.content-wrapper.with-breadcrumbs > div > div > div > div > div.row > div.col-md-9 > div > div > div:nth-child(2) > div:nth-child(1) > div > label")).getText());
        }


}
