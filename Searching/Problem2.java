package com.iamoperand.com.hackerearth.iamoperand.Searching;

import java.util.Scanner;

/**
 * Created by iamoperand on 7/7/17.
 */
public class Problem2 {

    static int findMin(int A, int B, int C, int K){


        for(int x=0; x<Integer.MAX_VALUE; x++){
            int equationVal  = (int) (A*Math.pow(x, 2) + B*x + C - K);

            if(equationVal >= 0){
                return x;
            }
        }
        return -1;

    }
    static void performLogic(int[][] valueArray){

        for(int i=0; i<valueArray.length; i++){

            int A = valueArray[i][0];
            int B = valueArray[i][1];
            int C = valueArray[i][2];
            int K = valueArray[i][3];

            int min = findMin(A, B, C, K);
            if(min > -1){
                System.out.println(min);
            }


        }

    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[][] valueArray = new int[T][4];
        for(int i=0; i<valueArray.length; i++){
                for(int j=0; j<4; j++){
                    valueArray[i][j] = scanner.nextInt();
                }
        }

        performLogic(valueArray);
    }
}
