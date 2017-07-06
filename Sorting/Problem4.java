package com.iamoperand.com.hackerearth.iamoperand.Sorting;

/**
 * Created by iamoperand on 6/7/17.
 */

import java.util.*;
public class Problem4 {

    static void incrementEachColumn(int[] columnSumArray){

        for(int i=0; i<columnSumArray.length; i++){
            columnSumArray[i]++;
        }
    }

    static void incrementEachRow(int[] rowSumArray){
        for(int i=0; i<rowSumArray.length; i++){
            rowSumArray[i]++;
        }
    }

    static void incrementRow(int index, int[] rowSumArray){
        int count = 0;
        while(count < rowSumArray.length){
            rowSumArray[index]++;
            count++;
        }
    }

    static void incrementColumn(int index, int[] columnSumArray){
        int count = 0;
        while(count < columnSumArray.length){
            columnSumArray[index]++;
            count++;
        }
    }

    static String getMin(int[] rowSumArray, int[] columnSumArray){

        String finalResult = "";
        int rowMin = rowSumArray[0];
        int rowIndex = 0;
        for(int i=1; i<rowSumArray.length; i++){
            if(rowSumArray[i] < rowMin){
                rowMin = rowSumArray[i];
                rowIndex = i;
            }
        }

        int columnMin = columnSumArray[0];
        int columnIndex = 0;
        for(int i=1; i<columnSumArray.length; i++){
            if(columnSumArray[i] < columnMin){
                columnMin = columnSumArray[i];
                columnIndex = i;
            }
        }
       // System.out.println("rowMin: " + rowMin);
       // System.out.println("colMin: " + columnMin);
        if(rowMin<columnMin){
            finalResult = 1 + " " + rowIndex + " " + rowMin;
        }else{
            finalResult = 0 + " " + columnIndex + " " + columnMin;
        }

        return finalResult;
    }
    static int decreaseCurse(int[] rowSumArray, int[] columnSumArray, int curse){

        String resultString = "";
        int[] fetchedArray = new int[3];
        int finalResult = 0;
        while(curse > 0){


            resultString = getMin(rowSumArray, columnSumArray);
         //   System.out.println("resultString is: " + resultString);
            int i =0;
            for (String s : resultString.split("\\s")) {
                fetchedArray[i]  = (Integer.parseInt(s));
                i++;
            }

            if(fetchedArray[0] == 1){
                //row was chosen to be minimum

                finalResult += fetchedArray[2];
                incrementRow(fetchedArray[1], rowSumArray);
                incrementEachColumn(columnSumArray);
            }else if(fetchedArray[0] == 0){
                //column was chosen to be minimum

                finalResult += fetchedArray[2];
                incrementColumn(fetchedArray[1], columnSumArray);
                incrementEachRow(rowSumArray);
            }
            //System.out.println("finalResult is: " + finalResult);
            curse--;
        }
        return finalResult;
    }
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
        //printFinalArray(finalArray);

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
              //  System.out.println("The column sum of index: " + index + " is: " + columnSum[index]);
            }



            //get individual row sum
            int[] rowSum = new int[N];
            for(int index=0; index<rowSum.length; index++){

                rowSum[index] = getRowSum(N, index, finalArray[i]);

                //checking the rowSum
                //System.out.println("The row sum of index: " + index + " is: " + rowSum[index]);
            }


            int val = decreaseCurse(rowSum, columnSum, curseArray[i]);
            System.out.println(val);
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
