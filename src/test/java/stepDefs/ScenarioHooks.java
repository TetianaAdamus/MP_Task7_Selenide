package stepDefs;

import static com.codeborne.selenide.Selenide.screenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

public class ScenarioHooks {

    //    @Before
//    public void setuSelenide(){
//        Configuration.screenshots = false;
//        Configuration.savePageSource = false;
//    }


    @After
    public void createScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            String fileName = "Screenshot of "+scenario.getName();
            scenario.attach(screenshot(OutputType.BYTES), "image/png", fileName);
        }
    }
}
