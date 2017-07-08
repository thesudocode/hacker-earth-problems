package com.iamoperand.com.hackerearth.iamoperand.Searching;

import java.util.Scanner;

/**
 * Created by iamoperand on 7/7/17.
 */
public class Problem4 {

    static void performLogic(int[] templePositions, int noOfMonks){

        int range = 0;

        while(range < Integer.MAX_VALUE){


            for(int i=0; i<templePositions.length-1; i++){

                int pos = (templePositions[i+1] - templePositions[i]) / 2;

            }



            range++;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] templePositions = new int[N];

        for(int i=0; i<templePositions.length; i++){
            templePositions[i] = scanner.nextInt();
        }

        performLogic(templePositions, K);
    }
}
