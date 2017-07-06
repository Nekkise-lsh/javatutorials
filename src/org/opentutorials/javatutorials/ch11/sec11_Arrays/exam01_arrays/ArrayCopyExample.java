package org.opentutorials.javatutorials.ch11.sec11_Arrays.exam01_arrays;

import java.util.Arrays;

/**
 * Created by Nekisse_lee on 2017. 7. 1..
 */
public class ArrayCopyExample {
    public static void main(String[] args) {
        char[] arr1 ={'J','A','V','A'};

        char[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));

        char[] arr3= Arrays.copyOfRange(arr1, 1, 3);
        System.out.println(Arrays.toString(arr3));

        char[] arr4 = new char[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        for (int i = 0; i<arr4.length; i ++){
            System.out.println("arr4[" + i + "] = " + arr4[i]);
        }

    }
}