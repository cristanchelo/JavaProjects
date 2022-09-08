package com.cedaniel200.solid.game.options;

import com.cedaniel200.solid.game.controller.ControladorConsola;

import java.util.Arrays;

public enum OpcionesMenu {
    INDEFINIDA(  -1, "Indefinida" ),
    TERMINAR_JUEGO(0, "Terminar juego"),
    ENCENDER_SABLE(1, "Encender sable"),
    APAGAR_SABLE(2, "Apagar sable");

    private int id;
    private String description;

    OpcionesMenu(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getInformacion(){
        return this.id + " " + this.description;
    }

    public static void imprimirOpcionesMenuExceptoIndefinido(ControladorConsola consola) {
        consola.imprimirConSaltoLinea("----- Opciones -----");
        Arrays.stream(values()).filter(opc -> opc != INDEFINIDA).
                forEach(opcion -> consola.imprimirConSaltoLinea(opcion.getInformacion()));
        consola.imprimirConSaltoLinea("--------------------");
    }
}
