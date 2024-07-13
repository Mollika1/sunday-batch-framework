package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginSteps {
    WebDriver driver;

    @Given("student at talentTEK Homepage")
    public void studentAtTalentTEKHomepage() {
      //  WebDriver driver;
       driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
    }

    @And("student enter their valid email address")
    public void studentEnterTheirValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("Remerene5@gmail.com");
    }

    @And("student enter their valid password")
    public void studentEnterTheirValidPassword() {
        driver.findElement(By.name("password")).sendKeys("Remerene0");
    }

    @When("student clicks on Login Button from Login page")
    public void studentClicksOnLoginButtonFromLoginPage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='login_form']/input")).click();
        Thread.sleep(1500);

    }

    @Then("student should be able to successfully login")
    public void studentShouldBeAbleToSuccessfullyLogin() {
        // assert if student successfully logged in or not
        // Expected : comes from project manager or business owner
        // Actual comes from what developer has been developed
        String exp = "Student information";
        String act = driver.findElement(By.cssSelector("h2[class='d-inline info']")).getText();
        Assert.assertEquals(act,exp);
    }

    @And("student enter their invalid email address")
    public void studentEnterTheirInvalidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("Remerene123@gmail.com");

    }

    @Then("student should not be able to successfully login")
    public void studentShouldNotBeAbleToSuccessfullyLogin() {
        String exp = "Invalid email address";
        String act =driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
        Assert.assertEquals(act,exp);
    }

    @And("student enter their invalid password")
    public void studentEnterTheirInvalidPassword() {
        driver.findElement(By.name("invalid password")).sendKeys("12345");

    }
}
