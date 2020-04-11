package Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yongzh
 * @date 2020/4/7
 */
public class Test {
    public static void main(String[] args) {
        temp4();
    }


    static void temp1() {
        String s = String.valueOf(1);
        StringBuilder sbl = new StringBuilder().append(1);
        StringBuffer sbf = new StringBuffer().append("1");

        String s1 = "AB";
        String s2 = "AB";
        String s3 = new String("AB");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

    static void temp2() {
        String ss = "111";
        ArrayList<String> arrList = new ArrayList<>();
        LinkedList<String> linkList = new LinkedList<>();
        arrList.add(ss);
        linkList.add(ss);
        arrList.indexOf(ss);
        linkList.indexOf(ss);
        arrList.remove(ss);
        linkList.remove(ss);
    }

    static void temp3() {
        String ss = "111";

        HashMap hashMap = new HashMap();
        hashMap.put(ss, ss);

        Hashtable hashtable = new Hashtable();
        hashtable.put(ss, ss);

        hashMap.equals(hashtable);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ss, ss);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(ss, ss);

        TreeMap treeMap = new TreeMap();
        treeMap.put(ss, ss);

        TreeMap<String, String> map = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }

        });
    }

    static void fatherAndSon() {
        Son son = new Son();
        son.print();
    }


    static void temp4() {
        Map<String, Long> map = new ConcurrentHashMap<>();
        map.put("ss", map.get("ss") + 1);
        System.out.println(map.get("ss"));
    }
}
