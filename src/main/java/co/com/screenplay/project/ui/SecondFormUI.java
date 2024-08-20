package co.com.screenplay.project.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SecondFormUI extends PageObject {
    public static final Target FIRST_NAME_INPUT = Target.the("first name input field")
            .locatedBy("input[name='firstName'][placeholder='First Name'].orangehrm-firstname");
}

