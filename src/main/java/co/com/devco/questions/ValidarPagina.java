package co.com.devco.questions;

import co.com.devco.userinterfaces.PetbookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarPagina implements Question<Boolean> {

    private static String title;


    public ValidarPagina(String title){
        this.title = title;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(PetbookHomePage.TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        return Text.of(PetbookHomePage.TITLE).viewedBy(actor).asString().equals(title);
    }


    public static ValidarPagina es(String title) {
        return new ValidarPagina(title);
    }
}
