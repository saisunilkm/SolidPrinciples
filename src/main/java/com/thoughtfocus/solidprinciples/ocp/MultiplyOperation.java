package com.thoughtfocus.solidprinciples.ocp;

public class MultiplyOperation implements ArithmeticOperations {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
