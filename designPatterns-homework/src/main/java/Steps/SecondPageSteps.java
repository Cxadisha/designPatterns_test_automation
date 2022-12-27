package Steps;

import Data.PersonData;
import Pages.SecondPage;
import io.qameta.allure.Step;

public class SecondPageSteps extends SecondPage {
    PersonData data = new PersonData();

    @Step
    public SecondPageSteps clickPracticeForm() {
        practiceForm.click();
        return this;
    }

    @Step
    public SecondPageSteps fillTheForm() {
        firstName.setValue(data.firstName);
        lastName.setValue(data.lastName);
        gender.click();
        number.setValue(data.number);
        submit.click();
        return this;
    }

}
