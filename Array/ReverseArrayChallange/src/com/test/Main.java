package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reverse(array);
    }

    public static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i = 0,j = array.length-1;i<array.length;i++,j--){
            reverseArray[j]=array[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
