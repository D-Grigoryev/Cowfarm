package com.example.cowfarm;

import java.util.ArrayList;

public class Cows {

    private String name;
    private int age;
    private int id;
    private String farm;
    private String vaccinations;
    private String illness;
    ArrayList <Cows> cowslist = new ArrayList<>();

      public Cows() {

    }

    public Cows(int id, String name, int age,  String farm, String vaccinations, String illness) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.farm = farm;
        this.vaccinations = vaccinations;
        this.illness = illness;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getFarm() {
        return farm;
    }

    public String getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public void setNewcow(int id, String name, int age,
                          String farm, String illness, String vaccinations) {
        cowslist.add(new Cows(id, name, age, farm, illness, vaccinations));
    }


    }


