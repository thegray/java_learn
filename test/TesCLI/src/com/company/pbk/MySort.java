package com.company.pbk;

public class MySort {
    private String sortName;
    public void setSortName(String name) { this.sortName = name; }
    public String getSortName() { return this.sortName; }
    public int[] doSort(int[] arr) {
        System.out.println("Sort using default");
        return arr;
    }
}
