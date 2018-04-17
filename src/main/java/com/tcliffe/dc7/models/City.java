package com.tcliffe.dc7.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "city")
public class City {
    private String name;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private int industrialTier;

    @NotNull
    private int residentialTier;

    @NotNull
    private int productionBonus;

    @NotNull
    private int populationBonus;

    @ManyToOne
    @JoinColumn(name = "city_id")
    public Nation nation;

    public City(String name, int id, int industrialTier, int residentialTier) {
        this.name = name;
        this.id = id;
        this.industrialTier = industrialTier;
        this.residentialTier = residentialTier;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getIndustrialTier() {
        return industrialTier;
    }

    public int getResidentialTier() {
        return residentialTier;
    }

    public int getProductionBonus() {
        return productionBonus;
    }

    public int getPopulationBonus() {
        return populationBonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndustrialTier(int industrialTier) {
        this.industrialTier = industrialTier;
    }

    public void setResidentialTier(int residentialTier) {
        this.residentialTier = residentialTier;
    }

    public void setProductionBonus(int productionBonus) {
        this.productionBonus = productionBonus;
    }

    public void setPopulationBonus(int populationBonus) {
        this.populationBonus = populationBonus;
    }
}
