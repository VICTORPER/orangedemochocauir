package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.ui.AddEmployeeUI.BUTTON_RECRUITMENT;
import static co.com.screenplay.project.ui.LoginUI.*;

@Slf4j
@AllArgsConstructor
public class AddEmployee implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_RECRUITMENT)
        );

    }
    public static AddEmployee button () {
        return Tasks.instrumented(AddEmployee.class);
    }
}
