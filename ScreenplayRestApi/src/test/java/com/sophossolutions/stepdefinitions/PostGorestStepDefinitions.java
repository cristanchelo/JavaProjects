package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

import com.sophossolutions.tasks.ExecutePostToken;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class PostGorestStepDefinitions {
    @When("proporciona la informacion del usuario en el endpoint {string}")
    public void proporcionaLaInformacionDelUsuarioEnElEndpoint(String endpoint, DataTable userInformation) {
        theActorInTheSpotlight().attemptsTo(ExecutePostToken.createUser(endpoint, userInformation));
    }

    @Then("valida la respuesta contenga el nombre {string} y el codigo de estado sea {int}")
    public void validaLaRespuestaContengaElNombreYElCodigoDeEstadoSea(String name, Integer statusCode) {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(statusCode)
                .body("name", equalTo(name))
        ));
    }
}
