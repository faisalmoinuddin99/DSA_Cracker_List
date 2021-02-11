package com.company;/*
MERGE SORT + Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.
 */

public class Main {

   public static void merge(int A[], int low, int mid, int high){
    int i,j,k ;
    int [] B = new int[high + 1];
     i = low ;
     j = mid + 1;
     k = low;

     while(i <= mid && j <= high){
         if (A[i] < A[j]){
             B[k++] = A[i++];
         }else{
             B[k++] = A[j++] ;
         }
     }
     while(i<= mid) {
         B[k++] = A[i++];
     }
     while(j <= high){
         B[k++] = A[j++] ;
     }
     for(int e = low; e <= high; e ++){
         A[e] = B[e] ;
     }

   }

   public static void mergeSort(int[] A,int low, int high){
       int mid ;
       if (low < high) {
           mid = low + (high - low) / 2;
           mergeSort(A,low,mid);
           mergeSort(A,mid + 1, high);
           merge(A,low, mid, high);
       }

   }
    public static void main(String[] args) {
        int A[] = {7,10,4,20,15} ;
        int n = A.length ;
        int low = 0;
        int high = n - 1;
        int mid = low + (high - low) / 2;
        int k = 4 ;

        mergeSort(A,low,high) ;
         printArray(A) ;
        System.out.println();
        System.out.print("Kth smallest element: ");
         findKthElement(A,k);
    }

    public static void printArray(int[] A){
        for(int i : A){
            System.out.print(i + " ");
        }
    }
    public static void findKthElement(int[] A, int k){
        System.out.println(A[k - 1]);
    }
}

/*

4 7 10 15 20
Kth smallest element: 15
 */