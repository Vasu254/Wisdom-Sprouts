public class Day9 {
    public static String LongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "There is no common prefix";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};
        System.out.println(LongestCommonPrefix(strs));  // Output: "fl"
        System.out.println(LongestCommonPrefix(strs1)); // Output: "There is no common prefix"
    }
}
