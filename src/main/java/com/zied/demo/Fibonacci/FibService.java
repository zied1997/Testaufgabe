package com.zied.demo.Fibonacci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FibService {

    private final FibonacciNumber fibNumber;

    @Autowired
    public FibService(FibonacciNumber fibNumber) {
        this.fibNumber = fibNumber;
    }

    public int getNumber(int rank){
        return fibNumber.nthFibonacciNumber(rank);
    }
}