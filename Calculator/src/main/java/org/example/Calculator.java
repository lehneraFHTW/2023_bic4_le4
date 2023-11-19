package org.example;

public class Calculator {

    public long add(int firstAddend, int secondAddend ){
        return firstAddend + secondAddend;
    }

    public long multiply(int firstFactor, int secondFactor){
        return firstFactor * secondFactor;
    }

    public float divide(int dividend, int divisor) {
        if(divisor == 0){
            throw new IllegalArgumentException("Division by Zero is forbidden");
        }else{
            return (float)dividend / (float)divisor;
        }
    }
}
