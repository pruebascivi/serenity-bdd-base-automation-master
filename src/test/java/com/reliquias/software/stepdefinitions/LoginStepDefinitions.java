package com.reliquias.software.stepdefinitions;

import com.reliquias.software.builders.Login;
import com.reliquias.software.facts.AToken;
import com.reliquias.software.navigate.NavigateTo;
import com.reliquias.software.questions.OverviewData;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginStepDefinitions {
    String name;
    @Dado("{string} navega a la página de inicio de sesión")
    public void navegaALaPáginaDeInicioDeSesión(String name) {
        this.name = name;
    }

    @Dado("{string} tiene un token")
    public void tieneUnToken(String name) {
        theActorCalled(name)
                .has(AToken.toManageTheirProducts());
    }

    @Cuando("incia sesión con las credenciales de acceso correctas")
    public void ingresaLasCredencialesDeAcceso() {

        theActorCalled(name).attemptsTo(
                NavigateTo.goPage(),
                Login
                        .with()
                        .username("pepito")
                        .and()
                        .password("seguridad")
                        .and()
                        .rememberMe()
        );
    }

    @Entonces("debería ver el tablero en la página principal")
    public void deberiaVerTableroPaginaPrincipal() {

        theActorInTheSpotlight().should(
                seeThat("The displayed credit available", OverviewData.creditAvailable(), equalTo("$17,800")),
                seeThat("The displayed credit available", OverviewData.totalBalance(), equalTo("$17,800")),
                seeThat("The displayed credit available", OverviewData.creditAvailable(), equalTo("$17,800"))

        );
    }


}
