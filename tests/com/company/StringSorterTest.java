package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.SortedMap;

import static org.junit.Assert.*;

public class StringSorterTest {

    StringSorter sorter;

    @Before
    public void setUp() throws Exception {

        sorter = new StringSorter();

    }

    @After
    public void tearDown() throws Exception {

        sorter = null;

    }

    @Test
    public void sort() {

        String[] actualString = {"hello", "this", "is", "harambe"};
        String[] expectedString = { "harambe","hello","is", "this"};
        assertEquals(expectedString,sorter.sort(actualString));
    }
}