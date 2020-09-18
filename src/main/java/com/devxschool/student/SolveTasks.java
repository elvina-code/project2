package com.devxschool.student;

import com.devxschool.test.Validation;



public class SolveTasks {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("TASK #1");
        /**
         *
         * Create a service to calculate a perimeter of a rectangle.
         * Tasks:
         * 1) have two inputs to your system
         * 2) calculate perimeter
         * 3) print out your result
         *
         * Example output:
         *  Enter your length:
         *  2
         *  Enter your width:
         *  1
         *  Your perimeter is equal to 6.
         *
         */

        //TODO implement your code here...
        int length = 4;
        int width = 6;
        int perimeter =(length+width)*2 ;
        System.out.println("perimiter is" +perimeter);


        Validation.testPerimeter(length, width, perimeter);
        System.out.println("===================================");
        System.out.println("TASK #2");
        /**
         *
         * Write a program, that calculates 10% bonus for a salary
         * Tasks:
         * 1) have a salary input to your system
         * 2) calculate 10% of a salary
         * 3) print out total amount of salary and bonus
         *
         * Example output:
         *  Enter your salary:
         *  100000
         *  Your bonus is 10000
         *  Your total salary is 110000
         */

        //TODO implement your code here...

        int salary = 100000;
        double bonus =(salary * 0.1);
        double totalSalary =salary + bonus;
        System.out.println(totalSalary);


        Validation.testBonus(salary, bonus, totalSalary);
        System.out.println("***********************************");
        System.out.println("TASK #3");
        /**
         *
         *  Write a program that calculates a multiplication by 9 WITHOUT multiplying
         *  Tasks:
         *  1) have a number input
         *  2) add 0 to the end of the number and save it
         *  3) subtract original number from the saved number
         *  4) print out the result
         *
         *  Example output:
         *   Enter any number I will calculate a multiplication by 9 without multiplying:
         *   754
         *   The result is 6786
         *
         */

        //TODO implement your code here...

        int number = 754;
        int numberWith0 = number * 10;
        int myResult = numberWith0 - number;
        System.out.println("Enter any number I will calculate a multiplication by 9 without multiplying:");
        System.out.println("The result is:" + myResult);











        System.out.println(number + " * 9 = " + myResult);
        Validation.testMultiplicationBy9(number, myResult);
        System.out.println("***********************************");
        System.out.println("TASK #4");
        /**
         *
         *  Write a program that calculates multiplication of a 2 digit number by 11 WITHOUT multiplying
         *  Tasks:
         *  1) have a "2 digit number" scanner input
         *  2) get first digit of a number and save
         *  3) get second digit of a number and save
         *  4) sum of first and second digit and save
         *  see Hint for steps 5-6
         *  5) if the sum is a two digit then
         *  6) increment first digit by 1 and save second digit to the sum
         *  7) append first digit, append sum and append second digit (ex: firstDigit = 6
         *  8) print out the result.
         *  HINT:
         *  on steps 5-6 use if statement
         *  syntax:
         *  if ( sum > 9 ) { firstDigit++; sum = sum % 10; }
         *
         *
         *  Example output:
         *   Enter a two digit number I will calculate a multiplication by 11 without multiplying:
         *   56
         *   The result is 616
         *
         */

        //TODO implement your code here...

        int twoDigitNumber = 56;
        int firstDigit = twoDigitNumber / 10;
        int secondDigit = twoDigitNumber % 10;
        int sum = firstDigit + secondDigit;
        int secondDigitOfSum = 0;
        int result = 0;
        if(sum >= 10){ // >9
               firstDigit++;
               secondDigitOfSum = sum % 10; // or sum = sum %10
               sum = secondDigitOfSum;

        }
             result = (firstDigit * 100) + (sum * 10) + (secondDigit * 1); // append 6,7,8 -->678
        System.out.println(result);


















        System.out.println(twoDigitNumber + " * 11 = " + myResult);
        Validation.testMultiplicationBy11(twoDigitNumber, result);
        System.out.println("***********************************");
        System.out.println("TASK #5");
        /**
         *
         * 5 street performers are singing every day.
         * At the end of the day they collect all money to one bucket and divide their profit equally.
         * For more accuracy and time efficiency they need a program to get a daily profit.
         * Help them out!
         *
         * 1) Have 5 inputs
         * 2) Calculate profit for each person
         * 3) Print out the result
         *
         * Output example:
         *  Jake's: 100.25
         *  Phil's: 88.50
         *  Ryan's: 99.00
         *  Tom's: 69.00
         *  Bill's: 123.45
         *  Each performer gets $96.04
         */

        //TODO implement your code here...

        double jake = 100.25;
        double phil = 88.5;
        double ryan = 99.00;
        double tom = 69.00;
        double bill = 123.45;
        double eachDailyProfit = ((jake+ phil + ryan + tom + bill)/5);
        System.out.println(eachDailyProfit);










        Validation.testProfit(jake, phil, ryan, tom, bill, eachDailyProfit);
        System.out.println("--- The end ---");
    }
}