package com.cedaniel200.solid.game.controller;

import com.cedaniel200.solid.game.controller.interfaces.Jedi;
import com.cedaniel200.solid.game.controller.interfaces.factories.JediFactory;
import static com.cedaniel200.solid.game.options.OpcionesMenu.imprimirOpcionesMenuExceptoIndefinido;

public class ControladorJuego {

    private boolean iniciado;
    private final ControladorConsola consola;
    private final Jedi jedi;
    private final JediFactory jediFactory;

    public ControladorJuego(JediFactory jediFactory){
        this.jediFactory = jediFactory;
        this.consola = new ControladorConsola();
        this.jedi = jediFactory.crearJedi();
    }

    public void iniciar(){
        this.iniciado = true;
        ejecutar();
    }

    public void ejecutar() {

        int opcion;
        this.consola.limpiar();
        imprimirOpcionesMenuExceptoIndefinido(this.consola);
        do {
            opcion = this.consola.getEntrada();
            this.consola.limpiar();
            imprimirOpcionesMenuExceptoIndefinido(this.consola);
            if (opcion == 0)
                this.finalizar();
            this.jedi.render(opcion);
        } while (iniciado);

    }

    public void finalizar(){
        this.iniciado = false;
    }
}
