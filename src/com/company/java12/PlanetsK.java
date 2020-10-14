package com.company.java12;

public enum PlanetsK {

    MERCURY(3.3, 2439.7),
    VENUS(48.7, 6052.8),
    EARTH(59.8, 6370),
    MARS(6.4, 3389.5),
    JUPITER(18986, 71492),
    SATURN(5684.6, 60268),
    URANUS(868, 25559),
    NEPTUNE(1024.3, 24764);

    private double mass, radius;
    PlanetsK(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}