package org.ingue;

import org.ingue.exception.ZeroDivException;

public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double sub(double first, double second) {
        return first - second;
    }

    public double mul(double first, double second) {
        return first * second;
    }

    public double div(double first, double second) {
        if (second == 0) {
            throw new ZeroDivException();
        }

        return first / second;
    }
}
