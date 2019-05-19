package com.company.pbk;

public class Main {

    public static void printArr(int[] arr) {
        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {5,8,3,6,2,1,0,7,4,9,10,15,12,11,17,13,16};

        System.out.println("Hello");
        MySort srt = new MergeSort();
        System.out.println(srt.getSortName());

        int[] ret = srt.doSort(arr);
        printArr(arr);

        MySearch src = new BinarySearch();
        int res = src.doSearch(arr, 20);
        if (res != -1)
            System.out.printf("%d : %d \n", res, arr[res]);
        else
            System.out.printf("Not found : %d \n", res);
    }
}
