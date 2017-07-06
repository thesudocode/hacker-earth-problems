package com.iamoperand.com.hackerearth.iamoperand.Sorting;

/**
 * Created by iamoperand on 6/7/17.
 */

import java.util.*;
public class Problem4 {

    static int getColumnSum(int N, int index, int[] array){
        int sum = 0;


        int count = 0;
        while(count < N){
            sum += array[index + count*N];
            count++;
        }

        return sum;
    }

    static int getRowSum(int N, int index, int[] array){

        int sum = 0;


        int count = 0;
        while(count < N){
            sum += array[index*N + count];
            count++;
        }

        return sum;
    }

    static void printFinalArray(int[][] finalArray) {

        for (int i = 0; i < finalArray.length; i++) {

            for (int j = 0; j < finalArray[i].length; j++) {

                System.out.print(finalArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mainLogic(int[] curseArray, String[] theMatrix) {


        int[][] finalArray = new int[theMatrix.length][];


        for (int i = 0; i < theMatrix.length; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (String s : theMatrix[i].split("\\s")) {
                list.add(Integer.parseInt(s));
            }
            int size = list.size();

            finalArray[i] = new int[size];
            for (int k = 0; k < size; k++) {
                int value = list.get(k);
                finalArray[i][k] = value;
            }
        }

        //check by printing the array
        printFinalArray(finalArray);

        //Now implement the main functionality

        //Going to the individual Test-Cases to implement the functionality for each of them
        for(int i=0; i<finalArray.length; i++){

            //get the size of the matrix ie. getting the N in N-by-N
            int N = (int) Math.sqrt(finalArray[i].length);

            //get individual column sum
            int[] columnSum = new int[N];

            for(int index=0; index<columnSum.length; index++){

                columnSum[index] = getColumnSum(N, index, finalArray[i]);

                //checking the columnSum
                System.out.println("The column sum of index: " + index + " is: " + columnSum[index]);
            }



            //get individual row sum
            int[] rowSum = new int[N];
            for(int index=0; index<rowSum.length; index++){

                rowSum[index] = getRowSum(N, index, finalArray[i]);

                //checking the rowSum
                System.out.println("The row sum of index: " + index + " is: " + rowSum[index]);
            }
        }



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
        //printMatrixString(theMatrix);

        //where the main logic goes
        mainLogic(curseArray, theMatrix);
    }



}
