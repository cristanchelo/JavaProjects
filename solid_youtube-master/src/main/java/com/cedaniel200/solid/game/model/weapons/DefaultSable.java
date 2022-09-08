package com.cedaniel200.solid.game.model.weapons;

import com.cedaniel200.solid.game.controller.ControladorConsola;
import com.cedaniel200.solid.game.controller.interfaces.Sable;

public class DefaultSable implements Sable {
    private final ControladorConsola consola;

    public DefaultSable() {
        this.consola = new ControladorConsola();
    }

    public void render(int accion){
        this.consola.imprimirConSaltoLinea(accion == 1 ? "|====>" : "");
    }
}
