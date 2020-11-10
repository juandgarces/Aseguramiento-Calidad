package co.com.devco.stepdefinitions;


import co.com.devco.questions.ValidarImagenes;
import co.com.devco.questions.ValidarImagenesGato;
import co.com.devco.questions.ValidarImagenesPerro;
import co.com.devco.questions.ValidarPagina;
import co.com.devco.tasks.EsperarCarga;
import co.com.devco.tasks.Ingresar;
import co.com.devco.tasks.SeleccionarOpcion;
import co.com.devco.utils.MyWebDriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.userinterfaces.PetbookHomePage.PETBOOK_HOME_PAGE;
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
        theActorInTheSpotlight().whoCan(BrowseTheWeb.with(
                MyWebDriverFactory.web().onTheWebsite(PETBOOK_HOME_PAGE)));
    }


    @Cuando("^Juan seleciona ver solo los \"([^\"]*)\"$")
    public void juanSelecionaVerSoloLos(String filtro) {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.deFiltro(filtro));
    }

    @Cuando("^Juan espera a que la pagina cargue$")
    public void juanEsperaAQueLaPaginaCargue() {
        theActorInTheSpotlight().attemptsTo(EsperarCarga.dePagina());
    }

    @Cuando("^Juan seleciona ver solo los \"([^\"]*)\" carga las fotos de perros$")
    public void juanSelecionaVerSoloLosCargaLasFotosDePerros(String filtro) {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.deFiltro(filtro));
    }

    @Cuando("^Juan cambia para ver los \"([^\"]*)\"$")
    public void juanCambiaParaVerLos(String filtro) {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.deFiltro(filtro));
    }

    @Entonces("^la pagina filtra las imagenes para mostrar solo los perros$")
    public void laPaginaFiltraLasImagenesParaMostrarSoloLosPerros() {
        theActorInTheSpotlight().should(seeThat(ValidarImagenesPerro.filtradas()));
    }

    @Entonces("^la pagina filtra las imagenes para mostrar solo los gatos$")
    public void laPaginaFiltraLasImagenesParaMostrarSoloLosGatos() {
        theActorInTheSpotlight().should(seeThat(ValidarImagenesGato.filtradas()));
    }

    @Entonces("^la pagina muestra todas las imagenes de los animales$")
    public void laPaginaMuestraTodasLasImagenesDeLosAnimales() {
        theActorInTheSpotlight().should(seeThat(ValidarImagenes.cargadas()));
    }

    @Entonces("^la pagina cambia las imagenes de los perros por la de los gatos$")
    public void laPaginaCambiaLasImagenesDeLosPerrosPorLaDeLosGatos() {
        theActorInTheSpotlight().should(seeThat(ValidarImagenesGato.filtradas()));
    }
}
