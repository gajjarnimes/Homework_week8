package week_8_Javawork;

public class SimpleCalculator {
    //instance variables
    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add=" + calculator.getAdditionResult());
        System.out.println("substract=" + calculator.getSubstraction());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply=" + calculator.getMultiplication());
        System.out.println("divide=" + calculator.getDivisionResult());
    }

    // instance methods:
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double result = (firstNumber + secondNumber);
        System.out.println(result);
        return result;
    }

    public double getSubstraction() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplication() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;}
                return (firstNumber / secondNumber);
            }
        }


















