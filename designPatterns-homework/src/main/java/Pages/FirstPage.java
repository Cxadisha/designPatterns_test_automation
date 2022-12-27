package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class FirstPage {

    public SelenideElement forms = $(By.xpath("//div[@class='card mt-4 top-card'][2]"));

}
