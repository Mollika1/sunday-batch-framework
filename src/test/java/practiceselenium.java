import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class practiceselenium {

    public static void main(String[] args) {
        // Email address must be unique
        // run in multiple browser like chrome and firefox
        // Test Env such as QA, Stage and Prod

        System.out.println("I am a Geek");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.get("https://qa.taltektc.com/signup.html");
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).sendKeys("mollika");
        driver.findElement(By.name("lastName")).sendKeys("akter");
        driver.findElement(By.name("email")).sendKeys("mollikaakter15@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456");
        new Select(driver.findElement(By.name("day"))).selectByVisibleText("17");
        new Select(driver.findElement(By.name("year"))).selectByVisibleText("1983");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("defaultCheck1")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

