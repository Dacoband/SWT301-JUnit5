package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class dem01es1 {
    /**
     * 
     */
    @Test
    public void testAdd1() {
        Demo demo1 = new Demo();
        assertEquals(8.0, demo1.add(5.0, 3.0));
    }

    @Test
    public void testAdd2() {
        Demo demo1 = new Demo();
        assertEquals(7.0, demo1.add(4.0, 3.0));
    }

}
