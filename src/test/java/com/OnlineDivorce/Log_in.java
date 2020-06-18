package com.OnlineDivorce;

import com.OnlineDivorce.Page.Landing;
import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Log_in extends WebDriverSettings  {

    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase(key = "ON-T1")
    public void log_in () {
        driver.get(URLDivorce);
        Landing.login(driver).click();
        Landing.E_mail(driver).sendKeys("nicolayqa+43@gmail.com");
        Landing.Password(driver).sendKeys("123456");
        Landing.sign_in(driver).click();
        TestCase.assertEquals("230", driver.findElement(By.cssSelector(".order-table-link")).getText());


    }
    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase(key = "ON-T2")
    public void log_in_Empty () throws InterruptedException {
        driver.get(URLDivorce);
        Landing.login(driver).click();
        Landing.sign_in(driver).click();
        SECONDS.sleep(1);
        TestCase.assertEquals("Please enter a correct username and password.", driver.findElement(By.cssSelector("div.text-danger:nth-child(3)")).getText());
    }

    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase(name = "Sign Up in Login")
    public void log_in_Sing_up () throws InterruptedException {
        driver.get(URLDivorce);
        Landing.login(driver).click();
        Landing.sing_up(driver).click();
        TimeUnit.SECONDS.sleep(1);
        TestCase.assertEquals("Do you qualify?", driver.findElement(By.cssSelector(".big-strong")).getText());
    }

    @Test
    public void log_in_ResetPass_Empty () {
        driver.get(URLDivorce);
        Landing.login(driver).click();
        Landing.reset_password(driver).click();
        driver.findElementByXPath("//*[@id=\"reset-form\"]/form/div[3]/div/button").click();
        TestCase.assertEquals("Please enter email", driver.findElement(By.cssSelector("div.text-center:nth-child(2)")).getText());
    }
    @Test
    public void log_in_ResetPass () throws InterruptedException {
        driver.get(URLDivorce);
        Landing.login(driver).click();
        Landing.reset_password(driver).click();
        driver.findElementById("email-reset").sendKeys("nicolayqa@gmail.com");
        driver.findElementByCssSelector(".button-submit").click();
        SECONDS.sleep(1);

        TestCase.assertEquals("We’ve sent you an email containing a link that will allow you to reset your password for the next 24 hours.", driver.findElement(By.cssSelector("#success-reset > div:nth-child(2) > p:nth-child(1)")).getText());
    }
    @Test
    public void pay () throws InterruptedException {
        driver.get(URLDivorce);
        Landing.login(driver).click();
        Landing.E_mail(driver).sendKeys("testor11568@test.ru");
        Landing.Password(driver).sendKeys("123456");
        Landing.sign_in(driver).click();
        TimeUnit.SECONDS.sleep(5);

        /*driver.findElementByCssSelector("div.col-sm-4:nth-child(1) > div:nth-child(1) > label:nth-child(1) > input:nth-child(2)").click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByCssSelector("div.col-sm-4:nth-child(1) > div:nth-child(1) > label:nth-child(1) > input:nth-child(2)").sendKeys("4000027891380961");
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByName("ccnum").click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByName("ccnum").click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByName("ccnum").click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByName("ccnum").sendKeys("4000027891380961");*/

        TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[1]/div[1]/label/input").clear();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[1]/div[1]/label/input").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[1]/div[1]/label/input").sendKeys("321321321321321321");


        TestCase.assertEquals("aaaaaaa", driver.findElement(By.name("ccnum")).getText());





    }

}
