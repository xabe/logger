package com.xabe.logger.jcl;

import org.apache.commons.logging.LogFactory;

public class Jcl {

    public Jcl() {
        LogFactory.getLog(getClass()).info("Soy Java commons logging");
    }
}
