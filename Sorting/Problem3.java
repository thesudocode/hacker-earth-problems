package com.iamoperand.com.hackerearth.iamoperand.Sorting;

import java.util.*;

/**
 * Created by iamoperand on 5/7/17.
 */
public class Problem3 {

    //dummy function used to individually print the 1D array (only for testing purpose)
    static void printArray(int a[]){
        for(int i=0; i<a.length; i++){

            System.out.print(a[i] + " ");


        }
        System.out.println();
    }

    static int[] mergeArrays(int[][] collectionArray){
        //the 2 rows of the collectionArray have the 2 arrays that need to be merged

        int sortedSize = collectionArray[0].length + collectionArray[1].length;
        int[] sortedArray = new int[sortedSize];

        int[] firstArray = new int[collectionArray[0].length];
        int[] secondArray = new int[collectionArray[1].length];

        for(int l=0; l<collectionArray[0].length; l++){
            firstArray[l] = collectionArray[0][l];
        }
        for(int m=0; m<collectionArray[1].length; m++){
            secondArray[m] = collectionArray[1][m];
        }
        int i = 0, j = 0, k = 0;
        while(i < firstArray.length && j<secondArray.length){




                if(firstArray[i] > secondArray[j]){
                    sortedArray[k] = firstArray[i];
                    i++;
                }else{
                    sortedArray[k] = secondArray[j];
                    j++;
                }
                k++;



        }


        while(i < firstArray.length){

            sortedArray[k] = firstArray[i];

            i++;
            k++;
        }

        while(j < secondArray.length){

            sortedArray[k] = secondArray[j];

            j++;
            k++;
        }

        return sortedArray;
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
                collectionArray[j] = new int[size];
                for (int k = 0; k <list.size(); k++) {
                    int value = list.get(k);
                    collectionArray[j][k] = value;
                }
            }
            int[] sortedArray = mergeArrays(collectionArray);

            stringArray[i][0] = "";
            for(int newIterator=0; newIterator<sortedArray.length; newIterator++){
                //System.out.println("at position: " + newIterator + " value of sorted Array is: " + sortedArray[newIterator]);
                stringArray[i][0] += sortedArray[newIterator] + " ";
                //System.out.println("stringArray[i][0] is: " + stringArray[i][0]);
            }
        }



        printStringArrays(stringArray);

    }

    static void printStringArrays(String[][] stringArray){
        for(int i=0; i<stringArray.length; i++){

                System.out.println(stringArray[i][0]);

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
