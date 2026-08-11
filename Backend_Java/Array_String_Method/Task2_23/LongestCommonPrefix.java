package Task2_23;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] words){
        String commonPrefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(commonPrefix) != 0){
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if (commonPrefix.isEmpty()) {
                    return "";
                }
            }
        }
        return commonPrefix;
    }
}
