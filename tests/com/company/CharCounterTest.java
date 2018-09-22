package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCounterTest {

    CharCounter counter;

    @Before
    public void setUp() throws Exception {

        counter = new CharCounter();

    }

    @After
    public void tearDown() throws Exception {

        counter = null;

    }

    @Test
    public void countChar() {

        assertEquals(3,counter.countChar("Indiaaa",'a'));

        assertEquals(1,counter.countChar("Sample String", 'a'));
    }
}