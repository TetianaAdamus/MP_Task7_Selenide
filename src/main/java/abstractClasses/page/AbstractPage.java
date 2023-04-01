package abstractClasses.page;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.localStorage;
import static com.codeborne.selenide.Selenide.sessionStorage;
import static com.codeborne.selenide.WebDriverRunner.driver;
import static constants.Constants.BOOK_DEPOSITORY;

import java.util.HashMap;
import java.util.Map;

public class AbstractPage {


    public void clearCookies() {
        clearBrowserCookies();
        localStorage().clear();
        sessionStorage().clear();
    }

    public Map<String, String> pagesNamesMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Initial home page", BOOK_DEPOSITORY);
        map.put("Basket page", BOOK_DEPOSITORY + "basket");
        map.put("Search page", BOOK_DEPOSITORY + "search");
        map.put("Checkout", BOOK_DEPOSITORY + "payment");
        return map;
    }

    public String pageUrl(String page) {
        return pagesNamesMap().get(page);
    }

    public boolean checkUrl(String pageName) {
        return driver().url().contains(pageUrl(pageName));
    }

    public void scrollToPageBottom(){
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
