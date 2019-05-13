package learn.pbk.Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    String[] dataKey;
    int[] dataValue;
    HashMap<String, Integer> hashMapEx = new HashMap<>();

    public void setDataKey(String[] dataKey) {
        this.dataKey = dataKey;
    }

    public void setDataValue(int[] dataValue) {
        this.dataValue = dataValue;
    }

    public void HashMapExInit() {
        int n = 0;
        if (dataKey.length < dataValue.length) {
            n = dataKey.length;
        } else
            n = dataValue.length;

        for (int i = 0; i < n; i++) {
            hashMapEx.put(dataKey[i], dataValue[i]);
        }
    }

    public void InitHashMap(String[] keys, int[] vals) {
        this.dataKey = keys;
        this.dataValue = vals;

        HashMapExInit();
    }

    public void printHashMap() {
        for (String strKey : hashMapEx.keySet()) {
            String key = strKey.toString();
            int val = hashMapEx.get(strKey);
            System.out.printf("%s : %d\n", key, val);
        }
    }

    public void printHashMapIterator() {
        Iterator hmIterator = hashMapEx.entrySet().iterator();
        while(hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            String key = mapElement.getKey().toString();
            int val = (int)mapElement.getValue();
            System.out.printf("%s : %d\n", key, val);
        }
    }

    public void printHashMapForEach() {
        hashMapEx.forEach((key, val) -> {
            System.out.println(key + " : " + val);
        });
    }


}
