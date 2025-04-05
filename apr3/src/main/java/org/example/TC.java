package org.example;

public class TC {
    public static void main(String[] args) {
        int N = 300;
        for (int i = 0; i < N; i++) { // 1 + N+1, N+1
            if (true) break;
            for (int j = 0; j < N; j++) {
                System.out.println("burn it up!!");
            }
        }
    }
}
// Big O of O(1), no matter what the value of N is, it will always print once. (with break)
// For loop with N, O(N) as single for loop