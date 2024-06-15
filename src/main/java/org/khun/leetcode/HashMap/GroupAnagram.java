package org.khun.leetcode.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if (!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagram groupAnagram = new GroupAnagram();

        String[] str1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram.groupAnagrams(str1).toString());
    }
}
