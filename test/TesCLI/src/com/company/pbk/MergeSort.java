package com.company.pbk;

public class MergeSort extends MySort {
    public MergeSort() {
        super.setSortName("Merge Sort");
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] tempL = new int[n1];
        int[] tempR = new int[n2];

        for (int i = 0; i < n1; i++) {
            tempL[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++) {
            tempR[j] = arr[m+j+1];
        }

        int i = 0, j = 0;
        int run = l;
        while(i < n1 && j < n2) {
            if (tempL[i] <= tempR[j]) {
                arr[run] = tempL[i];
                i++;
            } else {
                arr[run] = tempR[j];
                j++;
            }
            run++;
        }

        while(i < n1) {
            arr[run] = tempL[i];
            i++;
            run++;
        }

        while(j < n2) {
            arr[run] = tempR[j];
            j++;
            run++;
        }

    }

    private void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;
            sort(arr, l, m);
            sort(arr,m+1, r);

            merge(arr, l, m, r);
        }
    }

    @Override
    public int[] doSort(int[] arr) {
        System.out.println("Sort using merge, Time Compl: O(n log n)");
        int[] thearr = arr;
        sort(thearr, 0, thearr.length - 1);
        return thearr;
    }
}
