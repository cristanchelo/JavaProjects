package com.cedaniel200.solid.game.controller.interfaces.factories;

import com.cedaniel200.solid.game.controller.interfaces.Jedi;

public interface JediFactory {
    void setSableFactory(SableFactory sableFactory);
    Jedi crearJedi();
}
