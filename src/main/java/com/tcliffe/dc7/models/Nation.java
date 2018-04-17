package com.tcliffe.dc7.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "nation")
public class Nation {

    @NotNull
    private String name;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String governmentType;

    @NotNull
    private String leader;

    @NotNull
    private int totalProduction;

    @NotNull
    private int totalPopulation;

    @NotNull
    private int totalManpower;

    @OneToMany
    @JoinColumn (name = "city_id")
    private List<City> cities;

    @OneToMany
    private List<Resource> resources;

    @OneToMany
    private List<Territory> territories;

    @OneToMany
    private List<Unit> units;

    public Nation(@NotNull String name, int id, @NotNull String governmentType, @NotNull String leader, @NotNull int totalProduction, @NotNull int totalPopulation, @NotNull int totalManpower, List<City> cities, List<Resource> resources, List<Territory> territories, List<Unit> units) {
        this.name = name;
        this.id = id;
        this.governmentType = governmentType;
        this.leader = leader;
        this.totalProduction = totalProduction;
        this.totalPopulation = totalPopulation;
        this.totalManpower = totalManpower;
        this.cities = cities;
        this.resources = resources;
        this.territories = territories;
        this.units = units;
    }

    @NotNull
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

    public List<City> getCities() {
        return cities ;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public List<Territory> getTerritories() {
        return territories;
    }

    public List<Unit> getUnits() {
        return units;
    }

    @NotNull
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
        this.cities.add(cities);
    }

    public void setResources(Resource resources) {
        this.resources.add(resources);
    }

    public void setTerritories(Territory territories) {
        this.territories.add(territories);
    }

    public void setUnits(Unit units) {
        this.units.add(units);
    }
}
