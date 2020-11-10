package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetbookHomePage.BT_PERRO;
import static co.com.devco.userinterfaces.PetbookHomePage.PETBOOK_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Task {




    public static SeleccionarOpcion perro() {
        return instrumented(SeleccionarOpcion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BT_PERRO)
        );


    }
}
