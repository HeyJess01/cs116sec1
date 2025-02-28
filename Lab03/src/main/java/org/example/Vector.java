package main.java.org.example;

public class Vector {
    private int EndX = 0;
    private int EndY = 0;

    public int getStartX() {
        return 0;
    }

    public int getStartY() {
        return 0;
    }

    public int getEndX() {
        return EndX;
    }

    public void setEndX(int endX) {
        EndX = endX;
    }

    public int getEndY() {
        return EndY;
    }

    public void setEndY(int endY) {
        EndY = endY;
    }

    public double getLength(){
        return Math.sqrt(Math.pow(EndX, 2) + Math.pow(EndY, 2));
    }
}
