package com.iamoperand.com.hackerearth.iamoperand.Searching;

import java.util.Scanner;

/**
 * Created by iamoperand on 7/7/17.
 */
public class Problem3 {

    static int findMax(int[] array){
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    static void findMonkiness(int[][] A, int[][] B){


        for(int i=0; i<A.length; i++){
            int[] monkinessArray = new int[(int) Math.pow(A[i].length, 2)];
            for(int j=0; j<A[i].length; j++){

                for(int k=0; k<B[i].length; k++){

                        if(k>=j && B[i][k]>=A[i][j]){
                            monkinessArray[j*A[i].length + k] = k-j;
                        }else{
                            monkinessArray[j*A[i].length + k] = 0;
                        }

                }

            }
            //printArray(monkinessArray);
            int max = findMax(monkinessArray);
            System.out.println(max);
        }

    }
    static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void printIntegerArray(int[][] array){
        for(int i=0; i<array.length; i++){

            for(int j=0; j<array[i].length; j++){
                System.out.println(j);
                System.out.print(array[i][j] + " ");


            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[][] A = new int[T][];
        int[][] B = new int[T][];

        for(int i=0; i<T; i++){
            int N = scanner.nextInt();
            A[i] = new int[N];
            B[i] = new int[N];


            for(int j=0; j<N; j++){
               A[i][j] = scanner.nextInt();
              //  System.out.println("Taking input in A at: " + j);
            }

            for(int j=0; j<N; j++){
                B[i][j] = scanner.nextInt();
            //System.out.println("Taking input in B");
            }



        }
        findMonkiness(A, B);

    }
}
