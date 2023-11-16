package org.example;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if(secondNumber == 0 ){
            return 0;
        }
        return firstNumber / secondNumber;
    }

    /**
     *
     *
     * TEST EXAMPLE
     *
     * TEST CODE:
     *
     * SimpleCalculator calculator = new SimpleCalculator();
     * calculator.setFirstNumber(5.0);
     * calculator.setSecondNumber(4);
     * System.out.println("add= " + calculator.getAdditionResult());
     * System.out.println("subtract= " + calculator.getSubtractionResult());
     * calculator.setFirstNumber(5.25);
     * calculator.setSecondNumber(0);
     * System.out.println("multiply= " + calculator.getMultiplicationResult());
     * System.out.println("divide= " + calculator.getDivisionResult());
     * OUTPUT
     *
     * add= 9.0
     * subtract= 1.0
     * multiply= 0.0
     * divide= 0.0
     * TIPS:
     *
     * add= 9.0 is printed because 5.0 + 4 is 9.0
     *
     * subtract= 1.0 is printed because 5.0 - 4 is 1.0
     *
     * multiply= 0.0 is printed because 5.25 * 0 is 0.0
     *
     * divide= 0.0 is printed because secondNumber is set to 0
     *
     *
     *
     * NOTE: All ​methods should be defined as public NOT public static.
     *
     * NOTE: In total, you have to write 8 methods.
     *
     * NOTE: Do not add the main method to the solution code.
     */

}
