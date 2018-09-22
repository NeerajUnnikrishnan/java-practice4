package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharChangerTest {

    CharChanger changer;

    @Before
    public void setUp() throws Exception {

        changer = new CharChanger();

    }

    @After
    public void tearDown() throws Exception {

        changer = null;

    }

    @Test
    public void changeChar() {

        assertEquals("faity fry", changer.changeChar("daily dry"));

        assertEquals("fuggefy gitty", changer.changeChar("fuggedy gilly"));

        assertEquals("okey fokey", changer.changeChar("okey dokey"));


    }
}