package com.cedaniel200.solid.game.model.weapons.utilities;

import com.cedaniel200.solid.game.controller.interfaces.factories.SableFactory;
import com.cedaniel200.solid.game.model.weapons.DefaultSable;
import com.cedaniel200.solid.game.controller.interfaces.Sable;
import com.cedaniel200.solid.game.model.weapons.DiamondSable;

public class DefaultSableFactory implements SableFactory {
    private static final String TIPO_SABLE_DIAMANTE = "diamante";

    public Sable crearSable(){
        if(TIPO_SABLE_DIAMANTE.equalsIgnoreCase(System.getProperty("SABLE", "")))
            return new DiamondSable();
        return new DefaultSable();
    }
}
