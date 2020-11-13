package co.com.devco.tasks;

import co.com.devco.userinterfaces.PetbookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.PetbookHomePage.BT_GATO;
import static co.com.devco.userinterfaces.PetbookHomePage.BT_PERRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarCarga implements Task {

     public static EsperarCarga dePagina() {

        return instrumented(EsperarCarga.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(PetbookHomePage.TITLE, WebElementStateMatchers.isPresent()).
                forNoMoreThan(30).seconds());

    }
}
