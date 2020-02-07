package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_INPUT_NAME = "//*[@id=\"reg_form_box\"]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
    public static final String XPATH_INPUT_SURNAME = "//*[@id=\"reg_form_box\"]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]";
    public static final String XPATH_INPUT_MAIL = "//*[@id=\"reg_form_box\"]/div[2]/div[1]/div[1]/input[1]";
    public static final String XPATH_INPUT_MAIL_CONFIRM = "//*[@id=\"reg_form_box\"]/div[3]/div[1]/div[1]/div[1]/input[1]";
    public static final String XPATH_INPUT_PASSWORD = "//*[@id=\"reg_form_box\"]/div[4]/div[1]/div[1]/input[1]";
    public static final String XPATH_INPUT_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_INPUT_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_INPUT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        WebElement inputName = driver.findElement(By.xpath(XPATH_INPUT_NAME));
        inputName.sendKeys("John");

        WebElement inputSurname = driver.findElement(By.xpath(XPATH_INPUT_SURNAME));
        inputSurname.sendKeys("Smith");

        WebElement inputMail = driver.findElement(By.xpath(XPATH_INPUT_MAIL));
        inputMail.sendKeys("mail@gmail.com");

        while(!driver.findElement(By.xpath(XPATH_INPUT_MAIL_CONFIRM)).isDisplayed());

        WebElement inputMailConfirm = driver.findElement(By.xpath(XPATH_INPUT_MAIL_CONFIRM));
        inputMailConfirm.sendKeys("mail@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(XPATH_INPUT_PASSWORD));
        inputPassword.sendKeys("123456");

        while(!driver.findElement(By.xpath(XPATH_INPUT_DAY)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_INPUT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(10);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_INPUT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(8);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_INPUT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(20);

        driver.findElement(By.cssSelector("input[type='radio'][value='2'")).click();
    }
}
