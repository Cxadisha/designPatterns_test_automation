package Steps.PageFactory;

import Data.PersonDataPF;
import Pages.PageFactory.SecondPagePF;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SecondPageStepsPF {

    public WebDriver driver;
    PersonDataPF dataPF;
    SecondPagePF secondPagePF;

    public SecondPageStepsPF(WebDriver driver) {
        this.driver = driver;
        secondPagePF = new SecondPagePF(driver);
        dataPF = new PersonDataPF();
    }

    @Step
    public SecondPageStepsPF choosePracticeForms() {
        secondPagePF.practiceForm.click();
        return this;
    }

    @Step
    public SecondPageStepsPF enterFirstName() {
        secondPagePF.firstName.sendKeys(dataPF.firstName);
        return this;
    }

    @Step
    public SecondPageStepsPF enterLastName() {
        secondPagePF.lastName.sendKeys(dataPF.lastName);
        return this;
    }

    @Step
    public SecondPageStepsPF chooseGender() {

        String gender = dataPF.gender;

        switch (gender) {
            case "Male" -> secondPagePF.genderMale.click();
            case "Female" -> secondPagePF.genderFemale.click();
            case "Other" -> secondPagePF.genderOther.click();
        }

        return this;
    }

    @Step
    public SecondPageStepsPF enterNumber() {
        secondPagePF.number.sendKeys(dataPF.number);
        return this;
    }

    @Step
    public SecondPageStepsPF clickOnSubmit() {
        secondPagePF.submit.click();
        return this;
    }

}
