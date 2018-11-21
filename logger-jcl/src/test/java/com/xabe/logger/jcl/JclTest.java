package com.xabe.logger.jcl;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class JclTest {

    @Test
    public void shouldPrintLogger() throws Exception {
        MatcherAssert.assertThat(new Jcl(), Matchers.is(Matchers.notNullValue()));
    }

}