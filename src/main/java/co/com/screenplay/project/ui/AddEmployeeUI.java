package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddEmployeeUI extends PageObject {
    public static final Target BUTTON_RECRUITMENT = Target.the("Selecciona la opcion")
            .located(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(5) > a"));

    public static final Target ADD_BUTTON = Target.the("Add button")
            .located(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary"));

}
