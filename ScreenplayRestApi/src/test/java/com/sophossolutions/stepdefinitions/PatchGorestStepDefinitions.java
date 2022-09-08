package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.ExecutePatchToken;
import com.sophossolutions.tasks.ExecutePostToken;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class PatchGorestStepDefinitions {

    @When("actualiza la informacion del usuario en el endpoint {string} con el id {int}")
    public void actualizaLaInformacionDelUsuarioEnElEndpointConElId(String endpoint, Integer id, DataTable userInformation) {
        theActorInTheSpotlight().attemptsTo(ExecutePatchToken.updateUser(endpoint, id, userInformation));
    }

    @Then("valida que la respuesta contenga el nombre {string} y el codigo de estado sea {int}")
    public void validaQueLaRespuestaContengaElNombreYElCodigoDeEstadoSea(String name, Integer statusCode) {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(statusCode)
                .body("name", equalTo(name))
        ));
    }
}
