package selenium;

import jdk.internal.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RegistrationTest {

    WebDriver driver;
    @BeforeMethod
    public void createDriver(){

        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable_notifications","disable_infobars");
        System.setProperty("webdriver.chrome.driver","F:\\MORA\\L4S1\\QA\\WebDriver\\chromedriver.exe");
        driver=new ChromeDriver();


    }

    @Test
    public void fillForm(){

        driver.get("http://demoqa.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("menu-item-374")).click();
        driver.findElement(By.name("first_name")).sendKeys("Ruchira");
        driver.findElement(By.xpath("//*[@id=\"name_3_lastname\"]")).sendKeys("Peiris");
        List<WebElement> radioButton=driver.findElements(By.name("radio_4[]"));
        radioButton.get(0).click();

        List<WebElement> checkbox=driver.findElements(By.name("checkbox_5[]"));
        checkbox.get(1).click();

        WebElement dropdown=driver.findElement(By.id("dropdown_7"));
        Select dropDownElement=new Select(dropdown);
        driver.findElement(By.id("phone_9")).sendKeys("7777777777");
        driver.findElement(By.name("username")).sendKeys("test3@mytest.com");
        driver.findElement(By.name("e_mail")).sendKeys("test3@mytest.com");
        driver.findElement(By.id("password_2")).sendKeys("welcome@123");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("welcome@123");
        driver.findElement(By.name("pie_submit")).click();

        try {
            Thread.sleep(5000);
        }
        catch(Exception ex){

        }
        String message=driver.findElement(By.className("piereg_message")).getText();

        Assert.assertEquals(message,"Thank you for your registration");




    }



}
