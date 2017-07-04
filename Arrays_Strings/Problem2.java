package com.iamoperand.com.hackerearth.iamoperand.Arrays_Strings;

/**
 * Created by iamoperand on 2/7/17.
 */

import java.util.*;
public class Problem2 {


    static void delete(char[] charArray, int pos){

        for(int i=(pos); i<(charArray.length-1); i++){
            charArray[i] = charArray[i+1];

        }
        charArray[charArray.length-1] = Character.MIN_VALUE;

        if(charArray[pos] == charArray[pos+1]) {
            delete(charArray, pos);

        }

    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] stringList = new String[T];

        for(int i=0; i<T; i++){
            stringList[i] = scanner.next();
        }

        for(int i=0; i<T; i++){

            char[] charArray = new char[stringList[i].length()];
            stringList[i].getChars(0, stringList[i].length(), charArray, 0);

            for(int j=0; j<(charArray.length-1); j++){
                if(charArray[j] != Character.MIN_VALUE && charArray[j+1] != Character.MIN_VALUE && charArray[j] == charArray[j+1]){

                    delete(charArray, j);
                }



        }
        int charArrayLength = charArray.length;
        for(int k=0; k<charArray.length; k++){
            if(charArray[k] == Character.MIN_VALUE){
                charArrayLength = k;
                break;
            }
        }
        for(int k=0; k<charArrayLength; k++){

                System.out.print(charArray[k]);

            }
            System.out.println();

        }
    }
}
