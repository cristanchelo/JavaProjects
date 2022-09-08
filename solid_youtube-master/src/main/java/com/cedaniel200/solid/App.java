package com.cedaniel200.solid;

import com.cedaniel200.solid.game.controller.ControladorJuego;
import com.cedaniel200.solid.game.controller.interfaces.factories.JediFactory;
import com.cedaniel200.solid.game.model.characters.utilities.DefaultJediFactory;
import com.cedaniel200.solid.game.model.weapons.utilities.DefaultSableFactory;

public class App {
    public static void main(String[] args) {
        JediFactory jediFactory = new DefaultJediFactory();
        jediFactory.setSableFactory(new DefaultSableFactory());
        ControladorJuego juego = new ControladorJuego(jediFactory);
        juego.iniciar();
    }


}