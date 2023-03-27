package org.fasttrackit;

public class App
{
    public static void main( String[] args )
    {
        double sum = MathOps.calculateSum(3, 5);
        System.out.println("Sum of the two numbers: " + sum);

        double sum1 = MathOps.calculateSum(3,6, 7);
        System.out.println("Sum of the three numbers: " + sum1);

        double subtraction = MathOps.calculateSubtraction(4, 10);
        System.out.println("Subtraction of the two numbers: " + subtraction);

        double multiplication = MathOps.calculateMultiplication(4, 10);
        System.out.println("Multiplication of the two numbers: " + multiplication);

        double division = MathOps.calculateDivision(4, 10);
        System.out.println("Division of the two numbers: " + division);

        MathOps1 ops1 = new MathOps1();

        double sum2 = ops1.calculateSum(2,5);
        System.out.println("Sum of the two numbers from MathOps1: " + sum2);

        double sum3 = ops1.calculateSum(4,4,4);
        System.out.println("Sum of the three numbers from MathOps1: " + sum3);

        double subtraction1 = ops1.calculateSubtraction(2,5);
        System.out.println("Subtraction of the two numbers from MathOps1: " + subtraction1);

        double multiplication1 = ops1.calculateMultiplication(2,5);
        System.out.println("Multiplication of the two numbers from MathOps1: " + multiplication1);

        double division1 = ops1.calculateDivision(2,5);
        System.out.println("Division of the two numbers from MathOps1: " + division1);

    }
}
