package com.xabe.logger.slf4j;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class Slf4jTest {


    @org.junit.jupiter.api.Test
    public void shouldPrintLogger() throws Exception {
        MatcherAssert.assertThat(new Slf4j(), Matchers.is(Matchers.notNullValue()));
    }

}