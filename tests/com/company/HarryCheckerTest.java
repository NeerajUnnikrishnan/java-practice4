package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryCheckerTest {

    HarryChecker checker;

    @Before
    public void setUp() throws Exception {

        checker = new HarryChecker();

    }

    @After
    public void tearDown() throws Exception {

        checker = null;

    }

    @Test
    public void checkHarry() {

        assertTrue(checker.checkHarry("Harry is here"));
        assertFalse(checker.checkHarry("No one is here, get out"));
    }
}