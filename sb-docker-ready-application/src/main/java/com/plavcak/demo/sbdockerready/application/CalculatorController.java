package com.plavcak.demo.sbdockerready.application;

import com.plavcak.demo.sbdockerready.core.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @PostMapping
    public ResponseEntity<Output> sum(@RequestBody Input input) {
        return ResponseEntity.ok(new Output(calculator.sum(input.integers)));
    }

    public static class Input {
        private int[] integers;

        public Input setIntegers(int[] integers) {
            this.integers = integers;
            return this;
        }

        public int[] getIntegers() {
            return integers;
        }
    }

    public static class Output {

        private int sum;

        Output(int sum) {
            this.sum = sum;
        }

        public Output setSum(int sum) {
            this.sum = sum;
            return this;
        }

        public int getSum() {
            return sum;
        }
    }
}
