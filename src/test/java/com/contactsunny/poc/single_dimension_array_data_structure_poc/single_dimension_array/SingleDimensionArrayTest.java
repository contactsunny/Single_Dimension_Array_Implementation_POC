package com.contactsunny.poc.single_dimension_array_data_structure_poc.single_dimension_array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleDimensionArrayTest {

    private SingleDimensionArray<Integer> singleDimensionArray;

    @Before
    public void before() {
        singleDimensionArray = new SingleDimensionArray<>(Integer.class, 10);
    }

    @Test
    public void test_add_shouldAddValue() {
        singleDimensionArray.add(0, 10);
        assertEquals(10, singleDimensionArray.get(0), 0);

        singleDimensionArray.add(1, 20);
        assertEquals(20, singleDimensionArray.get(1), 0);

        singleDimensionArray.add(3, 30);
        assertEquals(30, singleDimensionArray.get(3), 0);
    }

    @Test
    public void test_get_shouldBeNullIfNotInitialized() {
        assertNull(singleDimensionArray.get(0));
    }

    @Test
    public void test_get_shouldThrowIndexOutOfBoundsForInvalidIndex() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            singleDimensionArray.get(11);
        });
    }

    @Test
    public void test_add_shouldThrowIndexOutOfBoundsForInvalidIndex() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            singleDimensionArray.add(11, 100);
        });
    }

    @Test
    public void test_add_shouldOverrideValueInCell() {
        singleDimensionArray.add(0, 10);
        assertEquals(10, singleDimensionArray.get(0), 0);

        singleDimensionArray.add(0, 25);
        assertEquals(25, singleDimensionArray.get(0), 0);
    }


}
