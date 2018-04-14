package com.tcliffe.dc7.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nation {

    private String name;

    @Id
    @GeneratedValue
    private int id;

    private String governmentType;

    private String leader;

    private int totalProduction;

    private int totalPopulation;

    private int totalManpower;

    private com.tcliffe.dc7.models.City cities;

    private Resource resources;

    private com.tcliffe.dc7.models.Territory territories;

    private com.tcliffe.dc7.models.Unit units;

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

    public com.tcliffe.dc7.models.City getCities() {
        return cities;
    }

    public Resource getResources() {
        return resources;
    }

    public com.tcliffe.dc7.models.Territory getTerritories() {
        return territories;
    }

    public com.tcliffe.dc7.models.Unit getUnits() {
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

    public void setCities(com.tcliffe.dc7.models.City cities) {
        this.cities = cities;
    }

    public void setResources(Resource resources) {
        this.resources = resources;
    }

    public void setTerritories(com.tcliffe.dc7.models.Territory territories) {
        this.territories = territories;
    }

    public void setUnits(com.tcliffe.dc7.models.Unit units) {
        this.units = units;
    }
}
