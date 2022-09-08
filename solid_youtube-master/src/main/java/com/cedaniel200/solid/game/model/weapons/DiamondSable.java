package com.cedaniel200.solid.game.model.weapons;

import com.cedaniel200.solid.game.controller.ControladorConsola;
import com.cedaniel200.solid.game.controller.interfaces.Sable;

public class DiamondSable implements Sable {
    private final ControladorConsola consola;

    public DiamondSable() {
        this.consola = new ControladorConsola();
    }

    public void render(int accion){
        this.consola.imprimirConSaltoLinea(accion == 1 ? "|<><>=>" : "");
    }
}
