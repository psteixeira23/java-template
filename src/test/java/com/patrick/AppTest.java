package com.patrick;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void shouldGreetProperly() {
        String result = App.greet("Patrick");
        assertEquals("Hello, Patrick!", result);
    }

    @Test
    void shouldRunMainWithoutErrors() {
        App.main(new String[] {});
    }

    @Test
    void shouldGreetDefaultProperly() {
        String result = App.greetDefault();
        assertEquals("Hello, World!", result);
    }

}
