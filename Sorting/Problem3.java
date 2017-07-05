package com.iamoperand.com.hackerearth.iamoperand.Sorting;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.*;

/**
 * Created by iamoperand on 5/7/17.
 */
public class Problem3 {

    static void mergeArrays(int[][] collectionArray){
        //the 2 rows of the collectionArray have the 2 arrays that need to be merged



        for(int i=0; i<collectionArray.length; i++){

            for(int j=0; j<collectionArray[i].length; j++){
                System.out.print(collectionArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printIntegerArrays(int[][] collectionArray){

        for(int i=0; i<collectionArray.length; i++){

            for(int j=0; j<collectionArray[i].length; j++){
                System.out.print(collectionArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void merge(String[][] stringArray){

        int[][] collectionArray = new int[2][];


        //get the 2 arrays separately

        //looping through the test cases
        for(int i=0; i<stringArray.length; i++){

            //looping through the 2 stringArrays in a particular test-case
            for(int j=0; j<stringArray[i].length; j++){
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (String s : stringArray[i][j].split("\\s"))
                {
                    list.add(Integer.parseInt(s));
                }
                int size = list.size();
                System.out.println("The size is: " + size);
                collectionArray[j] = new int[size];
                for (int k = 0; k <list.size(); k++) {
                    int value = list.get(k);
                    collectionArray[j][k] = value;
                }
            }
        }


        mergeArrays(collectionArray);
        printIntegerArrays(collectionArray);


    }
    static void printArrays(String[][] stringArray){

        for(int i=0; i<stringArray.length; i++){

            for(int j=0; j<stringArray[i].length; j++){
                System.out.println(stringArray[i][j]);
            }
        }
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        String[][] arrayString = new String[T][2];
        for(int i=0; i<T; i++){

            //get the size of the arrays
            int[] sizeOfArrays = new int[2];
            for(int j=0; j<sizeOfArrays.length; j++){
                sizeOfArrays[j] = scanner.nextInt();
            }

            //get the arrays and store them one-by-one
            for(int j=0; j<sizeOfArrays.length; j++){

                int size = sizeOfArrays[j];

                String str = new String();
                for(int k=0; k<size-1; k++){

                    str += scanner.next() + " ";
                }
                str += scanner.next();

                //got the string, now time to store them
                arrayString[i][j] = str;
            }

        }

        //merge the 2 arrays
        merge(arrayString);

    }
}
