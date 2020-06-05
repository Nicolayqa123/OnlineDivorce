package com.OnlineDivorce;

import com.OnlineDivorce.Page.Case_Details;
import com.OnlineDivorce.Page.Landing;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class Order_Check extends WebDriverSettings {

    @Test
    public void new_client() throws InterruptedException {
        driver.get(URLDivorce);
        Landing.start_Now(driver).click();
        Random r = new Random();
        int x = r.nextInt(90000) + 1;
        int p = r.nextInt( 999) + 1;
        Select state = new Select(driver.findElement(By.name("state")));
        state.selectByValue("OR");
        Case_Details.email(driver).sendKeys("testOR" + x + "@test.ru");
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
        who_will_file.selectByValue("you");
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

        driver.findElementByName("ccnum").click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByCssSelector("div.col-sm-4:nth-child(1) > div:nth-child(1) > label:nth-child(1) > input:nth-child(2)").sendKeys("4000027891380961");
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByName("ccnum").sendKeys("4000027891380961");
        driver.findElementByName("id_name").sendKeys("FL-BRW1");
        driver.findElementByName("cvv").sendKeys("666");
        Select Month = new Select(driver.findElement(By.name("ccexpm")));
        Month.selectByValue("09");
        Select Year = new Select(driver.findElement(By.name("ccexpy")));
        Year.selectByValue("2025");
        driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/form/div[2]/div/div/button").click();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("We have received your payment.", driver.findElement(By.cssSelector(".thank-under-heading")).getText());
        driver.findElementByCssSelector(".text-right").click();

        driver.findElementByCssSelector("input.form-control:nth-child(2)").sendKeys("342-34-3243");
        driver.findElementByCssSelector("div.col-lg-12:nth-child(2) > div:nth-child(1) > input:nth-child(3)").sendKeys("21");
        driver.findElementByCssSelector("div.col-lg-12:nth-child(3) > div:nth-child(1) > textarea:nth-child(3)").sendKeys("Test name Dima");

        driver.findElementByName("street15528").sendKeys("Alta");
        driver.findElementByName("city15528").sendKeys("Sunriver");
        Select State = new Select(driver.findElement(By.name("state15528")));
        State.selectByValue("OR");
        driver.findElementByName("zip15528").sendKeys("73033");

        driver.findElementByCssSelector("div.col-lg-12:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)").sendKeys("04/18/2020");
        driver.findElementByCssSelector("div.col-lg-12:nth-child(6) > div:nth-child(1) > input:nth-child(3)").sendKeys("123456789");
        driver.findElementByCssSelector("select.form-control:nth-child(4)").click();
        driver.findElementByCssSelector("select.form-control:nth-child(4) > option:nth-child(2)").click();
        driver.findElementByCssSelector("div.col-lg-12:nth-child(7) > div:nth-child(1) > input:nth-child(3)").sendKeys("26");
        driver.findElementByCssSelector("div.form-check:nth-child(3) > label:nth-child(1) > input:nth-child(1)").click();
        driver.findElementByName("q15533undefined").click();
        Select Are_you = new Select(driver.findElement(By.name("qn.15534")));
        Are_you.selectByValue("9165");
        driver.findElementByCssSelector("div.col-lg-12:nth-child(11) > div:nth-child(1) > textarea:nth-child(3)").sendKeys("Your county - Ukraine");
        driver.findElementByCssSelector("div.col-lg-12:nth-child(12) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)").sendKeys("04/18/2020");
        driver.findElementByCssSelector("div.col-lg-12:nth-child(13) > div:nth-child(1) > input:nth-child(3)").sendKeys("140");
        driver.findElementByCssSelector(".react-phone-number-input__input").sendKeys("201" + p + "0" + p);
        Select ChildrenTest = new Select(driver.findElement(By.name("qn.15539")));
        ChildrenTest.selectByValue("9168");
        driver.findElementByCssSelector("div.col-lg-12:nth-child(16) > div:nth-child(1) > div:nth-child(1) > select:nth-child(3)").click();
        driver.findElementByCssSelector("div.col-lg-12:nth-child(16) > div:nth-child(1) > div:nth-child(1) > select:nth-child(3) > option:nth-child(3)").click();
        driver.findElementByName("q15541undefined").click();
        driver.findElementByCssSelector("div.col-lg-12:nth-child(18) > div:nth-child(1) > textarea:nth-child(3)").sendKeys("test test test");






    }
}

