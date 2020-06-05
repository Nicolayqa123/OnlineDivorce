package com.OnlineDivorce.Testsuite2;

import com.OnlineDivorce.WebDriverSettings;
import org.junit.Test;

public class Second_Test extends WebDriverSettings {

    @Test
    public void test () throws InterruptedException {
        driver.get("https://onlinedivorcer.com/");
        driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/a").click();

       // assertEquals("Do you qualify?", driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[3]/div/div/p[1]")).getText());

    }

}
