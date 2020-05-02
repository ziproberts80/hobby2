
package planetapp;

import java.util.logging.Logger;


public class Planet {
    
     private String planetName;
     private String diameter;
     private String mass;
     private String moons;
     private String orbitDistance;
     private String orbitPeriod;
     private String surfaceTemperature;
     private String firstRecord;
     private String recordedBy;

    public String getDiameter() {
        return diameter;
    }

    public String getMass() {
        return mass;
    }

    public String getMoons() {
        return moons;
    }

    public String getOrbitDistance() {
        return orbitDistance;
    }

    public String getOrbitPeriod() {
        return orbitPeriod;
    }

    public String getSurfaceTemperature() {
        return surfaceTemperature;
    }

    public String getFirstRecord() {
        return firstRecord;
    }

    public String getRecordedBy() {
        return recordedBy;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public Planet(String planetName, String diameter, String mass, String moons, String orbitDistance, String orbitPeriod, String surfaceTemperature, String firstRecord, String recordedBy) {
        this.planetName = planetName;
        this.diameter = diameter;
        this.moons = moons;
        this.orbitDistance = orbitDistance;
        this.orbitPeriod = orbitPeriod;
        this.surfaceTemperature = surfaceTemperature;
        this.firstRecord = firstRecord;
        this.recordedBy = recordedBy;
        this.mass = mass;
    }

    public Planet() {
    }

     
     
     
     
     
     
     
     
     
}
