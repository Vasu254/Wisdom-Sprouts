public class Day8 {

    public static String reverseWordByWord(String str){
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            reversedStr.append(words[i]);
            if(i != 0){
                reversedStr.append(" ");
            }
        }
        return reversedStr.toString();
       
    }
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String result = reverseWordByWord(str);
        System.out.println(result); // Output: "Java from World Hello"
    }
}