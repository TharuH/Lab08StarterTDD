package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary), "Calgary should be removed");
        assertTrue(list.hasCity(edmonton), "Other cities should remain");
    }
    //test countCities
    @Test
    public void countCitiesZero() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities(), "Empty list should count as 0");
    }

    @Test
    public void countCitiesAdd() {
        CustomList list = new CustomList();
        list.addCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Edmonton", "AB"));
        assertEquals(2, list.countCities());
    }

}

