package com.iamoperand.com.hackerearth.iamoperand.Sorting;

/**
 * Created by iamoperand on 4/7/17.
 */

import java.util.*;

public class Problem1 {

    static int randomisedPartition(int a[], int startIndex, int endIndex){

        int pivotIndex = (int) (startIndex + (Math.random()*10)%((endIndex-startIndex)+1));

        int temp = a[endIndex];
        a[endIndex] = a[pivotIndex];
        a[pivotIndex] = temp;

        int returnedPivotIndex = partition(a, startIndex, endIndex);
        return returnedPivotIndex;
    }
    static int partition(int a[], int startIndex, int endIndex){

        int pivotIndex = startIndex;

        int pivot = a[endIndex];

        for(int i=startIndex; i<endIndex; i++){

            if(a[i] >= pivot){
                int temp = a[pivotIndex];
                a[pivotIndex] = a[i];
                a[i] = temp;
                pivotIndex++;

            }
        }
        int temp = a[pivotIndex];
        a[pivotIndex] = a[endIndex];
        a[endIndex] = temp;
        return pivotIndex;
    }
    static void quickSort(int a[], int startIndex, int endIndex){

        if(startIndex < endIndex){

            int pivotIndex = randomisedPartition(a, startIndex, endIndex);
            quickSort(a, startIndex, pivotIndex-1);
            quickSort(a, pivotIndex + 1, endIndex);
        }
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
            for(int j=0; j<array.length; j++){
                a[i][j] = array[j];
            }



        }
        //print the result
        printArrays(a);


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

        sortArrays(arrays);


    }
}
