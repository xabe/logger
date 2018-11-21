package com.xabe.logger.jul;

import java.util.logging.Logger;

public class Jul {

    public Jul() {
        Logger.getLogger( getClass().getName() ).info("Soy Java util Logging");
    }
}
