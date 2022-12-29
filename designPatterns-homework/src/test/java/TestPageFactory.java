import Data.PersonDataPF;
import Steps.PageFactory.FirstPageStepsPF;
import Steps.PageFactory.SecondPageStepsPF;
import Steps.PageFactory.ValidatePageStepsPF;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TestPageFactory {

    public WebDriver driver;

    @BeforeTest
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws AWTException {

        FirstPageStepsPF firstPageStepsPF = new FirstPageStepsPF(driver);
        firstPageStepsPF.open().clickOnForms();

        SecondPageStepsPF secondPageStepsPF = new SecondPageStepsPF(driver);

        // zoom out using robot
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        secondPageStepsPF.choosePracticeForms().enterFirstName().enterLastName().chooseGender().enterNumber().clickOnSubmit();

        PersonDataPF dataPF = new PersonDataPF();
        ValidatePageStepsPF validatePageStepsPF = new ValidatePageStepsPF(driver);
        Assert.assertEquals(validatePageStepsPF.getFullName(), dataPF.firstName + " " + dataPF.lastName);
        Assert.assertEquals(validatePageStepsPF.getGender(), dataPF.gender);
        Assert.assertEquals(validatePageStepsPF.getMobile(), dataPF.number);

    }

    @AfterTest
    public void after() {
        driver.quit();
    }

}
