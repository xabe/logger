package com.xabe.logger.log4j;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class Log4jTest {

    @Test
    public void shouldPrintLogger() throws Exception {
        MatcherAssert.assertThat(new Log4j(), Matchers.is(Matchers.notNullValue()));
    }

}