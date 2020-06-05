package com.OnlineDivorce;
import com.OnlineDivorce.Page.Case_Details;
import com.OnlineDivorce.Page.Landing;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class WebDriverSettings {

   // String URLDivorce = "https://divorcer.urgentpapers.org/";
     String URLDivorce = "https://divorcer-stage2client.urgentpapers.org/";

     public FirefoxDriver driver;

    @Rule
     public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {





            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(1400, 800));
            //  driver.manage().window().maximize();



        }


        @Override
        public void finished(Description description) {
            driver.quit();
        }

        @Override
        public void failed(Throwable e, Description description) {
         //   String newAutoTest = "TestFailure";
            File screenshot = driver.
                    getScreenshotAs(OutputType.FILE);
            String path = "C:\\Programms\\GitHub\\DivorceScreen\\screen\\"  + getClass() + screenshot.getName();

            try {
                FileUtils.copyFile(screenshot, new File(path));
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }



        public void new_client_notPassword() throws InterruptedException {
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
            TimeUnit.SECONDS.sleep(5);



        }






    };




}
