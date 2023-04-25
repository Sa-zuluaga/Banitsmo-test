package stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.questions.ValidarValores;
import org.example.tasks.CalcularTasa;
import org.example.userinterface.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CalcularTasaStepDefinition {
    HomePage HomePage;
    @Given("el {word} ingresa a la pagina de bancolombia")
    public void elUsuarioIngresaASufi(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                Open.browserOn(
                        HomePage
                ));
    }
    @When("el ingresa a la herramienta para calcular su tasa de interes")
    public void elCotizaUnSeguroParaSuAuto() {
        theActorInTheSpotlight().attemptsTo(
                CalcularTasa.Interes()
        );
    }
    @Then("el usuario deberia su tasa de interes")
    public void elUsuarioDeberiaSuSeguroCotizado() {
        theActorInTheSpotlight().should(
                seeThat(ValidarValores.ConLaBase())
        );
    }
}
