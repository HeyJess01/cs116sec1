package org.example;

public class Cylinder extends CircleSolid {
    private double height;

    Cylinder() {
        super(5.0);
        height = 5.0;
    }
    Cylinder(double radius, double heightInput) {
        super(radius);
        if (heightInput > 0){
            height = heightInput;
        }
    }

    public void setHeight(double heightInput) {
        if (heightInput > 0){
            height = heightInput;
        } else {
            height = 5.0;
        }
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return (Math.PI * Math.pow(getRadius(), 2) * getHeight());
    }
    public String toString(){
        return (super.toString() + "\nCylinder: Volume = " + getVolume());
    }
}
