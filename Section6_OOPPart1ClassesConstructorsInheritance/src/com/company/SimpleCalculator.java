package com.company;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    private double getAdditionResult(){
        return (this.firstNumber + this.secondNumber);
    }
    private double getMultiplicationResult(){
        return (this.firstNumber * this.secondNumber);
    }
    private double getDivisionResult(){
        return (this.firstNumber / this.secondNumber);
    }

}
