package com.iamoperand.com.hackerearth.iamoperand.Sorting;

/**
 * Created by iamoperand on 4/7/17.
 */

import java.util.*;

public class Problem1 {

    //function used to quicken up the quick-sort algorithm by randomly selecting a pivot
    static int randomisedPartition(int a[], int startIndex, int endIndex){

        int pivotIndex = (int) (startIndex + (Math.random()*10)%((endIndex-startIndex)+1));

        int temp = a[endIndex];
        a[endIndex] = a[pivotIndex];
        a[pivotIndex] = temp;

        int returnedPivotIndex = partition(a, startIndex, endIndex);
        return returnedPivotIndex;
    }

    //function used to find out the pivot index
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

    //quick-sort algorithm
    static void quickSort(int a[], int startIndex, int endIndex){

        if(startIndex < endIndex){

            int pivotIndex = randomisedPartition(a, startIndex, endIndex);
            quickSort(a, startIndex, pivotIndex-1);
            quickSort(a, pivotIndex + 1, endIndex);
        }
    }

    //function used for sorting the arrays in the 2D array
    static void sortArrays(int a[][]){

        for(int i=0; i<a.length; i++){

            //instantiate a new array to fill in with the column of ith row
            int[] array = new int[a[i].length];

            //get the array in a variable
            for(int j=0; j<array.length; j++){
                array[j] = a[i][j];
            }

            //perform sorting operation on the array
            quickSort(array, 0, array.length-1);


            //put it right back to where it belonged
            for(int j=0; j<array.length; j++){
                a[i][j] = array[j];
            }



        }

        //print the result
        printArrays(a);


    }


    //dummy function used to individually print the 1D array (only for testing purpose)
    static void printArray(int a[]){
        for(int i=0; i<a.length; i++){

            System.out.print(a[i] + " ");


        }
        System.out.println();
    }


    //function used to print the 2D array in the row-wise format
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

        //get the number of test-cases in variable T
        int T = scanner.nextInt();

        //instantiate only the first dimension of the array i.e. the number of rows as it is all that we know
        int[][] arrays = new int[T][];

        //get the arrays
        for(int i=0; i<T; i++){

            //get the size of the array
            int size = scanner.nextInt();

            //instantiate the skewed 2D array with the column dimension
            arrays[i] = new int[size];


            //get the values of the array and put it in the second dimension of the 2D array
            for(int j=0; j<arrays[i].length; j++){
                arrays[i][j] = scanner.nextInt();
            }
        }

        //sort the arrays
        sortArrays(arrays);


    }
}
