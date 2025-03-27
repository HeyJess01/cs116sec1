package org.example;

public abstract class CircleSolid {
    private double radius;

    CircleSolid() {
        radius = 5.0;
    }

    CircleSolid(double radiusInput) {
        if (radiusInput > 0) {
            radius = radiusInput;
        } else {
            radius = 5.0;
        }
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            radius = 5.0;
        }
    }
    public double getRadius() {
        return radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return ("CircleSolid: Radius = " + radius);
    }

    public abstract double getVolume();

}
