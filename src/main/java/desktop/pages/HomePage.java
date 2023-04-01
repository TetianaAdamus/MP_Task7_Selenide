package desktop.pages;

//import static utils.WebDriverWaiter.waitForPageLoadComplete;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static utils.WebDriverWaiter.waitForPageLoadComplete;

import abstractClasses.page.AbstractPage;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends AbstractPage {

    SelenideElement rootElement = $("[class=' page-type-home js'] div.page-slide").should(exist);


    public void search(String keyword) {
        rootElement.$(".text-input").setValue(keyword).pressEnter();
               waitForPageLoadComplete();
    }

}
