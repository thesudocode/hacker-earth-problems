package com.iamoperand.com.hackerearth.iamoperand.Sorting;

import java.util.Scanner;

import static com.iamoperand.com.hackerearth.iamoperand.Sorting.Problem2.getCount;

/**
 * Created by iamoperand on 4/7/17.
 */
public class Problem2 {

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

    static void getCount(int a[][]){

        for(int i=0; i<a.length; i++){

            //get individual array
            int[] individualArray = new int[a[i].length];
            for(int j=0; j<individualArray.length; j++){
                individualArray[j] = a[i][j];
            }

            //do stuff with individual Array
            for(int j=0; j<individualArray.length; j++){
                int max = individualArray[j];

                int count = 0;
                for(int k=(j+1); k<individualArray.length; k++){
                    if(max <= individualArray[k]){
                        break;
                    }else{
                        count++;
                    }

                }

                System.out.println("The value of count for position: " + j + " whose value: " + individualArray[j] + "  is: " + count);

                //got the value of count for individualArray[j], now assign it to individualArray[j]
                individualArray[j] = count;


            }

            System.out.println("Printing individual array");
            printArray(individualArray);
            //now assign individualArray to where it came from
            for(int j=0; j<individualArray.length; j++){
                a[i][j] = individualArray[j] ;
            }

        }

        System.out.println("Printing all the arrays at once");
        printArrays(a);
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


        getCount(arrays);


    }
}
