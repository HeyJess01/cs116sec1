package org.example;

public class User {
    private static int IDCount = 0;
    private int ID;

    public User() {
        this.ID = this.IDCount++;
    }

    public int getID() {
        return ID;
    }
}
