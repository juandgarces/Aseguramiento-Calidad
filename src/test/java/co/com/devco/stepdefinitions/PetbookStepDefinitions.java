package co.com.devco.stepdefinitions;


import co.com.devco.questions.ValidarPagina;
import co.com.devco.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetbookStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan");
    }

    @Cuando("^Juan busca en internt una pagina para publicar fotos de su mascota$")
    public void juanBuscaEnInterntUnaPaginaParaPublicarFotosDeSuMascota() {
        theActorInTheSpotlight().attemptsTo(
                Ingresar.url()
        );
    }


    @Entonces("^debe ver el titulo \"([^\"]*)\"$")
    public void debeVerElTitulo(String titlepage) {
        theActorInTheSpotlight().should(seeThat(ValidarPagina.es(titlepage)));
    }


}
