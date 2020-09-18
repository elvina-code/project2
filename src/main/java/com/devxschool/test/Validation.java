package com.devxschool.test;

public class Validation {

    public static void checkIfImplemented(Number result){
        if(result.equals(0) || result.equals(0.0)){
            throw new RuntimeException("Result cannot be " + result.toString());
        }
    }

    public static void testPerimeter(int l, int w, int aP){
        checkIfImplemented(aP);
        int eP = 2 * (l + w);
        if(eP != aP){
            throw new ArithmeticException("Check your function! \nactual: " + aP + "\nexpected: " + eP);
        }
        System.out.println("-- Success! Your function is correct");
    }

    public static void testBonus(int s, double aB, double aTS) {
        checkIfImplemented(aTS);
        double eB = s * 0.1;
        if(eB != aB){
            throw new ArithmeticException("Check your function! \nactual: " + aB + "\nexpected: " + eB);
        }

        double eTS = s + eB;
        if(eTS != aTS){
            throw new ArithmeticException("Check your function! \nactual: " + aTS + "\nexpected: " + eTS);
        }

        System.out.println("-- Success! Your function is correct");
    }

    public static void testMultiplicationBy9(int number, int myResult) {
        checkIfImplemented(myResult);
        int eR = number * 9;
        if(eR != myResult){
            throw new ArithmeticException("Check your function! \nactual: " + eR + "\nexpected: " + myResult);
        }
        System.out.println("-- Success! Your function is correct");
    }

    public static void testMultiplicationBy11(int twoDigitNumber, int result) {
        checkIfImplemented(result);
        int eR = twoDigitNumber * 11;
        if(eR != result){
            throw new ArithmeticException("Check your function! \ractual: " + eR + "\rexpected: " + result);
        }
        System.out.println("-- Success! Your function is correct");
    }

    public static void testProfit(double jake, double phil, double ryan, double tom, double bill, double profit) {
        checkIfImplemented(profit);
        double eP = (jake+phil+ryan+tom+bill)/5;
        if(eP != profit){
            throw new ArithmeticException("Check your function! \nactual: " + eP + "\nexpected: " + profit);
        }
        System.out.println("-- Success! Your function is correct");
    }
}
