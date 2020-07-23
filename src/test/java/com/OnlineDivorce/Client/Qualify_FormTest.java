package com.OnlineDivorce.Client;

import com.OnlineDivorce.Page.Case_Details;
import com.OnlineDivorce.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class Qualify_FormTest extends WebDriverSettings {
    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase (key = "ON-T83")
    public void qualify_success() throws InterruptedException {
        Random r = new Random();
        int x = r.nextInt(90000) + 1;

    driver.get(URLDivorce);
        Select state = new Select(driver.findElement(By.name("state")));
        state.selectByValue("OR");
        Case_Details.email(driver).sendKeys("test" + x + "@test.ru");
        Case_Details.first_name(driver).sendKeys("Test First");
        Case_Details.last_name(driver).sendKeys("Test Last");
        Case_Details.free_eligibikity_check(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Yes! You can save on your divorce. Please click on Continue button or you will be redirected automatically", driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/p")).getText());

    }
    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase (key = "ON-T84")
    public void qualify_notValid() throws InterruptedException {
        Random r = new Random();
        int x = r.nextInt(90000) + 1;

        driver.get(URLDivorce);

        Case_Details.email(driver).sendKeys("test" + x + "@@test.ru");
        Case_Details.first_name(driver).sendKeys("     ");
        Case_Details.last_name(driver).sendKeys("     ");
        Case_Details.free_eligibikity_check(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("The state name is required.", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[3]/span")).getText());
        assertEquals("The first name is required.", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[4]/div[1]/span")).getText());
        assertEquals("The last name is required.", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[4]/div[2]/span")).getText());
        assertEquals("The email format is invalid.", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[4]/div[3]/span")).getText());



    }
    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase (key = "ON-T85")
    public void qualify_empty() {
        Random r = new Random();
        int x = r.nextInt(90000) + 1;
        driver.get(URLDivorce);
        Case_Details.free_eligibikity_check(driver).click();
        assertEquals("The state name is required.", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[3]/span")).getText());
        assertEquals("The first name is required.", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[4]/div[1]/span")).getText());
        assertEquals("The last name is required.", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[4]/div[2]/span")).getText());
        assertEquals("The email is required", driver.findElement(By.xpath("//*[@id=\"free-eligibikity-check-form\"]/div[4]/div[3]/span")).getText());
    }
    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase (key = "ON-T86")
    public void qualify_phone() throws InterruptedException {
        Random r = new Random();
        int x = r.nextInt(90000) + 1;

        driver.get(URLDivorce);
     //   TimeUnit.SECONDS.sleep(6);
        driver.findElementByCssSelector("#free-eligibikity-check-form > div:nth-child(3) > label:nth-child(2)").click();
        driver.findElementByCssSelector("#free-eligibikity-check-form > div:nth-child(5) > label:nth-child(2)").click();
        Select state = new Select(driver.findElement(By.name("state")));
        state.selectByValue("OR");
        Case_Details.email(driver).sendKeys("test" + x + "@test.ru");
        Case_Details.first_name(driver).sendKeys("Test First");
        Case_Details.last_name(driver).sendKeys("Test Last");
        Case_Details.free_eligibikity_check(driver).click();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("Seems that your case is more complicated and you need to reach an agreement with your spouse. Please leave your phone number and our Divorce Specialist will contact you to explore your options.",
                driver.findElement(By.cssSelector("#qualify-requirements > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(1)")).getText());
        driver.findElementById("user-phone").sendKeys("201" + x + "0123");
        driver.findElementById("qualify-submit").click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("Our support will contact you soon", driver.findElement(By.id("toast-container")).getText());

    }

}





