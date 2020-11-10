package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetbookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Task {

    private String filtro;

    public SeleccionarOpcion(String filtro) {
        this.filtro = filtro;
    }


    public static SeleccionarOpcion deFiltro(String filtro) {

        return instrumented(SeleccionarOpcion.class,filtro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (filtro) {
            case "perros":
                actor.attemptsTo(Click.on(BT_PERRO));
                break;
            case "gatos":
                actor.attemptsTo(Click.on(BT_GATO));
                break;
            case "all":
                actor.attemptsTo(Click.on(BT_PERRO));
                break;
            default:
                actor.attemptsTo(Click.on(BT_PERRO));
                break;
        }

    }
}
