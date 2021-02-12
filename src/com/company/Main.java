package com.company;

/*
Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {0,2,1,2,0} ;
        int size = arr.length;

//        printArray(arr);
        sort012(arr);
    }
    public static void sort012(int[] a) {

        int i, ct0 = 0, ct1 = 0, ct2 = 0;

        for ( i = 0; i < a.length; i++){
            switch (a[i]){
                case 0 :
                    ct0++;
                    break;
                case 1:
                    ct1++;
                    break;
                case 2:
                    ct2++ ;
                    break;
            }
        }
        i = 0 ;
        while(ct0 > 0){
            a[i++] = 0;
            ct0--;
        }
        while(ct1 > 0){
            a[i++] = 1;
            ct1--;
        }
        while (ct2 > 0){
            a[i++]  = 2  ;
            ct2 --;
        }
        printArray(a);
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
/*
output: 0 0 1 2 2
 */