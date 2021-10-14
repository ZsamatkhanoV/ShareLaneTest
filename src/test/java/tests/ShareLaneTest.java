package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    // 1.Open browser, URL - https://sharelane.com/cgi-bin/register.py
    // 2.Enter value in ZIP code field
    // 3.Click Continue button

    @Test
    public void fillInZipCodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
    }

    // 1.Open browser, URL - https://sharelane.com/cgi-bin/register.py
    // 2.Enter value in ZIP code field
    // 3.Click Continue button
    // 4.Fill value in Register fields
    // 5.Click Register button

    @Test
    public void fillInZipCodeFieldWithEmptyDataTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
    }
    @Test
    public void fillInZipCodeFieldWithMandatoryFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Ziyat");
        driver.findElement(By.name("email")).sendKeys("Ziyat@sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("23456");
        driver.findElement(By.name("password2")).sendKeys("23456");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
    }
    @Test
    public void fillInZipCodeFieldWithOptionalFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.findElement(By.name("last_name")).sendKeys("Ivanov");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
    }
    @Test
    public void fillInZipCodeFieldWithFullFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Ziyat");
        driver.findElement(By.name("last_name")).sendKeys("Ivanov");
        driver.findElement(By.name("email")).sendKeys("Ziyat@sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("23456");
        driver.findElement(By.name("password2")).sendKeys("23456");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
    }
    @Test
    public void fillInZipCodeFieldWithNotConfirmedPasswordTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Ziyat");
        driver.findElement(By.name("last_name")).sendKeys("Ivanov");
        driver.findElement(By.name("email")).sendKeys("Ziyat@sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("23456");
        driver.findElement(By.name("password2")).sendKeys("23456789");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
    }
    @Test
    public void fillInZipCodeFieldWithoutPasswordTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Ziyat");
        driver.findElement(By.name("last_name")).sendKeys("Ivanov");
        driver.findElement(By.name("email")).sendKeys("Ziyat@sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
    }
}
