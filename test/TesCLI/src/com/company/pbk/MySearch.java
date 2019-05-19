package com.company.pbk;

public class MySearch {
    private String searchName;
    public void setSearchName(String name) { this.searchName = name; }
    public String getSearchName() { return this.searchName; }
    public int doSearch(int[] arr, int val) {
        System.out.println("Search using default");
        for (int i : arr) {
            if (i == val) {
                return i;
            }
        }
        return -1;
    }
}
