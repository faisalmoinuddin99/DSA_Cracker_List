package com.company;

public class Main {


    public static void main(String[] args) {
/*   Write a program to reverse an array or string


    Given an array (or string), the task is to reverse the array/string.
    Examples :


    Input  : arr[] = {1, 2, 3}
    Output : arr[] = {3, 2, 1}

    Input :  arr[] = {4, 5, 1, 2}
    Output : arr[] = {2, 1, 5, 4}

 */

        int [] a = {1,2,3,4,5,6} ;
        int size = a.length;
        System.out.println("Before Reversing");
        printArray(a,size);
        int start = 0;
        int end = size - 1 ;
        System.out.println();
        System.out.print("After Reversing");
        reverseArray(a,start,end);
    }

    private static  void reverseArray(int[] a, int start, int end){
        int temp ;
        int size = a.length;

        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println();
        printArray(a,size);
    }

    private static void printArray(int[] a, int size) {
        for(int i = 0; i < size; i++ ){
            System.out.print(a[i] + " ");
        }

    }




}
