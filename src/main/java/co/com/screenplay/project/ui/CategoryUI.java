package co.com.screenplay.project.ui;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CategoryUI extends PageObject {

    private static List<WebElement> locatorListJobTitle() {
        String xpath = "//div[@id='app']//form//div[1]//div[1]//div[2]//div//div//div[1]";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }
    public static final Target JOB_TITLE = Target.the("Select text input")
            .located(By.xpath("(//div[contains(@class, 'oxd-select-text-input')])[1]"));

    public static final Target VACANCY = Target.the("Select text input")
            .located(By.xpath("(//div[contains(@class, 'oxd-select-text-input')])[2]"));

    public static final Target HIRING_MANAGER = Target.the("Select text input")
            .located(By.xpath("(//div[contains(@class, 'oxd-select-text-input')])[3]"));
    public static final Target STATUS = Target.the("Select text input")
            .located(By.xpath("(//div[contains(@class, 'oxd-select-text-input')])[4]"));

    public static final Target METHODOFAPP = Target.the("Select text input")
            .located(By.xpath("(//div[contains(@class, 'oxd-select-text-input')])[5]"));
    public static final Target CANDIDATENAME = Target.the("Select text input")
            .located(By.xpath("(//div[contains(@class, 'oxd-select-text-input')])[4]"));



}
