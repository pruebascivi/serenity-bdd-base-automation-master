package com.reliquias.software.task;

import com.reliquias.software.ui.login.LoginForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.reliquias.software.ui.login.LoginForm.PASSWORD_FIELD;
import static com.reliquias.software.ui.login.LoginForm.USERNAME_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String username;
    private final String password;

    public DoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password){
        return instrumented(DoLogin.class, username, password); //Por debajo en algun momento invoca al constructor
    }//Oculta y centraliza la creacion

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
        );
    }
}
