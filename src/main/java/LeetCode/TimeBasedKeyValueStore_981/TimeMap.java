package LeetCode.TimeBasedKeyValueStore_981;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//class TimeMap {
//
//    private final Map<String, TreeMap<Integer, String>> map;
//
//    public TimeMap() {
//        this.map = new HashMap<>();
//    }
//
//
//    public void set(String key, String value, int timestamp) {
//        if(!map.containsKey(key)){
//            map.put(key,new TreeMap<Integer, String>());
//        }
//        map.get(key).put(timestamp,value);
//    }
//
//    public String get(String key, int timestamp) {
//        if (map.containsKey(key)) {
//            Integer floorKey = map.get(key).floorKey(timestamp);
//            if (floorKey != null) {
//                return map.get(key).get(floorKey);
//            }
//        }
//        return "";
//    }
//}
class TimeMap {

    private final Map<String, List<ValueDate>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    private class ValueDate {
        private final String value;
        private final int timestamp;

        public ValueDate(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }


    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new ValueDate(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (map.containsKey(key)) {
            return getValue(map.get(key), timestamp);
        } else {
            return "";
        }
    }
    private String getValue(List<ValueDate> list, int timestamp) {
        int left = 0,
                right = list.size()-1;
        String result = "";
        while (left <= right) {
            int middle = (left + right) >> 1;
            if (list.get(middle).timestamp <= timestamp) {
                result = list.get(middle).value;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return result;
    }


//    class TimeMap {
//        /**
//         * INNER HASHMAP:
//         * Key - int timestamp
//         * Value - String value
//         * OUTER HASHMAP:
//         * Key - String key
//         * Value - inner hashmap
//         **/
//
//        private HashMap<String, HashMap<Integer, String>> map;
//
//        public TimeMap() {
//            this.map = new HashMap<>();
//        }
//
//        public void set(String key, String value, int timestamp) {
//            /**
//             * if the outer hashmap doesn't contain the String key,
//             * create a new entry in the outer hashmap with an
//             * empty inner hashmap, then add the values in
//             *
//             * else, get the inner hashmap using the String key
//             * and add the int timestamp and String value into
//             * the inner hashmap
//             **/
//
//            if(!this.map.containsKey(key)) {
//                HashMap<Integer, String> innerMap = new HashMap<>();
//                innerMap.put(timestamp, value);
//                this.map.put(key, innerMap);
//            } else {
//                HashMap<Integer, String> innerMap = this.map.get(key);
//                innerMap.put(timestamp, value);
//                this.map.put(key, innerMap);
//            }
//        }
//
//        public String get(String key, int timestamp) {
//
//            /**
//             * if the outer hashmap doesn't contain the String key,
//             * return ""
//             *
//             * else, find the closest timestamp that is <= int timestamp
//             * if no such timestamp exists, return ""
//             **/
//
//            if(!this.map.containsKey(key)) {
//                return "";
//            } else {
//                HashMap<Integer, String> innerMap = this.map.get(key);
//                for(int i=timestamp; i>=1; i--) {
//                    if(innerMap.containsKey(i)) {
//                        return innerMap.get(i);
//                    }
//                }
//                return "";
//            }
//        }
//
//    }
}
