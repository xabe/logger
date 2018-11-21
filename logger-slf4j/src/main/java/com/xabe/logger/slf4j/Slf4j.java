package com.xabe.logger.slf4j;

import com.xabe.logger.jcl.Jcl;
import com.xabe.logger.jul.Jul;
import com.xabe.logger.log4j.Log4j;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Level;
import java.util.logging.LogManager;

public class Slf4j {

    public Slf4j() {
        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        java.util.logging.Logger.getLogger("global").setLevel(Level.ALL);
        LoggerFactory.getLogger(getClass()).info("Soy Slf4j");
        new Log4j();
        new Jcl();
        new Jul();
    }
}
