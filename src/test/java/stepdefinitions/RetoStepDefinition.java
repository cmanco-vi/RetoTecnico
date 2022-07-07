package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;
import tasks.AbrirJoinToday;

import java.util.List;

public class RetoStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^un navegador web en la página de Utest\\.com$")
    public void unNavegadorWebEnLaPáginaDeUtestCom() {
        OnStage.theActorCalled("Crihstian").wasAbleTo(Abrir.Pagina());

    }

    @When("^se ingresan los datos del formulario$")
    public void seIngresanLosDatosDelFormulario(List<TablaDeDatosFeature> tablaDeDatosFeatureList) {
        OnStage.theActorCalled("Crihstian").wasAbleTo(AbrirJoinToday.LaPagina(tablaDeDatosFeatureList.get(0)));
    }

    @Then("^se crea un nuevo usuario$")
    public void seCreaUnNuevoUsuario(String question) {
       //System.out.println("Welcome to the world's largest community of freelance software testers!");
    }

}
