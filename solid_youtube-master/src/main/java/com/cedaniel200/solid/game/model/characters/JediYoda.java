package com.cedaniel200.solid.game.model.characters;

import com.cedaniel200.solid.game.controller.ControladorConsola;
import com.cedaniel200.solid.game.controller.interfaces.Jedi;
import com.cedaniel200.solid.game.controller.interfaces.Sable;

public class JediYoda implements Jedi {
    private final Sable sable;
    private final ControladorConsola consola;

    public JediYoda(Sable sable) {
        this.sable = sable;
        this.consola = new ControladorConsola();
    }

    public void render(int accion){
        if(accion < 0 || accion > 2){
            this.preguntar();
        }
        if(accion == 0){
            this.despedirse();
        }else{
            this.renderSable(accion);
        }
    }

    public void renderSable(int accion){
        this.consola.imprimirConSaltoLinea(" <...>  ");
        this.consola.imprimir("------");
        usarSable(accion);
        this.consola.imprimirConSaltoLinea("  /\\");
    }

    public void preguntar(){
        this.consola.imprimirConSaltoLinea("  ? ");
    }

    public void despedirse(){
        this.consola.imprimirConSaltoLinea("Que la fuerza te acompa\u00f1e");
    }

    public void usarSable(int accion){
        this.sable.render(accion);
    }
}
