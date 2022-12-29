package Steps.PageFactory;

import Data.PersonDataPF;
import Pages.PageFactory.FirstPagePF;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class FirstPageStepsPF {

    public WebDriver driver;
    PersonDataPF dataPF;
    FirstPagePF firstPagePF;

    public FirstPageStepsPF(WebDriver driver) {
        this.driver = driver;
        dataPF = new PersonDataPF();
        firstPagePF = new FirstPagePF(driver);
    }

    @Step
    public FirstPageStepsPF open() {
        driver.get(dataPF.url);
        return this;
    }

    @Step
    public FirstPageStepsPF clickOnForms() {
        firstPagePF.forms.click();
        return this;
    }

}
