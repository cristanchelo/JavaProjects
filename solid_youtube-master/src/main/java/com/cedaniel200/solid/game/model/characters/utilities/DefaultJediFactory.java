package com.cedaniel200.solid.game.model.characters.utilities;

import com.cedaniel200.solid.game.controller.interfaces.Sable;
import com.cedaniel200.solid.game.controller.interfaces.factories.JediFactory;
import com.cedaniel200.solid.game.controller.interfaces.factories.SableFactory;
import com.cedaniel200.solid.game.controller.interfaces.Jedi;
import com.cedaniel200.solid.game.model.characters.DefaultJedi;
import com.cedaniel200.solid.game.model.characters.JediYoda;

public class DefaultJediFactory implements JediFactory {

    private static final String TIPO_JEDI_YODA = "yoda";
    private SableFactory sableFactory;

    @Override
    public void setSableFactory(SableFactory sableFactory) {
        this.sableFactory = sableFactory;
    }

    public Jedi crearJedi(){
        this.validarSableFactory();
        Sable sable = sableFactory.crearSable();
        if(TIPO_JEDI_YODA.equalsIgnoreCase(System.getProperty("JEDI", "")))
           return new JediYoda(sable);
        return new DefaultJedi(sable);
    }

    private void validarSableFactory(){
        if(this.sableFactory == null)
            throw new IllegalStateException("No existe un sableFactory");
    }
}
