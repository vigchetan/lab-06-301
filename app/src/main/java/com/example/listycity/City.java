package com.example.listycity;

/**
 * This is a class that defines a City object.
 * A City has a name and a province it belongs to.
 * Cities are comparable by their city name in lexicographic order.
 */
public class City implements Comparable<City> {

    /** The name of the city. */
    private String city;

    /** The name of the province the city belongs to. */
    private String province;

    /**
     * Constructs a new City with the given city name and province name.
     * @param city     The name of the city.
     * @param province The name of the province.
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     * @return The city name as a String.
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province.
     * @return The province name as a String.
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another city by their city names lexicographically.
     * @param o The city to compare to.
     * @return A negative integer, zero, or a positive integer as this city's
     *         name is less than, equal to, or greater than the other city's name.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Checks whether this city is equal to another object.
     * Two cities are equal if they have the same city name and province name.
     * @param o The object to compare with.
     * @return true if equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return this.city.equals(city1.city) && this.province.equals(city1.province);
    }

    /**
     * Returns a hash code for this city based on its name and province.
     * @return The hash code of this city.
     */
    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}