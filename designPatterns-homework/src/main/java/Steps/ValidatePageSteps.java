package Steps;

import Pages.ValidatePage;
import io.qameta.allure.Step;

public class ValidatePageSteps extends ValidatePage {

    @Step
    public String  getFullName() {
        return studentNamePage.getText();
    }

    @Step
    public String getGender() {
        return genderPage.getText();
    }

    @Step
    public String getMobile() {
        return mobilePage.getText();
    }

}
