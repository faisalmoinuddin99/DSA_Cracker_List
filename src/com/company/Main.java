package com.company;

/*
Merging Two Sorted Array
 */

public class Main {
    public static void main(String[] args) {
        int[] a = {7,8,12};
        int[] b = {1,2,11} ;
        int m = a.length;
        int n = b.length;
        int [] c = new int[m + n] ;

        mergeSortedArray(a,b,c,m,n);

    }
    public static void mergeSortedArray(int[] A, int[] B, int[] C, int m, int n){
        int i = 0, j = 0, k = 0;

        while (i < m && j < n){
            if (A[i] < B[j]){
                C[k++] = A[i++];
            }else{
               C[k++] = B[j++] ;
            }
        }
        // copy all remaining element from A to C
        while(i < m) {
            C[k++] = A[i++];
        }
        // copy all remaining element from B to C
        while(j < n) {
            C[k++] = B[j++] ;
        }
        printArray(C);
    }

    public static void printArray(int[] a){
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}

/*
1 2 7 8 11 12
 */