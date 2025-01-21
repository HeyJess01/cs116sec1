package org.jessa;

public class Jan16 {
    public static void main(String[] args) {
        float m = 23;
//        m = 23d type mismatch
        float d;
        d = (float) 34.1 * m;
        System.out.println(m);
        System.out.println(d);

//        potentially losing information = EXPLICIT casting
//        not losing any information = IMPLICIT casting

    }
}
