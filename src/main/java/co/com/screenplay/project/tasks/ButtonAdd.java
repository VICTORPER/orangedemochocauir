package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static co.com.screenplay.project.ui.AddEmployeeUI.ADD_BUTTON;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


@Slf4j
@AllArgsConstructor
public class ButtonAdd implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].click();", ADD_BUTTON.resolveFor(actor));

       /* actor.attemptsTo( Scroll.to(ADD_BUTTON),
                WaitUntil.the(ADD_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(ADD_BUTTON)
       );*/

        }
    public static ButtonAdd button() {
        return Tasks.instrumented(ButtonAdd.class);
    }
}
