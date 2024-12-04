package com.reliquias.software.questions.token;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.UUID;

public class GetToken implements Question {

    public static Question<String> toManageMyProducts(){return new GetToken();}

    @Override
    public Object answeredBy(Actor actor) {
        return UUID.randomUUID().toString();
    }
}
