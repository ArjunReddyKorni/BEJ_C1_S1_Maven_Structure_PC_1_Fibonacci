package practice.niit;

import practice.niit.fibonacci.Fibonacci;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number = scanner.nextInt();
        Fibonacci fibonacci =new Fibonacci();
       int[] fibonacciR = fibonacci.fibonacci(number);
        for (int i : fibonacciR) {
            System.out.print(" " + i);
        }
    }
}
