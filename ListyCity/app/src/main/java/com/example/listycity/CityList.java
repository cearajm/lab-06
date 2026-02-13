package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * this is a class that keeps a list of city objects
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city is present in the list
     * @param city
     * This is the target city to check for
     */
    public void hasCity(City city) {

    }

    /**
     * This deletes a city from the list if it is present in the list
     * @param city
     */
    public void delete(City city) {

    }

    /**
     * this counts how many cities are in the list
     * @return
     * returns num of cities in list
     */
    public int countCities() {
        return cities.size();
    }

}
