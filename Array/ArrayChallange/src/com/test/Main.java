package com.test;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] array = getIntegers(5);
	    displayArray(array);
        System.out.println("\nDisplaying same array in descending order : \n");
	    int[] sortedArray = sortArray(array);
	    displayArray(sortedArray);
    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Please enter "+number+" integer for an array");
        for(int i = 0;i<number;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void displayArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Array element "+i+" : "+array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        int temp;
        int count = 1;
        for (int i = 0;i<array.length;i++){
            sortedArray[i] = array[i];
        }

        for (int i=0;i<sortedArray.length;i++){
            for (int j = i+1;j<sortedArray.length;j++){
//                System.out.println(count);
                count++;
                if(sortedArray[i]<sortedArray[j]){
                 temp = sortedArray[i];
                 sortedArray[i] = sortedArray[j];
                 sortedArray[j]=temp;
                }
            }
        }
        return sortedArray;
     }
}
