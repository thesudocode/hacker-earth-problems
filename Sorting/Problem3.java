package com.iamoperand.com.hackerearth.iamoperand.Sorting;

import java.util.*;

/**
 * Created by iamoperand on 5/7/17.
 */
public class Problem3 {

    static void merge(String[][] stringArray){



        //get the 2 arrays separately
        for(int i=0; i<stringArray.length; i++){

            for(int j=0; j<stringArray[i].length; j++){

            }
        }
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
