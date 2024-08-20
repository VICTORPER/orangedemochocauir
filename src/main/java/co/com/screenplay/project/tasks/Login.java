package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static co.com.screenplay.project.ui.LoginUI.*;


@Slf4j
@AllArgsConstructor
public class Login implements Task {

    private String user;
    private String pwd;

    @Override
    @Step("{0} se autentica y acepta la alert del mensaje")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(INPUT_USER_NAME),
                Enter.theValue(pwd).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );



    }

    public static Login authentication(String user, String pwd) {
        return Tasks.instrumented(Login.class, user, pwd);
    }
}
