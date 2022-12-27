package Steps;

import Data.PersonData;
import Pages.FirstPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.zoom;

public class FirstPageSteps extends FirstPage {

    @Step
    public FirstPageSteps clickOnForms() {
        forms.click();
        return this;
    }

}
