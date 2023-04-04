package desktop.pages;

import static com.codeborne.selenide.Selenide.$;
import static utils.WebDriverWaiter.waitForPageLoadComplete;

import abstractClasses.page.AbstractPage;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends AbstractPage {

    SelenideElement rootElement = $(".page-type-home");


    public void search(String keyword) {
        rootElement.$(".text-input").setValue(keyword).pressEnter();
        waitForPageLoadComplete();
    }

}
