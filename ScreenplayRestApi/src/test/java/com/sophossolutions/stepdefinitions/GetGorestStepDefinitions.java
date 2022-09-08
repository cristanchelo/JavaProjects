package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

import com.sophossolutions.tasks.ExecutionGetToken;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetGorestStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("{string} establece la base url {string} del servicio")
    public void estableceLaBaseUrlDelServicio(String actorName, String baseUrl) {
        theActorCalled(actorName).whoCan(CallAnApi.at(baseUrl));
    }

    @When("consulta en el endpoint {string} el id {string}")
    public void consultaEnElEndpointElId(String endpoint, String id) {
        theActorInTheSpotlight().attemptsTo(ExecutionGetToken.getInformation(endpoint, id));
    }

    @Then("valida que el codigo de estado HTTP sea {int} y la respuesta contenga el nombre {string}")
    public void validaQueElCodigoDeEstadoHTTPSeaYLaRespuestaContengaElNombre(Integer status, String name) {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(status).body(
                "name", equalTo(name))));
    }
}
