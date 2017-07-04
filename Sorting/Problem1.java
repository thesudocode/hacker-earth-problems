package com.iamoperand.com.hackerearth.iamoperand.Sorting;

/**
 * Created by iamoperand on 4/7/17.
 */

import java.util.*;

public class Problem1 {


    static void quickSort(int a[], int startIndex, int endIndex){


    }
    static void sortArrays(int a[][]){

        for(int i=0; i<a.length; i++){

            int[] array = new int[a[i].length];

            //get the array
            for(int j=0; j<array.length; j++){
                array[j] = a[i][j];
            }

            //perform sorting operation on the array
            quickSort(array, 0, array.length-1);


            //put it right back where it belonged


        }


    }

    static void printArray(int a[]){
        for(int i=0; i<a.length; i++){

                System.out.print(a[i] + " ");


        }
        System.out.println();
    }

    static void printArrays(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[][] arrays = new int[T][];
        //get the size of the arrays
        for(int i=0; i<T; i++){
            int size = scanner.nextInt();
            arrays[i] = new int[size];



            for(int j=0; j<arrays[i].length; j++){
                arrays[i][j] = scanner.nextInt();
            }
        }

        printArrays(arrays);

        sortArrays(arrays);


    }
}
