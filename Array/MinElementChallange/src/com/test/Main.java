package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many interger you want to enter");
        int count = scanner.nextInt();

        int[] array = readIntegers(count);

        int min = findMin(array);

        System.out.println("minimum = " + min);
//        System.out.println(Arrays.toString(array));
        // write your code here
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        System.out.println("Please enter " + count + " elements.\n");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min;

        min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = (min < array[i]) ? min : array[i];
        }
        return min;
    }
}
