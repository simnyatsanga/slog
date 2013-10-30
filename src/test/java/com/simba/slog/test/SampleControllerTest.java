package com.simba.slog.test;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SampleControllerTest {
    @Test
    public void testName() {
        assertThat(1, is(1));
    }
}