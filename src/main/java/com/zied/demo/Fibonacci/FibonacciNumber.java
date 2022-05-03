package com.zied.demo.Fibonacci;

import org.springframework.stereotype.Component;
@Component
public class FibonacciNumber {

    private int DB =55;

    public int nthFibonacciNumber(int n) {
        double phi = (1 + Math.sqrt(5))/2;
        int nthTerm = (int) ((Math.pow(phi, n) - Math.pow(-phi, -n))/Math.sqrt(5));
        return nthTerm;
    }
}