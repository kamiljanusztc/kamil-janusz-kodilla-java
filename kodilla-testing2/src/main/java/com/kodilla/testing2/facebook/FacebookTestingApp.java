package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class FacebookTestingApp {

    public static final String XPATH_COOKIE_ACCEPT = "//div[contains(@class, \"_9xo5\")]/button[1]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";

    public static final String XPATH_NAME = "//input[contains(@name,\"firstname\")]";
    public static final String XPATH_SURNAME = "//input[contains(@name,\"lastname\")]";
    public static final String XPATH_EMAIL = "//input[contains(@name,\"reg_email__\")]";
    public static final String XPATH_EMAIL_CONFIRM = "//input[contains(@name,\"reg_email_confirmation__\")]";
    public static final String XPATH_PASSWORD = "//input[contains(@name,\"reg_passwd__\")]";

    public static final String XPATH_DAY = "//select[contains(@id,\"day\")]";
    public static final String XPATH_MONTH = "//select[contains(@id,\"month\")]";
    public static final String XPATH_YEAR = "//select[contains(@id,\"year\")]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIE_ACCEPT)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        TimeUnit.SECONDS.sleep(1);

        driver.findElement(By.xpath(XPATH_NAME)).sendKeys("Kamil");
        driver.findElement(By.xpath(XPATH_SURNAME)).sendKeys("Kamil");
        driver.findElement(By.xpath(XPATH_EMAIL)).sendKeys("test@test.com");
        driver.findElement(By.xpath(XPATH_EMAIL_CONFIRM)).sendKeys("test@test.com");
        driver.findElement(By.xpath(XPATH_PASSWORD)).sendKeys("pass");
        driver.findElement(By.xpath(XPATH_DAY)).sendKeys("10");
        driver.findElement(By.xpath(XPATH_MONTH)).sendKeys("10");
        driver.findElement(By.xpath(XPATH_YEAR)).sendKeys("1994");
    }
}
