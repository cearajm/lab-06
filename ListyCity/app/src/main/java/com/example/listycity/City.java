package com.example.listycity;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * this is a class that defines a City
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName() {
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}

