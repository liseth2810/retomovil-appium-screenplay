package com.liseth2810.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.liseth2810.app.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {

    private Map<String, String> user;

    public LogIn(Map<String, String> user) {
        this.user = user;
    }

    public static LogIn the(Map<String, String> user){
        return instrumented(LogIn.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.get("username")).into(USERNAME),
                Enter.theValue(user.get("password")).into(PASSWORD),
                Click.on(BTN_LOGIN)
        );

    }
}
