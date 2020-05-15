package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements ISpin, IDataStore {

    private String name;
    private int capacity;
    private ArrayList<Object> contents;
    private String discType;
    private int minRPM;
    private int maxRPM;

    public BaseDisc(int minRPM, int maxRPM) {
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
    }

    public String ToString() {
        return this.name;
    }

    @Override
    public void Spin() {
    System.out.println("A " + this.ToString() + " spins at a rate of " + minRPM + " - " + maxRPM + " rpm.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Object> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Object> contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
