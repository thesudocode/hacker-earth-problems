package com.iamoperand.com.hackerearth.iamoperand.Searching;

import java.util.Scanner;

/**
 * Created by iamoperand on 7/7/17.
 */
public class Problem3 {

    static void printIntegerArrays(int[][] array){
        for(int i=0; i<array.length; i++){

            for(int j=0; j<array[i].length; j++){
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

            }

            for(int j=0; j<N; j++){
                B[i][j] = scanner.nextInt();

            }

            printIntegerArrays(A);
            printIntegerArrays(B);
        }
    }
}
