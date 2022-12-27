package Steps;

import Data.PersonData;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.zoom;

public class Config {

    PersonData data = new PersonData();

    public Config configure() {
        Configuration.browserSize = "2560x1440";
        open(data.url);
        zoom(0.75);
        return this;
    }

}
