package co.com.devco.stepdefinitions;


import co.com.devco.questions.ValidarImagenesPerro;
import co.com.devco.questions.ValidarPagina;
import co.com.devco.tasks.Ingresar;
import co.com.devco.tasks.SeleccionarOpcion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Consequence;
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


    @Dado("^Que Juan ingresa a la pagina Pet Book$")
    public void queJuanIngresaALaPaginaPetBook() {
        theActorInTheSpotlight().attemptsTo(
                Ingresar.url()
        );
    }


    @Cuando("^Juan seleciona ver solo los perros$")
    public void juanSelecionaVerSoloLosPerros() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.perro());
    }


    @Entonces("^la pagina filtra las imagenes para mostrar solo los perros$")
    public void laPaginaFiltraLasImagenesParaMostrarSoloLosPerros() {
        theActorInTheSpotlight().should(seeThat(ValidarImagenesPerro.filtradas()));
    }


}
