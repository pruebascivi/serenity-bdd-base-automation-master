package com.reliquias.software.stepdefinitions;

import com.reliquias.software.conf.SessionVariables;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition2 {

    @Entonces("el deberia traer Foo")
    public void elDeberiaTraerFoo() {
        String valueRecall = theActorInTheSpotlight().recall(SessionVariables.FOO.toString());
    }
}
