package practice.niit.fibonacci;

import java.util.Scanner;

public class Fibonacci {



    public  int[] fibonacci(int number){
        int number1 = 0;
        int number2 = 1;
        int number3 ;
        int fbSeries[] = new int[number];
        fbSeries[0] = 0;
        fbSeries[1] = 1;
//        System.out.print(number1 + " " + number2);

        for (int i = 0; i < number-2; i++) {
            number3 = number1 + number2;
//            System.out.print(" " + number3);
            fbSeries[i+2]=number3;
            number1 = number2;
            number2 = number3;
        }

        return fbSeries;
    }
}
