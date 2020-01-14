package com.jarnoharno.library;

import org.apache.commons.math3.util.ContinuedFraction;

public class Constants {

    public static double pi() {
        return new ContinuedFraction() {
            @Override
            public double getA(int n, double x) {
                return (n == 0) ? 3.0 : 6.0;
            }

            @Override
            public double getB(int n, double x) {
                double y = (2.0 * n) - 1.0;
                return y * y;
            }
        }.evaluate(0);
    }
}
