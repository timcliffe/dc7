package org.launchcode.models;

import javax.persistence.Entity;

@Entity
public class Nation {

    private String name;

    private int id;

    private String governmentType;

    private String leader;

    private int totalProduction;

    private int totalPopulation;

    private int totalManpower;

    private City cities;

    private Resource resources;

    private Territory territories;

    private Unit units;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGovernmentType() {
        return governmentType;
    }

    public String getLeader() {
        return leader;
    }

    public int getTotalProduction() {
        return totalProduction;
    }

    public int getTotalPopulation() {
        return totalPopulation;
    }

    public int getTotalManpower() {
        return totalManpower;
    }

    public City getCities() {
        return cities;
    }

    public Resource getResources() {
        return resources;
    }

    public Territory getTerritories() {
        return territories;
    }

    public Unit getUnits() {
        return units;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGovernmentType(String governmentType) {
        this.governmentType = governmentType;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void setTotalProduction(int totalProduction) {
        this.totalProduction = totalProduction;
    }

    public void setTotalPopulation(int totalPopulation) {
        this.totalPopulation = totalPopulation;
    }

    public void setTotalManpower(int totalManpower) {
        this.totalManpower = totalManpower;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

    public void setResources(Resource resources) {
        this.resources = resources;
    }

    public void setTerritories(Territory territories) {
        this.territories = territories;
    }

    public void setUnits(Unit units) {
        this.units = units;
    }
}
