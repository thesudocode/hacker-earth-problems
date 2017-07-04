package com.iamoperand.com.hackerearth.iamoperand.Arrays_Strings;

import java.util.*;

class Problem1 {

    static void swap(int pos, char[] str){

        if((str.length)%2 == 0){
            if((pos+1)<=(str.length/2)){
                char temp = str[pos];
                str[pos] = str[str.length - 1 - pos];
                str[str.length - 1 - pos] = temp;
                swap(pos+1, str);
            }
        }else{
            if((pos+1)<=(str.length-1)/2){
                char temp = str[pos];
                str[pos] = str[str.length - 1 - pos];
                str[str.length - 1 - pos] = temp;
                swap(pos+1, str);
            }
        }

    }
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        String[] stringList = new String[T];

        for(int i=1; i<=T; i++){

            if (s.hasNext()) {
                stringList[i-1] = s.next();

            }
        }

        for(int i=1; i<=T; i++){


            String str = stringList[i-1];
            char[] charArray = new char[str.length()];
            str.getChars(0, str.length(), charArray, 0);

            swap(0, charArray);

            for(int j=0; j<str.length(); j++){

                System.out.print(charArray[j]);

            }
            System.out.println();
        }

        //System.out.println("Hello World!");
    }
}
