package com.sophossolutions.tasks;

import com.sophossolutions.constants.ApiConstants;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class ExecutionDeleteToken implements Task {

    private String endpoint;
    private Integer id;

    public ExecutionDeleteToken(String endpoint, Integer id){
        this.endpoint = endpoint;
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from(endpoint.concat(id.toString())).with(
                request -> request.auth().oauth2(ApiConstants.TOKEN)
        ));

        SerenityRest.lastResponse().prettyPeek();
    }

    public static ExecutionDeleteToken deleteUserInformation(String endpoint, Integer id){
        return Tasks.instrumented(ExecutionDeleteToken.class, endpoint, id);
    }
}
