package com.xabe.logger.jul;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class JulTest {

    @Test
    public void shouldPrintLogger() throws Exception {
        MatcherAssert.assertThat(new Jul(), Matchers.is(Matchers.notNullValue()));
    }

}