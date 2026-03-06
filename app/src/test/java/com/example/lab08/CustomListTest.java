package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {

        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);

        // this should fail because hasCity() doesn't exist yet
        // failing test for hasCity
        assertTrue(list.hasCity(calgary));
    }

}