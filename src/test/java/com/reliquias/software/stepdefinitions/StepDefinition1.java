package com.reliquias.software.stepdefinitions;

import com.reliquias.software.conf.SessionVariables;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition1 {
    @Cuando("el trata de recordar {string}")
    public void elTrataDeRecordarFoo(String value) {

        theActorInTheSpotlight().remember(SessionVariables.FOO.toString(), value);
    }

}
