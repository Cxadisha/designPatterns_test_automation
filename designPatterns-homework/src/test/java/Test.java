import Data.PersonData;
import Steps.Config;
import Steps.FirstPageSteps;
import Steps.SecondPageSteps;
import Steps.ValidatePageSteps;
import org.testng.Assert;

public class Test {

    Config config = new Config();
    FirstPageSteps firstPageSteps = new FirstPageSteps();
    SecondPageSteps secondPageSteps = new SecondPageSteps();
    ValidatePageSteps validatePageSteps = new ValidatePageSteps();
    PersonData data = new PersonData();

    @org.testng.annotations.Test
    public void test() {
        config.configure();
        firstPageSteps.clickOnForms();
        secondPageSteps.clickPracticeForm().fillTheForm();

        Assert.assertEquals(validatePageSteps.getFullName(), data.firstName + " " + data.lastName);
        Assert.assertEquals(validatePageSteps.getGender(), data.gender);
        Assert.assertEquals(validatePageSteps.getMobile(), data.number);

    }

}
