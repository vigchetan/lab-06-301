package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects.
 * It provides methods to add, delete, search, and retrieve cities.
 */
public class CityList {

    /** The internal list that stores all city objects. */
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not already exist.
     * @param city This is a candidate city to add.
     * @throws IllegalArgumentException if the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities, ordered by city name.
     * @return Return the sorted list of cities.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a given city exists in the list.
     * @param city The city to check for in the list.
     * @return true if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if present.
     * If the city is not present, throws an exception.
     * @param city The city to remove from the list.
     * @throws IllegalArgumentException if the city is not found in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities currently in the list.
     * @return The count of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }
}