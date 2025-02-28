package main.java.org.example;

public class BoundVector {
    private int StartX;
    private int EndX;
    private int StartY;
    private int EndY;

    public BoundVector(){
        StartX = 0;
        StartY = 0;
        EndX = 1;
        EndY = 1;
    }
    public BoundVector(int endX, int endY){
        Vector vector = new Vector();
        vector.setEndX(endX);
        vector.setEndY(endY);
    }
    public BoundVector(int startX, int startY, int endX, int endY){
        StartX = startX;
        StartY = startY;
        EndX = endX;
        EndY = endY;
    }
}
