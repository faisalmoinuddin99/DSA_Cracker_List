package com.company;
/*
Find the maximum and minimum element in an array
 */

public class Main {
    public static void main(String[] args) {
//        int [] a = {10,1,5,100,20} ;
        int [] a = {20,18,0,-1,70};
        System.out.println("Printing array elements");
        printArray(a);
       int max = findMaxElement(a);
        System.out.println();
        System.out.println("Max element in array : " + max);

        int min = findMinElement(a) ;

        System.out.println("Min element in array : " + min);
    }

    public static void printArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
    }
    public static int findMaxElement(int[]a){
        int max = Integer.MIN_VALUE ;

        for(int i : a){
           if (max < i) {
               max = i ;
           }

        }
        return max ;

    }

    public static int findMinElement(int[] a) {
        int min = Integer.MAX_VALUE;
        for(int i : a) {
            if (min > i) {
                min =i;
            }
        }
        return min ;
    }
}

/*
Printing array elements
20 18 0 -1 70
Max element in array : 70
Min element in array : -1

 */