package com.company.pbk;

public class BinarySearch extends MySearch {
    public BinarySearch() {
        super.setSearchName("Binary Search");
    }

    @Override
    public int doSearch(int[] arr, int val) {
        System.out.println("Search using binary, Time compl: O(log n)");
        int l = 0;
        int r = arr.length - 1;

        while(l <= r) {
            int m = l + (r-l)/2;
            if (val == arr[m]) {
                return m;
            } else if (val < arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
