import java.util.*;

public class Day10 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};
        System.out.println(groupAnagrams(strs1)); // [[eat, tea, ate], [tan, nat], [bat]]
        System.out.println(groupAnagrams(strs2)); // [[""]]
        System.out.println(groupAnagrams(strs3)); // [["a"]]
    }
}
