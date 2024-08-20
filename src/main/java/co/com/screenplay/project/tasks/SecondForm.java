package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.util.EnvironmentVariables;
import static co.com.screenplay.project.ui.SecondFormUI.FIRST_NAME_INPUT;

@Slf4j
@AllArgsConstructor
public class SecondForm implements Task {

    private static EnvironmentVariables environmentVariables;
    private String user_admin;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user_admin).into(FIRST_NAME_INPUT)
        );
    }

    public static SecondForm formnewadmin(String user_admin) {
        return Tasks.instrumented(SecondForm.class, user_admin);
    }
}
