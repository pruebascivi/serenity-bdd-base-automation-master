package com.reliquias.software.facts;

import com.reliquias.software.questions.token.GetToken;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.facts.Fact;

public class AToken implements Fact {

    private String token;
    public static AToken toManageTheirProducts(){
        return new AToken();
    }
    @Override
    public void setup(Actor actor) {
        token = GetToken.
                toManageMyProducts().
                answeredBy(actor);
    }

    public String toString(){
        return "token is " + token;
    }
}
