package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage {

    private final ElementsCollection results = $$("yass-span");

    @Step("Check search result")
    public void checkSearchResult(String text) {
        results.findBy(text(text)).shouldBe(visible);
    }
}