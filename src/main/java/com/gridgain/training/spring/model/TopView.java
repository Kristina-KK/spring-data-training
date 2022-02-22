package com.gridgain.training.spring.model;

public class TopView {

    private String name;

    private int population;

    private String countryName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "TopView{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
