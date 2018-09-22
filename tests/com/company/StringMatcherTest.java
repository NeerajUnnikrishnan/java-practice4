package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {

    StringMatcher matcher;

    @Before
    public void setUp() throws Exception {

        matcher = new StringMatcher();

    }

    @After
    public void tearDown() throws Exception {

        matcher = null;

    }

    @Test
    public void matchString() {

        assertEquals(10, matcher.matchString("This is a sample string", "sample"));
    }
}