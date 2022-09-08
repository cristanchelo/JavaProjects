package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.ExecutionDeleteToken;
import com.sophossolutions.tasks.ExecutionGetToken;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class DeleteGorestStepDefinitions {
    @When("elimina el usuario en el endpoint {string} con el id {int}")
    public void eliminaElUsuarioEnElEndpointConElId(String endpoint, Integer id) {
        theActorInTheSpotlight().attemptsTo(ExecutionDeleteToken.deleteUserInformation(endpoint, id));
    }
    @Then("valida que el codigo de estado HTTP sea {int} y la respuesta sea nula o no traiga informacion")
    public void validaQueElCodigoDeEstadoHTTPSeaYLaRespuestaSeaNulaONoTraigaInformacion(Integer statusCode) {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(statusCode)
                .noRootPath()
        ));
    }
}
