import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class GroupAnagram {

	public static void main(String[] args) {
		 String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"}; 
	     List<List<String>> list = printAnagrams(arr);
	     System.out.println(list);
	}

	private static List<List<String>> printAnagrams(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		List<List<String>> resultList =  new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			String word = arr[i];
			char [] tempArr = word.toCharArray(); 
			Arrays.sort(tempArr);
			String sortedWord = new String(tempArr);
			
			if(map.containsKey(sortedWord)) {
				map.get(sortedWord).add(word);
			} else {
				List<String> anagramWordList = new ArrayList<>();
				anagramWordList.add(word);
				map.put(sortedWord, anagramWordList);
			}
		}
	    for(String s : map.keySet()) {
	    	List<String> list = map.get(s);
	    	Collections.sort(list);
	    	resultList.add(list);
	    }
		return resultList;
	}
	
	/*
	 *  in place of sort array we can use ca[c - 'a']++;  
	 *   public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
	 */

}
