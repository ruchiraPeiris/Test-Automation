package selenium;

import jdk.internal.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class RegistrationTest {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable_notifications","disable_infobars");
        System.setProperty("webdriver.chrome.driver","F:\\MORA\\L4S1\\QA\\WebDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demoqa.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("menu-item-374")).click();
        driver.findElement(By.name("first_name")).sendKeys("Ruchira");

        List<WebElement> radioButton=driver.findElements(By.name("radio_4[]"));
        radioButton.get(0).click();


    }
}
