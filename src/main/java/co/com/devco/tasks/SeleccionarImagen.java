package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.PetbookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarImagen implements Task {

    //private String filtro;

    public SeleccionarImagen(){};

    public static SeleccionarImagen img() {

        return instrumented(SeleccionarImagen.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PRIMERA_IMAGEN));

    }

}

