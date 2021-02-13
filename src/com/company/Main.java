package com.company;/*
Move all negative numbers to beginning and positive to end with constant extra space

An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples :

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */

public class Main {

    public static void main(String[] args) {
        int [] a = {-12,11,-13,-5,6,-7,5,-3,-6} ;

        int low = 0;
        int high = a.length - 1;
        int mid = low + (high - low) / 2;

        mergeSort(a,low,high);
        printArray(a);
    }

    public static void merge(int[] a, int low, int mid, int high){
        int i, j , k;
        i = low;
        j = mid + 1;
        k = low;
        int [] b = new int[high + 1];

        while (i <= mid && j <= high){
            if(a[i] < a[j]){
                b[k++] = a[i++];
            }else{
                b[k++] = a[j++];
            }
        }

        while(i <= mid){
            b[k++] = a[i++];
        }
        while(j <= high){
            b[k++] = a[j++];
        }

        for(int e = low; e<= high; e++){
            a[e] = b[e];
        }
    }
    public static  void mergeSort(int[] a, int low, int high){
int mid ;
    if(low < high){
        mid = low + (high - low) / 2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,low,mid,high);
    }

    }
    public static void printArray(int [] a){
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}