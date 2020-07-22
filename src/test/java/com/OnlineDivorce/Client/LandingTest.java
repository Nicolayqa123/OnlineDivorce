package com.OnlineDivorce.Client;

import com.OnlineDivorce.WebDriverSettings;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LandingTest extends WebDriverSettings {

String state = "Oregon";
    @Test
    @com.adaptavist.tm4j.junit.annotation.TestCase(key = "ON-T87")
    public void log_in () {
        driver.get(URLDivorce);
        driver.findElementByCssSelector("#content-wrapper > div.left-wrapper > div.site-name-wrapper > div.hamburger-2.hamburger--3dxy.js-hamburger > div").click();
        driver.findElementByCssSelector("#content-wrapper > div.left-wrapper > div.site-name-wrapper > div.row.states-menu-wrapper.visible-flex > div:nth-child(2) > div > div:nth-child(4) > ul > li:nth-child(11) > a").click();
        assertTrue(driver.findElementByCssSelector("#free-eligibikity-check-form > div.input-validate-group.for-select > select").getText().contains(state));
    }


}
// #free-eligibikity-check-form > div.input-validate-group.for-select > span