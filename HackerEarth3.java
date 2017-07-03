package com.iamoperand.com.hackerearth.iamoperand;

/**
 * Created by iamoperand on 2/7/17.
 */

import java.util.*;
public class HackerEarth3 {

    static int count = 0, temp = 0, laterCount = 0, totalCount = 0;

    static void findConsecutive(int[] individual, int pos){

            if((pos < individual.length-1) && (individual[pos]+1) == individual[pos+1]){
                count++;

                pos++;

                findConsecutive(individual, pos);
            }

        if(totalCount == 0 && count != 0){
            totalCount++;
            temp = count + 1;


        }else if(totalCount == 0 && count == 0 ){

            temp = 0;
        }

    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);


        int T = scanner.nextInt();
        int[] N = new int[T];
        int[] X = new int[T];
        int[] finalResult = new int[T];
        for(int i=0; i<T; i++){

            N[i] = scanner.nextInt();
            X[i] = scanner.nextInt();

            int[] individualRequest = new int[N[i]];
            for(int j=0; j<N[i]; j++){
                individualRequest[j] = scanner.nextInt();
            }
            finalResult[i] = 0;

            int pqr = 0;
            while(pqr<(N[i])){
                findConsecutive(individualRequest, pqr);
                laterCount = temp;

                totalCount = 0;
                count = 0;


                for(int k=pqr; k<(pqr+laterCount); k++){
                    finalResult[i] += individualRequest[k];

                }
                    if(laterCount==0){
                        pqr++;
                        if(finalResult[i] != 0){
                            break;
                        }
                    }else{
                        pqr += laterCount;
                        if(finalResult[i] != 0){
                            break;
                        }
                    }




            }

            laterCount = 0;
            temp = 0;
            totalCount= 0;

        }

        for(int i=0; i<T; i++){

            if(finalResult[i] == X[i]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}
