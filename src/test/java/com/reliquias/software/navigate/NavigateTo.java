package com.reliquias.software.navigate;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable goPage(){
        return Task.where("{0} Abre la página",
                Open.browserOn().the(AppliToolsHomePage.class));
    }
}
