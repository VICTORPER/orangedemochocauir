package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.screenplay.project.ui.CategoryUI.*;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;

public class FirstForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //selectRandomJobTitle();
        waiting(TIME_SHORT);
        actor.attemptsTo(

                Click.on(JOB_TITLE),
                Click.on(VACANCY),
                Click.on(HIRING_MANAGER),
                Click.on(STATUS),
                Click.on(METHODOFAPP)
        );
    }
    public static FirstForm firstForm () {

        return Tasks.instrumented(FirstForm.class);
    }





}
