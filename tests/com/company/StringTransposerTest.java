package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposerTest {

    StringTransposer transposer;

    @Before
    public void setUp() throws Exception {

        transposer = new StringTransposer();

    }

    @After
    public void tearDown() throws Exception {

        transposer = null;

    }

    @Test
    public void tranposeString() {

        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", transposer.tranposeString("a quick brown fox jumps over the lazy dog"));
    }
}