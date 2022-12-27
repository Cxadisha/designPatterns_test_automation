package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ValidatePage {

    public SelenideElement studentNamePage = $(By.xpath("//td[text()='Student Name']//following-sibling::td"));
    public SelenideElement genderPage = $(By.xpath("//td[text()='Gender']//following-sibling::td"));
    public SelenideElement mobilePage = $(By.xpath("//td[text()='Mobile']//following-sibling::td"));

}
