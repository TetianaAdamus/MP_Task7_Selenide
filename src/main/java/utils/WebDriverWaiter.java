package utils;

import static com.codeborne.selenide.Selenide.Wait;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.webdriver;
import static constants.Constants.TIME_TO_WAIT;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaiter {

    public static void waitForPageLoadComplete() {
        new WebDriverWait(webdriver().object(), Duration.ofSeconds(TIME_TO_WAIT)).until(webDriver -> (executeJavaScript(
                "return document.readyState").equals("complete")));
//        doWait().until(() -> COMPLETE.equals(executeJavaScript("return document.readyState")));
//        new WebDriverWait(getDriver(), TIME_TO_WAIT).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals(
//                "complete"));
    }

    public static void waitUntilElementDisplayed(SelenideElement element) {
        Wait().until(visibilityOf(element));
    }

    public static void waitUntilElementDisappear(SelenideElement element) {
        Wait().until(invisibilityOf(element));
    }

}
