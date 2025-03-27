package org.example;

public class Sphere extends CircleSolid{

    Sphere(){
        super();
    }

    Sphere (double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return ((4.0/3.0) * Math.PI * Math.pow(getRadius(), 3));
    }

    public String toString(){
        return (super.toString() + "\nSphere: Volume = " + getVolume());
    }
}
