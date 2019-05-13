package learn.pbk;

import learn.pbk.Model.MapExample;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] dataKey = {"a1", "b2", "c3", "d4", "e5"};
        int[] dataValue = {0,1,2,3,4};

        MapExample mex = new MapExample();
        mex.InitHashMap(dataKey, dataValue);
        mex.printHashMapIterator();
    }
}
