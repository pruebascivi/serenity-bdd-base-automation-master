package com.reliquias.software.stepdefinitions;

import io.cucumber.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStepDefinitions {

    @Dado("{string} quiere recordar algo")
    public void setActorName(String name) {
        theActorCalled(name);
    }
}
