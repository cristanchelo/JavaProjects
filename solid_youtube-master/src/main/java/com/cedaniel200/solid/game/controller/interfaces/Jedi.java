package com.cedaniel200.solid.game.controller.interfaces;

import com.cedaniel200.solid.game.controller.interfaces.Renderizable;

public interface Jedi extends Renderizable {

    void renderSable(int accion);
    void preguntar();
    void despedirse();
    void usarSable(int accion);
}
