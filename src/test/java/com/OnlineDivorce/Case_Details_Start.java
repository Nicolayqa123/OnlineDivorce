package com.OnlineDivorce;

import com.OnlineDivorce.Page.Case_Details;
import com.OnlineDivorce.Page.Landing;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class Case_Details_Start extends WebDriverSettings {
    @Test
    public void new_client() throws InterruptedException {
        driver.get(URLDivorce);
        Landing.start_Now(driver).click();
            Random r = new Random();
            int x = r.nextInt(90000) + 1;
            Select state = new Select(driver.findElement(By.name("state")));
            state.selectByValue("OR");
            Case_Details.email(driver).sendKeys("test" + x + "@test.ru");
            Case_Details.first_name(driver).sendKeys("Test First");
            Case_Details.last_name(driver).sendKeys("Test Last");
            Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(5);

        Select you_are = new Select(driver.findElement(By.name("you_are")));
        you_are.selectByValue("husband");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(5);
        Select month = new Select(driver.findElement(By.name("month")));
        month.selectByValue("5");
        Case_Details.day(driver).sendKeys("15");
        Case_Details.year(driver).sendKeys("1995");
        Case_Details.city_married(driver).sendKeys("Kiev");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select children_count = new Select(driver.findElement(By.name("children_count")));
        children_count.selectByValue("3");
        Select wife_pregnant = new Select(driver.findElement(By.name("wife_pregnant")));
        wife_pregnant.selectByValue("no");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select assets_any = new Select(driver.findElement(By.name("assets_any")));
        assets_any.selectByValue("no");
        Select debts_any = new Select(driver.findElement(By.name("debts_any")));
        debts_any.selectByValue("no");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select who_will_file = new Select(driver.findElement(By.name("who_will_file")));
        who_will_file.selectByValue("wife");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select live_together_now = new Select(driver.findElement(By.name("live_together_now")));
        live_together_now.selectByValue("apart");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select community_property_divide_equally = new Select(driver.findElement(By.name("community_property_divide_equally")));
        community_property_divide_equally.selectByValue("yes");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select divide_debts = new Select(driver.findElement(By.name("divide_debts")));
        divide_debts.selectByValue("no");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select my_additional_income_sources = new Select(driver.findElement(By.name("my_additional_income_sources")));
        my_additional_income_sources.selectByValue("no");
        Select spouse_additional_income_sources = new Select(driver.findElement(By.name("spouse_additional_income_sources")));
        spouse_additional_income_sources.selectByValue("no");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select i_owe_spouse_money = new Select(driver.findElement(By.name("i_owe_spouse_money")));
        i_owe_spouse_money.selectByValue("no");
        Select spouse_owes_me_money = new Select(driver.findElement(By.name("spouse_owes_me_money")));
        spouse_owes_me_money.selectByValue("no");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Select either_party_military_member = new Select(driver.findElement(By.name("either_party_military_member")));
        either_party_military_member.selectByValue("no");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Case_Details.password(driver).sendKeys("123456");
        Case_Details.continue_(driver).click();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("Payment Details", driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/h3")).getText());



    }


}
