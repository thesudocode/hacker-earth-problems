package com.iamoperand.com.hackerearth.iamoperand.Sorting;

/**
 * Created by iamoperand on 6/7/17.
 */

import java.util.*;
public class Problem4 {

    static void mainLogic(int[] curseArray, String[] theMatrix){


    }


    static void printMatrixString(String[] matrixString){

        for(int i=0; i<matrixString.length; i++){

            System.out.println(matrixString[i]);
        }
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int T  = scanner.nextInt();

        int[] curseArray = new int[T];
        String[] theMatrix = new String[T];

        for(int i=0; i<T; i++){
            //get the value of N
            int N = scanner.nextInt();

            //get the values filled in curseArray one-by-one
            curseArray[i] = scanner.nextInt();


            //fill in the values of poison content, N^2 times.
            String matrixString = "";

            for(int j=0; j < Math.pow(N, 2); j++){
                matrixString += scanner.nextInt() + " ";
            }

            //got the values into the matrixString. Now put it inside theMatrix.

            theMatrix[i] = matrixString;



        }

        //check by printing the Matrix string that we got
        printMatrixString(theMatrix);

        //where the main logic goes
        mainLogic(curseArray, theMatrix);
    }



}
