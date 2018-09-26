package com.plavcak.demo.sbdockerready.core;

import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class CalculatorImpl implements Calculator {

    public int sum(int... vars) {
        return IntStream.of(vars).sum();
    }
}
