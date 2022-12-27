package Pages;

import Data.PersonData;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SecondPage {

    PersonData data = new PersonData();

    public SelenideElement practiceForm = $(By.xpath("//span[text()='Practice Form']"));
    public SelenideElement firstName = $(By.id("firstName"));
    public SelenideElement lastName = $(By.id("lastName"));
    public SelenideElement gender = $(By.xpath("//label[text()='" + data.gender + "']"));
    public SelenideElement number = $(By.id("userNumber"));
    public SelenideElement submit = $(By.xpath("//button[text()='Submit']"));

}
